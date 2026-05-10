package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object securesourcemanager:
  extension (builder: com.pulumi.gcp.securesourcemanager.RepositoryArgs.Builder)
    /**
     * @param initialConfig Initial configurations for the repository.
     *  Structure is documented below.
     * @return builder
     */
    def initialConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryInitialConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryInitialConfigArgs.builder
      builder.initialConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.InstanceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.InstanceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Secure Source Manager Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.securesourcemanager.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.securesourcemanager.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.securesourcemanager.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.securesourcemanager.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.securesourcemanager.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.securesourcemanager.RepositoryIamBinding` and `gcp.securesourcemanager.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.securesourcemanager.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.securesourcemanager.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.securesourcemanager.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamPolicy;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/securesourcemanager.repoAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securesourcemanager.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamBinding;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RepositoryIamBinding("binding", RepositoryIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .role("roles/securesourcemanager.repoAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securesourcemanager.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamMember;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RepositoryIamMember("member", RepositoryIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .role("roles/securesourcemanager.repoAdmin")
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
   *  # IAM policy for Secure Source Manager Repository
   * 
   *  Three different resources help you manage your IAM policy for Secure Source Manager Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.securesourcemanager.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.securesourcemanager.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.securesourcemanager.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.securesourcemanager.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.securesourcemanager.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.securesourcemanager.RepositoryIamBinding` and `gcp.securesourcemanager.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.securesourcemanager.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.securesourcemanager.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.securesourcemanager.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamPolicy;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/securesourcemanager.repoAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securesourcemanager.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamBinding;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RepositoryIamBinding("binding", RepositoryIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .role("roles/securesourcemanager.repoAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securesourcemanager.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamMember;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RepositoryIamMember("member", RepositoryIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .role("roles/securesourcemanager.repoAdmin")
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
   *  * projects/{{project}}/locations/{{location}}/repositories/{{repository_id}}
   *  * {{project}}/{{location}}/{{repository_id}}
   *  * {{location}}/{{repository_id}}
   *  * {{repository_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Secure Source Manager repository IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_secure_source_manager_repository_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/repositories/{{repository_id}} roles/securesourcemanager.repoAdmin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_secure_source_manager_repository_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/repositories/{{repository_id}} roles/securesourcemanager.repoAdmin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:securesourcemanager/repositoryIamMember:RepositoryIamMember editor projects/{{project}}/locations/{{location}}/repositories/{{repository_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securesourcemanager.RepositoryIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securesourcemanager.RepositoryIamMemberArgs.builder
    com.pulumi.gcp.securesourcemanager.RepositoryIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * BranchRule is the protection rule to enforce pre-defined rules on designated branches within a repository.
   * 
   *  To get more information about BranchRule, see:
   * 
   *  * [API documentation](https://cloud.google.com/secure-source-manager/docs/reference/rest/v1/projects.locations.repositories.branchRules)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/secure-source-manager/docs/overview)
   */
  def BranchRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securesourcemanager.BranchRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securesourcemanager.BranchRuleArgs.builder
    com.pulumi.gcp.securesourcemanager.BranchRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.InstanceArgs.Builder)
    /**
     * @param privateConfig Private settings for private instance.
     *  Structure is documented below.
     * @return builder
     */
    def privateConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigArgs.builder
      builder.privateConfig(args(argsBuilder).build)

    /**
     * @param workforceIdentityFederationConfig Configuration for Workforce Identity Federation to support third party identity provider.
     *  If unset, defaults to the Google OIDC IdP.
     *  Structure is documented below.
     * @return builder
     */
    def workforceIdentityFederationConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstanceWorkforceIdentityFederationConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstanceWorkforceIdentityFederationConfigArgs.builder
      builder.workforceIdentityFederationConfig(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Secure Source Manager Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.securesourcemanager.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.securesourcemanager.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.securesourcemanager.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.securesourcemanager.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.securesourcemanager.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.securesourcemanager.RepositoryIamBinding` and `gcp.securesourcemanager.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.securesourcemanager.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.securesourcemanager.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.securesourcemanager.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamPolicy;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/securesourcemanager.repoAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securesourcemanager.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamBinding;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RepositoryIamBinding("binding", RepositoryIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .role("roles/securesourcemanager.repoAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securesourcemanager.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamMember;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RepositoryIamMember("member", RepositoryIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .role("roles/securesourcemanager.repoAdmin")
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
   *  # IAM policy for Secure Source Manager Repository
   * 
   *  Three different resources help you manage your IAM policy for Secure Source Manager Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.securesourcemanager.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.securesourcemanager.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.securesourcemanager.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.securesourcemanager.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.securesourcemanager.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.securesourcemanager.RepositoryIamBinding` and `gcp.securesourcemanager.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.securesourcemanager.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.securesourcemanager.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.securesourcemanager.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamPolicy;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/securesourcemanager.repoAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securesourcemanager.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamBinding;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RepositoryIamBinding("binding", RepositoryIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .role("roles/securesourcemanager.repoAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securesourcemanager.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamMember;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RepositoryIamMember("member", RepositoryIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .role("roles/securesourcemanager.repoAdmin")
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
   *  * projects/{{project}}/locations/{{location}}/repositories/{{repository_id}}
   *  * {{project}}/{{location}}/{{repository_id}}
   *  * {{location}}/{{repository_id}}
   *  * {{repository_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Secure Source Manager repository IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_secure_source_manager_repository_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/repositories/{{repository_id}} roles/securesourcemanager.repoAdmin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_secure_source_manager_repository_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/repositories/{{repository_id}} roles/securesourcemanager.repoAdmin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:securesourcemanager/repositoryIamPolicy:RepositoryIamPolicy editor projects/{{project}}/locations/{{location}}/repositories/{{repository_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securesourcemanager.RepositoryIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securesourcemanager.RepositoryIamPolicyArgs.builder
    com.pulumi.gcp.securesourcemanager.RepositoryIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.RepositoryIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.RepositoryIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  type SecuresourcemanagerFunctions = com.pulumi.gcp.securesourcemanager.SecuresourcemanagerFunctions
  object SecuresourcemanagerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.securesourcemanager.SecuresourcemanagerFunctions.*
  extension (self: SecuresourcemanagerFunctions.type)
    /** Retrieves the current IAM policy data for instance */
    def getInstanceIamPolicy(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.GetInstanceIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.securesourcemanager.outputs.GetInstanceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.GetInstanceIamPolicyArgs.builder
      com.pulumi.gcp.securesourcemanager.SecuresourcemanagerFunctions.getInstanceIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for instance */
    def getInstanceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.GetInstanceIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.securesourcemanager.outputs.GetInstanceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.GetInstanceIamPolicyPlainArgs.builder
      com.pulumi.gcp.securesourcemanager.SecuresourcemanagerFunctions.getInstanceIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for repository */
    def getRepositoryIamPolicy(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.GetRepositoryIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.securesourcemanager.outputs.GetRepositoryIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.GetRepositoryIamPolicyArgs.builder
      com.pulumi.gcp.securesourcemanager.SecuresourcemanagerFunctions.getRepositoryIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for repository */
    def getRepositoryIamPolicyPlain(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.GetRepositoryIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.securesourcemanager.outputs.GetRepositoryIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.GetRepositoryIamPolicyPlainArgs.builder
      com.pulumi.gcp.securesourcemanager.SecuresourcemanagerFunctions.getRepositoryIamPolicyPlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Secure Source Manager Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.securesourcemanager.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.securesourcemanager.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.securesourcemanager.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.securesourcemanager.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.securesourcemanager.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.securesourcemanager.RepositoryIamBinding` and `gcp.securesourcemanager.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.securesourcemanager.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.securesourcemanager.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.securesourcemanager.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamPolicy;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/securesourcemanager.repoAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securesourcemanager.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamBinding;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RepositoryIamBinding("binding", RepositoryIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .role("roles/securesourcemanager.repoAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securesourcemanager.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamMember;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RepositoryIamMember("member", RepositoryIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .role("roles/securesourcemanager.repoAdmin")
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
   *  # IAM policy for Secure Source Manager Repository
   * 
   *  Three different resources help you manage your IAM policy for Secure Source Manager Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.securesourcemanager.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.securesourcemanager.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.securesourcemanager.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.securesourcemanager.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.securesourcemanager.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.securesourcemanager.RepositoryIamBinding` and `gcp.securesourcemanager.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.securesourcemanager.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.securesourcemanager.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.securesourcemanager.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamPolicy;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/securesourcemanager.repoAdmin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securesourcemanager.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamBinding;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RepositoryIamBinding("binding", RepositoryIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .role("roles/securesourcemanager.repoAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.securesourcemanager.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamMember;
   *  import com.pulumi.gcp.securesourcemanager.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RepositoryIamMember("member", RepositoryIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .repositoryId(default_.repositoryId())
   *              .role("roles/securesourcemanager.repoAdmin")
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
   *  * projects/{{project}}/locations/{{location}}/repositories/{{repository_id}}
   *  * {{project}}/{{location}}/{{repository_id}}
   *  * {{location}}/{{repository_id}}
   *  * {{repository_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Secure Source Manager repository IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_secure_source_manager_repository_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/repositories/{{repository_id}} roles/securesourcemanager.repoAdmin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_secure_source_manager_repository_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/repositories/{{repository_id}} roles/securesourcemanager.repoAdmin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:securesourcemanager/repositoryIamBinding:RepositoryIamBinding editor projects/{{project}}/locations/{{location}}/repositories/{{repository_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securesourcemanager.RepositoryIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securesourcemanager.RepositoryIamBindingArgs.builder
    com.pulumi.gcp.securesourcemanager.RepositoryIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.HookArgs.Builder)
    /**
     * @param pushOption The trigger option for push events.
     *  Structure is documented below.
     * @return builder
     */
    def pushOption(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.HookPushOptionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.HookArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.HookPushOptionArgs.builder
      builder.pushOption(args(argsBuilder).build)

  /**
   * Repositories store source code. It supports all Git SCM client commands and has built-in pull requests and issue tracking. Both HTTPS and SSH authentication are supported.
   * 
   *  To get more information about Repository, see:
   * 
   *  * [API documentation](https://cloud.google.com/secure-source-manager/docs/reference/rest/v1/projects.locations.repositories)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/secure-source-manager/docs/overview)
   */
  def Repository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securesourcemanager.RepositoryArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securesourcemanager.RepositoryArgs.builder
    com.pulumi.gcp.securesourcemanager.Repository(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  def InstanceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securesourcemanager.InstanceIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securesourcemanager.InstanceIamPolicyArgs.builder
    com.pulumi.gcp.securesourcemanager.InstanceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Instances are deployed to an available Google Cloud region and are accessible via their web interface.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/secure-source-manager/docs/reference/rest/v1/projects.locations.instances)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/secure-source-manager/docs/create-instance)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securesourcemanager.InstanceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securesourcemanager.InstanceArgs.builder
    com.pulumi.gcp.securesourcemanager.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.InstanceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.InstanceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  def InstanceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securesourcemanager.InstanceIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securesourcemanager.InstanceIamBindingArgs.builder
    com.pulumi.gcp.securesourcemanager.InstanceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Hook is a user-defined HTTP callback triggered by an event.
   * 
   *  To get more information about Hook, see:
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/secure-source-manager/docs/overview)
   */
  def Hook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securesourcemanager.HookArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securesourcemanager.HookArgs.builder
    com.pulumi.gcp.securesourcemanager.Hook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  def InstanceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securesourcemanager.InstanceIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.securesourcemanager.InstanceIamMemberArgs.builder
    com.pulumi.gcp.securesourcemanager.InstanceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.HookState.Builder)
    /**
     * @param pushOption The trigger option for push events.
     *  Structure is documented below.
     * @return builder
     */
    def pushOption(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.HookPushOptionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.HookState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.HookPushOptionArgs.builder
      builder.pushOption(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigArgs.Builder)
    /**
     * @param customHostConfig Custom host configuration for the instance.
     *  Structure is documented below.
     * @return builder
     */
    def customHostConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigCustomHostConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigCustomHostConfigArgs.builder
      builder.customHostConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.RepositoryState.Builder)
    /**
     * @param initialConfig Initial configurations for the repository.
     *  Structure is documented below.
     * @return builder
     */
    def initialConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryInitialConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryInitialConfigArgs.builder
      builder.initialConfig(args(argsBuilder).build)

    /**
     * @param uris URIs for the repository.
     *  Structure is documented below.
     * @return builder
     */
    def uris(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryUriArgs.Builder]*):
        com.pulumi.gcp.securesourcemanager.inputs.RepositoryState.Builder =
      def argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryUriArgs.builder
      builder.uris(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.InstanceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.InstanceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.InstanceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.InstanceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.inputs.InstanceState.Builder)
    /**
     * @param hostConfigs A list of hostnames for this instance.
     *  Structure is documented below.
     * @return builder
     */
    def hostConfigs(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstanceHostConfigArgs.Builder]*):
        com.pulumi.gcp.securesourcemanager.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstanceHostConfigArgs.builder
      builder.hostConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param privateConfig Private settings for private instance.
     *  Structure is documented below.
     * @return builder
     */
    def privateConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstancePrivateConfigArgs.builder
      builder.privateConfig(args(argsBuilder).build)

    /**
     * @param workforceIdentityFederationConfig Configuration for Workforce Identity Federation to support third party identity provider.
     *  If unset, defaults to the Google OIDC IdP.
     *  Structure is documented below.
     * @return builder
     */
    def workforceIdentityFederationConfig(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.InstanceWorkforceIdentityFederationConfigArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.InstanceWorkforceIdentityFederationConfigArgs.builder
      builder.workforceIdentityFederationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securesourcemanager.RepositoryIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.securesourcemanager.RepositoryIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securesourcemanager.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
