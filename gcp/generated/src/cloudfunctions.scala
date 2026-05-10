package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudfunctions:
  /**
   * Three different resources help you manage your IAM policy for Cloud Functions CloudFunction. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudfunctions.FunctionIamPolicy`: Authoritative. Sets the IAM policy for the cloudfunction and replaces any existing policy already attached.
   *  * `gcp.cloudfunctions.FunctionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the cloudfunction are preserved.
   *  * `gcp.cloudfunctions.FunctionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the cloudfunction are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudfunctions.FunctionIamPolicy`: Retrieves the IAM policy for the cloudfunction
   * 
   *  &gt; **Note:** `gcp.cloudfunctions.FunctionIamPolicy` **cannot** be used in conjunction with `gcp.cloudfunctions.FunctionIamBinding` and `gcp.cloudfunctions.FunctionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudfunctions.FunctionIamBinding` resources **can be** used in conjunction with `gcp.cloudfunctions.FunctionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudfunctions.FunctionIamPolicy
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
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamPolicy;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new FunctionIamPolicy("policy", FunctionIamPolicyArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctions.FunctionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamBinding;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new FunctionIamBinding("binding", FunctionIamBindingArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctions.FunctionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamMember;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new FunctionIamMember("member", FunctionIamMemberArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
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
   *  # IAM policy for Cloud Functions CloudFunction
   * 
   *  Three different resources help you manage your IAM policy for Cloud Functions CloudFunction. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudfunctions.FunctionIamPolicy`: Authoritative. Sets the IAM policy for the cloudfunction and replaces any existing policy already attached.
   *  * `gcp.cloudfunctions.FunctionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the cloudfunction are preserved.
   *  * `gcp.cloudfunctions.FunctionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the cloudfunction are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudfunctions.FunctionIamPolicy`: Retrieves the IAM policy for the cloudfunction
   * 
   *  &gt; **Note:** `gcp.cloudfunctions.FunctionIamPolicy` **cannot** be used in conjunction with `gcp.cloudfunctions.FunctionIamBinding` and `gcp.cloudfunctions.FunctionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudfunctions.FunctionIamBinding` resources **can be** used in conjunction with `gcp.cloudfunctions.FunctionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudfunctions.FunctionIamPolicy
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
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamPolicy;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new FunctionIamPolicy("policy", FunctionIamPolicyArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctions.FunctionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamBinding;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new FunctionIamBinding("binding", FunctionIamBindingArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctions.FunctionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamMember;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new FunctionIamMember("member", FunctionIamMemberArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
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
   *  * projects/{{project}}/locations/{{region}}/functions/{{cloud_function}}
   *  * {{project}}/{{region}}/{{cloud_function}}
   *  * {{region}}/{{cloud_function}}
   *  * {{cloud_function}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Functions cloudfunction IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_cloudfunctions_function_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/functions/{{cloud_function}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_cloudfunctions_function_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/functions/{{cloud_function}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:cloudfunctions/functionIamPolicy:FunctionIamPolicy editor projects/{{project}}/locations/{{region}}/functions/{{cloud_function}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def FunctionIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudfunctions.FunctionIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudfunctions.FunctionIamPolicyArgs.builder
    com.pulumi.gcp.cloudfunctions.FunctionIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type CloudfunctionsFunctions = com.pulumi.gcp.cloudfunctions.CloudfunctionsFunctions
  object CloudfunctionsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.cloudfunctions.CloudfunctionsFunctions.*
  extension (self: CloudfunctionsFunctions.type)
    /**
     * Get information about a Google Cloud Function. For more information see
     *  the [official documentation](https://cloud.google.com/functions/docs/)
     *  and [API](https://cloud.google.com/functions/docs/apis).
     */
    def getFunction(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.GetFunctionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudfunctions.outputs.GetFunctionResult] =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.GetFunctionArgs.builder
      com.pulumi.gcp.cloudfunctions.CloudfunctionsFunctions.getFunction(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Function. For more information see
     *  the [official documentation](https://cloud.google.com/functions/docs/)
     *  and [API](https://cloud.google.com/functions/docs/apis).
     */
    def getFunctionPlain(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.GetFunctionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudfunctions.outputs.GetFunctionResult] =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.GetFunctionPlainArgs.builder
      com.pulumi.gcp.cloudfunctions.CloudfunctionsFunctions.getFunctionPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for cloudfunction */
    def getFunctionIamPolicy(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.GetFunctionIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudfunctions.outputs.GetFunctionIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.GetFunctionIamPolicyArgs.builder
      com.pulumi.gcp.cloudfunctions.CloudfunctionsFunctions.getFunctionIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for cloudfunction */
    def getFunctionIamPolicyPlain(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.GetFunctionIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudfunctions.outputs.GetFunctionIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.GetFunctionIamPolicyPlainArgs.builder
      com.pulumi.gcp.cloudfunctions.CloudfunctionsFunctions.getFunctionIamPolicyPlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Functions CloudFunction. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudfunctions.FunctionIamPolicy`: Authoritative. Sets the IAM policy for the cloudfunction and replaces any existing policy already attached.
   *  * `gcp.cloudfunctions.FunctionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the cloudfunction are preserved.
   *  * `gcp.cloudfunctions.FunctionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the cloudfunction are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudfunctions.FunctionIamPolicy`: Retrieves the IAM policy for the cloudfunction
   * 
   *  &gt; **Note:** `gcp.cloudfunctions.FunctionIamPolicy` **cannot** be used in conjunction with `gcp.cloudfunctions.FunctionIamBinding` and `gcp.cloudfunctions.FunctionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudfunctions.FunctionIamBinding` resources **can be** used in conjunction with `gcp.cloudfunctions.FunctionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudfunctions.FunctionIamPolicy
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
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamPolicy;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new FunctionIamPolicy("policy", FunctionIamPolicyArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctions.FunctionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamBinding;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new FunctionIamBinding("binding", FunctionIamBindingArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctions.FunctionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamMember;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new FunctionIamMember("member", FunctionIamMemberArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
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
   *  # IAM policy for Cloud Functions CloudFunction
   * 
   *  Three different resources help you manage your IAM policy for Cloud Functions CloudFunction. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudfunctions.FunctionIamPolicy`: Authoritative. Sets the IAM policy for the cloudfunction and replaces any existing policy already attached.
   *  * `gcp.cloudfunctions.FunctionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the cloudfunction are preserved.
   *  * `gcp.cloudfunctions.FunctionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the cloudfunction are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudfunctions.FunctionIamPolicy`: Retrieves the IAM policy for the cloudfunction
   * 
   *  &gt; **Note:** `gcp.cloudfunctions.FunctionIamPolicy` **cannot** be used in conjunction with `gcp.cloudfunctions.FunctionIamBinding` and `gcp.cloudfunctions.FunctionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudfunctions.FunctionIamBinding` resources **can be** used in conjunction with `gcp.cloudfunctions.FunctionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudfunctions.FunctionIamPolicy
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
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamPolicy;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new FunctionIamPolicy("policy", FunctionIamPolicyArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctions.FunctionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamBinding;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new FunctionIamBinding("binding", FunctionIamBindingArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctions.FunctionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamMember;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new FunctionIamMember("member", FunctionIamMemberArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
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
   *  * projects/{{project}}/locations/{{region}}/functions/{{cloud_function}}
   *  * {{project}}/{{region}}/{{cloud_function}}
   *  * {{region}}/{{cloud_function}}
   *  * {{cloud_function}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Functions cloudfunction IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_cloudfunctions_function_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/functions/{{cloud_function}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_cloudfunctions_function_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/functions/{{cloud_function}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:cloudfunctions/functionIamMember:FunctionIamMember editor projects/{{project}}/locations/{{region}}/functions/{{cloud_function}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def FunctionIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudfunctions.FunctionIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudfunctions.FunctionIamMemberArgs.builder
    com.pulumi.gcp.cloudfunctions.FunctionIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudfunctions.FunctionIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.FunctionIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder)
    /**
     * @param automaticUpdatePolicy Security patches are applied automatically to the runtime without requiring the function to be redeployed. This should be specified as an empty block and cannot be set alongside `onDeployUpdatePolicy`.
     * @return builder
     */
    def automaticUpdatePolicy(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionAutomaticUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionAutomaticUpdatePolicyArgs.builder
      builder.automaticUpdatePolicy(args(argsBuilder).build)

    /**
     * @param eventTrigger A source that fires events in response to a condition in another service. Structure is documented below. Cannot be used with `triggerHttp`.
     * @return builder
     */
    def eventTrigger(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerArgs.builder
      builder.eventTrigger(args(argsBuilder).build)

    /**
     * @param onDeployUpdatePolicy Security patches are only applied when a function is redeployed. This should be specified as an empty block and cannot be set alongside `automaticUpdatePolicy`. Structure is documented below.
     * @return builder
     */
    def onDeployUpdatePolicy(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionOnDeployUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionOnDeployUpdatePolicyArgs.builder
      builder.onDeployUpdatePolicy(args(argsBuilder).build)

    /**
     * @param secretEnvironmentVariables Secret environment variables configuration. Structure is documented below.
     * @return builder
     */
    def secretEnvironmentVariables(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretEnvironmentVariableArgs.Builder]*):
        com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretEnvironmentVariableArgs.builder
      builder.secretEnvironmentVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param secretVolumes Secret volumes configuration. Structure is documented below.
     * @return builder
     */
    def secretVolumes(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeArgs.Builder]*):
        com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeArgs.builder
      builder.secretVolumes(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceRepository Represents parameters related to source repository where a function is hosted.
     *  Cannot be set alongside `sourceArchiveBucket` or `sourceArchiveObject`. Structure is documented below. It must match the pattern `projects/{project}/locations/{location}/repositories/{repository}`.*
     * @return builder
     */
    def sourceRepository(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionSourceRepositoryArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionSourceRepositoryArgs.builder
      builder.sourceRepository(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Functions CloudFunction. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudfunctions.FunctionIamPolicy`: Authoritative. Sets the IAM policy for the cloudfunction and replaces any existing policy already attached.
   *  * `gcp.cloudfunctions.FunctionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the cloudfunction are preserved.
   *  * `gcp.cloudfunctions.FunctionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the cloudfunction are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudfunctions.FunctionIamPolicy`: Retrieves the IAM policy for the cloudfunction
   * 
   *  &gt; **Note:** `gcp.cloudfunctions.FunctionIamPolicy` **cannot** be used in conjunction with `gcp.cloudfunctions.FunctionIamBinding` and `gcp.cloudfunctions.FunctionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudfunctions.FunctionIamBinding` resources **can be** used in conjunction with `gcp.cloudfunctions.FunctionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudfunctions.FunctionIamPolicy
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
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamPolicy;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new FunctionIamPolicy("policy", FunctionIamPolicyArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctions.FunctionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamBinding;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new FunctionIamBinding("binding", FunctionIamBindingArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctions.FunctionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamMember;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new FunctionIamMember("member", FunctionIamMemberArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
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
   *  # IAM policy for Cloud Functions CloudFunction
   * 
   *  Three different resources help you manage your IAM policy for Cloud Functions CloudFunction. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudfunctions.FunctionIamPolicy`: Authoritative. Sets the IAM policy for the cloudfunction and replaces any existing policy already attached.
   *  * `gcp.cloudfunctions.FunctionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the cloudfunction are preserved.
   *  * `gcp.cloudfunctions.FunctionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the cloudfunction are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudfunctions.FunctionIamPolicy`: Retrieves the IAM policy for the cloudfunction
   * 
   *  &gt; **Note:** `gcp.cloudfunctions.FunctionIamPolicy` **cannot** be used in conjunction with `gcp.cloudfunctions.FunctionIamBinding` and `gcp.cloudfunctions.FunctionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudfunctions.FunctionIamBinding` resources **can be** used in conjunction with `gcp.cloudfunctions.FunctionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudfunctions.FunctionIamPolicy
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
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamPolicy;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new FunctionIamPolicy("policy", FunctionIamPolicyArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctions.FunctionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamBinding;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new FunctionIamBinding("binding", FunctionIamBindingArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctions.FunctionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamMember;
   *  import com.pulumi.gcp.cloudfunctions.FunctionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new FunctionIamMember("member", FunctionIamMemberArgs.builder()
   *              .project(function.project())
   *              .region(function.region())
   *              .cloudFunction(function.name())
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
   *  * projects/{{project}}/locations/{{region}}/functions/{{cloud_function}}
   *  * {{project}}/{{region}}/{{cloud_function}}
   *  * {{region}}/{{cloud_function}}
   *  * {{cloud_function}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Functions cloudfunction IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_cloudfunctions_function_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/functions/{{cloud_function}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_cloudfunctions_function_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/functions/{{cloud_function}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:cloudfunctions/functionIamBinding:FunctionIamBinding editor projects/{{project}}/locations/{{region}}/functions/{{cloud_function}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def FunctionIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudfunctions.FunctionIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudfunctions.FunctionIamBindingArgs.builder
    com.pulumi.gcp.cloudfunctions.FunctionIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudfunctions.FunctionIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.FunctionIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Creates a new Cloud Function. For more information see:
   * 
   *  * [API documentation](https://cloud.google.com/functions/docs/reference/rest/v1/projects.locations.functions)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/functions/docs)
   * 
   *  &gt; **Warning:** As of November 1, 2019, newly created Functions are
   *  private-by-default and will require [appropriate IAM permissions](https://cloud.google.com/functions/docs/reference/iam/roles)
   *  to be invoked. See below examples for how to set up the appropriate permissions,
   *  or view the [Cloud Functions IAM resources](https://www.terraform.io/docs/providers/google/r/cloudfunctions_cloud_function_iam.html)
   *  for Cloud Functions.
   */
  def Function(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudfunctions.FunctionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudfunctions.FunctionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudfunctions.Function(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerArgs.Builder)
    /**
     * @param failurePolicy Specifies policy for failed executions. Structure is documented below.
     * @return builder
     */
    def failurePolicy(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerFailurePolicyArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerFailurePolicyArgs.builder
      builder.failurePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctions.inputs.FunctionIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeArgs.Builder)
    /**
     * @param versions List of secret versions to mount for this secret. If empty, the &#34;latest&#34; version of the secret will be made available in a file named after the secret under the mount point. Structure is documented below.
     * @return builder
     */
    def versions(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeVersionArgs.Builder]*):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeVersionArgs.builder
      builder.versions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudfunctions.inputs.FunctionState.Builder)
    /**
     * @param automaticUpdatePolicy Security patches are applied automatically to the runtime without requiring the function to be redeployed. This should be specified as an empty block and cannot be set alongside `onDeployUpdatePolicy`.
     * @return builder
     */
    def automaticUpdatePolicy(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionAutomaticUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionAutomaticUpdatePolicyArgs.builder
      builder.automaticUpdatePolicy(args(argsBuilder).build)

    /**
     * @param eventTrigger A source that fires events in response to a condition in another service. Structure is documented below. Cannot be used with `triggerHttp`.
     * @return builder
     */
    def eventTrigger(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerArgs.builder
      builder.eventTrigger(args(argsBuilder).build)

    /**
     * @param onDeployUpdatePolicy Security patches are only applied when a function is redeployed. This should be specified as an empty block and cannot be set alongside `automaticUpdatePolicy`. Structure is documented below.
     * @return builder
     */
    def onDeployUpdatePolicy(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionOnDeployUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionOnDeployUpdatePolicyArgs.builder
      builder.onDeployUpdatePolicy(args(argsBuilder).build)

    /**
     * @param secretEnvironmentVariables Secret environment variables configuration. Structure is documented below.
     * @return builder
     */
    def secretEnvironmentVariables(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretEnvironmentVariableArgs.Builder]*):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretEnvironmentVariableArgs.builder
      builder.secretEnvironmentVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param secretVolumes Secret volumes configuration. Structure is documented below.
     * @return builder
     */
    def secretVolumes(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeArgs.Builder]*):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionSecretVolumeArgs.builder
      builder.secretVolumes(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceRepository Represents parameters related to source repository where a function is hosted.
     *  Cannot be set alongside `sourceArchiveBucket` or `sourceArchiveObject`. Structure is documented below. It must match the pattern `projects/{project}/locations/{location}/repositories/{repository}`.*
     * @return builder
     */
    def sourceRepository(args: Endofunction[com.pulumi.gcp.cloudfunctions.inputs.FunctionSourceRepositoryArgs.Builder]):
        com.pulumi.gcp.cloudfunctions.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctions.inputs.FunctionSourceRepositoryArgs.builder
      builder.sourceRepository(args(argsBuilder).build)
