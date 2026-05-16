package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object gemini:
  /**
   * The resource for managing CodeTools setting bindings for Admin Control.
   * 
   *  To get more information about CodeToolsSettingBinding, see:
   *  * How-to Guides
   *      * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  def CodeToolsSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.CodeToolsSettingBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.CodeToolsSettingBindingArgs.builder
    com.pulumi.gcp.gemini.CodeToolsSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** The resource for managing CodeTools settings for Admin Control. */
  def CodeToolsSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.CodeToolsSettingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.CodeToolsSettingArgs.builder
    com.pulumi.gcp.gemini.CodeToolsSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** The resource for managing ReleaseChannel settings for Admin Control. */
  def ReleaseChannelSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.ReleaseChannelSettingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.ReleaseChannelSettingArgs.builder
    com.pulumi.gcp.gemini.ReleaseChannelSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object GeminiFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for repositorygroup */
    inline def getRepositoryGroupIamPolicy(args: Endofunction[com.pulumi.gcp.gemini.inputs.GetRepositoryGroupIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.gemini.outputs.GetRepositoryGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GetRepositoryGroupIamPolicyArgs.builder
      com.pulumi.gcp.gemini.GeminiFunctions.getRepositoryGroupIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for repositorygroup */
    inline def getRepositoryGroupIamPolicyPlain(args: Endofunction[com.pulumi.gcp.gemini.inputs.GetRepositoryGroupIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gemini.outputs.GetRepositoryGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GetRepositoryGroupIamPolicyPlainArgs.builder
      com.pulumi.gcp.gemini.GeminiFunctions.getRepositoryGroupIamPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * The resource for managing Logging setting bindings for Admin Control.
   * 
   *  To get more information about LoggingSettingBinding, see:
   *  * How-to Guides
   *      * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  def LoggingSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.LoggingSettingBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.LoggingSettingBindingArgs.builder
    com.pulumi.gcp.gemini.LoggingSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The resource for managing Repository Group for Gemini Code Assist.
   * 
   *  To get more information about RepositoryGroup, see:
   * 
   *  * [API documentation](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.codeRepositoryIndexes.repositoryGroups)
   */
  def RepositoryGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.RepositoryGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.RepositoryGroupArgs.builder
    com.pulumi.gcp.gemini.RepositoryGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gemini.RepositoryGroupArgs.Builder)
    /**
     * @param repositories Required. List of repositories to group.
     *  Structure is documented below.
     * @return builder
     */
    def repositories(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupRepositoryArgs.Builder]*):
        com.pulumi.gcp.gemini.RepositoryGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)

  /**
   * Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
   *  * `gcp.gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved.
   *  * `gcp.gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
   * 
   *  &gt; **Note:** `gcp.gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gcp.gemini.RepositoryGroupIamBinding` and `gcp.gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gcp.gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gemini.RepositoryGroupIamPolicy
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
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamPolicy;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs;
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
   *                  .role("roles/cloudaicompanion.repositoryGroupsUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryGroupIamPolicy("policy", RepositoryGroupIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gemini.RepositoryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamBinding;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs;
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
   *          var binding = new RepositoryGroupIamBinding("binding", RepositoryGroupIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .role("roles/cloudaicompanion.repositoryGroupsUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gemini.RepositoryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamMember;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs;
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
   *          var member = new RepositoryGroupIamMember("member", RepositoryGroupIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .role("roles/cloudaicompanion.repositoryGroupsUser")
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
   *  # IAM policy for Gemini for Google Cloud RepositoryGroup
   * 
   *  Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
   *  * `gcp.gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved.
   *  * `gcp.gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
   * 
   *  &gt; **Note:** `gcp.gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gcp.gemini.RepositoryGroupIamBinding` and `gcp.gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gcp.gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gemini.RepositoryGroupIamPolicy
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
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamPolicy;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs;
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
   *                  .role("roles/cloudaicompanion.repositoryGroupsUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryGroupIamPolicy("policy", RepositoryGroupIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gemini.RepositoryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamBinding;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs;
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
   *          var binding = new RepositoryGroupIamBinding("binding", RepositoryGroupIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .role("roles/cloudaicompanion.repositoryGroupsUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gemini.RepositoryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamMember;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs;
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
   *          var member = new RepositoryGroupIamMember("member", RepositoryGroupIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .role("roles/cloudaicompanion.repositoryGroupsUser")
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
   *  * projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
   *  * {{project}}/{{location}}/{{code_repository_index}}/{{repository_group_id}}
   *  * {{location}}/{{code_repository_index}}/{{repository_group_id}}
   *  * {{repository_group_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Gemini for Google Cloud repositorygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gemini_repository_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gemini_repository_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gemini/repositoryGroupIamBinding:RepositoryGroupIamBinding editor projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryGroupIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs.builder
    com.pulumi.gcp.gemini.RepositoryGroupIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The resource for managing GeminiGcpEnablementSetting setting bindings for Admin Control.
   * 
   *  To get more information about GeminiGcpEnablementSettingBinding, see:
   *  * How-to Guides
   *      * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  def GeminiGcpEnablementSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.GeminiGcpEnablementSettingBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.GeminiGcpEnablementSettingBindingArgs.builder
    com.pulumi.gcp.gemini.GeminiGcpEnablementSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
   *  * `gcp.gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved.
   *  * `gcp.gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
   * 
   *  &gt; **Note:** `gcp.gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gcp.gemini.RepositoryGroupIamBinding` and `gcp.gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gcp.gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gemini.RepositoryGroupIamPolicy
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
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamPolicy;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs;
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
   *                  .role("roles/cloudaicompanion.repositoryGroupsUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryGroupIamPolicy("policy", RepositoryGroupIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gemini.RepositoryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamBinding;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs;
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
   *          var binding = new RepositoryGroupIamBinding("binding", RepositoryGroupIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .role("roles/cloudaicompanion.repositoryGroupsUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gemini.RepositoryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamMember;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs;
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
   *          var member = new RepositoryGroupIamMember("member", RepositoryGroupIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .role("roles/cloudaicompanion.repositoryGroupsUser")
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
   *  # IAM policy for Gemini for Google Cloud RepositoryGroup
   * 
   *  Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
   *  * `gcp.gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved.
   *  * `gcp.gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
   * 
   *  &gt; **Note:** `gcp.gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gcp.gemini.RepositoryGroupIamBinding` and `gcp.gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gcp.gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gemini.RepositoryGroupIamPolicy
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
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamPolicy;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs;
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
   *                  .role("roles/cloudaicompanion.repositoryGroupsUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryGroupIamPolicy("policy", RepositoryGroupIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gemini.RepositoryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamBinding;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs;
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
   *          var binding = new RepositoryGroupIamBinding("binding", RepositoryGroupIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .role("roles/cloudaicompanion.repositoryGroupsUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gemini.RepositoryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamMember;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs;
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
   *          var member = new RepositoryGroupIamMember("member", RepositoryGroupIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .role("roles/cloudaicompanion.repositoryGroupsUser")
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
   *  * projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
   *  * {{project}}/{{location}}/{{code_repository_index}}/{{repository_group_id}}
   *  * {{location}}/{{code_repository_index}}/{{repository_group_id}}
   *  * {{repository_group_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Gemini for Google Cloud repositorygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gemini_repository_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gemini_repository_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gemini/repositoryGroupIamMember:RepositoryGroupIamMember editor projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryGroupIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs.builder
    com.pulumi.gcp.gemini.RepositoryGroupIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** The resource for managing DataSharingWithGoogle settings for Admin Control. */
  def DataSharingWithGoogleSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.DataSharingWithGoogleSettingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.DataSharingWithGoogleSettingArgs.builder
    com.pulumi.gcp.gemini.DataSharingWithGoogleSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** The resource for managing Logging settings for Admin Control. */
  def LoggingSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.LoggingSettingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.LoggingSettingArgs.builder
    com.pulumi.gcp.gemini.LoggingSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * The resource for managing ReleaseChannel setting bindings for Admin Control.
   * 
   *  To get more information about ReleaseChannelSettingBinding, see:
   *  * How-to Guides
   *      * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  def ReleaseChannelSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.ReleaseChannelSettingBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.ReleaseChannelSettingBindingArgs.builder
    com.pulumi.gcp.gemini.ReleaseChannelSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gemini.CodeToolsSettingArgs.Builder)
    /**
     * @param enabledTools Represents the full set of enabled tools.
     *  Structure is documented below.
     * @return builder
     */
    def enabledTools(args: Endofunction[com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.Builder]*):
        com.pulumi.gcp.gemini.CodeToolsSettingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.builder
      builder.enabledTools(args.map(_(argsBuilder).build)*)

  /**
   * The resource for managing Code Repository Index for Gemini Code Assist.
   * 
   *  To get more information about CodeRepositoryIndex, see:
   * 
   *  * [API documentation](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.codeRepositoryIndexes)
   *  * How-to Guides
   *      * [Gemini Code Assist overview](https://cloud.google.com/gemini/docs/codeassist/overview)
   */
  def CodeRepositoryIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.CodeRepositoryIndexArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.CodeRepositoryIndexArgs.builder
    com.pulumi.gcp.gemini.CodeRepositoryIndex(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
   *  * `gcp.gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved.
   *  * `gcp.gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
   * 
   *  &gt; **Note:** `gcp.gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gcp.gemini.RepositoryGroupIamBinding` and `gcp.gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gcp.gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gemini.RepositoryGroupIamPolicy
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
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamPolicy;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs;
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
   *                  .role("roles/cloudaicompanion.repositoryGroupsUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryGroupIamPolicy("policy", RepositoryGroupIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gemini.RepositoryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamBinding;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs;
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
   *          var binding = new RepositoryGroupIamBinding("binding", RepositoryGroupIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .role("roles/cloudaicompanion.repositoryGroupsUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gemini.RepositoryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamMember;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs;
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
   *          var member = new RepositoryGroupIamMember("member", RepositoryGroupIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .role("roles/cloudaicompanion.repositoryGroupsUser")
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
   *  # IAM policy for Gemini for Google Cloud RepositoryGroup
   * 
   *  Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
   *  * `gcp.gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved.
   *  * `gcp.gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
   * 
   *  &gt; **Note:** `gcp.gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gcp.gemini.RepositoryGroupIamBinding` and `gcp.gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gcp.gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gemini.RepositoryGroupIamPolicy
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
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamPolicy;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs;
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
   *                  .role("roles/cloudaicompanion.repositoryGroupsUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryGroupIamPolicy("policy", RepositoryGroupIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gemini.RepositoryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamBinding;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs;
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
   *          var binding = new RepositoryGroupIamBinding("binding", RepositoryGroupIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .role("roles/cloudaicompanion.repositoryGroupsUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gemini.RepositoryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamMember;
   *  import com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs;
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
   *          var member = new RepositoryGroupIamMember("member", RepositoryGroupIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .codeRepositoryIndex(example.codeRepositoryIndex())
   *              .repositoryGroupId(example.repositoryGroupId())
   *              .role("roles/cloudaicompanion.repositoryGroupsUser")
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
   *  * projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
   *  * {{project}}/{{location}}/{{code_repository_index}}/{{repository_group_id}}
   *  * {{location}}/{{code_repository_index}}/{{repository_group_id}}
   *  * {{repository_group_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Gemini for Google Cloud repositorygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gemini_repository_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gemini_repository_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gemini/repositoryGroupIamPolicy:RepositoryGroupIamPolicy editor projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryGroupIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs.builder
    com.pulumi.gcp.gemini.RepositoryGroupIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The resource for managing DataSharingWithGoogle setting bindings for Admin Control.
   * 
   *  To get more information about DataSharingWithGoogleSettingBinding, see:
   *  * How-to Guides
   *      * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  def DataSharingWithGoogleSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.DataSharingWithGoogleSettingBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.DataSharingWithGoogleSettingBindingArgs.builder
    com.pulumi.gcp.gemini.DataSharingWithGoogleSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.CodeToolsSettingState.Builder)
    /**
     * @param enabledTools Represents the full set of enabled tools.
     *  Structure is documented below.
     * @return builder
     */
    def enabledTools(args: Endofunction[com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.CodeToolsSettingState.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.builder
      builder.enabledTools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.RepositoryGroupState.Builder)
    /**
     * @param repositories Required. List of repositories to group.
     *  Structure is documented below.
     * @return builder
     */
    def repositories(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupRepositoryArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.RepositoryGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.Builder)
    /**
     * @param configs Configuration parameters for the tool.
     *  Structure is documented below.
     * @return builder
     */
    def configs(args: Endofunction[com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolConfigArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolConfigArgs.builder
      builder.configs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /** The resource for managing GeminiGcpEnablement settings for Admin Control. */
  def GeminiGcpEnablementSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.GeminiGcpEnablementSettingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gemini.GeminiGcpEnablementSettingArgs.builder
    com.pulumi.gcp.gemini.GeminiGcpEnablementSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
