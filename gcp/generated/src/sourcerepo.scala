package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object sourcerepo:
  extension (builder: com.pulumi.gcp.sourcerepo.RepositoryArgs.Builder)
    /**
     * @param pubsubConfigs How this repository publishes a change in the repository through Cloud Pub/Sub.
     *  Keyed by the topic names.
     *  Structure is documented below.
     * @return builder
     */
    def pubsubConfigs(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.RepositoryPubsubConfigArgs.Builder]*):
        com.pulumi.gcp.sourcerepo.RepositoryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.sourcerepo.inputs.RepositoryPubsubConfigArgs.builder
      builder.pubsubConfigs(args.map(_(argsBuilder).build)*)

  type SourcerepoFunctions = com.pulumi.gcp.sourcerepo.SourcerepoFunctions
  object SourcerepoFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.sourcerepo.SourcerepoFunctions.*
  extension (self: SourcerepoFunctions.type)
    /**
     * Get infomation about an existing Google Cloud Source Repository.
     *  For more information see [the official documentation](https://cloud.google.com/source-repositories)
     *  and
     *  [API](https://cloud.google.com/source-repositories/docs/reference/rest/v1/projects.repos).
     */
    def getRepository(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.GetRepositoryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.sourcerepo.outputs.GetRepositoryResult] =
      val argsBuilder = com.pulumi.gcp.sourcerepo.inputs.GetRepositoryArgs.builder
      com.pulumi.gcp.sourcerepo.SourcerepoFunctions.getRepository(args(argsBuilder).build)

    /**
     * Get infomation about an existing Google Cloud Source Repository.
     *  For more information see [the official documentation](https://cloud.google.com/source-repositories)
     *  and
     *  [API](https://cloud.google.com/source-repositories/docs/reference/rest/v1/projects.repos).
     */
    def getRepositoryPlain(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.GetRepositoryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sourcerepo.outputs.GetRepositoryResult] =
      val argsBuilder = com.pulumi.gcp.sourcerepo.inputs.GetRepositoryPlainArgs.builder
      com.pulumi.gcp.sourcerepo.SourcerepoFunctions.getRepositoryPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for repository */
    def getRepositoryIamPolicy(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.GetRepositoryIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.sourcerepo.outputs.GetRepositoryIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.sourcerepo.inputs.GetRepositoryIamPolicyArgs.builder
      com.pulumi.gcp.sourcerepo.SourcerepoFunctions.getRepositoryIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for repository */
    def getRepositoryIamPolicyPlain(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.GetRepositoryIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.sourcerepo.outputs.GetRepositoryIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.sourcerepo.inputs.GetRepositoryIamPolicyPlainArgs.builder
      com.pulumi.gcp.sourcerepo.SourcerepoFunctions.getRepositoryIamPolicyPlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Source Repositories Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.sourcerepo.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.sourcerepo.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.sourcerepo.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.sourcerepo.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.sourcerepo.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.sourcerepo.RepositoryIamBinding` and `gcp.sourcerepo.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.sourcerepo.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.sourcerepo.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.sourcerepo.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamPolicy;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.sourcerepo.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamBinding;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.sourcerepo.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamMember;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
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
   *  # IAM policy for Cloud Source Repositories Repository
   * 
   *  Three different resources help you manage your IAM policy for Cloud Source Repositories Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.sourcerepo.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.sourcerepo.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.sourcerepo.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.sourcerepo.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.sourcerepo.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.sourcerepo.RepositoryIamBinding` and `gcp.sourcerepo.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.sourcerepo.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.sourcerepo.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.sourcerepo.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamPolicy;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.sourcerepo.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamBinding;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.sourcerepo.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamMember;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
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
   *  * projects/{{project}}/repos/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Source Repositories repository IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_sourcerepo_repository_iam_member.editor &#34;projects/{{project}}/repos/{{repository}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_sourcerepo_repository_iam_binding.editor &#34;projects/{{project}}/repos/{{repository}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:sourcerepo/repositoryIamMember:RepositoryIamMember editor projects/{{project}}/repos/{{repository}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.sourcerepo.RepositoryIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.sourcerepo.RepositoryIamMemberArgs.builder
    com.pulumi.gcp.sourcerepo.RepositoryIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Source Repositories Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.sourcerepo.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.sourcerepo.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.sourcerepo.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.sourcerepo.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.sourcerepo.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.sourcerepo.RepositoryIamBinding` and `gcp.sourcerepo.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.sourcerepo.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.sourcerepo.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.sourcerepo.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamPolicy;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.sourcerepo.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamBinding;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.sourcerepo.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamMember;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
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
   *  # IAM policy for Cloud Source Repositories Repository
   * 
   *  Three different resources help you manage your IAM policy for Cloud Source Repositories Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.sourcerepo.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.sourcerepo.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.sourcerepo.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.sourcerepo.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.sourcerepo.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.sourcerepo.RepositoryIamBinding` and `gcp.sourcerepo.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.sourcerepo.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.sourcerepo.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.sourcerepo.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamPolicy;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.sourcerepo.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamBinding;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.sourcerepo.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamMember;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
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
   *  * projects/{{project}}/repos/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Source Repositories repository IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_sourcerepo_repository_iam_member.editor &#34;projects/{{project}}/repos/{{repository}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_sourcerepo_repository_iam_binding.editor &#34;projects/{{project}}/repos/{{repository}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:sourcerepo/repositoryIamPolicy:RepositoryIamPolicy editor projects/{{project}}/repos/{{repository}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.sourcerepo.RepositoryIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.sourcerepo.RepositoryIamPolicyArgs.builder
    com.pulumi.gcp.sourcerepo.RepositoryIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.sourcerepo.RepositoryIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.sourcerepo.RepositoryIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sourcerepo.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Source Repositories Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.sourcerepo.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.sourcerepo.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.sourcerepo.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.sourcerepo.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.sourcerepo.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.sourcerepo.RepositoryIamBinding` and `gcp.sourcerepo.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.sourcerepo.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.sourcerepo.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.sourcerepo.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamPolicy;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.sourcerepo.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamBinding;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.sourcerepo.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamMember;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
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
   *  # IAM policy for Cloud Source Repositories Repository
   * 
   *  Three different resources help you manage your IAM policy for Cloud Source Repositories Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.sourcerepo.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.sourcerepo.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.sourcerepo.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.sourcerepo.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.sourcerepo.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.sourcerepo.RepositoryIamBinding` and `gcp.sourcerepo.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.sourcerepo.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.sourcerepo.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.sourcerepo.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamPolicy;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.sourcerepo.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamBinding;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.sourcerepo.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamMember;
   *  import com.pulumi.gcp.sourcerepo.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .project(my_repo.project())
   *              .repository(my_repo.name())
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
   *  * projects/{{project}}/repos/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Source Repositories repository IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_sourcerepo_repository_iam_member.editor &#34;projects/{{project}}/repos/{{repository}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_sourcerepo_repository_iam_binding.editor &#34;projects/{{project}}/repos/{{repository}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:sourcerepo/repositoryIamBinding:RepositoryIamBinding editor projects/{{project}}/repos/{{repository}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.sourcerepo.RepositoryIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.sourcerepo.RepositoryIamBindingArgs.builder
    com.pulumi.gcp.sourcerepo.RepositoryIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A repository (or repo) is a Git repository storing versioned source content.
   * 
   *  To get more information about Repository, see:
   * 
   *  * [API documentation](https://cloud.google.com/source-repositories/docs/reference/rest/v1/projects.repos)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/source-repositories/)
   */
  def Repository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.sourcerepo.RepositoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.sourcerepo.RepositoryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.sourcerepo.Repository(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.sourcerepo.inputs.RepositoryIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.sourcerepo.inputs.RepositoryIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.sourcerepo.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.sourcerepo.inputs.RepositoryState.Builder)
    /**
     * @param pubsubConfigs How this repository publishes a change in the repository through Cloud Pub/Sub.
     *  Keyed by the topic names.
     *  Structure is documented below.
     * @return builder
     */
    def pubsubConfigs(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.RepositoryPubsubConfigArgs.Builder]*):
        com.pulumi.gcp.sourcerepo.inputs.RepositoryState.Builder =
      def argsBuilder = com.pulumi.gcp.sourcerepo.inputs.RepositoryPubsubConfigArgs.builder
      builder.pubsubConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.sourcerepo.inputs.RepositoryIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.sourcerepo.inputs.RepositoryIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.sourcerepo.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.sourcerepo.RepositoryIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.sourcerepo.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.sourcerepo.RepositoryIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.sourcerepo.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
