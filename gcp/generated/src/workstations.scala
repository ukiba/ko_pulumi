package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object workstations:
  type WorkstationsFunctions = com.pulumi.gcp.workstations.WorkstationsFunctions
  object WorkstationsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.workstations.WorkstationsFunctions.*
  extension (self: WorkstationsFunctions.type)
    /** Retrieves the current IAM policy data for workstationconfig */
    def getWorkstationConfigIamPolicy(args: Endofunction[com.pulumi.gcp.workstations.inputs.GetWorkstationConfigIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.workstations.outputs.GetWorkstationConfigIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.GetWorkstationConfigIamPolicyArgs.builder
      com.pulumi.gcp.workstations.WorkstationsFunctions.getWorkstationConfigIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for workstationconfig */
    def getWorkstationConfigIamPolicyPlain(args: Endofunction[com.pulumi.gcp.workstations.inputs.GetWorkstationConfigIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.workstations.outputs.GetWorkstationConfigIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.GetWorkstationConfigIamPolicyPlainArgs.builder
      com.pulumi.gcp.workstations.WorkstationsFunctions.getWorkstationConfigIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for workstation */
    def getWorkstationIamPolicy(args: Endofunction[com.pulumi.gcp.workstations.inputs.GetWorkstationIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.workstations.outputs.GetWorkstationIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.GetWorkstationIamPolicyArgs.builder
      com.pulumi.gcp.workstations.WorkstationsFunctions.getWorkstationIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for workstation */
    def getWorkstationIamPolicyPlain(args: Endofunction[com.pulumi.gcp.workstations.inputs.GetWorkstationIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.workstations.outputs.GetWorkstationIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.GetWorkstationIamPolicyPlainArgs.builder
      com.pulumi.gcp.workstations.WorkstationsFunctions.getWorkstationIamPolicyPlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Workstations WorkstationConfig. Each of these resources serves a different use case:
   * 
   *  * `gcp.workstations.WorkstationConfigIamPolicy`: Authoritative. Sets the IAM policy for the workstationconfig and replaces any existing policy already attached.
   *  * `gcp.workstations.WorkstationConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstationconfig are preserved.
   *  * `gcp.workstations.WorkstationConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstationconfig are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.workstations.WorkstationConfigIamPolicy`: Retrieves the IAM policy for the workstationconfig
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationConfigIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationConfigIamBinding` and `gcp.workstations.WorkstationConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationConfigIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.workstations.WorkstationConfigIamPolicy
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
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamPolicy;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs;
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
   *          var policy = new WorkstationConfigIamPolicy("policy", WorkstationConfigIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamBinding;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs;
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
   *          var binding = new WorkstationConfigIamBinding("binding", WorkstationConfigIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamMember;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs;
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
   *          var member = new WorkstationConfigIamMember("member", WorkstationConfigIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
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
   *  # IAM policy for Cloud Workstations WorkstationConfig
   * 
   *  Three different resources help you manage your IAM policy for Cloud Workstations WorkstationConfig. Each of these resources serves a different use case:
   * 
   *  * `gcp.workstations.WorkstationConfigIamPolicy`: Authoritative. Sets the IAM policy for the workstationconfig and replaces any existing policy already attached.
   *  * `gcp.workstations.WorkstationConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstationconfig are preserved.
   *  * `gcp.workstations.WorkstationConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstationconfig are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.workstations.WorkstationConfigIamPolicy`: Retrieves the IAM policy for the workstationconfig
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationConfigIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationConfigIamBinding` and `gcp.workstations.WorkstationConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationConfigIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.workstations.WorkstationConfigIamPolicy
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
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamPolicy;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs;
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
   *          var policy = new WorkstationConfigIamPolicy("policy", WorkstationConfigIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamBinding;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs;
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
   *          var binding = new WorkstationConfigIamBinding("binding", WorkstationConfigIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamMember;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs;
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
   *          var member = new WorkstationConfigIamMember("member", WorkstationConfigIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
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
   *  * projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
   *  * {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
   *  * {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
   *  * {{workstation_config_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Workstations workstationconfig IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_workstations_workstation_config_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_workstations_workstation_config_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:workstations/workstationConfigIamPolicy:WorkstationConfigIamPolicy editor projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkstationConfigIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs.builder
    com.pulumi.gcp.workstations.WorkstationConfigIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Workstations WorkstationConfig. Each of these resources serves a different use case:
   * 
   *  * `gcp.workstations.WorkstationConfigIamPolicy`: Authoritative. Sets the IAM policy for the workstationconfig and replaces any existing policy already attached.
   *  * `gcp.workstations.WorkstationConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstationconfig are preserved.
   *  * `gcp.workstations.WorkstationConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstationconfig are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.workstations.WorkstationConfigIamPolicy`: Retrieves the IAM policy for the workstationconfig
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationConfigIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationConfigIamBinding` and `gcp.workstations.WorkstationConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationConfigIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.workstations.WorkstationConfigIamPolicy
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
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamPolicy;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs;
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
   *          var policy = new WorkstationConfigIamPolicy("policy", WorkstationConfigIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamBinding;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs;
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
   *          var binding = new WorkstationConfigIamBinding("binding", WorkstationConfigIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamMember;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs;
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
   *          var member = new WorkstationConfigIamMember("member", WorkstationConfigIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
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
   *  # IAM policy for Cloud Workstations WorkstationConfig
   * 
   *  Three different resources help you manage your IAM policy for Cloud Workstations WorkstationConfig. Each of these resources serves a different use case:
   * 
   *  * `gcp.workstations.WorkstationConfigIamPolicy`: Authoritative. Sets the IAM policy for the workstationconfig and replaces any existing policy already attached.
   *  * `gcp.workstations.WorkstationConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstationconfig are preserved.
   *  * `gcp.workstations.WorkstationConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstationconfig are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.workstations.WorkstationConfigIamPolicy`: Retrieves the IAM policy for the workstationconfig
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationConfigIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationConfigIamBinding` and `gcp.workstations.WorkstationConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationConfigIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.workstations.WorkstationConfigIamPolicy
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
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamPolicy;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs;
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
   *          var policy = new WorkstationConfigIamPolicy("policy", WorkstationConfigIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamBinding;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs;
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
   *          var binding = new WorkstationConfigIamBinding("binding", WorkstationConfigIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamMember;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs;
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
   *          var member = new WorkstationConfigIamMember("member", WorkstationConfigIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
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
   *  * projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
   *  * {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
   *  * {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
   *  * {{workstation_config_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Workstations workstationconfig IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_workstations_workstation_config_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_workstations_workstation_config_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:workstations/workstationConfigIamMember:WorkstationConfigIamMember editor projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkstationConfigIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs.builder
    com.pulumi.gcp.workstations.WorkstationConfigIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.workstations.WorkstationClusterArgs.Builder)
    /**
     * @param domainConfig Configuration options for a custom domain.
     *  Structure is documented below.
     * @return builder
     */
    def domainConfig(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationClusterDomainConfigArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationClusterDomainConfigArgs.builder
      builder.domainConfig(args(argsBuilder).build)

    /**
     * @param privateClusterConfig Configuration for private cluster.
     *  Structure is documented below.
     * @return builder
     */
    def privateClusterConfig(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationClusterPrivateClusterConfigArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationClusterPrivateClusterConfigArgs.builder
      builder.privateClusterConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.workstations.WorkstationClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Three different resources help you manage your IAM policy for Cloud Workstations WorkstationConfig. Each of these resources serves a different use case:
   * 
   *  * `gcp.workstations.WorkstationConfigIamPolicy`: Authoritative. Sets the IAM policy for the workstationconfig and replaces any existing policy already attached.
   *  * `gcp.workstations.WorkstationConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstationconfig are preserved.
   *  * `gcp.workstations.WorkstationConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstationconfig are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.workstations.WorkstationConfigIamPolicy`: Retrieves the IAM policy for the workstationconfig
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationConfigIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationConfigIamBinding` and `gcp.workstations.WorkstationConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationConfigIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.workstations.WorkstationConfigIamPolicy
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
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamPolicy;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs;
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
   *          var policy = new WorkstationConfigIamPolicy("policy", WorkstationConfigIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamBinding;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs;
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
   *          var binding = new WorkstationConfigIamBinding("binding", WorkstationConfigIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamMember;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs;
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
   *          var member = new WorkstationConfigIamMember("member", WorkstationConfigIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
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
   *  # IAM policy for Cloud Workstations WorkstationConfig
   * 
   *  Three different resources help you manage your IAM policy for Cloud Workstations WorkstationConfig. Each of these resources serves a different use case:
   * 
   *  * `gcp.workstations.WorkstationConfigIamPolicy`: Authoritative. Sets the IAM policy for the workstationconfig and replaces any existing policy already attached.
   *  * `gcp.workstations.WorkstationConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstationconfig are preserved.
   *  * `gcp.workstations.WorkstationConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstationconfig are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.workstations.WorkstationConfigIamPolicy`: Retrieves the IAM policy for the workstationconfig
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationConfigIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationConfigIamBinding` and `gcp.workstations.WorkstationConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationConfigIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.workstations.WorkstationConfigIamPolicy
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
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamPolicy;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamPolicyArgs;
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
   *          var policy = new WorkstationConfigIamPolicy("policy", WorkstationConfigIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamBinding;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs;
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
   *          var binding = new WorkstationConfigIamBinding("binding", WorkstationConfigIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamMember;
   *  import com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs;
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
   *          var member = new WorkstationConfigIamMember("member", WorkstationConfigIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
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
   *  * projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
   *  * {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
   *  * {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}
   *  * {{workstation_config_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Workstations workstationconfig IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_workstations_workstation_config_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_workstations_workstation_config_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:workstations/workstationConfigIamBinding:WorkstationConfigIamBinding editor projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkstationConfigIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationConfigIamBindingArgs.builder
    com.pulumi.gcp.workstations.WorkstationConfigIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.workstations.WorkstationIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder)
    /**
     * @param allowedPorts A list of port ranges specifying single ports or ranges of ports that are externally accessible in the workstation. Allowed ports must be one of 22, 80, or within range 1024-65535. If not specified defaults to ports 22, 80, and ports 1024-65535.
     *  Structure is documented below.
     * @return builder
     */
    def allowedPorts(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigAllowedPortArgs.Builder]*):
        com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigAllowedPortArgs.builder
      builder.allowedPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param container Container that will be run for each workstation using this configuration when that workstation is started.
     *  Structure is documented below.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigContainerArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigContainerArgs.builder
      builder.container(args(argsBuilder).build)

    /**
     * @param encryptionKey Encrypts resources of this workstation configuration using a customer-managed encryption key.
     *  If specified, the boot disk of the Compute Engine instance and the persistent disk are encrypted using this encryption key. If this field is not set, the disks are encrypted using a generated key. Customer-managed encryption keys do not protect disk metadata.
     *  If the customer-managed encryption key is rotated, when the workstation instance is stopped, the system attempts to recreate the persistent disk with the new version of the key. Be sure to keep older versions of the key until the persistent disk is recreated. Otherwise, data on the persistent disk will be lost.
     *  If the encryption key is revoked, the workstation session will automatically be stopped within 7 hours.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionKey(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigEncryptionKeyArgs.builder
      builder.encryptionKey(args(argsBuilder).build)

    /**
     * @param ephemeralDirectories Ephemeral directories which won&#39;t persist across workstation sessions.
     *  Structure is documented below.
     * @return builder
     */
    def ephemeralDirectories(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryArgs.Builder]*):
        com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryArgs.builder
      builder.ephemeralDirectories(args.map(_(argsBuilder).build)*)

    /**
     * @param host Runtime host for a workstation.
     *  Structure is documented below.
     * @return builder
     */
    def host(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostArgs.builder
      builder.host(args(argsBuilder).build)

    /**
     * @param persistentDirectories Directories to persist across workstation sessions.
     *  Structure is documented below.
     * @return builder
     */
    def persistentDirectories(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryArgs.Builder]*):
        com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryArgs.builder
      builder.persistentDirectories(args.map(_(argsBuilder).build)*)

    /**
     * @param readinessChecks Readiness checks to be performed on a workstation.
     *  Structure is documented below.
     * @return builder
     */
    def readinessChecks(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigReadinessCheckArgs.Builder]*):
        com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigReadinessCheckArgs.builder
      builder.readinessChecks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.workstations.WorkstationIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Workstations Workstation. Each of these resources serves a different use case:
   * 
   *  * `gcp.workstations.WorkstationIamPolicy`: Authoritative. Sets the IAM policy for the workstation and replaces any existing policy already attached.
   *  * `gcp.workstations.WorkstationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstation are preserved.
   *  * `gcp.workstations.WorkstationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstation are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.workstations.WorkstationIamPolicy`: Retrieves the IAM policy for the workstation
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationIamBinding` and `gcp.workstations.WorkstationIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.workstations.WorkstationIamPolicy
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
   *  import com.pulumi.gcp.workstations.WorkstationIamPolicy;
   *  import com.pulumi.gcp.workstations.WorkstationIamPolicyArgs;
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
   *          var policy = new WorkstationIamPolicy("policy", WorkstationIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationIamBinding;
   *  import com.pulumi.gcp.workstations.WorkstationIamBindingArgs;
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
   *          var binding = new WorkstationIamBinding("binding", WorkstationIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationIamMember;
   *  import com.pulumi.gcp.workstations.WorkstationIamMemberArgs;
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
   *          var member = new WorkstationIamMember("member", WorkstationIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
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
   *  # IAM policy for Cloud Workstations Workstation
   * 
   *  Three different resources help you manage your IAM policy for Cloud Workstations Workstation. Each of these resources serves a different use case:
   * 
   *  * `gcp.workstations.WorkstationIamPolicy`: Authoritative. Sets the IAM policy for the workstation and replaces any existing policy already attached.
   *  * `gcp.workstations.WorkstationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstation are preserved.
   *  * `gcp.workstations.WorkstationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstation are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.workstations.WorkstationIamPolicy`: Retrieves the IAM policy for the workstation
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationIamBinding` and `gcp.workstations.WorkstationIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.workstations.WorkstationIamPolicy
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
   *  import com.pulumi.gcp.workstations.WorkstationIamPolicy;
   *  import com.pulumi.gcp.workstations.WorkstationIamPolicyArgs;
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
   *          var policy = new WorkstationIamPolicy("policy", WorkstationIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationIamBinding;
   *  import com.pulumi.gcp.workstations.WorkstationIamBindingArgs;
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
   *          var binding = new WorkstationIamBinding("binding", WorkstationIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationIamMember;
   *  import com.pulumi.gcp.workstations.WorkstationIamMemberArgs;
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
   *          var member = new WorkstationIamMember("member", WorkstationIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
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
   *  * projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
   *  * {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
   *  * {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
   *  * {{workstation_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Workstations workstation IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_workstations_workstation_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_workstations_workstation_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:workstations/workstationIamMember:WorkstationIamMember editor projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkstationIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationIamMemberArgs.builder
    com.pulumi.gcp.workstations.WorkstationIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A single instance of a developer workstation with its own persistent storage.
   * 
   *  To get more information about Workstation, see:
   * 
   *  * [API documentation](https://cloud.google.com/workstations/docs/reference/rest/v1/projects.locations.workstationClusters.workstationConfigs.workstations)
   *  * How-to Guides
   *      * [Workstations](https://cloud.google.com/workstations/docs/)
   */
  def Workstation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationArgs.builder
    com.pulumi.gcp.workstations.Workstation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A set of configuration options describing how a workstation will be run. Workstation configurations are intended to be shared across multiple workstations.
   * 
   *  To get more information about WorkstationConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/workstations/docs/reference/rest/v1/projects.locations.workstationClusters.workstationConfigs/create)
   *  * How-to Guides
   *      * [Workstations](https://cloud.google.com/workstations/docs/)
   */
  def WorkstationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationConfigArgs.builder
    com.pulumi.gcp.workstations.WorkstationConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Workstations Workstation. Each of these resources serves a different use case:
   * 
   *  * `gcp.workstations.WorkstationIamPolicy`: Authoritative. Sets the IAM policy for the workstation and replaces any existing policy already attached.
   *  * `gcp.workstations.WorkstationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstation are preserved.
   *  * `gcp.workstations.WorkstationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstation are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.workstations.WorkstationIamPolicy`: Retrieves the IAM policy for the workstation
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationIamBinding` and `gcp.workstations.WorkstationIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.workstations.WorkstationIamPolicy
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
   *  import com.pulumi.gcp.workstations.WorkstationIamPolicy;
   *  import com.pulumi.gcp.workstations.WorkstationIamPolicyArgs;
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
   *          var policy = new WorkstationIamPolicy("policy", WorkstationIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationIamBinding;
   *  import com.pulumi.gcp.workstations.WorkstationIamBindingArgs;
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
   *          var binding = new WorkstationIamBinding("binding", WorkstationIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationIamMember;
   *  import com.pulumi.gcp.workstations.WorkstationIamMemberArgs;
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
   *          var member = new WorkstationIamMember("member", WorkstationIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
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
   *  # IAM policy for Cloud Workstations Workstation
   * 
   *  Three different resources help you manage your IAM policy for Cloud Workstations Workstation. Each of these resources serves a different use case:
   * 
   *  * `gcp.workstations.WorkstationIamPolicy`: Authoritative. Sets the IAM policy for the workstation and replaces any existing policy already attached.
   *  * `gcp.workstations.WorkstationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstation are preserved.
   *  * `gcp.workstations.WorkstationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstation are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.workstations.WorkstationIamPolicy`: Retrieves the IAM policy for the workstation
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationIamBinding` and `gcp.workstations.WorkstationIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.workstations.WorkstationIamPolicy
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
   *  import com.pulumi.gcp.workstations.WorkstationIamPolicy;
   *  import com.pulumi.gcp.workstations.WorkstationIamPolicyArgs;
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
   *          var policy = new WorkstationIamPolicy("policy", WorkstationIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationIamBinding;
   *  import com.pulumi.gcp.workstations.WorkstationIamBindingArgs;
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
   *          var binding = new WorkstationIamBinding("binding", WorkstationIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationIamMember;
   *  import com.pulumi.gcp.workstations.WorkstationIamMemberArgs;
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
   *          var member = new WorkstationIamMember("member", WorkstationIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
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
   *  * projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
   *  * {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
   *  * {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
   *  * {{workstation_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Workstations workstation IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_workstations_workstation_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_workstations_workstation_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:workstations/workstationIamPolicy:WorkstationIamPolicy editor projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkstationIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationIamPolicyArgs.builder
    com.pulumi.gcp.workstations.WorkstationIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Workstations Workstation. Each of these resources serves a different use case:
   * 
   *  * `gcp.workstations.WorkstationIamPolicy`: Authoritative. Sets the IAM policy for the workstation and replaces any existing policy already attached.
   *  * `gcp.workstations.WorkstationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstation are preserved.
   *  * `gcp.workstations.WorkstationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstation are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.workstations.WorkstationIamPolicy`: Retrieves the IAM policy for the workstation
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationIamBinding` and `gcp.workstations.WorkstationIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.workstations.WorkstationIamPolicy
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
   *  import com.pulumi.gcp.workstations.WorkstationIamPolicy;
   *  import com.pulumi.gcp.workstations.WorkstationIamPolicyArgs;
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
   *          var policy = new WorkstationIamPolicy("policy", WorkstationIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationIamBinding;
   *  import com.pulumi.gcp.workstations.WorkstationIamBindingArgs;
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
   *          var binding = new WorkstationIamBinding("binding", WorkstationIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationIamMember;
   *  import com.pulumi.gcp.workstations.WorkstationIamMemberArgs;
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
   *          var member = new WorkstationIamMember("member", WorkstationIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
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
   *  # IAM policy for Cloud Workstations Workstation
   * 
   *  Three different resources help you manage your IAM policy for Cloud Workstations Workstation. Each of these resources serves a different use case:
   * 
   *  * `gcp.workstations.WorkstationIamPolicy`: Authoritative. Sets the IAM policy for the workstation and replaces any existing policy already attached.
   *  * `gcp.workstations.WorkstationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workstation are preserved.
   *  * `gcp.workstations.WorkstationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workstation are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.workstations.WorkstationIamPolicy`: Retrieves the IAM policy for the workstation
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationIamPolicy` **cannot** be used in conjunction with `gcp.workstations.WorkstationIamBinding` and `gcp.workstations.WorkstationIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.workstations.WorkstationIamBinding` resources **can be** used in conjunction with `gcp.workstations.WorkstationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.workstations.WorkstationIamPolicy
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
   *  import com.pulumi.gcp.workstations.WorkstationIamPolicy;
   *  import com.pulumi.gcp.workstations.WorkstationIamPolicyArgs;
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
   *          var policy = new WorkstationIamPolicy("policy", WorkstationIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationIamBinding;
   *  import com.pulumi.gcp.workstations.WorkstationIamBindingArgs;
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
   *          var binding = new WorkstationIamBinding("binding", WorkstationIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.workstations.WorkstationIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.workstations.WorkstationIamMember;
   *  import com.pulumi.gcp.workstations.WorkstationIamMemberArgs;
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
   *          var member = new WorkstationIamMember("member", WorkstationIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .workstationClusterId(default_.workstationClusterId())
   *              .workstationConfigId(default_.workstationConfigId())
   *              .workstationId(default_.workstationId())
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
   *  * projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
   *  * {{project}}/{{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
   *  * {{location}}/{{workstation_cluster_id}}/{{workstation_config_id}}/{{workstation_id}}
   *  * {{workstation_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Workstations workstation IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_workstations_workstation_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_workstations_workstation_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:workstations/workstationIamBinding:WorkstationIamBinding editor projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}/workstationConfigs/{{workstation_config_id}}/workstations/{{workstation_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkstationIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.workstations.WorkstationIamBindingArgs.builder
    com.pulumi.gcp.workstations.WorkstationIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.workstations.WorkstationConfigIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceBoostConfigArgs.Builder)
    /**
     * @param accelerators An accelerator card attached to the boost instance.
     *  Structure is documented below.
     * @return builder
     */
    def accelerators(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceBoostConfigAcceleratorArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceBoostConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceBoostConfigAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder)
    /**
     * @param allowedPorts A list of port ranges specifying single ports or ranges of ports that are externally accessible in the workstation. Allowed ports must be one of 22, 80, or within range 1024-65535. If not specified defaults to ports 22, 80, and ports 1024-65535.
     *  Structure is documented below.
     * @return builder
     */
    def allowedPorts(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigAllowedPortArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigAllowedPortArgs.builder
      builder.allowedPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param conditions Status conditions describing the current resource state.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigConditionArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param container Container that will be run for each workstation using this configuration when that workstation is started.
     *  Structure is documented below.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigContainerArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigContainerArgs.builder
      builder.container(args(argsBuilder).build)

    /**
     * @param encryptionKey Encrypts resources of this workstation configuration using a customer-managed encryption key.
     *  If specified, the boot disk of the Compute Engine instance and the persistent disk are encrypted using this encryption key. If this field is not set, the disks are encrypted using a generated key. Customer-managed encryption keys do not protect disk metadata.
     *  If the customer-managed encryption key is rotated, when the workstation instance is stopped, the system attempts to recreate the persistent disk with the new version of the key. Be sure to keep older versions of the key until the persistent disk is recreated. Otherwise, data on the persistent disk will be lost.
     *  If the encryption key is revoked, the workstation session will automatically be stopped within 7 hours.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionKey(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigEncryptionKeyArgs.builder
      builder.encryptionKey(args(argsBuilder).build)

    /**
     * @param ephemeralDirectories Ephemeral directories which won&#39;t persist across workstation sessions.
     *  Structure is documented below.
     * @return builder
     */
    def ephemeralDirectories(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryArgs.builder
      builder.ephemeralDirectories(args.map(_(argsBuilder).build)*)

    /**
     * @param host Runtime host for a workstation.
     *  Structure is documented below.
     * @return builder
     */
    def host(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostArgs.builder
      builder.host(args(argsBuilder).build)

    /**
     * @param persistentDirectories Directories to persist across workstation sessions.
     *  Structure is documented below.
     * @return builder
     */
    def persistentDirectories(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryArgs.builder
      builder.persistentDirectories(args.map(_(argsBuilder).build)*)

    /**
     * @param readinessChecks Readiness checks to be performed on a workstation.
     *  Structure is documented below.
     * @return builder
     */
    def readinessChecks(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigReadinessCheckArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigReadinessCheckArgs.builder
      builder.readinessChecks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationClusterState.Builder)
    /**
     * @param conditions Status conditions describing the current resource state.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationClusterConditionArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationClusterConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param domainConfig Configuration options for a custom domain.
     *  Structure is documented below.
     * @return builder
     */
    def domainConfig(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationClusterDomainConfigArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationClusterDomainConfigArgs.builder
      builder.domainConfig(args(argsBuilder).build)

    /**
     * @param privateClusterConfig Configuration for private cluster.
     *  Structure is documented below.
     * @return builder
     */
    def privateClusterConfig(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationClusterPrivateClusterConfigArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationClusterPrivateClusterConfigArgs.builder
      builder.privateClusterConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.workstations.inputs.WorkstationClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigHostArgs.Builder)
    /**
     * @param gceInstance A runtime using a Compute Engine instance.
     *  Structure is documented below.
     * @return builder
     */
    def gceInstance(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigHostArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs.builder
      builder.gceInstance(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs.Builder)
    /**
     * @param accelerators An accelerator card attached to the instance.
     *  Structure is documented below.
     * @return builder
     */
    def accelerators(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceAcceleratorArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param boostConfigs A list of the boost configurations that workstations created using this workstation configuration are allowed to use.
     *  Structure is documented below.
     * @return builder
     */
    def boostConfigs(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceBoostConfigArgs.Builder]*):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceBoostConfigArgs.builder
      builder.boostConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param confidentialInstanceConfig A set of Compute Engine Confidential VM instance options.
     *  Structure is documented below.
     * @return builder
     */
    def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig A set of Compute Engine Shielded instance options.
     *  Structure is documented below.
     * @return builder
     */
    def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigHostGceInstanceShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryArgs.Builder)
    /**
     * @param gcePd A directory to persist across workstation sessions, backed by a Compute Engine regional persistent disk. Can only be updated if not empty during creation.
     *  Structure is documented below.
     * @return builder
     */
    def gcePd(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryGcePdArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigPersistentDirectoryGcePdArgs.builder
      builder.gcePd(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryArgs.Builder)
    /**
     * @param gcePd An EphemeralDirectory backed by a Compute Engine persistent disk.
     *  Structure is documented below.
     * @return builder
     */
    def gcePd(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryGcePdArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationConfigEphemeralDirectoryGcePdArgs.builder
      builder.gcePd(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.workstations.inputs.WorkstationIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.workstations.inputs.WorkstationIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.workstations.inputs.WorkstationIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.workstations.inputs.WorkstationIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A grouping of workstation configurations and the associated workstations in that region.
   * 
   *  To get more information about WorkstationCluster, see:
   * 
   *  * [API documentation](https://cloud.google.com/workstations/docs/reference/rest/v1/projects.locations.workstationClusters/create)
   *  * How-to Guides
   *      * [Workstations](https://cloud.google.com/workstations/docs/)
   */
  def WorkstationCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.workstations.WorkstationClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.workstations.WorkstationClusterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.gcp.workstations.WorkstationCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
