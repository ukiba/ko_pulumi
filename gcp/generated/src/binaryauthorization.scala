package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object binaryauthorization:
  /**
   * Three different resources help you manage your IAM policy for Binary Authorization Attestor. Each of these resources serves a different use case:
   * 
   *  * `gcp.binaryauthorization.AttestorIamPolicy`: Authoritative. Sets the IAM policy for the attestor and replaces any existing policy already attached.
   *  * `gcp.binaryauthorization.AttestorIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the attestor are preserved.
   *  * `gcp.binaryauthorization.AttestorIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the attestor are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.binaryauthorization.AttestorIamPolicy`: Retrieves the IAM policy for the attestor
   * 
   *  &gt; **Note:** `gcp.binaryauthorization.AttestorIamPolicy` **cannot** be used in conjunction with `gcp.binaryauthorization.AttestorIamBinding` and `gcp.binaryauthorization.AttestorIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.binaryauthorization.AttestorIamBinding` resources **can be** used in conjunction with `gcp.binaryauthorization.AttestorIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.binaryauthorization.AttestorIamPolicy
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
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamPolicy;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new AttestorIamPolicy("policy", AttestorIamPolicyArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.binaryauthorization.AttestorIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamBinding;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new AttestorIamBinding("binding", AttestorIamBindingArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.binaryauthorization.AttestorIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamMember;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new AttestorIamMember("member", AttestorIamMemberArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
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
   *  # IAM policy for Binary Authorization Attestor
   * 
   *  Three different resources help you manage your IAM policy for Binary Authorization Attestor. Each of these resources serves a different use case:
   * 
   *  * `gcp.binaryauthorization.AttestorIamPolicy`: Authoritative. Sets the IAM policy for the attestor and replaces any existing policy already attached.
   *  * `gcp.binaryauthorization.AttestorIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the attestor are preserved.
   *  * `gcp.binaryauthorization.AttestorIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the attestor are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.binaryauthorization.AttestorIamPolicy`: Retrieves the IAM policy for the attestor
   * 
   *  &gt; **Note:** `gcp.binaryauthorization.AttestorIamPolicy` **cannot** be used in conjunction with `gcp.binaryauthorization.AttestorIamBinding` and `gcp.binaryauthorization.AttestorIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.binaryauthorization.AttestorIamBinding` resources **can be** used in conjunction with `gcp.binaryauthorization.AttestorIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.binaryauthorization.AttestorIamPolicy
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
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamPolicy;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new AttestorIamPolicy("policy", AttestorIamPolicyArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.binaryauthorization.AttestorIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamBinding;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new AttestorIamBinding("binding", AttestorIamBindingArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.binaryauthorization.AttestorIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamMember;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new AttestorIamMember("member", AttestorIamMemberArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
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
   *  * projects/{{project}}/attestors/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Binary Authorization attestor IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_binary_authorization_attestor_iam_member.editor &#34;projects/{{project}}/attestors/{{attestor}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_binary_authorization_attestor_iam_binding.editor &#34;projects/{{project}}/attestors/{{attestor}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:binaryauthorization/attestorIamBinding:AttestorIamBinding editor projects/{{project}}/attestors/{{attestor}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AttestorIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs.builder
    com.pulumi.gcp.binaryauthorization.AttestorIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type BinaryauthorizationFunctions = com.pulumi.gcp.binaryauthorization.BinaryauthorizationFunctions
  object BinaryauthorizationFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.binaryauthorization.BinaryauthorizationFunctions.*
  extension (self: BinaryauthorizationFunctions.type)
    /** Retrieves the current IAM policy data for attestor */
    def getAttestorIamPolicy(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.GetAttestorIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.binaryauthorization.outputs.GetAttestorIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.GetAttestorIamPolicyArgs.builder
      com.pulumi.gcp.binaryauthorization.BinaryauthorizationFunctions.getAttestorIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for attestor */
    def getAttestorIamPolicyPlain(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.GetAttestorIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.binaryauthorization.outputs.GetAttestorIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.GetAttestorIamPolicyPlainArgs.builder
      com.pulumi.gcp.binaryauthorization.BinaryauthorizationFunctions.getAttestorIamPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Binary Authorization Attestor. Each of these resources serves a different use case:
   * 
   *  * `gcp.binaryauthorization.AttestorIamPolicy`: Authoritative. Sets the IAM policy for the attestor and replaces any existing policy already attached.
   *  * `gcp.binaryauthorization.AttestorIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the attestor are preserved.
   *  * `gcp.binaryauthorization.AttestorIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the attestor are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.binaryauthorization.AttestorIamPolicy`: Retrieves the IAM policy for the attestor
   * 
   *  &gt; **Note:** `gcp.binaryauthorization.AttestorIamPolicy` **cannot** be used in conjunction with `gcp.binaryauthorization.AttestorIamBinding` and `gcp.binaryauthorization.AttestorIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.binaryauthorization.AttestorIamBinding` resources **can be** used in conjunction with `gcp.binaryauthorization.AttestorIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.binaryauthorization.AttestorIamPolicy
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
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamPolicy;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new AttestorIamPolicy("policy", AttestorIamPolicyArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.binaryauthorization.AttestorIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamBinding;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new AttestorIamBinding("binding", AttestorIamBindingArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.binaryauthorization.AttestorIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamMember;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new AttestorIamMember("member", AttestorIamMemberArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
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
   *  # IAM policy for Binary Authorization Attestor
   * 
   *  Three different resources help you manage your IAM policy for Binary Authorization Attestor. Each of these resources serves a different use case:
   * 
   *  * `gcp.binaryauthorization.AttestorIamPolicy`: Authoritative. Sets the IAM policy for the attestor and replaces any existing policy already attached.
   *  * `gcp.binaryauthorization.AttestorIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the attestor are preserved.
   *  * `gcp.binaryauthorization.AttestorIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the attestor are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.binaryauthorization.AttestorIamPolicy`: Retrieves the IAM policy for the attestor
   * 
   *  &gt; **Note:** `gcp.binaryauthorization.AttestorIamPolicy` **cannot** be used in conjunction with `gcp.binaryauthorization.AttestorIamBinding` and `gcp.binaryauthorization.AttestorIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.binaryauthorization.AttestorIamBinding` resources **can be** used in conjunction with `gcp.binaryauthorization.AttestorIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.binaryauthorization.AttestorIamPolicy
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
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamPolicy;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new AttestorIamPolicy("policy", AttestorIamPolicyArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.binaryauthorization.AttestorIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamBinding;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new AttestorIamBinding("binding", AttestorIamBindingArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.binaryauthorization.AttestorIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamMember;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new AttestorIamMember("member", AttestorIamMemberArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
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
   *  * projects/{{project}}/attestors/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Binary Authorization attestor IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_binary_authorization_attestor_iam_member.editor &#34;projects/{{project}}/attestors/{{attestor}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_binary_authorization_attestor_iam_binding.editor &#34;projects/{{project}}/attestors/{{attestor}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:binaryauthorization/attestorIamMember:AttestorIamMember editor projects/{{project}}/attestors/{{attestor}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AttestorIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs.builder
    com.pulumi.gcp.binaryauthorization.AttestorIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Binary Authorization Attestor. Each of these resources serves a different use case:
   * 
   *  * `gcp.binaryauthorization.AttestorIamPolicy`: Authoritative. Sets the IAM policy for the attestor and replaces any existing policy already attached.
   *  * `gcp.binaryauthorization.AttestorIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the attestor are preserved.
   *  * `gcp.binaryauthorization.AttestorIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the attestor are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.binaryauthorization.AttestorIamPolicy`: Retrieves the IAM policy for the attestor
   * 
   *  &gt; **Note:** `gcp.binaryauthorization.AttestorIamPolicy` **cannot** be used in conjunction with `gcp.binaryauthorization.AttestorIamBinding` and `gcp.binaryauthorization.AttestorIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.binaryauthorization.AttestorIamBinding` resources **can be** used in conjunction with `gcp.binaryauthorization.AttestorIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.binaryauthorization.AttestorIamPolicy
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
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamPolicy;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new AttestorIamPolicy("policy", AttestorIamPolicyArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.binaryauthorization.AttestorIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamBinding;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new AttestorIamBinding("binding", AttestorIamBindingArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.binaryauthorization.AttestorIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamMember;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new AttestorIamMember("member", AttestorIamMemberArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
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
   *  # IAM policy for Binary Authorization Attestor
   * 
   *  Three different resources help you manage your IAM policy for Binary Authorization Attestor. Each of these resources serves a different use case:
   * 
   *  * `gcp.binaryauthorization.AttestorIamPolicy`: Authoritative. Sets the IAM policy for the attestor and replaces any existing policy already attached.
   *  * `gcp.binaryauthorization.AttestorIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the attestor are preserved.
   *  * `gcp.binaryauthorization.AttestorIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the attestor are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.binaryauthorization.AttestorIamPolicy`: Retrieves the IAM policy for the attestor
   * 
   *  &gt; **Note:** `gcp.binaryauthorization.AttestorIamPolicy` **cannot** be used in conjunction with `gcp.binaryauthorization.AttestorIamBinding` and `gcp.binaryauthorization.AttestorIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.binaryauthorization.AttestorIamBinding` resources **can be** used in conjunction with `gcp.binaryauthorization.AttestorIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.binaryauthorization.AttestorIamPolicy
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
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamPolicy;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new AttestorIamPolicy("policy", AttestorIamPolicyArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.binaryauthorization.AttestorIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamBinding;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new AttestorIamBinding("binding", AttestorIamBindingArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.binaryauthorization.AttestorIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamMember;
   *  import com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new AttestorIamMember("member", AttestorIamMemberArgs.builder()
   *              .project(attestor.project())
   *              .attestor(attestor.name())
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
   *  * projects/{{project}}/attestors/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Binary Authorization attestor IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_binary_authorization_attestor_iam_member.editor &#34;projects/{{project}}/attestors/{{attestor}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_binary_authorization_attestor_iam_binding.editor &#34;projects/{{project}}/attestors/{{attestor}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:binaryauthorization/attestorIamPolicy:AttestorIamPolicy editor projects/{{project}}/attestors/{{attestor}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AttestorIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.binaryauthorization.AttestorIamPolicyArgs.builder
    com.pulumi.gcp.binaryauthorization.AttestorIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.AttestorArgs.Builder)
    /**
     * @param attestationAuthorityNote A Container Analysis ATTESTATION_AUTHORITY Note, created by the user.
     *  Structure is documented below.
     * @return builder
     */
    def attestationAuthorityNote(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNoteArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.AttestorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNoteArgs.builder
      builder.attestationAuthorityNote(args(argsBuilder).build)

  /**
   * An attestor that attests to container image artifacts.
   * 
   *  To get more information about Attestor, see:
   * 
   *  * [API documentation](https://cloud.google.com/binary-authorization/docs/reference/rest/)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/binary-authorization/)
   */
  def Attestor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.binaryauthorization.AttestorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.binaryauthorization.AttestorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.binaryauthorization.Attestor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.PolicyArgs.Builder)
    /**
     * @param admissionWhitelistPatterns A whitelist of image patterns to exclude from admission rules. If an
     *  image&#39;s name matches a whitelist pattern, the image&#39;s admission
     *  requests will always be permitted regardless of your admission rules.
     *  Structure is documented below.
     * @return builder
     */
    def admissionWhitelistPatterns(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.PolicyAdmissionWhitelistPatternArgs.Builder]*):
        com.pulumi.gcp.binaryauthorization.PolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.PolicyAdmissionWhitelistPatternArgs.builder
      builder.admissionWhitelistPatterns(args.map(_(argsBuilder).build)*)

    /**
     * @param clusterAdmissionRules Per-cluster admission rules. An admission rule specifies either that
     *  all container images used in a pod creation request must be attested
     *  to by one or more attestors, that all pod creations will be allowed,
     *  or that all pod creations will be denied. There can be at most one
     *  admission rule per cluster spec.
     * 
     *  Identifier format: `{{location}}.{{clusterId}}`.
     *  A location is either a compute zone (e.g. `us-central1-a`) or a region
     *  (e.g. `us-central1`).
     *  Structure is documented below.
     * @return builder
     */
    def clusterAdmissionRules(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.PolicyClusterAdmissionRuleArgs.Builder]*):
        com.pulumi.gcp.binaryauthorization.PolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.PolicyClusterAdmissionRuleArgs.builder
      builder.clusterAdmissionRules(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultAdmissionRule Default admission rule for a cluster without a per-cluster admission
     *  rule.
     *  Structure is documented below.
     * @return builder
     */
    def defaultAdmissionRule(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.PolicyDefaultAdmissionRuleArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.PolicyDefaultAdmissionRuleArgs.builder
      builder.defaultAdmissionRule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A policy for container image binary authorization.
   * 
   *  To get more information about Policy, see:
   * 
   *  * [API documentation](https://cloud.google.com/binary-authorization/docs/reference/rest/)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/binary-authorization/)
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.binaryauthorization.PolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.binaryauthorization.PolicyArgs.builder
    com.pulumi.gcp.binaryauthorization.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.inputs.AttestorIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.inputs.AttestorIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNoteArgs.Builder)
    /**
     * @param publicKeys Public keys that verify attestations signed by this attestor. This
     *  field may be updated.
     *  If this field is non-empty, one of the specified public keys must
     *  verify that an attestation was signed by this attestor for the
     *  image specified in the admission request.
     *  If this field is empty, this attestor always returns that no valid
     *  attestations exist.
     *  Structure is documented below.
     * @return builder
     */
    def publicKeys(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyArgs.Builder]*):
        com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNoteArgs.Builder =
      def argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyArgs.builder
      builder.publicKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyArgs.Builder)
    /**
     * @param pkixPublicKey A raw PKIX SubjectPublicKeyInfo format public key.
     *  NOTE: id may be explicitly provided by the caller when using this
     *  type of public key, but it MUST be a valid RFC3986 URI. If id is left
     *  blank, a default one will be computed based on the digest of the DER
     *  encoding of the public key.
     *  Structure is documented below.
     * @return builder
     */
    def pkixPublicKey(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyArgs.builder
      builder.pkixPublicKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.inputs.AttestorState.Builder)
    /**
     * @param attestationAuthorityNote A Container Analysis ATTESTATION_AUTHORITY Note, created by the user.
     *  Structure is documented below.
     * @return builder
     */
    def attestationAuthorityNote(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNoteArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.inputs.AttestorState.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNoteArgs.builder
      builder.attestationAuthorityNote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.inputs.PolicyState.Builder)
    /**
     * @param admissionWhitelistPatterns A whitelist of image patterns to exclude from admission rules. If an
     *  image&#39;s name matches a whitelist pattern, the image&#39;s admission
     *  requests will always be permitted regardless of your admission rules.
     *  Structure is documented below.
     * @return builder
     */
    def admissionWhitelistPatterns(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.PolicyAdmissionWhitelistPatternArgs.Builder]*):
        com.pulumi.gcp.binaryauthorization.inputs.PolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.PolicyAdmissionWhitelistPatternArgs.builder
      builder.admissionWhitelistPatterns(args.map(_(argsBuilder).build)*)

    /**
     * @param clusterAdmissionRules Per-cluster admission rules. An admission rule specifies either that
     *  all container images used in a pod creation request must be attested
     *  to by one or more attestors, that all pod creations will be allowed,
     *  or that all pod creations will be denied. There can be at most one
     *  admission rule per cluster spec.
     * 
     *  Identifier format: `{{location}}.{{clusterId}}`.
     *  A location is either a compute zone (e.g. `us-central1-a`) or a region
     *  (e.g. `us-central1`).
     *  Structure is documented below.
     * @return builder
     */
    def clusterAdmissionRules(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.PolicyClusterAdmissionRuleArgs.Builder]*):
        com.pulumi.gcp.binaryauthorization.inputs.PolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.PolicyClusterAdmissionRuleArgs.builder
      builder.clusterAdmissionRules(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultAdmissionRule Default admission rule for a cluster without a per-cluster admission
     *  rule.
     *  Structure is documented below.
     * @return builder
     */
    def defaultAdmissionRule(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.PolicyDefaultAdmissionRuleArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.PolicyDefaultAdmissionRuleArgs.builder
      builder.defaultAdmissionRule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.inputs.AttestorIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.inputs.AttestorIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)
