package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object dataplex:
  /**
   * Three different resources help you manage your IAM policy for Dataplex Task. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.TaskIamPolicy`: Authoritative. Sets the IAM policy for the task and replaces any existing policy already attached.
   *  * `gcp.dataplex.TaskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the task are preserved.
   *  * `gcp.dataplex.TaskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the task are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.TaskIamPolicy`: Retrieves the IAM policy for the task
   * 
   *  &gt; **Note:** `gcp.dataplex.TaskIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.TaskIamBinding` and `gcp.dataplex.TaskIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.TaskIamBinding` resources **can be** used in conjunction with `gcp.dataplex.TaskIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.TaskIamPolicy
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
   *  import com.pulumi.gcp.dataplex.TaskIamPolicy;
   *  import com.pulumi.gcp.dataplex.TaskIamPolicyArgs;
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
   *          var policy = new TaskIamPolicy("policy", TaskIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.TaskIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.TaskIamBinding;
   *  import com.pulumi.gcp.dataplex.TaskIamBindingArgs;
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
   *          var binding = new TaskIamBinding("binding", TaskIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.TaskIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.TaskIamMember;
   *  import com.pulumi.gcp.dataplex.TaskIamMemberArgs;
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
   *          var member = new TaskIamMember("member", TaskIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
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
   *  # IAM policy for Dataplex Task
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Task. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.TaskIamPolicy`: Authoritative. Sets the IAM policy for the task and replaces any existing policy already attached.
   *  * `gcp.dataplex.TaskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the task are preserved.
   *  * `gcp.dataplex.TaskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the task are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.TaskIamPolicy`: Retrieves the IAM policy for the task
   * 
   *  &gt; **Note:** `gcp.dataplex.TaskIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.TaskIamBinding` and `gcp.dataplex.TaskIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.TaskIamBinding` resources **can be** used in conjunction with `gcp.dataplex.TaskIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.TaskIamPolicy
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
   *  import com.pulumi.gcp.dataplex.TaskIamPolicy;
   *  import com.pulumi.gcp.dataplex.TaskIamPolicyArgs;
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
   *          var policy = new TaskIamPolicy("policy", TaskIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.TaskIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.TaskIamBinding;
   *  import com.pulumi.gcp.dataplex.TaskIamBindingArgs;
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
   *          var binding = new TaskIamBinding("binding", TaskIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.TaskIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.TaskIamMember;
   *  import com.pulumi.gcp.dataplex.TaskIamMemberArgs;
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
   *          var member = new TaskIamMember("member", TaskIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
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
   *  * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
   *  * {{project}}/{{location}}/{{lake}}/{{task_id}}
   *  * {{location}}/{{lake}}/{{task_id}}
   *  * {{task_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex task IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_task_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_task_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/taskIamMember:TaskIamMember editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TaskIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.TaskIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.TaskIamMemberArgs.builder
    com.pulumi.gcp.dataplex.TaskIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A data asset resource that can be packaged and shared via a data product.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about DataProductDataAsset, see:
   * 
   *  * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.dataProducts.dataAssets)
   *  * How-to Guides
   *      * [Official Documentation](https://docs.cloud.google.com/dataplex/docs/manage-data-products)
   */
  def DataProductDataAsset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DataProductDataAssetArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.DataProductDataAssetArgs.builder
    com.pulumi.gcp.dataplex.DataProductDataAsset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.EntryTypeArgs.Builder)
    /**
     * @param requiredAspects AspectInfo for the entry type.
     *  Structure is documented below.
     * @return builder
     */
    def requiredAspects(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryTypeRequiredAspectArgs.Builder]*):
        com.pulumi.gcp.dataplex.EntryTypeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryTypeRequiredAspectArgs.builder
      builder.requiredAspects(args.map(_(argsBuilder).build)*)

  /** The Dataplex Asset resource */
  def Asset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AssetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataplex.AssetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataplex.Asset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex AspectType. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.AspectTypeIamPolicy`: Authoritative. Sets the IAM policy for the aspecttype and replaces any existing policy already attached.
   *  * `gcp.dataplex.AspectTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the aspecttype are preserved.
   *  * `gcp.dataplex.AspectTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the aspecttype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.AspectTypeIamPolicy`: Retrieves the IAM policy for the aspecttype
   * 
   *  &gt; **Note:** `gcp.dataplex.AspectTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AspectTypeIamBinding` and `gcp.dataplex.AspectTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.AspectTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AspectTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.AspectTypeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.AspectTypeIamPolicy;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs;
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
   *          var policy = new AspectTypeIamPolicy("policy", AspectTypeIamPolicyArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AspectTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamBinding;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs;
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
   *          var binding = new AspectTypeIamBinding("binding", AspectTypeIamBindingArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AspectTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamMember;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs;
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
   *          var member = new AspectTypeIamMember("member", AspectTypeIamMemberArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
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
   *  # IAM policy for Dataplex AspectType
   * 
   *  Three different resources help you manage your IAM policy for Dataplex AspectType. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.AspectTypeIamPolicy`: Authoritative. Sets the IAM policy for the aspecttype and replaces any existing policy already attached.
   *  * `gcp.dataplex.AspectTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the aspecttype are preserved.
   *  * `gcp.dataplex.AspectTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the aspecttype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.AspectTypeIamPolicy`: Retrieves the IAM policy for the aspecttype
   * 
   *  &gt; **Note:** `gcp.dataplex.AspectTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AspectTypeIamBinding` and `gcp.dataplex.AspectTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.AspectTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AspectTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.AspectTypeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.AspectTypeIamPolicy;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs;
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
   *          var policy = new AspectTypeIamPolicy("policy", AspectTypeIamPolicyArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AspectTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamBinding;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs;
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
   *          var binding = new AspectTypeIamBinding("binding", AspectTypeIamBindingArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AspectTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamMember;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs;
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
   *          var member = new AspectTypeIamMember("member", AspectTypeIamMemberArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
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
   *  * projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}}
   *  * {{project}}/{{location}}/{{aspect_type_id}}
   *  * {{location}}/{{aspect_type_id}}
   *  * {{aspect_type_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex aspecttype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_aspect_type_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_aspect_type_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/aspectTypeIamPolicy:AspectTypeIamPolicy editor projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AspectTypeIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.AspectTypeIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.GlossaryIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GlossaryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.GlossaryIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GlossaryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * &gt; **Warning:** `gcp.dataplex.DataAsset` is deprecated and will be removed in a future major release. Please use `gcp.dataplex.DataProductDataAsset` resource instead.
   * 
   *  A data asset resource that can be packaged and shared via a data product.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about DataAsset, see:
   * 
   *  * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.dataProducts.dataAssets)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dataplex/docs)
   */
  def DataAsset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DataAssetArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.DataAssetArgs.builder
    com.pulumi.gcp.dataplex.DataAsset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.GlossaryIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GlossaryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.GlossaryIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GlossaryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Lake. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.LakeIamPolicy`: Authoritative. Sets the IAM policy for the lake and replaces any existing policy already attached.
   *  * `gcp.dataplex.LakeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the lake are preserved.
   *  * `gcp.dataplex.LakeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the lake are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.LakeIamPolicy`: Retrieves the IAM policy for the lake
   * 
   *  &gt; **Note:** `gcp.dataplex.LakeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.LakeIamBinding` and `gcp.dataplex.LakeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.LakeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.LakeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.LakeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.LakeIamPolicy;
   *  import com.pulumi.gcp.dataplex.LakeIamPolicyArgs;
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
   *          var policy = new LakeIamPolicy("policy", LakeIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.LakeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.LakeIamBinding;
   *  import com.pulumi.gcp.dataplex.LakeIamBindingArgs;
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
   *          var binding = new LakeIamBinding("binding", LakeIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.LakeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.LakeIamMember;
   *  import com.pulumi.gcp.dataplex.LakeIamMemberArgs;
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
   *          var member = new LakeIamMember("member", LakeIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
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
   *  # IAM policy for Dataplex Lake
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Lake. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.LakeIamPolicy`: Authoritative. Sets the IAM policy for the lake and replaces any existing policy already attached.
   *  * `gcp.dataplex.LakeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the lake are preserved.
   *  * `gcp.dataplex.LakeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the lake are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.LakeIamPolicy`: Retrieves the IAM policy for the lake
   * 
   *  &gt; **Note:** `gcp.dataplex.LakeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.LakeIamBinding` and `gcp.dataplex.LakeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.LakeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.LakeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.LakeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.LakeIamPolicy;
   *  import com.pulumi.gcp.dataplex.LakeIamPolicyArgs;
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
   *          var policy = new LakeIamPolicy("policy", LakeIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.LakeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.LakeIamBinding;
   *  import com.pulumi.gcp.dataplex.LakeIamBindingArgs;
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
   *          var binding = new LakeIamBinding("binding", LakeIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.LakeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.LakeIamMember;
   *  import com.pulumi.gcp.dataplex.LakeIamMemberArgs;
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
   *          var member = new LakeIamMember("member", LakeIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/lakes/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex lake IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_lake_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_lake_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/lakeIamMember:LakeIamMember editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def LakeIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.LakeIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.LakeIamMemberArgs.builder
    com.pulumi.gcp.dataplex.LakeIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.ZoneIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.ZoneIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.DatascanIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Glossary. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.GlossaryIamPolicy`: Authoritative. Sets the IAM policy for the glossary and replaces any existing policy already attached.
   *  * `gcp.dataplex.GlossaryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the glossary are preserved.
   *  * `gcp.dataplex.GlossaryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the glossary are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.GlossaryIamPolicy`: Retrieves the IAM policy for the glossary
   * 
   *  &gt; **Note:** `gcp.dataplex.GlossaryIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.GlossaryIamBinding` and `gcp.dataplex.GlossaryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.GlossaryIamBinding` resources **can be** used in conjunction with `gcp.dataplex.GlossaryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.GlossaryIamPolicy
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
   *  import com.pulumi.gcp.dataplex.GlossaryIamPolicy;
   *  import com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs;
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
   *          var policy = new GlossaryIamPolicy("policy", GlossaryIamPolicyArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.GlossaryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.GlossaryIamBinding;
   *  import com.pulumi.gcp.dataplex.GlossaryIamBindingArgs;
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
   *          var binding = new GlossaryIamBinding("binding", GlossaryIamBindingArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.GlossaryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.GlossaryIamMember;
   *  import com.pulumi.gcp.dataplex.GlossaryIamMemberArgs;
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
   *          var member = new GlossaryIamMember("member", GlossaryIamMemberArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
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
   *  # IAM policy for Dataplex Glossary
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Glossary. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.GlossaryIamPolicy`: Authoritative. Sets the IAM policy for the glossary and replaces any existing policy already attached.
   *  * `gcp.dataplex.GlossaryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the glossary are preserved.
   *  * `gcp.dataplex.GlossaryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the glossary are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.GlossaryIamPolicy`: Retrieves the IAM policy for the glossary
   * 
   *  &gt; **Note:** `gcp.dataplex.GlossaryIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.GlossaryIamBinding` and `gcp.dataplex.GlossaryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.GlossaryIamBinding` resources **can be** used in conjunction with `gcp.dataplex.GlossaryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.GlossaryIamPolicy
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
   *  import com.pulumi.gcp.dataplex.GlossaryIamPolicy;
   *  import com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs;
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
   *          var policy = new GlossaryIamPolicy("policy", GlossaryIamPolicyArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.GlossaryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.GlossaryIamBinding;
   *  import com.pulumi.gcp.dataplex.GlossaryIamBindingArgs;
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
   *          var binding = new GlossaryIamBinding("binding", GlossaryIamBindingArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.GlossaryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.GlossaryIamMember;
   *  import com.pulumi.gcp.dataplex.GlossaryIamMemberArgs;
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
   *          var member = new GlossaryIamMember("member", GlossaryIamMemberArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
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
   *  * projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}}
   *  * {{project}}/{{location}}/{{glossary_id}}
   *  * {{location}}/{{glossary_id}}
   *  * {{glossary_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex glossary IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_glossary_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_glossary_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/glossaryIamBinding:GlossaryIamBinding editor projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def GlossaryIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.GlossaryIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.GlossaryIamBindingArgs.builder
    com.pulumi.gcp.dataplex.GlossaryIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.DatascanIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Task. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.TaskIamPolicy`: Authoritative. Sets the IAM policy for the task and replaces any existing policy already attached.
   *  * `gcp.dataplex.TaskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the task are preserved.
   *  * `gcp.dataplex.TaskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the task are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.TaskIamPolicy`: Retrieves the IAM policy for the task
   * 
   *  &gt; **Note:** `gcp.dataplex.TaskIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.TaskIamBinding` and `gcp.dataplex.TaskIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.TaskIamBinding` resources **can be** used in conjunction with `gcp.dataplex.TaskIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.TaskIamPolicy
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
   *  import com.pulumi.gcp.dataplex.TaskIamPolicy;
   *  import com.pulumi.gcp.dataplex.TaskIamPolicyArgs;
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
   *          var policy = new TaskIamPolicy("policy", TaskIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.TaskIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.TaskIamBinding;
   *  import com.pulumi.gcp.dataplex.TaskIamBindingArgs;
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
   *          var binding = new TaskIamBinding("binding", TaskIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.TaskIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.TaskIamMember;
   *  import com.pulumi.gcp.dataplex.TaskIamMemberArgs;
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
   *          var member = new TaskIamMember("member", TaskIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
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
   *  # IAM policy for Dataplex Task
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Task. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.TaskIamPolicy`: Authoritative. Sets the IAM policy for the task and replaces any existing policy already attached.
   *  * `gcp.dataplex.TaskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the task are preserved.
   *  * `gcp.dataplex.TaskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the task are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.TaskIamPolicy`: Retrieves the IAM policy for the task
   * 
   *  &gt; **Note:** `gcp.dataplex.TaskIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.TaskIamBinding` and `gcp.dataplex.TaskIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.TaskIamBinding` resources **can be** used in conjunction with `gcp.dataplex.TaskIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.TaskIamPolicy
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
   *  import com.pulumi.gcp.dataplex.TaskIamPolicy;
   *  import com.pulumi.gcp.dataplex.TaskIamPolicyArgs;
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
   *          var policy = new TaskIamPolicy("policy", TaskIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.TaskIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.TaskIamBinding;
   *  import com.pulumi.gcp.dataplex.TaskIamBindingArgs;
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
   *          var binding = new TaskIamBinding("binding", TaskIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.TaskIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.TaskIamMember;
   *  import com.pulumi.gcp.dataplex.TaskIamMemberArgs;
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
   *          var member = new TaskIamMember("member", TaskIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
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
   *  * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
   *  * {{project}}/{{location}}/{{lake}}/{{task_id}}
   *  * {{location}}/{{lake}}/{{task_id}}
   *  * {{task_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex task IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_task_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_task_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/taskIamPolicy:TaskIamPolicy editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TaskIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.TaskIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.TaskIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.TaskIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a user-visible job which provides the insights for the related data source.
   * 
   *  To get more information about Datascan, see:
   * 
   *  * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dataplex/docs)
   */
  def Datascan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DatascanArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.DatascanArgs.builder
    com.pulumi.gcp.dataplex.Datascan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.TaskIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.TaskIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Datascan. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.DatascanIamPolicy`: Authoritative. Sets the IAM policy for the datascan and replaces any existing policy already attached.
   *  * `gcp.dataplex.DatascanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datascan are preserved.
   *  * `gcp.dataplex.DatascanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datascan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.DatascanIamPolicy`: Retrieves the IAM policy for the datascan
   * 
   *  &gt; **Note:** `gcp.dataplex.DatascanIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DatascanIamBinding` and `gcp.dataplex.DatascanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.DatascanIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DatascanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.DatascanIamPolicy
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
   *  import com.pulumi.gcp.dataplex.DatascanIamPolicy;
   *  import com.pulumi.gcp.dataplex.DatascanIamPolicyArgs;
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
   *          var policy = new DatascanIamPolicy("policy", DatascanIamPolicyArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.DatascanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.DatascanIamBinding;
   *  import com.pulumi.gcp.dataplex.DatascanIamBindingArgs;
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
   *          var binding = new DatascanIamBinding("binding", DatascanIamBindingArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.DatascanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.DatascanIamMember;
   *  import com.pulumi.gcp.dataplex.DatascanIamMemberArgs;
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
   *          var member = new DatascanIamMember("member", DatascanIamMemberArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
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
   *  # IAM policy for Dataplex Datascan
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Datascan. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.DatascanIamPolicy`: Authoritative. Sets the IAM policy for the datascan and replaces any existing policy already attached.
   *  * `gcp.dataplex.DatascanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datascan are preserved.
   *  * `gcp.dataplex.DatascanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datascan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.DatascanIamPolicy`: Retrieves the IAM policy for the datascan
   * 
   *  &gt; **Note:** `gcp.dataplex.DatascanIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DatascanIamBinding` and `gcp.dataplex.DatascanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.DatascanIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DatascanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.DatascanIamPolicy
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
   *  import com.pulumi.gcp.dataplex.DatascanIamPolicy;
   *  import com.pulumi.gcp.dataplex.DatascanIamPolicyArgs;
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
   *          var policy = new DatascanIamPolicy("policy", DatascanIamPolicyArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.DatascanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.DatascanIamBinding;
   *  import com.pulumi.gcp.dataplex.DatascanIamBindingArgs;
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
   *          var binding = new DatascanIamBinding("binding", DatascanIamBindingArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.DatascanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.DatascanIamMember;
   *  import com.pulumi.gcp.dataplex.DatascanIamMemberArgs;
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
   *          var member = new DatascanIamMember("member", DatascanIamMemberArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
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
   *  * projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}}
   *  * {{project}}/{{location}}/{{data_scan_id}}
   *  * {{location}}/{{data_scan_id}}
   *  * {{data_scan_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex datascan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_datascan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_datascan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/datascanIamBinding:DatascanIamBinding editor projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DatascanIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DatascanIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.DatascanIamBindingArgs.builder
    com.pulumi.gcp.dataplex.DatascanIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AspectTypeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AspectTypeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  type DataplexFunctions = com.pulumi.gcp.dataplex.DataplexFunctions
  object DataplexFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.dataplex.DataplexFunctions.*
  extension (self: DataplexFunctions.type)
    /** Retrieves the current IAM policy data for aspecttype */
    def getAspectTypeIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetAspectTypeIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetAspectTypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetAspectTypeIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getAspectTypeIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for aspecttype */
    def getAspectTypeIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetAspectTypeIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetAspectTypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetAspectTypeIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getAspectTypeIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for asset */
    def getAssetIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetAssetIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetAssetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetAssetIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getAssetIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for asset */
    def getAssetIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetAssetIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetAssetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetAssetIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getAssetIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the generated data quality rules for the creating a new data quality scan.
     *  For more information see
     *  the [official documentation](https://cloud.google.com/dataplex/docs)
     *  and [API](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.dataScans/generateDataQualityRules).
     * 
     *  ## example
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.dataplex.DataplexFunctions;
     *  import com.pulumi.gcp.dataplex.inputs.GetDataQualityRulesArgs;
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
     *          final var dqrs = DataplexFunctions.getDataQualityRules(GetDataQualityRulesArgs.builder()
     *              .project("my-project")
     *              .location("use-central1")
     *              .dataScanId("my-datascan-profile")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getDataQualityRules(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetDataQualityRulesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetDataQualityRulesResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetDataQualityRulesArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getDataQualityRules(args(argsBuilder).build)

    /**
     * Retrieves the generated data quality rules for the creating a new data quality scan.
     *  For more information see
     *  the [official documentation](https://cloud.google.com/dataplex/docs)
     *  and [API](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.dataScans/generateDataQualityRules).
     * 
     *  ## example
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.dataplex.DataplexFunctions;
     *  import com.pulumi.gcp.dataplex.inputs.GetDataQualityRulesArgs;
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
     *          final var dqrs = DataplexFunctions.getDataQualityRules(GetDataQualityRulesArgs.builder()
     *              .project("my-project")
     *              .location("use-central1")
     *              .dataScanId("my-datascan-profile")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getDataQualityRulesPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetDataQualityRulesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetDataQualityRulesResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetDataQualityRulesPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getDataQualityRulesPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for datascan */
    def getDatascanIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetDatascanIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetDatascanIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetDatascanIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getDatascanIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for datascan */
    def getDatascanIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetDatascanIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetDatascanIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetDatascanIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getDatascanIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for entrygroup */
    def getEntryGroupIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetEntryGroupIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetEntryGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetEntryGroupIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getEntryGroupIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for entrygroup */
    def getEntryGroupIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetEntryGroupIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetEntryGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetEntryGroupIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getEntryGroupIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for entrytype */
    def getEntryTypeIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetEntryTypeIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetEntryTypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetEntryTypeIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getEntryTypeIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for entrytype */
    def getEntryTypeIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetEntryTypeIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetEntryTypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetEntryTypeIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getEntryTypeIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for glossary */
    def getGlossaryIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetGlossaryIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetGlossaryIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetGlossaryIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getGlossaryIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for glossary */
    def getGlossaryIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetGlossaryIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetGlossaryIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetGlossaryIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getGlossaryIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for lake */
    def getLakeIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetLakeIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetLakeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetLakeIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getLakeIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for lake */
    def getLakeIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetLakeIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetLakeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetLakeIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getLakeIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for task */
    def getTaskIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetTaskIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetTaskIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetTaskIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getTaskIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for task */
    def getTaskIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetTaskIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetTaskIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetTaskIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getTaskIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for zone */
    def getZoneIamPolicy(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetZoneIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dataplex.outputs.GetZoneIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetZoneIamPolicyArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getZoneIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for zone */
    def getZoneIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GetZoneIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dataplex.outputs.GetZoneIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GetZoneIamPolicyPlainArgs.builder
      com.pulumi.gcp.dataplex.DataplexFunctions.getZoneIamPolicyPlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Task. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.TaskIamPolicy`: Authoritative. Sets the IAM policy for the task and replaces any existing policy already attached.
   *  * `gcp.dataplex.TaskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the task are preserved.
   *  * `gcp.dataplex.TaskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the task are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.TaskIamPolicy`: Retrieves the IAM policy for the task
   * 
   *  &gt; **Note:** `gcp.dataplex.TaskIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.TaskIamBinding` and `gcp.dataplex.TaskIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.TaskIamBinding` resources **can be** used in conjunction with `gcp.dataplex.TaskIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.TaskIamPolicy
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
   *  import com.pulumi.gcp.dataplex.TaskIamPolicy;
   *  import com.pulumi.gcp.dataplex.TaskIamPolicyArgs;
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
   *          var policy = new TaskIamPolicy("policy", TaskIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.TaskIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.TaskIamBinding;
   *  import com.pulumi.gcp.dataplex.TaskIamBindingArgs;
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
   *          var binding = new TaskIamBinding("binding", TaskIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.TaskIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.TaskIamMember;
   *  import com.pulumi.gcp.dataplex.TaskIamMemberArgs;
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
   *          var member = new TaskIamMember("member", TaskIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
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
   *  # IAM policy for Dataplex Task
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Task. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.TaskIamPolicy`: Authoritative. Sets the IAM policy for the task and replaces any existing policy already attached.
   *  * `gcp.dataplex.TaskIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the task are preserved.
   *  * `gcp.dataplex.TaskIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the task are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.TaskIamPolicy`: Retrieves the IAM policy for the task
   * 
   *  &gt; **Note:** `gcp.dataplex.TaskIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.TaskIamBinding` and `gcp.dataplex.TaskIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.TaskIamBinding` resources **can be** used in conjunction with `gcp.dataplex.TaskIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.TaskIamPolicy
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
   *  import com.pulumi.gcp.dataplex.TaskIamPolicy;
   *  import com.pulumi.gcp.dataplex.TaskIamPolicyArgs;
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
   *          var policy = new TaskIamPolicy("policy", TaskIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.TaskIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.TaskIamBinding;
   *  import com.pulumi.gcp.dataplex.TaskIamBindingArgs;
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
   *          var binding = new TaskIamBinding("binding", TaskIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.TaskIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.TaskIamMember;
   *  import com.pulumi.gcp.dataplex.TaskIamMemberArgs;
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
   *          var member = new TaskIamMember("member", TaskIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .taskId(example.taskId())
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
   *  * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
   *  * {{project}}/{{location}}/{{lake}}/{{task_id}}
   *  * {{location}}/{{lake}}/{{task_id}}
   *  * {{task_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex task IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_task_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_task_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/taskIamBinding:TaskIamBinding editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TaskIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.TaskIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.TaskIamBindingArgs.builder
    com.pulumi.gcp.dataplex.TaskIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** An Aspect Type is a template for creating Aspects. */
  def AspectType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AspectTypeArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.AspectTypeArgs.builder
    com.pulumi.gcp.dataplex.AspectType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex AspectType. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.AspectTypeIamPolicy`: Authoritative. Sets the IAM policy for the aspecttype and replaces any existing policy already attached.
   *  * `gcp.dataplex.AspectTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the aspecttype are preserved.
   *  * `gcp.dataplex.AspectTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the aspecttype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.AspectTypeIamPolicy`: Retrieves the IAM policy for the aspecttype
   * 
   *  &gt; **Note:** `gcp.dataplex.AspectTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AspectTypeIamBinding` and `gcp.dataplex.AspectTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.AspectTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AspectTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.AspectTypeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.AspectTypeIamPolicy;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs;
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
   *          var policy = new AspectTypeIamPolicy("policy", AspectTypeIamPolicyArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AspectTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamBinding;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs;
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
   *          var binding = new AspectTypeIamBinding("binding", AspectTypeIamBindingArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AspectTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamMember;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs;
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
   *          var member = new AspectTypeIamMember("member", AspectTypeIamMemberArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
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
   *  # IAM policy for Dataplex AspectType
   * 
   *  Three different resources help you manage your IAM policy for Dataplex AspectType. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.AspectTypeIamPolicy`: Authoritative. Sets the IAM policy for the aspecttype and replaces any existing policy already attached.
   *  * `gcp.dataplex.AspectTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the aspecttype are preserved.
   *  * `gcp.dataplex.AspectTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the aspecttype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.AspectTypeIamPolicy`: Retrieves the IAM policy for the aspecttype
   * 
   *  &gt; **Note:** `gcp.dataplex.AspectTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AspectTypeIamBinding` and `gcp.dataplex.AspectTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.AspectTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AspectTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.AspectTypeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.AspectTypeIamPolicy;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs;
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
   *          var policy = new AspectTypeIamPolicy("policy", AspectTypeIamPolicyArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AspectTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamBinding;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs;
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
   *          var binding = new AspectTypeIamBinding("binding", AspectTypeIamBindingArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AspectTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamMember;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs;
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
   *          var member = new AspectTypeIamMember("member", AspectTypeIamMemberArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
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
   *  * projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}}
   *  * {{project}}/{{location}}/{{aspect_type_id}}
   *  * {{location}}/{{aspect_type_id}}
   *  * {{aspect_type_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex aspecttype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_aspect_type_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_aspect_type_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/aspectTypeIamMember:AspectTypeIamMember editor projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AspectTypeIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs.builder
    com.pulumi.gcp.dataplex.AspectTypeIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.LakeIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.LakeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.AssetIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.AssetIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.EntryArgs.Builder)
    /**
     * @param aspects The aspects that are attached to the entry.
     *  Structure is documented below.
     * @return builder
     */
    def aspects(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryAspectArgs.Builder]*):
        com.pulumi.gcp.dataplex.EntryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryAspectArgs.builder
      builder.aspects(args.map(_(argsBuilder).build)*)

    /**
     * @param entrySource A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def entrySource(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryEntrySourceArgs.Builder]):
        com.pulumi.gcp.dataplex.EntryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryEntrySourceArgs.builder
      builder.entrySource(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Lake. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.LakeIamPolicy`: Authoritative. Sets the IAM policy for the lake and replaces any existing policy already attached.
   *  * `gcp.dataplex.LakeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the lake are preserved.
   *  * `gcp.dataplex.LakeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the lake are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.LakeIamPolicy`: Retrieves the IAM policy for the lake
   * 
   *  &gt; **Note:** `gcp.dataplex.LakeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.LakeIamBinding` and `gcp.dataplex.LakeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.LakeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.LakeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.LakeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.LakeIamPolicy;
   *  import com.pulumi.gcp.dataplex.LakeIamPolicyArgs;
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
   *          var policy = new LakeIamPolicy("policy", LakeIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.LakeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.LakeIamBinding;
   *  import com.pulumi.gcp.dataplex.LakeIamBindingArgs;
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
   *          var binding = new LakeIamBinding("binding", LakeIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.LakeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.LakeIamMember;
   *  import com.pulumi.gcp.dataplex.LakeIamMemberArgs;
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
   *          var member = new LakeIamMember("member", LakeIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
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
   *  # IAM policy for Dataplex Lake
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Lake. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.LakeIamPolicy`: Authoritative. Sets the IAM policy for the lake and replaces any existing policy already attached.
   *  * `gcp.dataplex.LakeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the lake are preserved.
   *  * `gcp.dataplex.LakeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the lake are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.LakeIamPolicy`: Retrieves the IAM policy for the lake
   * 
   *  &gt; **Note:** `gcp.dataplex.LakeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.LakeIamBinding` and `gcp.dataplex.LakeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.LakeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.LakeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.LakeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.LakeIamPolicy;
   *  import com.pulumi.gcp.dataplex.LakeIamPolicyArgs;
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
   *          var policy = new LakeIamPolicy("policy", LakeIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.LakeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.LakeIamBinding;
   *  import com.pulumi.gcp.dataplex.LakeIamBindingArgs;
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
   *          var binding = new LakeIamBinding("binding", LakeIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.LakeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.LakeIamMember;
   *  import com.pulumi.gcp.dataplex.LakeIamMemberArgs;
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
   *          var member = new LakeIamMember("member", LakeIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/lakes/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex lake IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_lake_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_lake_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/lakeIamPolicy:LakeIamPolicy editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def LakeIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.LakeIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.LakeIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.LakeIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.DataProductDataAssetArgs.Builder)
    /**
     * @param accessGroupConfigs Access groups configurations.
     *  Structure is documented below.
     * @return builder
     */
    def accessGroupConfigs(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductDataAssetAccessGroupConfigArgs.Builder]*):
        com.pulumi.gcp.dataplex.DataProductDataAssetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductDataAssetAccessGroupConfigArgs.builder
      builder.accessGroupConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.DataProductArgs.Builder)
    /**
     * @param accessGroups Custom user defined access groups at the data product level.
     *  Structure is documented below.
     * @return builder
     */
    def accessGroups(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupArgs.Builder]*):
        com.pulumi.gcp.dataplex.DataProductArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupArgs.builder
      builder.accessGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.ZoneArgs.Builder)
    /**
     * @param discoverySpec Required. Specification of the discovery feature applied to data in this zone.
     * @return builder
     */
    def discoverySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.ZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs.builder
      builder.discoverySpec(args(argsBuilder).build)

    /**
     * @param resourceSpec Required. Immutable. Specification of the resources that are referenced by the assets within this zone.
     * @return builder
     */
    def resourceSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneResourceSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.ZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneResourceSpecArgs.builder
      builder.resourceSpec(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Datascan. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.DatascanIamPolicy`: Authoritative. Sets the IAM policy for the datascan and replaces any existing policy already attached.
   *  * `gcp.dataplex.DatascanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datascan are preserved.
   *  * `gcp.dataplex.DatascanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datascan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.DatascanIamPolicy`: Retrieves the IAM policy for the datascan
   * 
   *  &gt; **Note:** `gcp.dataplex.DatascanIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DatascanIamBinding` and `gcp.dataplex.DatascanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.DatascanIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DatascanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.DatascanIamPolicy
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
   *  import com.pulumi.gcp.dataplex.DatascanIamPolicy;
   *  import com.pulumi.gcp.dataplex.DatascanIamPolicyArgs;
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
   *          var policy = new DatascanIamPolicy("policy", DatascanIamPolicyArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.DatascanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.DatascanIamBinding;
   *  import com.pulumi.gcp.dataplex.DatascanIamBindingArgs;
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
   *          var binding = new DatascanIamBinding("binding", DatascanIamBindingArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.DatascanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.DatascanIamMember;
   *  import com.pulumi.gcp.dataplex.DatascanIamMemberArgs;
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
   *          var member = new DatascanIamMember("member", DatascanIamMemberArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
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
   *  # IAM policy for Dataplex Datascan
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Datascan. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.DatascanIamPolicy`: Authoritative. Sets the IAM policy for the datascan and replaces any existing policy already attached.
   *  * `gcp.dataplex.DatascanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datascan are preserved.
   *  * `gcp.dataplex.DatascanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datascan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.DatascanIamPolicy`: Retrieves the IAM policy for the datascan
   * 
   *  &gt; **Note:** `gcp.dataplex.DatascanIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DatascanIamBinding` and `gcp.dataplex.DatascanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.DatascanIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DatascanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.DatascanIamPolicy
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
   *  import com.pulumi.gcp.dataplex.DatascanIamPolicy;
   *  import com.pulumi.gcp.dataplex.DatascanIamPolicyArgs;
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
   *          var policy = new DatascanIamPolicy("policy", DatascanIamPolicyArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.DatascanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.DatascanIamBinding;
   *  import com.pulumi.gcp.dataplex.DatascanIamBindingArgs;
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
   *          var binding = new DatascanIamBinding("binding", DatascanIamBindingArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.DatascanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.DatascanIamMember;
   *  import com.pulumi.gcp.dataplex.DatascanIamMemberArgs;
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
   *          var member = new DatascanIamMember("member", DatascanIamMemberArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
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
   *  * projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}}
   *  * {{project}}/{{location}}/{{data_scan_id}}
   *  * {{location}}/{{data_scan_id}}
   *  * {{data_scan_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex datascan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_datascan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_datascan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/datascanIamMember:DatascanIamMember editor projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DatascanIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DatascanIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.DatascanIamMemberArgs.builder
    com.pulumi.gcp.dataplex.DatascanIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.LakeArgs.Builder)
    /**
     * @param metastore Optional. Settings to manage lake and Dataproc Metastore service instance association.
     * @return builder
     */
    def metastore(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeMetastoreArgs.Builder]):
        com.pulumi.gcp.dataplex.LakeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeMetastoreArgs.builder
      builder.metastore(args(argsBuilder).build)

  /** Represents a collection of categories and terms defined by the user. Glossary is a top level resource and is the GCP parent resource of all the categories and terms within it. */
  def Glossary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.GlossaryArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.GlossaryArgs.builder
    com.pulumi.gcp.dataplex.Glossary(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex AspectType. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.AspectTypeIamPolicy`: Authoritative. Sets the IAM policy for the aspecttype and replaces any existing policy already attached.
   *  * `gcp.dataplex.AspectTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the aspecttype are preserved.
   *  * `gcp.dataplex.AspectTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the aspecttype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.AspectTypeIamPolicy`: Retrieves the IAM policy for the aspecttype
   * 
   *  &gt; **Note:** `gcp.dataplex.AspectTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AspectTypeIamBinding` and `gcp.dataplex.AspectTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.AspectTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AspectTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.AspectTypeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.AspectTypeIamPolicy;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs;
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
   *          var policy = new AspectTypeIamPolicy("policy", AspectTypeIamPolicyArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AspectTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamBinding;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs;
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
   *          var binding = new AspectTypeIamBinding("binding", AspectTypeIamBindingArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AspectTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamMember;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs;
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
   *          var member = new AspectTypeIamMember("member", AspectTypeIamMemberArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
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
   *  # IAM policy for Dataplex AspectType
   * 
   *  Three different resources help you manage your IAM policy for Dataplex AspectType. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.AspectTypeIamPolicy`: Authoritative. Sets the IAM policy for the aspecttype and replaces any existing policy already attached.
   *  * `gcp.dataplex.AspectTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the aspecttype are preserved.
   *  * `gcp.dataplex.AspectTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the aspecttype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.AspectTypeIamPolicy`: Retrieves the IAM policy for the aspecttype
   * 
   *  &gt; **Note:** `gcp.dataplex.AspectTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AspectTypeIamBinding` and `gcp.dataplex.AspectTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.AspectTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AspectTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.AspectTypeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.AspectTypeIamPolicy;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamPolicyArgs;
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
   *          var policy = new AspectTypeIamPolicy("policy", AspectTypeIamPolicyArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AspectTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamBinding;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs;
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
   *          var binding = new AspectTypeIamBinding("binding", AspectTypeIamBindingArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AspectTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamMember;
   *  import com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs;
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
   *          var member = new AspectTypeIamMember("member", AspectTypeIamMemberArgs.builder()
   *              .project(testAspectTypeBasic.project())
   *              .location(testAspectTypeBasic.location())
   *              .aspectTypeId(testAspectTypeBasic.aspectTypeId())
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
   *  * projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}}
   *  * {{project}}/{{location}}/{{aspect_type_id}}
   *  * {{location}}/{{aspect_type_id}}
   *  * {{aspect_type_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex aspecttype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_aspect_type_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_aspect_type_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/aspectTypeIamBinding:AspectTypeIamBinding editor projects/{{project}}/locations/{{location}}/aspectTypes/{{aspect_type_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AspectTypeIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs.builder
    com.pulumi.gcp.dataplex.AspectTypeIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** An Entry Group represents a logical grouping of one or more Entries. */
  def EntryGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryGroupArgs.builder
    com.pulumi.gcp.dataplex.EntryGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Asset. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.AssetIamPolicy`: Authoritative. Sets the IAM policy for the asset and replaces any existing policy already attached.
   *  * `gcp.dataplex.AssetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the asset are preserved.
   *  * `gcp.dataplex.AssetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the asset are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.AssetIamPolicy`: Retrieves the IAM policy for the asset
   * 
   *  &gt; **Note:** `gcp.dataplex.AssetIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AssetIamBinding` and `gcp.dataplex.AssetIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.AssetIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AssetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.AssetIamPolicy
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
   *  import com.pulumi.gcp.dataplex.AssetIamPolicy;
   *  import com.pulumi.gcp.dataplex.AssetIamPolicyArgs;
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
   *          var policy = new AssetIamPolicy("policy", AssetIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AssetIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AssetIamBinding;
   *  import com.pulumi.gcp.dataplex.AssetIamBindingArgs;
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
   *          var binding = new AssetIamBinding("binding", AssetIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AssetIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AssetIamMember;
   *  import com.pulumi.gcp.dataplex.AssetIamMemberArgs;
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
   *          var member = new AssetIamMember("member", AssetIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
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
   *  # IAM policy for Dataplex Asset
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Asset. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.AssetIamPolicy`: Authoritative. Sets the IAM policy for the asset and replaces any existing policy already attached.
   *  * `gcp.dataplex.AssetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the asset are preserved.
   *  * `gcp.dataplex.AssetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the asset are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.AssetIamPolicy`: Retrieves the IAM policy for the asset
   * 
   *  &gt; **Note:** `gcp.dataplex.AssetIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AssetIamBinding` and `gcp.dataplex.AssetIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.AssetIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AssetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.AssetIamPolicy
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
   *  import com.pulumi.gcp.dataplex.AssetIamPolicy;
   *  import com.pulumi.gcp.dataplex.AssetIamPolicyArgs;
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
   *          var policy = new AssetIamPolicy("policy", AssetIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AssetIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AssetIamBinding;
   *  import com.pulumi.gcp.dataplex.AssetIamBindingArgs;
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
   *          var binding = new AssetIamBinding("binding", AssetIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AssetIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AssetIamMember;
   *  import com.pulumi.gcp.dataplex.AssetIamMemberArgs;
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
   *          var member = new AssetIamMember("member", AssetIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{name}}
   *  * {{project}}/{{location}}/{{lake}}/{{dataplex_zone}}/{{name}}
   *  * {{location}}/{{lake}}/{{dataplex_zone}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex asset IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_asset_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_asset_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/assetIamPolicy:AssetIamPolicy editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AssetIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AssetIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.AssetIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.AssetIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex EntryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   *  * `gcp.dataplex.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved.
   *  * `gcp.dataplex.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryGroupIamBinding` and `gcp.dataplex.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.EntryGroupIamPolicy
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
   *  import com.pulumi.gcp.dataplex.EntryGroupIamPolicy;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs;
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
   *          var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamBinding;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs;
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
   *          var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamMember;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs;
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
   *          var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
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
   *  # IAM policy for Dataplex EntryGroup
   * 
   *  Three different resources help you manage your IAM policy for Dataplex EntryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   *  * `gcp.dataplex.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved.
   *  * `gcp.dataplex.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryGroupIamBinding` and `gcp.dataplex.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.EntryGroupIamPolicy
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
   *  import com.pulumi.gcp.dataplex.EntryGroupIamPolicy;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs;
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
   *          var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamBinding;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs;
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
   *          var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamMember;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs;
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
   *          var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
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
   *  * projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}}
   *  * {{project}}/{{location}}/{{entry_group_id}}
   *  * {{location}}/{{entry_group_id}}
   *  * {{entry_group_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex entrygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_entry_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_entry_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/entryGroupIamBinding:EntryGroupIamBinding editor projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryGroupIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs.builder
    com.pulumi.gcp.dataplex.EntryGroupIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex EntryType. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.EntryTypeIamPolicy`: Authoritative. Sets the IAM policy for the entrytype and replaces any existing policy already attached.
   *  * `gcp.dataplex.EntryTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrytype are preserved.
   *  * `gcp.dataplex.EntryTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrytype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.EntryTypeIamPolicy`: Retrieves the IAM policy for the entrytype
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryTypeIamBinding` and `gcp.dataplex.EntryTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.EntryTypeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.EntryTypeIamPolicy;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs;
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
   *          var policy = new EntryTypeIamPolicy("policy", EntryTypeIamPolicyArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamBinding;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs;
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
   *          var binding = new EntryTypeIamBinding("binding", EntryTypeIamBindingArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamMember;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs;
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
   *          var member = new EntryTypeIamMember("member", EntryTypeIamMemberArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
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
   *  # IAM policy for Dataplex EntryType
   * 
   *  Three different resources help you manage your IAM policy for Dataplex EntryType. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.EntryTypeIamPolicy`: Authoritative. Sets the IAM policy for the entrytype and replaces any existing policy already attached.
   *  * `gcp.dataplex.EntryTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrytype are preserved.
   *  * `gcp.dataplex.EntryTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrytype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.EntryTypeIamPolicy`: Retrieves the IAM policy for the entrytype
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryTypeIamBinding` and `gcp.dataplex.EntryTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.EntryTypeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.EntryTypeIamPolicy;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs;
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
   *          var policy = new EntryTypeIamPolicy("policy", EntryTypeIamPolicyArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamBinding;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs;
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
   *          var binding = new EntryTypeIamBinding("binding", EntryTypeIamBindingArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamMember;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs;
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
   *          var member = new EntryTypeIamMember("member", EntryTypeIamMemberArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
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
   *  * projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}}
   *  * {{project}}/{{location}}/{{entry_type_id}}
   *  * {{location}}/{{entry_type_id}}
   *  * {{entry_type_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex entrytype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_entry_type_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_entry_type_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/entryTypeIamPolicy:EntryTypeIamPolicy editor projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryTypeIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.EntryTypeIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A data product is a curated collection of data assets, packaged to address
   *  specific use cases.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about DataProduct, see:
   * 
   *  * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.dataProducts)
   *  * How-to Guides
   *      * [Introduction to Data Products](https://cloud.google.com/dataplex/docs/data-products-overview)
   */
  def DataProduct(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DataProductArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.DataProductArgs.builder
    com.pulumi.gcp.dataplex.DataProduct(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Zone. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.ZoneIamPolicy`: Authoritative. Sets the IAM policy for the zone and replaces any existing policy already attached.
   *  * `gcp.dataplex.ZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the zone are preserved.
   *  * `gcp.dataplex.ZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the zone are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.ZoneIamPolicy`: Retrieves the IAM policy for the zone
   * 
   *  &gt; **Note:** `gcp.dataplex.ZoneIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.ZoneIamBinding` and `gcp.dataplex.ZoneIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.ZoneIamBinding` resources **can be** used in conjunction with `gcp.dataplex.ZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.ZoneIamPolicy
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
   *  import com.pulumi.gcp.dataplex.ZoneIamPolicy;
   *  import com.pulumi.gcp.dataplex.ZoneIamPolicyArgs;
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
   *          var policy = new ZoneIamPolicy("policy", ZoneIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.ZoneIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.ZoneIamBinding;
   *  import com.pulumi.gcp.dataplex.ZoneIamBindingArgs;
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
   *          var binding = new ZoneIamBinding("binding", ZoneIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.ZoneIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.ZoneIamMember;
   *  import com.pulumi.gcp.dataplex.ZoneIamMemberArgs;
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
   *          var member = new ZoneIamMember("member", ZoneIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
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
   *  # IAM policy for Dataplex Zone
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Zone. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.ZoneIamPolicy`: Authoritative. Sets the IAM policy for the zone and replaces any existing policy already attached.
   *  * `gcp.dataplex.ZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the zone are preserved.
   *  * `gcp.dataplex.ZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the zone are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.ZoneIamPolicy`: Retrieves the IAM policy for the zone
   * 
   *  &gt; **Note:** `gcp.dataplex.ZoneIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.ZoneIamBinding` and `gcp.dataplex.ZoneIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.ZoneIamBinding` resources **can be** used in conjunction with `gcp.dataplex.ZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.ZoneIamPolicy
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
   *  import com.pulumi.gcp.dataplex.ZoneIamPolicy;
   *  import com.pulumi.gcp.dataplex.ZoneIamPolicyArgs;
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
   *          var policy = new ZoneIamPolicy("policy", ZoneIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.ZoneIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.ZoneIamBinding;
   *  import com.pulumi.gcp.dataplex.ZoneIamBindingArgs;
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
   *          var binding = new ZoneIamBinding("binding", ZoneIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.ZoneIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.ZoneIamMember;
   *  import com.pulumi.gcp.dataplex.ZoneIamMemberArgs;
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
   *          var member = new ZoneIamMember("member", ZoneIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{name}}
   *  * {{project}}/{{location}}/{{lake}}/{{name}}
   *  * {{location}}/{{lake}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex zone IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_zone_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_zone_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/zoneIamBinding:ZoneIamBinding editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ZoneIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.ZoneIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.ZoneIamBindingArgs.builder
    com.pulumi.gcp.dataplex.ZoneIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.TaskArgs.Builder)
    /**
     * @param executionSpec Configuration for the cluster
     *  Structure is documented below.
     * @return builder
     */
    def executionSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskExecutionSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.TaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskExecutionSpecArgs.builder
      builder.executionSpec(args(argsBuilder).build)

    /**
     * @param notebook A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     *  Structure is documented below.
     * @return builder
     */
    def notebook(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskNotebookArgs.Builder]):
        com.pulumi.gcp.dataplex.TaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskNotebookArgs.builder
      builder.notebook(args(argsBuilder).build)

    /**
     * @param spark A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     *  Structure is documented below.
     * @return builder
     */
    def spark(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskSparkArgs.Builder]):
        com.pulumi.gcp.dataplex.TaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskSparkArgs.builder
      builder.spark(args(argsBuilder).build)

    /**
     * @param triggerSpec Configuration for the cluster
     *  Structure is documented below.
     * @return builder
     */
    def triggerSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskTriggerSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.TaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskTriggerSpecArgs.builder
      builder.triggerSpec(args(argsBuilder).build)

  /** Represents a collection of categories and terms within a Glossary that are related to each other. */
  def GlossaryCategory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.GlossaryCategoryArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.GlossaryCategoryArgs.builder
    com.pulumi.gcp.dataplex.GlossaryCategory(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** An Entry Type is a template for creating Entries. */
  def EntryType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryTypeArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryTypeArgs.builder
    com.pulumi.gcp.dataplex.EntryType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.LakeIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.LakeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Zone. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.ZoneIamPolicy`: Authoritative. Sets the IAM policy for the zone and replaces any existing policy already attached.
   *  * `gcp.dataplex.ZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the zone are preserved.
   *  * `gcp.dataplex.ZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the zone are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.ZoneIamPolicy`: Retrieves the IAM policy for the zone
   * 
   *  &gt; **Note:** `gcp.dataplex.ZoneIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.ZoneIamBinding` and `gcp.dataplex.ZoneIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.ZoneIamBinding` resources **can be** used in conjunction with `gcp.dataplex.ZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.ZoneIamPolicy
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
   *  import com.pulumi.gcp.dataplex.ZoneIamPolicy;
   *  import com.pulumi.gcp.dataplex.ZoneIamPolicyArgs;
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
   *          var policy = new ZoneIamPolicy("policy", ZoneIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.ZoneIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.ZoneIamBinding;
   *  import com.pulumi.gcp.dataplex.ZoneIamBindingArgs;
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
   *          var binding = new ZoneIamBinding("binding", ZoneIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.ZoneIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.ZoneIamMember;
   *  import com.pulumi.gcp.dataplex.ZoneIamMemberArgs;
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
   *          var member = new ZoneIamMember("member", ZoneIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
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
   *  # IAM policy for Dataplex Zone
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Zone. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.ZoneIamPolicy`: Authoritative. Sets the IAM policy for the zone and replaces any existing policy already attached.
   *  * `gcp.dataplex.ZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the zone are preserved.
   *  * `gcp.dataplex.ZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the zone are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.ZoneIamPolicy`: Retrieves the IAM policy for the zone
   * 
   *  &gt; **Note:** `gcp.dataplex.ZoneIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.ZoneIamBinding` and `gcp.dataplex.ZoneIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.ZoneIamBinding` resources **can be** used in conjunction with `gcp.dataplex.ZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.ZoneIamPolicy
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
   *  import com.pulumi.gcp.dataplex.ZoneIamPolicy;
   *  import com.pulumi.gcp.dataplex.ZoneIamPolicyArgs;
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
   *          var policy = new ZoneIamPolicy("policy", ZoneIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.ZoneIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.ZoneIamBinding;
   *  import com.pulumi.gcp.dataplex.ZoneIamBindingArgs;
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
   *          var binding = new ZoneIamBinding("binding", ZoneIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.ZoneIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.ZoneIamMember;
   *  import com.pulumi.gcp.dataplex.ZoneIamMemberArgs;
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
   *          var member = new ZoneIamMember("member", ZoneIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{name}}
   *  * {{project}}/{{location}}/{{lake}}/{{name}}
   *  * {{location}}/{{lake}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex zone IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_zone_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_zone_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/zoneIamMember:ZoneIamMember editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ZoneIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.ZoneIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.ZoneIamMemberArgs.builder
    com.pulumi.gcp.dataplex.ZoneIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Glossary. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.GlossaryIamPolicy`: Authoritative. Sets the IAM policy for the glossary and replaces any existing policy already attached.
   *  * `gcp.dataplex.GlossaryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the glossary are preserved.
   *  * `gcp.dataplex.GlossaryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the glossary are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.GlossaryIamPolicy`: Retrieves the IAM policy for the glossary
   * 
   *  &gt; **Note:** `gcp.dataplex.GlossaryIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.GlossaryIamBinding` and `gcp.dataplex.GlossaryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.GlossaryIamBinding` resources **can be** used in conjunction with `gcp.dataplex.GlossaryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.GlossaryIamPolicy
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
   *  import com.pulumi.gcp.dataplex.GlossaryIamPolicy;
   *  import com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs;
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
   *          var policy = new GlossaryIamPolicy("policy", GlossaryIamPolicyArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.GlossaryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.GlossaryIamBinding;
   *  import com.pulumi.gcp.dataplex.GlossaryIamBindingArgs;
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
   *          var binding = new GlossaryIamBinding("binding", GlossaryIamBindingArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.GlossaryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.GlossaryIamMember;
   *  import com.pulumi.gcp.dataplex.GlossaryIamMemberArgs;
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
   *          var member = new GlossaryIamMember("member", GlossaryIamMemberArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
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
   *  # IAM policy for Dataplex Glossary
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Glossary. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.GlossaryIamPolicy`: Authoritative. Sets the IAM policy for the glossary and replaces any existing policy already attached.
   *  * `gcp.dataplex.GlossaryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the glossary are preserved.
   *  * `gcp.dataplex.GlossaryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the glossary are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.GlossaryIamPolicy`: Retrieves the IAM policy for the glossary
   * 
   *  &gt; **Note:** `gcp.dataplex.GlossaryIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.GlossaryIamBinding` and `gcp.dataplex.GlossaryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.GlossaryIamBinding` resources **can be** used in conjunction with `gcp.dataplex.GlossaryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.GlossaryIamPolicy
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
   *  import com.pulumi.gcp.dataplex.GlossaryIamPolicy;
   *  import com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs;
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
   *          var policy = new GlossaryIamPolicy("policy", GlossaryIamPolicyArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.GlossaryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.GlossaryIamBinding;
   *  import com.pulumi.gcp.dataplex.GlossaryIamBindingArgs;
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
   *          var binding = new GlossaryIamBinding("binding", GlossaryIamBindingArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.GlossaryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.GlossaryIamMember;
   *  import com.pulumi.gcp.dataplex.GlossaryIamMemberArgs;
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
   *          var member = new GlossaryIamMember("member", GlossaryIamMemberArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
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
   *  * projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}}
   *  * {{project}}/{{location}}/{{glossary_id}}
   *  * {{location}}/{{glossary_id}}
   *  * {{glossary_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex glossary IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_glossary_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_glossary_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/glossaryIamPolicy:GlossaryIamPolicy editor projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def GlossaryIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.GlossaryIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * EntryLink represents a link between two Entries.
   * 
   *  To get more information about EntryLink, see:
   * 
   *  * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.entryGroups.entryLinks)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dataplex/docs)
   */
  def EntryLink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryLinkArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryLinkArgs.builder
    com.pulumi.gcp.dataplex.EntryLink(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex EntryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   *  * `gcp.dataplex.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved.
   *  * `gcp.dataplex.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryGroupIamBinding` and `gcp.dataplex.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.EntryGroupIamPolicy
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
   *  import com.pulumi.gcp.dataplex.EntryGroupIamPolicy;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs;
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
   *          var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamBinding;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs;
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
   *          var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamMember;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs;
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
   *          var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
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
   *  # IAM policy for Dataplex EntryGroup
   * 
   *  Three different resources help you manage your IAM policy for Dataplex EntryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   *  * `gcp.dataplex.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved.
   *  * `gcp.dataplex.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryGroupIamBinding` and `gcp.dataplex.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.EntryGroupIamPolicy
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
   *  import com.pulumi.gcp.dataplex.EntryGroupIamPolicy;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs;
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
   *          var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamBinding;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs;
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
   *          var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamMember;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs;
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
   *          var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
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
   *  * projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}}
   *  * {{project}}/{{location}}/{{entry_group_id}}
   *  * {{location}}/{{entry_group_id}}
   *  * {{entry_group_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex entrygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_entry_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_entry_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/entryGroupIamPolicy:EntryGroupIamPolicy editor projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryGroupIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.EntryGroupIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Dataplex task represents the work that you want Dataplex to do on a schedule. It encapsulates code, parameters, and the schedule.
   * 
   *  To get more information about Task, see:
   * 
   *  * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.lakes.tasks)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/dataplex/docs)
   */
  def Task(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.TaskArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.TaskArgs.builder
    com.pulumi.gcp.dataplex.Task(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.DatascanArgs.Builder)
    /**
     * @param data The data source for DataScan.
     *  Structure is documented below.
     * @return builder
     */
    def data(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataArgs.builder
      builder.data(args(argsBuilder).build)

    /**
     * @param dataDiscoverySpec DataDiscoveryScan related setting.
     *  Structure is documented below.
     * @return builder
     */
    def dataDiscoverySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecArgs.builder
      builder.dataDiscoverySpec(args(argsBuilder).build)

    /**
     * @param dataDocumentationSpec DataDocumentationScan related setting.
     * @return builder
     */
    def dataDocumentationSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDocumentationSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDocumentationSpecArgs.builder
      builder.dataDocumentationSpec(args(argsBuilder).build)

    /**
     * @param dataProfileSpec DataProfileScan related setting.
     *  Structure is documented below.
     * @return builder
     */
    def dataProfileSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.builder
      builder.dataProfileSpec(args(argsBuilder).build)

    /**
     * @param dataQualitySpec DataQualityScan related setting.
     *  Structure is documented below.
     * @return builder
     */
    def dataQualitySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs.builder
      builder.dataQualitySpec(args(argsBuilder).build)

    /**
     * @param executionIdentity The identity to run the datascan. If not specified, defaults to the Dataplex Service Agent.
     *  Structure is documented below.
     * @return builder
     */
    def executionIdentity(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.builder
      builder.executionIdentity(args(argsBuilder).build)

    /**
     * @param executionSpec DataScan execution settings.
     *  Structure is documented below.
     * @return builder
     */
    def executionSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecArgs.builder
      builder.executionSpec(args(argsBuilder).build)

  /** Represents a collection of terms within a Glossary that are related to each other. */
  def GlossaryTerm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.GlossaryTermArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.GlossaryTermArgs.builder
    com.pulumi.gcp.dataplex.GlossaryTerm(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Datascan. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.DatascanIamPolicy`: Authoritative. Sets the IAM policy for the datascan and replaces any existing policy already attached.
   *  * `gcp.dataplex.DatascanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datascan are preserved.
   *  * `gcp.dataplex.DatascanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datascan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.DatascanIamPolicy`: Retrieves the IAM policy for the datascan
   * 
   *  &gt; **Note:** `gcp.dataplex.DatascanIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DatascanIamBinding` and `gcp.dataplex.DatascanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.DatascanIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DatascanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.DatascanIamPolicy
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
   *  import com.pulumi.gcp.dataplex.DatascanIamPolicy;
   *  import com.pulumi.gcp.dataplex.DatascanIamPolicyArgs;
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
   *          var policy = new DatascanIamPolicy("policy", DatascanIamPolicyArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.DatascanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.DatascanIamBinding;
   *  import com.pulumi.gcp.dataplex.DatascanIamBindingArgs;
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
   *          var binding = new DatascanIamBinding("binding", DatascanIamBindingArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.DatascanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.DatascanIamMember;
   *  import com.pulumi.gcp.dataplex.DatascanIamMemberArgs;
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
   *          var member = new DatascanIamMember("member", DatascanIamMemberArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
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
   *  # IAM policy for Dataplex Datascan
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Datascan. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.DatascanIamPolicy`: Authoritative. Sets the IAM policy for the datascan and replaces any existing policy already attached.
   *  * `gcp.dataplex.DatascanIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datascan are preserved.
   *  * `gcp.dataplex.DatascanIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datascan are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.DatascanIamPolicy`: Retrieves the IAM policy for the datascan
   * 
   *  &gt; **Note:** `gcp.dataplex.DatascanIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.DatascanIamBinding` and `gcp.dataplex.DatascanIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.DatascanIamBinding` resources **can be** used in conjunction with `gcp.dataplex.DatascanIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.DatascanIamPolicy
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
   *  import com.pulumi.gcp.dataplex.DatascanIamPolicy;
   *  import com.pulumi.gcp.dataplex.DatascanIamPolicyArgs;
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
   *          var policy = new DatascanIamPolicy("policy", DatascanIamPolicyArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.DatascanIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.DatascanIamBinding;
   *  import com.pulumi.gcp.dataplex.DatascanIamBindingArgs;
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
   *          var binding = new DatascanIamBinding("binding", DatascanIamBindingArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.DatascanIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.DatascanIamMember;
   *  import com.pulumi.gcp.dataplex.DatascanIamMemberArgs;
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
   *          var member = new DatascanIamMember("member", DatascanIamMemberArgs.builder()
   *              .project(basicProfile.project())
   *              .location(basicProfile.location())
   *              .dataScanId(basicProfile.dataScanId())
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
   *  * projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}}
   *  * {{project}}/{{location}}/{{data_scan_id}}
   *  * {{location}}/{{data_scan_id}}
   *  * {{data_scan_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex datascan IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_datascan_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_datascan_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/datascanIamPolicy:DatascanIamPolicy editor projects/{{project}}/locations/{{location}}/dataScans/{{data_scan_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DatascanIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.DatascanIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.DatascanIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.DatascanIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryTypeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryTypeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.ZoneIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.ZoneIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex EntryType. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.EntryTypeIamPolicy`: Authoritative. Sets the IAM policy for the entrytype and replaces any existing policy already attached.
   *  * `gcp.dataplex.EntryTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrytype are preserved.
   *  * `gcp.dataplex.EntryTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrytype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.EntryTypeIamPolicy`: Retrieves the IAM policy for the entrytype
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryTypeIamBinding` and `gcp.dataplex.EntryTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.EntryTypeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.EntryTypeIamPolicy;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs;
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
   *          var policy = new EntryTypeIamPolicy("policy", EntryTypeIamPolicyArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamBinding;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs;
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
   *          var binding = new EntryTypeIamBinding("binding", EntryTypeIamBindingArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamMember;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs;
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
   *          var member = new EntryTypeIamMember("member", EntryTypeIamMemberArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
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
   *  # IAM policy for Dataplex EntryType
   * 
   *  Three different resources help you manage your IAM policy for Dataplex EntryType. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.EntryTypeIamPolicy`: Authoritative. Sets the IAM policy for the entrytype and replaces any existing policy already attached.
   *  * `gcp.dataplex.EntryTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrytype are preserved.
   *  * `gcp.dataplex.EntryTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrytype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.EntryTypeIamPolicy`: Retrieves the IAM policy for the entrytype
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryTypeIamBinding` and `gcp.dataplex.EntryTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.EntryTypeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.EntryTypeIamPolicy;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs;
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
   *          var policy = new EntryTypeIamPolicy("policy", EntryTypeIamPolicyArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamBinding;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs;
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
   *          var binding = new EntryTypeIamBinding("binding", EntryTypeIamBindingArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamMember;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs;
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
   *          var member = new EntryTypeIamMember("member", EntryTypeIamMemberArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
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
   *  * projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}}
   *  * {{project}}/{{location}}/{{entry_type_id}}
   *  * {{location}}/{{entry_type_id}}
   *  * {{entry_type_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex entrytype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_entry_type_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_entry_type_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/entryTypeIamBinding:EntryTypeIamBinding editor projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryTypeIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs.builder
    com.pulumi.gcp.dataplex.EntryTypeIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Lake. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.LakeIamPolicy`: Authoritative. Sets the IAM policy for the lake and replaces any existing policy already attached.
   *  * `gcp.dataplex.LakeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the lake are preserved.
   *  * `gcp.dataplex.LakeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the lake are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.LakeIamPolicy`: Retrieves the IAM policy for the lake
   * 
   *  &gt; **Note:** `gcp.dataplex.LakeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.LakeIamBinding` and `gcp.dataplex.LakeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.LakeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.LakeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.LakeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.LakeIamPolicy;
   *  import com.pulumi.gcp.dataplex.LakeIamPolicyArgs;
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
   *          var policy = new LakeIamPolicy("policy", LakeIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.LakeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.LakeIamBinding;
   *  import com.pulumi.gcp.dataplex.LakeIamBindingArgs;
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
   *          var binding = new LakeIamBinding("binding", LakeIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.LakeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.LakeIamMember;
   *  import com.pulumi.gcp.dataplex.LakeIamMemberArgs;
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
   *          var member = new LakeIamMember("member", LakeIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
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
   *  # IAM policy for Dataplex Lake
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Lake. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.LakeIamPolicy`: Authoritative. Sets the IAM policy for the lake and replaces any existing policy already attached.
   *  * `gcp.dataplex.LakeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the lake are preserved.
   *  * `gcp.dataplex.LakeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the lake are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.LakeIamPolicy`: Retrieves the IAM policy for the lake
   * 
   *  &gt; **Note:** `gcp.dataplex.LakeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.LakeIamBinding` and `gcp.dataplex.LakeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.LakeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.LakeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.LakeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.LakeIamPolicy;
   *  import com.pulumi.gcp.dataplex.LakeIamPolicyArgs;
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
   *          var policy = new LakeIamPolicy("policy", LakeIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.LakeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.LakeIamBinding;
   *  import com.pulumi.gcp.dataplex.LakeIamBindingArgs;
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
   *          var binding = new LakeIamBinding("binding", LakeIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.LakeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.LakeIamMember;
   *  import com.pulumi.gcp.dataplex.LakeIamMemberArgs;
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
   *          var member = new LakeIamMember("member", LakeIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/lakes/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex lake IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_lake_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_lake_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/lakeIamBinding:LakeIamBinding editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def LakeIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.LakeIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.LakeIamBindingArgs.builder
    com.pulumi.gcp.dataplex.LakeIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Asset. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.AssetIamPolicy`: Authoritative. Sets the IAM policy for the asset and replaces any existing policy already attached.
   *  * `gcp.dataplex.AssetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the asset are preserved.
   *  * `gcp.dataplex.AssetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the asset are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.AssetIamPolicy`: Retrieves the IAM policy for the asset
   * 
   *  &gt; **Note:** `gcp.dataplex.AssetIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AssetIamBinding` and `gcp.dataplex.AssetIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.AssetIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AssetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.AssetIamPolicy
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
   *  import com.pulumi.gcp.dataplex.AssetIamPolicy;
   *  import com.pulumi.gcp.dataplex.AssetIamPolicyArgs;
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
   *          var policy = new AssetIamPolicy("policy", AssetIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AssetIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AssetIamBinding;
   *  import com.pulumi.gcp.dataplex.AssetIamBindingArgs;
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
   *          var binding = new AssetIamBinding("binding", AssetIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AssetIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AssetIamMember;
   *  import com.pulumi.gcp.dataplex.AssetIamMemberArgs;
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
   *          var member = new AssetIamMember("member", AssetIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
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
   *  # IAM policy for Dataplex Asset
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Asset. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.AssetIamPolicy`: Authoritative. Sets the IAM policy for the asset and replaces any existing policy already attached.
   *  * `gcp.dataplex.AssetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the asset are preserved.
   *  * `gcp.dataplex.AssetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the asset are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.AssetIamPolicy`: Retrieves the IAM policy for the asset
   * 
   *  &gt; **Note:** `gcp.dataplex.AssetIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AssetIamBinding` and `gcp.dataplex.AssetIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.AssetIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AssetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.AssetIamPolicy
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
   *  import com.pulumi.gcp.dataplex.AssetIamPolicy;
   *  import com.pulumi.gcp.dataplex.AssetIamPolicyArgs;
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
   *          var policy = new AssetIamPolicy("policy", AssetIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AssetIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AssetIamBinding;
   *  import com.pulumi.gcp.dataplex.AssetIamBindingArgs;
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
   *          var binding = new AssetIamBinding("binding", AssetIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AssetIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AssetIamMember;
   *  import com.pulumi.gcp.dataplex.AssetIamMemberArgs;
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
   *          var member = new AssetIamMember("member", AssetIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{name}}
   *  * {{project}}/{{location}}/{{lake}}/{{dataplex_zone}}/{{name}}
   *  * {{location}}/{{lake}}/{{dataplex_zone}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex asset IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_asset_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_asset_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/assetIamMember:AssetIamMember editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AssetIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AssetIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.AssetIamMemberArgs.builder
    com.pulumi.gcp.dataplex.AssetIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Asset. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.AssetIamPolicy`: Authoritative. Sets the IAM policy for the asset and replaces any existing policy already attached.
   *  * `gcp.dataplex.AssetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the asset are preserved.
   *  * `gcp.dataplex.AssetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the asset are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.AssetIamPolicy`: Retrieves the IAM policy for the asset
   * 
   *  &gt; **Note:** `gcp.dataplex.AssetIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AssetIamBinding` and `gcp.dataplex.AssetIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.AssetIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AssetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.AssetIamPolicy
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
   *  import com.pulumi.gcp.dataplex.AssetIamPolicy;
   *  import com.pulumi.gcp.dataplex.AssetIamPolicyArgs;
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
   *          var policy = new AssetIamPolicy("policy", AssetIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AssetIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AssetIamBinding;
   *  import com.pulumi.gcp.dataplex.AssetIamBindingArgs;
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
   *          var binding = new AssetIamBinding("binding", AssetIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AssetIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AssetIamMember;
   *  import com.pulumi.gcp.dataplex.AssetIamMemberArgs;
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
   *          var member = new AssetIamMember("member", AssetIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
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
   *  # IAM policy for Dataplex Asset
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Asset. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.AssetIamPolicy`: Authoritative. Sets the IAM policy for the asset and replaces any existing policy already attached.
   *  * `gcp.dataplex.AssetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the asset are preserved.
   *  * `gcp.dataplex.AssetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the asset are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.AssetIamPolicy`: Retrieves the IAM policy for the asset
   * 
   *  &gt; **Note:** `gcp.dataplex.AssetIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.AssetIamBinding` and `gcp.dataplex.AssetIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.AssetIamBinding` resources **can be** used in conjunction with `gcp.dataplex.AssetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.AssetIamPolicy
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
   *  import com.pulumi.gcp.dataplex.AssetIamPolicy;
   *  import com.pulumi.gcp.dataplex.AssetIamPolicyArgs;
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
   *          var policy = new AssetIamPolicy("policy", AssetIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AssetIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AssetIamBinding;
   *  import com.pulumi.gcp.dataplex.AssetIamBindingArgs;
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
   *          var binding = new AssetIamBinding("binding", AssetIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.AssetIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.AssetIamMember;
   *  import com.pulumi.gcp.dataplex.AssetIamMemberArgs;
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
   *          var member = new AssetIamMember("member", AssetIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.dataplexZone())
   *              .asset(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{name}}
   *  * {{project}}/{{location}}/{{lake}}/{{dataplex_zone}}/{{name}}
   *  * {{location}}/{{lake}}/{{dataplex_zone}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex asset IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_asset_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_asset_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/assetIamBinding:AssetIamBinding editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{dataplex_zone}}/assets/{{asset}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AssetIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.AssetIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.AssetIamBindingArgs.builder
    com.pulumi.gcp.dataplex.AssetIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex EntryType. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.EntryTypeIamPolicy`: Authoritative. Sets the IAM policy for the entrytype and replaces any existing policy already attached.
   *  * `gcp.dataplex.EntryTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrytype are preserved.
   *  * `gcp.dataplex.EntryTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrytype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.EntryTypeIamPolicy`: Retrieves the IAM policy for the entrytype
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryTypeIamBinding` and `gcp.dataplex.EntryTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.EntryTypeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.EntryTypeIamPolicy;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs;
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
   *          var policy = new EntryTypeIamPolicy("policy", EntryTypeIamPolicyArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamBinding;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs;
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
   *          var binding = new EntryTypeIamBinding("binding", EntryTypeIamBindingArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamMember;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs;
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
   *          var member = new EntryTypeIamMember("member", EntryTypeIamMemberArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
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
   *  # IAM policy for Dataplex EntryType
   * 
   *  Three different resources help you manage your IAM policy for Dataplex EntryType. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.EntryTypeIamPolicy`: Authoritative. Sets the IAM policy for the entrytype and replaces any existing policy already attached.
   *  * `gcp.dataplex.EntryTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrytype are preserved.
   *  * `gcp.dataplex.EntryTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrytype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.EntryTypeIamPolicy`: Retrieves the IAM policy for the entrytype
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryTypeIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryTypeIamBinding` and `gcp.dataplex.EntryTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryTypeIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.EntryTypeIamPolicy
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
   *  import com.pulumi.gcp.dataplex.EntryTypeIamPolicy;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamPolicyArgs;
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
   *          var policy = new EntryTypeIamPolicy("policy", EntryTypeIamPolicyArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamBinding;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs;
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
   *          var binding = new EntryTypeIamBinding("binding", EntryTypeIamBindingArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamMember;
   *  import com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs;
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
   *          var member = new EntryTypeIamMember("member", EntryTypeIamMemberArgs.builder()
   *              .project(testEntryTypeBasic.project())
   *              .location(testEntryTypeBasic.location())
   *              .entryTypeId(testEntryTypeBasic.entryTypeId())
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
   *  * projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}}
   *  * {{project}}/{{location}}/{{entry_type_id}}
   *  * {{location}}/{{entry_type_id}}
   *  * {{entry_type_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex entrytype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_entry_type_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_entry_type_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/entryTypeIamMember:EntryTypeIamMember editor projects/{{project}}/locations/{{location}}/entryTypes/{{entry_type_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryTypeIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs.builder
    com.pulumi.gcp.dataplex.EntryTypeIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.TaskIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.TaskIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.EntryLinkArgs.Builder)
    /**
     * @param aspects The Aspects attached to the Entry Link.
     *  Structure is documented below.
     * @return builder
     */
    def aspects(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryLinkAspectArgs.Builder]*):
        com.pulumi.gcp.dataplex.EntryLinkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryLinkAspectArgs.builder
      builder.aspects(args.map(_(argsBuilder).build)*)

    /**
     * @param entryReferences Specifies the Entries referenced in the Entry Link. There should be exactly two entry references.
     *  Structure is documented below.
     * @return builder
     */
    def entryReferences(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryLinkEntryReferenceArgs.Builder]*):
        com.pulumi.gcp.dataplex.EntryLinkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryLinkEntryReferenceArgs.builder
      builder.entryReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.AssetIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.AssetIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex EntryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   *  * `gcp.dataplex.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved.
   *  * `gcp.dataplex.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryGroupIamBinding` and `gcp.dataplex.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.EntryGroupIamPolicy
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
   *  import com.pulumi.gcp.dataplex.EntryGroupIamPolicy;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs;
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
   *          var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamBinding;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs;
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
   *          var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamMember;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs;
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
   *          var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
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
   *  # IAM policy for Dataplex EntryGroup
   * 
   *  Three different resources help you manage your IAM policy for Dataplex EntryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   *  * `gcp.dataplex.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved.
   *  * `gcp.dataplex.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.EntryGroupIamBinding` and `gcp.dataplex.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.dataplex.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.EntryGroupIamPolicy
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
   *  import com.pulumi.gcp.dataplex.EntryGroupIamPolicy;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamPolicyArgs;
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
   *          var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamBinding;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs;
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
   *          var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.EntryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamMember;
   *  import com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs;
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
   *          var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *              .project(testEntryGroupBasic.project())
   *              .location(testEntryGroupBasic.location())
   *              .entryGroupId(testEntryGroupBasic.entryGroupId())
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
   *  * projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}}
   *  * {{project}}/{{location}}/{{entry_group_id}}
   *  * {{location}}/{{entry_group_id}}
   *  * {{entry_group_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex entrygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_entry_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_entry_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/entryGroupIamMember:EntryGroupIamMember editor projects/{{project}}/locations/{{location}}/entryGroups/{{entry_group_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryGroupIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs.builder
    com.pulumi.gcp.dataplex.EntryGroupIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.AssetArgs.Builder)
    /**
     * @param discoverySpec Required. Specification of the discovery feature applied to data referenced by this asset. When this spec is left unset, the asset will use the spec set on the parent zone.
     * @return builder
     */
    def discoverySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.AssetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecArgs.builder
      builder.discoverySpec(args(argsBuilder).build)

    /**
     * @param resourceSpec Required. Immutable. Specification of the resource that is referenced by this asset.
     * @return builder
     */
    def resourceSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetResourceSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.AssetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetResourceSpecArgs.builder
      builder.resourceSpec(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Zone. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.ZoneIamPolicy`: Authoritative. Sets the IAM policy for the zone and replaces any existing policy already attached.
   *  * `gcp.dataplex.ZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the zone are preserved.
   *  * `gcp.dataplex.ZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the zone are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.ZoneIamPolicy`: Retrieves the IAM policy for the zone
   * 
   *  &gt; **Note:** `gcp.dataplex.ZoneIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.ZoneIamBinding` and `gcp.dataplex.ZoneIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.ZoneIamBinding` resources **can be** used in conjunction with `gcp.dataplex.ZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.ZoneIamPolicy
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
   *  import com.pulumi.gcp.dataplex.ZoneIamPolicy;
   *  import com.pulumi.gcp.dataplex.ZoneIamPolicyArgs;
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
   *          var policy = new ZoneIamPolicy("policy", ZoneIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.ZoneIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.ZoneIamBinding;
   *  import com.pulumi.gcp.dataplex.ZoneIamBindingArgs;
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
   *          var binding = new ZoneIamBinding("binding", ZoneIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.ZoneIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.ZoneIamMember;
   *  import com.pulumi.gcp.dataplex.ZoneIamMemberArgs;
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
   *          var member = new ZoneIamMember("member", ZoneIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
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
   *  # IAM policy for Dataplex Zone
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Zone. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.ZoneIamPolicy`: Authoritative. Sets the IAM policy for the zone and replaces any existing policy already attached.
   *  * `gcp.dataplex.ZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the zone are preserved.
   *  * `gcp.dataplex.ZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the zone are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.ZoneIamPolicy`: Retrieves the IAM policy for the zone
   * 
   *  &gt; **Note:** `gcp.dataplex.ZoneIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.ZoneIamBinding` and `gcp.dataplex.ZoneIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.ZoneIamBinding` resources **can be** used in conjunction with `gcp.dataplex.ZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.ZoneIamPolicy
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
   *  import com.pulumi.gcp.dataplex.ZoneIamPolicy;
   *  import com.pulumi.gcp.dataplex.ZoneIamPolicyArgs;
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
   *          var policy = new ZoneIamPolicy("policy", ZoneIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.ZoneIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.ZoneIamBinding;
   *  import com.pulumi.gcp.dataplex.ZoneIamBindingArgs;
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
   *          var binding = new ZoneIamBinding("binding", ZoneIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.ZoneIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.ZoneIamMember;
   *  import com.pulumi.gcp.dataplex.ZoneIamMemberArgs;
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
   *          var member = new ZoneIamMember("member", ZoneIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .lake(example.lake())
   *              .dataplexZone(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{name}}
   *  * {{project}}/{{location}}/{{lake}}/{{name}}
   *  * {{location}}/{{lake}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex zone IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_zone_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_zone_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/zoneIamPolicy:ZoneIamPolicy editor projects/{{project}}/locations/{{location}}/lakes/{{lake}}/zones/{{zone}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ZoneIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.ZoneIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.ZoneIamPolicyArgs.builder
    com.pulumi.gcp.dataplex.ZoneIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Dataplex Glossary. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.GlossaryIamPolicy`: Authoritative. Sets the IAM policy for the glossary and replaces any existing policy already attached.
   *  * `gcp.dataplex.GlossaryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the glossary are preserved.
   *  * `gcp.dataplex.GlossaryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the glossary are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.GlossaryIamPolicy`: Retrieves the IAM policy for the glossary
   * 
   *  &gt; **Note:** `gcp.dataplex.GlossaryIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.GlossaryIamBinding` and `gcp.dataplex.GlossaryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.GlossaryIamBinding` resources **can be** used in conjunction with `gcp.dataplex.GlossaryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.GlossaryIamPolicy
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
   *  import com.pulumi.gcp.dataplex.GlossaryIamPolicy;
   *  import com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs;
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
   *          var policy = new GlossaryIamPolicy("policy", GlossaryIamPolicyArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.GlossaryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.GlossaryIamBinding;
   *  import com.pulumi.gcp.dataplex.GlossaryIamBindingArgs;
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
   *          var binding = new GlossaryIamBinding("binding", GlossaryIamBindingArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.GlossaryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.GlossaryIamMember;
   *  import com.pulumi.gcp.dataplex.GlossaryIamMemberArgs;
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
   *          var member = new GlossaryIamMember("member", GlossaryIamMemberArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
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
   *  # IAM policy for Dataplex Glossary
   * 
   *  Three different resources help you manage your IAM policy for Dataplex Glossary. Each of these resources serves a different use case:
   * 
   *  * `gcp.dataplex.GlossaryIamPolicy`: Authoritative. Sets the IAM policy for the glossary and replaces any existing policy already attached.
   *  * `gcp.dataplex.GlossaryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the glossary are preserved.
   *  * `gcp.dataplex.GlossaryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the glossary are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dataplex.GlossaryIamPolicy`: Retrieves the IAM policy for the glossary
   * 
   *  &gt; **Note:** `gcp.dataplex.GlossaryIamPolicy` **cannot** be used in conjunction with `gcp.dataplex.GlossaryIamBinding` and `gcp.dataplex.GlossaryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dataplex.GlossaryIamBinding` resources **can be** used in conjunction with `gcp.dataplex.GlossaryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.dataplex.GlossaryIamPolicy
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
   *  import com.pulumi.gcp.dataplex.GlossaryIamPolicy;
   *  import com.pulumi.gcp.dataplex.GlossaryIamPolicyArgs;
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
   *          var policy = new GlossaryIamPolicy("policy", GlossaryIamPolicyArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.GlossaryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.GlossaryIamBinding;
   *  import com.pulumi.gcp.dataplex.GlossaryIamBindingArgs;
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
   *          var binding = new GlossaryIamBinding("binding", GlossaryIamBindingArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.dataplex.GlossaryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dataplex.GlossaryIamMember;
   *  import com.pulumi.gcp.dataplex.GlossaryIamMemberArgs;
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
   *          var member = new GlossaryIamMember("member", GlossaryIamMemberArgs.builder()
   *              .project(glossaryTestId.project())
   *              .location(glossaryTestId.location())
   *              .glossaryId(glossaryTestId.glossaryId())
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
   *  * projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}}
   *  * {{project}}/{{location}}/{{glossary_id}}
   *  * {{location}}/{{glossary_id}}
   *  * {{glossary_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Dataplex glossary IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_glossary_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dataplex_glossary_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dataplex/glossaryIamMember:GlossaryIamMember editor projects/{{project}}/locations/{{location}}/glossaries/{{glossary_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def GlossaryIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.GlossaryIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.GlossaryIamMemberArgs.builder
    com.pulumi.gcp.dataplex.GlossaryIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.DataAssetArgs.Builder)
    /**
     * @param accessGroupConfigs Access groups configurations.
     *  Structure is documented below.
     * @return builder
     */
    def accessGroupConfigs(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataAssetAccessGroupConfigArgs.Builder]*):
        com.pulumi.gcp.dataplex.DataAssetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DataAssetAccessGroupConfigArgs.builder
      builder.accessGroupConfigs(args.map(_(argsBuilder).build)*)

  /** The Dataplex Zone resource */
  def Zone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.ZoneArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataplex.ZoneArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataplex.Zone(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An entry represents a data asset for which you capture metadata, such as a BigQuery table.
   *  The primary constituents of an entry are aspects, which provide thematically coherent information.
   *  Examples include a table&#39;s schema, sensitive data protection profile, data quality information, or a simple tag.
   * 
   *  **Important Considerations:**
   * 
   *  * There is a limit of 99 aspects per entry.
   *  * The entry resource has to use project numbers and not project IDs. Therefore, if
   *    a dependency was already provisioned using project ID, it needs to be referenced explicitly as a resource name
   *    containing the project number.
   * 
   *  To get more information about Entry, see:
   * 
   *  * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.entryGroups.entries)
   *  * How-to Guides
   *      * [Manage entries and ingest custom sources](https://cloud.google.com/dataplex/docs/ingest-custom-sources)
   */
  def Entry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.EntryArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dataplex.EntryArgs.builder
    com.pulumi.gcp.dataplex.Entry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryTypeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryTypeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecArgs.Builder)
    /**
     * @param csvOptions Optional. Configuration for CSV data.
     * @return builder
     */
    def csvOptions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecCsvOptionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecCsvOptionsArgs.builder
      builder.csvOptions(args(argsBuilder).build)

    /**
     * @param jsonOptions Optional. Configuration for Json data.
     * @return builder
     */
    def jsonOptions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecJsonOptionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecJsonOptionsArgs.builder
      builder.jsonOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.AssetIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AssetIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryTypeIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryTypeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.EntryTypeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryTypeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.AssetDiscoveryStatusArgs.Builder)
    /**
     * @param stats Data Stats of the asset reported by discovery.
     * @return builder
     */
    def stats(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetDiscoveryStatusStatArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.AssetDiscoveryStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetDiscoveryStatusStatArgs.builder
      builder.stats(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecArgs.Builder)
    /**
     * @param bigqueryPublishingConfig Configuration for metadata publishing.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryPublishingConfig(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecBigqueryPublishingConfigArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecBigqueryPublishingConfigArgs.builder
      builder.bigqueryPublishingConfig(args(argsBuilder).build)

    /**
     * @param storageConfig Configurations related to Cloud Storage as the data source.
     *  Structure is documented below.
     * @return builder
     */
    def storageConfig(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigArgs.builder
      builder.storageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecPostScanActionsArgs.Builder)
    /**
     * @param bigqueryExport If set, results will be exported to the provided BigQuery table.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryExport(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecPostScanActionsBigqueryExportArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecPostScanActionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecPostScanActionsBigqueryExportArgs.builder
      builder.bigqueryExport(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.ZoneIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.ZoneIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryTypeIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryTypeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.EntryTypeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryTypeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.ZoneState.Builder)
    /**
     * @param assetStatuses Output only. Aggregated status of the underlying assets of the zone.
     * @return builder
     */
    def assetStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneAssetStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.ZoneState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneAssetStatusArgs.builder
      builder.assetStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param discoverySpec Required. Specification of the discovery feature applied to data in this zone.
     * @return builder
     */
    def discoverySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.ZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs.builder
      builder.discoverySpec(args(argsBuilder).build)

    /**
     * @param resourceSpec Required. Immutable. Specification of the resources that are referenced by the assets within this zone.
     * @return builder
     */
    def resourceSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneResourceSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.ZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneResourceSpecArgs.builder
      builder.resourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryLinkAspectArgs.Builder)
    /**
     * @param aspect A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def aspect(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryLinkAspectAspectArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.EntryLinkAspectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryLinkAspectAspectArgs.builder
      builder.aspect(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryGroupIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.EntryGroupIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.LakeIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.LakeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryAspectArgs.Builder)
    /**
     * @param aspect A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def aspect(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryAspectAspectArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.EntryAspectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryAspectAspectArgs.builder
      builder.aspect(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.LakeState.Builder)
    /**
     * @param assetStatuses Output only. Aggregated status of the underlying assets of the lake.
     * @return builder
     */
    def assetStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeAssetStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.LakeState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeAssetStatusArgs.builder
      builder.assetStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param metastore Optional. Settings to manage lake and Dataproc Metastore service instance association.
     * @return builder
     */
    def metastore(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeMetastoreArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.LakeState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeMetastoreArgs.builder
      builder.metastore(args(argsBuilder).build)

    /**
     * @param metastoreStatuses Output only. Metastore status of the lake.
     * @return builder
     */
    def metastoreStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeMetastoreStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.LakeState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeMetastoreStatusArgs.builder
      builder.metastoreStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder)
    /**
     * @param nonNullExpectation ColumnMap rule which evaluates whether each column value is null.
     * @return builder
     */
    def nonNullExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleNonNullExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleNonNullExpectationArgs.builder
      builder.nonNullExpectation(args(argsBuilder).build)

    /**
     * @param rangeExpectation ColumnMap rule which evaluates whether each column value lies between a specified range.
     *  Structure is documented below.
     * @return builder
     */
    def rangeExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRangeExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRangeExpectationArgs.builder
      builder.rangeExpectation(args(argsBuilder).build)

    /**
     * @param regexExpectation ColumnMap rule which evaluates whether each column value matches a specified regex.
     *  Structure is documented below.
     * @return builder
     */
    def regexExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRegexExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRegexExpectationArgs.builder
      builder.regexExpectation(args(argsBuilder).build)

    /**
     * @param rowConditionExpectation Table rule which evaluates whether each row passes the specified condition.
     *  Structure is documented below.
     * @return builder
     */
    def rowConditionExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRowConditionExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRowConditionExpectationArgs.builder
      builder.rowConditionExpectation(args(argsBuilder).build)

    /**
     * @param setExpectation ColumnMap rule which evaluates whether each column value is contained by a specified set.
     *  Structure is documented below.
     * @return builder
     */
    def setExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleSetExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleSetExpectationArgs.builder
      builder.setExpectation(args(argsBuilder).build)

    /**
     * @param sqlAssertion Table rule which evaluates whether any row matches invalid state.
     *  Structure is documented below.
     * @return builder
     */
    def sqlAssertion(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleSqlAssertionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleSqlAssertionArgs.builder
      builder.sqlAssertion(args(argsBuilder).build)

    /**
     * @param statisticRangeExpectation ColumnAggregate rule which evaluates whether the column aggregate statistic lies between a specified range.
     *  Structure is documented below.
     * @return builder
     */
    def statisticRangeExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleStatisticRangeExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleStatisticRangeExpectationArgs.builder
      builder.statisticRangeExpectation(args(argsBuilder).build)

    /**
     * @param tableConditionExpectation Table rule which evaluates whether the provided expression is true.
     *  Structure is documented below.
     * @return builder
     */
    def tableConditionExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTableConditionExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTableConditionExpectationArgs.builder
      builder.tableConditionExpectation(args(argsBuilder).build)

    /**
     * @param templateReference Aggregate rule which references a rule template and provides the parameters to be substituted in the template.
     *  Structure is documented below.
     * @return builder
     */
    def templateReference(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTemplateReferenceArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTemplateReferenceArgs.builder
      builder.templateReference(args(argsBuilder).build)

    /**
     * @param uniquenessExpectation Row-level rule which evaluates whether each column value is unique.
     * @return builder
     */
    def uniquenessExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleUniquenessExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleUniquenessExpectationArgs.builder
      builder.uniquenessExpectation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportArgs.Builder)
    /**
     * @param jobEndTrigger This trigger is triggered whenever a scan job run ends, regardless of the result.
     * @return builder
     */
    def jobEndTrigger(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportJobEndTriggerArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportJobEndTriggerArgs.builder
      builder.jobEndTrigger(args(argsBuilder).build)

    /**
     * @param jobFailureTrigger This trigger is triggered when the scan job itself fails, regardless of the result.
     * @return builder
     */
    def jobFailureTrigger(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportJobFailureTriggerArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportJobFailureTriggerArgs.builder
      builder.jobFailureTrigger(args(argsBuilder).build)

    /**
     * @param recipients The individuals or groups who are designated to receive notifications upon triggers.
     *  Structure is documented below.
     * @return builder
     */
    def recipients(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportRecipientsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportRecipientsArgs.builder
      builder.recipients(args(argsBuilder).build)

    /**
     * @param scoreThresholdTrigger This trigger is triggered when the DQ score in the job result is less than a specified input score.
     *  Structure is documented below.
     * @return builder
     */
    def scoreThresholdTrigger(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportScoreThresholdTriggerArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportScoreThresholdTriggerArgs.builder
      builder.scoreThresholdTrigger(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.GlossaryIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GlossaryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.GlossaryIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GlossaryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskState.Builder)
    /**
     * @param executionSpec Configuration for the cluster
     *  Structure is documented below.
     * @return builder
     */
    def executionSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskExecutionSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskExecutionSpecArgs.builder
      builder.executionSpec(args(argsBuilder).build)

    /**
     * @param executionStatuses Configuration for the cluster
     *  Structure is documented below.
     * @return builder
     */
    def executionStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskExecutionStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.TaskState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskExecutionStatusArgs.builder
      builder.executionStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param notebook A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     *  Structure is documented below.
     * @return builder
     */
    def notebook(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskNotebookArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskNotebookArgs.builder
      builder.notebook(args(argsBuilder).build)

    /**
     * @param spark A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     *  Structure is documented below.
     * @return builder
     */
    def spark(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskSparkArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskSparkArgs.builder
      builder.spark(args(argsBuilder).build)

    /**
     * @param triggerSpec Configuration for the cluster
     *  Structure is documented below.
     * @return builder
     */
    def triggerSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskTriggerSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskTriggerSpecArgs.builder
      builder.triggerSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryState.Builder)
    /**
     * @param aspects The aspects that are attached to the entry.
     *  Structure is documented below.
     * @return builder
     */
    def aspects(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryAspectArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.EntryState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryAspectArgs.builder
      builder.aspects(args.map(_(argsBuilder).build)*)

    /**
     * @param entrySource A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def entrySource(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryEntrySourceArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.EntryState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryEntrySourceArgs.builder
      builder.entrySource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.AspectTypeIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AspectTypeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AspectTypeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AspectTypeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.Builder)
    /**
     * @param dataplexServiceAgent The Dataplex service agent associated with the user&#39;s project.
     * @return builder
     */
    def dataplexServiceAgent(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityDataplexServiceAgentArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityDataplexServiceAgentArgs.builder
      builder.dataplexServiceAgent(args(argsBuilder).build)

    /**
     * @param serviceAccount Service account to use to execute a datascan.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccount(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityServiceAccountArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

    /**
     * @param userCredential The credential of the calling user. Supports only ONE_TIME trigger type.
     * @return builder
     */
    def userCredential(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityUserCredentialArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityUserCredentialArgs.builder
      builder.userCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.Builder)
    /**
     * @param excludeFields The fields to exclude from data profile.
     *  If specified, the fields will be excluded from data profile, regardless of `includeFields` value.
     *  Structure is documented below.
     * @return builder
     */
    def excludeFields(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecExcludeFieldsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecExcludeFieldsArgs.builder
      builder.excludeFields(args(argsBuilder).build)

    /**
     * @param includeFields The fields to include in data profile.
     *  If not specified, all fields at the time of profile scan job execution are included, except for ones listed in `excludeFields`.
     *  Structure is documented below.
     * @return builder
     */
    def includeFields(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecIncludeFieldsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecIncludeFieldsArgs.builder
      builder.includeFields(args(argsBuilder).build)

    /**
     * @param postScanActions Actions to take upon job completion.
     *  Structure is documented below.
     * @return builder
     */
    def postScanActions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecPostScanActionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecPostScanActionsArgs.builder
      builder.postScanActions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryTypeState.Builder)
    /**
     * @param requiredAspects AspectInfo for the entry type.
     *  Structure is documented below.
     * @return builder
     */
    def requiredAspects(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryTypeRequiredAspectArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.EntryTypeState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryTypeRequiredAspectArgs.builder
      builder.requiredAspects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryGroupIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.EntryGroupIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerArgs.Builder)
    /**
     * @param onDemand The scan runs once via dataScans.run API.
     * @return builder
     */
    def onDemand(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerOnDemandArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerOnDemandArgs.builder
      builder.onDemand(args(argsBuilder).build)

    /**
     * @param oneTime The scan runs once upon DataScan creation.
     *  Structure is documented below.
     * @return builder
     */
    def oneTime(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerOneTimeArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerOneTimeArgs.builder
      builder.oneTime(args(argsBuilder).build)

    /**
     * @param schedule The scan is scheduled to run periodically.
     *  Structure is documented below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerScheduleArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryEntrySourceArgs.Builder)
    /**
     * @param ancestors Structure is documented below.
     * @return builder
     */
    def ancestors(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryEntrySourceAncestorArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.EntryEntrySourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryEntrySourceAncestorArgs.builder
      builder.ancestors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsArgs.Builder)
    /**
     * @param bigqueryExport If set, results will be exported to the provided BigQuery table.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryExport(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsBigqueryExportArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsBigqueryExportArgs.builder
      builder.bigqueryExport(args(argsBuilder).build)

    /**
     * @param notificationReport The configuration of notification report post scan action.
     *  Structure is documented below.
     * @return builder
     */
    def notificationReport(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportArgs.builder
      builder.notificationReport(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecArgs.Builder)
    /**
     * @param trigger Spec related to how often and when a scan should be triggered.
     *  Structure is documented below.
     * @return builder
     */
    def trigger(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.LakeIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.LakeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskNotebookArgs.Builder)
    /**
     * @param infrastructureSpec Infrastructure specification for the execution.
     *  Structure is documented below.
     * @return builder
     */
    def infrastructureSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskNotebookArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecArgs.builder
      builder.infrastructureSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.AspectTypeIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AspectTypeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AspectTypeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AspectTypeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigArgs.Builder)
    /**
     * @param csvOptions Configuration for CSV data.
     *  Structure is documented below.
     * @return builder
     */
    def csvOptions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigCsvOptionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigCsvOptionsArgs.builder
      builder.csvOptions(args(argsBuilder).build)

    /**
     * @param jsonOptions Configuration for JSON data.
     *  Structure is documented below.
     * @return builder
     */
    def jsonOptions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigJsonOptionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigJsonOptionsArgs.builder
      builder.jsonOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskSparkArgs.Builder)
    /**
     * @param infrastructureSpec Infrastructure specification for the execution.
     *  Structure is documented below.
     * @return builder
     */
    def infrastructureSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskSparkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecArgs.builder
      builder.infrastructureSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupArgs.Builder)
    /**
     * @param principal The principal entity.
     *  Structure is documented below.
     * @return builder
     */
    def principal(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupPrincipalArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskExecutionStatusArgs.Builder)
    /**
     * @param latestJobs (Output)
     *  latest job execution.
     *  Structure is documented below.
     * @return builder
     */
    def latestJobs(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskExecutionStatusLatestJobArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.TaskExecutionStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskExecutionStatusLatestJobArgs.builder
      builder.latestJobs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DataAssetState.Builder)
    /**
     * @param accessGroupConfigs Access groups configurations.
     *  Structure is documented below.
     * @return builder
     */
    def accessGroupConfigs(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataAssetAccessGroupConfigArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.DataAssetState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DataAssetAccessGroupConfigArgs.builder
      builder.accessGroupConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs.Builder)
    /**
     * @param postScanActions Actions to take upon job completion.
     *  Structure is documented below.
     * @return builder
     */
    def postScanActions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsArgs.builder
      builder.postScanActions(args(argsBuilder).build)

    /**
     * @param rules The list of rules to evaluate against a data source. At least one rule is required.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.ZoneIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.ZoneIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DataProductState.Builder)
    /**
     * @param accessGroups Custom user defined access groups at the data product level.
     *  Structure is documented below.
     * @return builder
     */
    def accessGroups(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.DataProductState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupArgs.builder
      builder.accessGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DataProductDataAssetState.Builder)
    /**
     * @param accessGroupConfigs Access groups configurations.
     *  Structure is documented below.
     * @return builder
     */
    def accessGroupConfigs(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductDataAssetAccessGroupConfigArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.DataProductDataAssetState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductDataAssetAccessGroupConfigArgs.builder
      builder.accessGroupConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTemplateReferenceArgs.Builder)
    /**
     * @param values The map of parameter name and value.
     *  Structure is documented below.
     * @return builder
     */
    def values(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTemplateReferenceValueArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTemplateReferenceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTemplateReferenceValueArgs.builder
      builder.values(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanState.Builder)
    /**
     * @param data The data source for DataScan.
     *  Structure is documented below.
     * @return builder
     */
    def data(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataArgs.builder
      builder.data(args(argsBuilder).build)

    /**
     * @param dataDiscoverySpec DataDiscoveryScan related setting.
     *  Structure is documented below.
     * @return builder
     */
    def dataDiscoverySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecArgs.builder
      builder.dataDiscoverySpec(args(argsBuilder).build)

    /**
     * @param dataDocumentationSpec DataDocumentationScan related setting.
     * @return builder
     */
    def dataDocumentationSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDocumentationSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDocumentationSpecArgs.builder
      builder.dataDocumentationSpec(args(argsBuilder).build)

    /**
     * @param dataProfileSpec DataProfileScan related setting.
     *  Structure is documented below.
     * @return builder
     */
    def dataProfileSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.builder
      builder.dataProfileSpec(args(argsBuilder).build)

    /**
     * @param dataQualitySpec DataQualityScan related setting.
     *  Structure is documented below.
     * @return builder
     */
    def dataQualitySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs.builder
      builder.dataQualitySpec(args(argsBuilder).build)

    /**
     * @param executionIdentity The identity to run the datascan. If not specified, defaults to the Dataplex Service Agent.
     *  Structure is documented below.
     * @return builder
     */
    def executionIdentity(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.builder
      builder.executionIdentity(args(argsBuilder).build)

    /**
     * @param executionSpec DataScan execution settings.
     *  Structure is documented below.
     * @return builder
     */
    def executionSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecArgs.builder
      builder.executionSpec(args(argsBuilder).build)

    /**
     * @param executionStatuses Status of the data scan execution.
     *  Structure is documented below.
     * @return builder
     */
    def executionStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionStatusArgs.builder
      builder.executionStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryLinkState.Builder)
    /**
     * @param aspects The Aspects attached to the Entry Link.
     *  Structure is documented below.
     * @return builder
     */
    def aspects(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryLinkAspectArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.EntryLinkState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryLinkAspectArgs.builder
      builder.aspects(args.map(_(argsBuilder).build)*)

    /**
     * @param entryReferences Specifies the Entries referenced in the Entry Link. There should be exactly two entry references.
     *  Structure is documented below.
     * @return builder
     */
    def entryReferences(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryLinkEntryReferenceArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.EntryLinkState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryLinkEntryReferenceArgs.builder
      builder.entryReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecArgs.Builder)
    /**
     * @param batch Compute resources needed for a Task when using Dataproc Serverless.
     *  Structure is documented below.
     * @return builder
     */
    def batch(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecBatchArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecBatchArgs.builder
      builder.batch(args(argsBuilder).build)

    /**
     * @param containerImage Container Image Runtime Configuration.
     *  Structure is documented below.
     * @return builder
     */
    def containerImage(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecContainerImageArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecContainerImageArgs.builder
      builder.containerImage(args(argsBuilder).build)

    /**
     * @param vpcNetwork Vpc network.
     *  Structure is documented below.
     * @return builder
     */
    def vpcNetwork(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecVpcNetworkArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecVpcNetworkArgs.builder
      builder.vpcNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs.Builder)
    /**
     * @param csvOptions Optional. Configuration for CSV data.
     * @return builder
     */
    def csvOptions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecCsvOptionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecCsvOptionsArgs.builder
      builder.csvOptions(args(argsBuilder).build)

    /**
     * @param jsonOptions Optional. Configuration for Json data.
     * @return builder
     */
    def jsonOptions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecJsonOptionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecJsonOptionsArgs.builder
      builder.jsonOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.AssetState.Builder)
    /**
     * @param discoverySpec Required. Specification of the discovery feature applied to data referenced by this asset. When this spec is left unset, the asset will use the spec set on the parent zone.
     * @return builder
     */
    def discoverySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AssetState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecArgs.builder
      builder.discoverySpec(args(argsBuilder).build)

    /**
     * @param discoveryStatuses Output only. Status of the discovery feature applied to data referenced by this asset.
     * @return builder
     */
    def discoveryStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetDiscoveryStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.AssetState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetDiscoveryStatusArgs.builder
      builder.discoveryStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceSpec Required. Immutable. Specification of the resource that is referenced by this asset.
     * @return builder
     */
    def resourceSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetResourceSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AssetState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetResourceSpecArgs.builder
      builder.resourceSpec(args(argsBuilder).build)

    /**
     * @param resourceStatuses Output only. Status of the resource referenced by this asset.
     * @return builder
     */
    def resourceStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetResourceStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.AssetState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetResourceStatusArgs.builder
      builder.resourceStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param securityStatuses Output only. Status of the security policy applied to resource referenced by this asset.
     * @return builder
     */
    def securityStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetSecurityStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.AssetState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetSecurityStatusArgs.builder
      builder.securityStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecArgs.Builder)
    /**
     * @param batch Compute resources needed for a Task when using Dataproc Serverless.
     *  Structure is documented below.
     * @return builder
     */
    def batch(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecBatchArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecBatchArgs.builder
      builder.batch(args(argsBuilder).build)

    /**
     * @param containerImage Container Image Runtime Configuration.
     *  Structure is documented below.
     * @return builder
     */
    def containerImage(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecContainerImageArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecContainerImageArgs.builder
      builder.containerImage(args(argsBuilder).build)

    /**
     * @param vpcNetwork Vpc network.
     *  Structure is documented below.
     * @return builder
     */
    def vpcNetwork(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecVpcNetworkArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecVpcNetworkArgs.builder
      builder.vpcNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.GlossaryIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GlossaryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.GlossaryIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GlossaryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.AssetIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AssetIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AspectTypeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AspectTypeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /** The Dataplex Lake resource */
  def Lake(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dataplex.LakeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dataplex.LakeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dataplex.Lake(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
