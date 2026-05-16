package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudfunctionsv2:
  /**
   * Three different resources help you manage your IAM policy for Cloud Functions (2nd gen) function. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudfunctionsv2.FunctionIamPolicy`: Authoritative. Sets the IAM policy for the function and replaces any existing policy already attached.
   *  * `gcp.cloudfunctionsv2.FunctionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the function are preserved.
   *  * `gcp.cloudfunctionsv2.FunctionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the function are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudfunctionsv2.FunctionIamPolicy`: Retrieves the IAM policy for the function
   * 
   *  &gt; **Note:** `gcp.cloudfunctionsv2.FunctionIamPolicy` **cannot** be used in conjunction with `gcp.cloudfunctionsv2.FunctionIamBinding` and `gcp.cloudfunctionsv2.FunctionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudfunctionsv2.FunctionIamBinding` resources **can be** used in conjunction with `gcp.cloudfunctionsv2.FunctionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudfunctionsv2.FunctionIamPolicy
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
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicy;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
   *              .cloudFunction(function.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctionsv2.FunctionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamBinding;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
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
   *  ## gcp.cloudfunctionsv2.FunctionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamMember;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
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
   *  # IAM policy for Cloud Functions (2nd gen) function
   * 
   *  Three different resources help you manage your IAM policy for Cloud Functions (2nd gen) function. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudfunctionsv2.FunctionIamPolicy`: Authoritative. Sets the IAM policy for the function and replaces any existing policy already attached.
   *  * `gcp.cloudfunctionsv2.FunctionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the function are preserved.
   *  * `gcp.cloudfunctionsv2.FunctionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the function are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudfunctionsv2.FunctionIamPolicy`: Retrieves the IAM policy for the function
   * 
   *  &gt; **Note:** `gcp.cloudfunctionsv2.FunctionIamPolicy` **cannot** be used in conjunction with `gcp.cloudfunctionsv2.FunctionIamBinding` and `gcp.cloudfunctionsv2.FunctionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudfunctionsv2.FunctionIamBinding` resources **can be** used in conjunction with `gcp.cloudfunctionsv2.FunctionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudfunctionsv2.FunctionIamPolicy
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
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicy;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
   *              .cloudFunction(function.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctionsv2.FunctionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamBinding;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
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
   *  ## gcp.cloudfunctionsv2.FunctionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamMember;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
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
   *  * projects/{{project}}/locations/{{location}}/functions/{{cloud_function}}
   *  * {{project}}/{{location}}/{{cloud_function}}
   *  * {{location}}/{{cloud_function}}
   *  * {{cloud_function}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Functions (2nd gen) function IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_cloudfunctions2_function_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/functions/{{cloud_function}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_cloudfunctions2_function_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/functions/{{cloud_function}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:cloudfunctionsv2/functionIamPolicy:FunctionIamPolicy editor projects/{{project}}/locations/{{location}}/functions/{{cloud_function}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def FunctionIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicyArgs.builder
    com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Functions (2nd gen) function. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudfunctionsv2.FunctionIamPolicy`: Authoritative. Sets the IAM policy for the function and replaces any existing policy already attached.
   *  * `gcp.cloudfunctionsv2.FunctionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the function are preserved.
   *  * `gcp.cloudfunctionsv2.FunctionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the function are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudfunctionsv2.FunctionIamPolicy`: Retrieves the IAM policy for the function
   * 
   *  &gt; **Note:** `gcp.cloudfunctionsv2.FunctionIamPolicy` **cannot** be used in conjunction with `gcp.cloudfunctionsv2.FunctionIamBinding` and `gcp.cloudfunctionsv2.FunctionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudfunctionsv2.FunctionIamBinding` resources **can be** used in conjunction with `gcp.cloudfunctionsv2.FunctionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudfunctionsv2.FunctionIamPolicy
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
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicy;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
   *              .cloudFunction(function.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctionsv2.FunctionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamBinding;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
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
   *  ## gcp.cloudfunctionsv2.FunctionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamMember;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
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
   *  # IAM policy for Cloud Functions (2nd gen) function
   * 
   *  Three different resources help you manage your IAM policy for Cloud Functions (2nd gen) function. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudfunctionsv2.FunctionIamPolicy`: Authoritative. Sets the IAM policy for the function and replaces any existing policy already attached.
   *  * `gcp.cloudfunctionsv2.FunctionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the function are preserved.
   *  * `gcp.cloudfunctionsv2.FunctionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the function are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudfunctionsv2.FunctionIamPolicy`: Retrieves the IAM policy for the function
   * 
   *  &gt; **Note:** `gcp.cloudfunctionsv2.FunctionIamPolicy` **cannot** be used in conjunction with `gcp.cloudfunctionsv2.FunctionIamBinding` and `gcp.cloudfunctionsv2.FunctionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudfunctionsv2.FunctionIamBinding` resources **can be** used in conjunction with `gcp.cloudfunctionsv2.FunctionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudfunctionsv2.FunctionIamPolicy
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
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicy;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
   *              .cloudFunction(function.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctionsv2.FunctionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamBinding;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
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
   *  ## gcp.cloudfunctionsv2.FunctionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamMember;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
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
   *  * projects/{{project}}/locations/{{location}}/functions/{{cloud_function}}
   *  * {{project}}/{{location}}/{{cloud_function}}
   *  * {{location}}/{{cloud_function}}
   *  * {{cloud_function}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Functions (2nd gen) function IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_cloudfunctions2_function_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/functions/{{cloud_function}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_cloudfunctions2_function_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/functions/{{cloud_function}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:cloudfunctionsv2/functionIamMember:FunctionIamMember editor projects/{{project}}/locations/{{location}}/functions/{{cloud_function}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def FunctionIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.FunctionIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.FunctionIamMemberArgs.builder
    com.pulumi.gcp.cloudfunctionsv2.FunctionIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.FunctionIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.FunctionIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.FunctionArgs.Builder)
    /**
     * @param buildConfig Describes the Build step of the function that builds a container
     *  from the given source.
     *  Structure is documented below.
     * @return builder
     */
    def buildConfig(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.builder
      builder.buildConfig(args(argsBuilder).build)

    /**
     * @param eventTrigger An Eventarc trigger managed by Google Cloud Functions that fires events in
     *  response to a condition in another service.
     *  Structure is documented below.
     * @return builder
     */
    def eventTrigger(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerArgs.builder
      builder.eventTrigger(args(argsBuilder).build)

    /**
     * @param serviceConfig Describes the Service being deployed.
     *  Structure is documented below.
     * @return builder
     */
    def serviceConfig(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.FunctionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.builder
      builder.serviceConfig(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Functions (2nd gen) function. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudfunctionsv2.FunctionIamPolicy`: Authoritative. Sets the IAM policy for the function and replaces any existing policy already attached.
   *  * `gcp.cloudfunctionsv2.FunctionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the function are preserved.
   *  * `gcp.cloudfunctionsv2.FunctionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the function are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudfunctionsv2.FunctionIamPolicy`: Retrieves the IAM policy for the function
   * 
   *  &gt; **Note:** `gcp.cloudfunctionsv2.FunctionIamPolicy` **cannot** be used in conjunction with `gcp.cloudfunctionsv2.FunctionIamBinding` and `gcp.cloudfunctionsv2.FunctionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudfunctionsv2.FunctionIamBinding` resources **can be** used in conjunction with `gcp.cloudfunctionsv2.FunctionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudfunctionsv2.FunctionIamPolicy
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
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicy;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
   *              .cloudFunction(function.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctionsv2.FunctionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamBinding;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
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
   *  ## gcp.cloudfunctionsv2.FunctionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamMember;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
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
   *  # IAM policy for Cloud Functions (2nd gen) function
   * 
   *  Three different resources help you manage your IAM policy for Cloud Functions (2nd gen) function. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudfunctionsv2.FunctionIamPolicy`: Authoritative. Sets the IAM policy for the function and replaces any existing policy already attached.
   *  * `gcp.cloudfunctionsv2.FunctionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the function are preserved.
   *  * `gcp.cloudfunctionsv2.FunctionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the function are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudfunctionsv2.FunctionIamPolicy`: Retrieves the IAM policy for the function
   * 
   *  &gt; **Note:** `gcp.cloudfunctionsv2.FunctionIamPolicy` **cannot** be used in conjunction with `gcp.cloudfunctionsv2.FunctionIamBinding` and `gcp.cloudfunctionsv2.FunctionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudfunctionsv2.FunctionIamBinding` resources **can be** used in conjunction with `gcp.cloudfunctionsv2.FunctionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudfunctionsv2.FunctionIamPolicy
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
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicy;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
   *              .cloudFunction(function.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudfunctionsv2.FunctionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamBinding;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
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
   *  ## gcp.cloudfunctionsv2.FunctionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamMember;
   *  import com.pulumi.gcp.cloudfunctionsv2.FunctionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .location(function.location())
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
   *  * projects/{{project}}/locations/{{location}}/functions/{{cloud_function}}
   *  * {{project}}/{{location}}/{{cloud_function}}
   *  * {{location}}/{{cloud_function}}
   *  * {{cloud_function}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Functions (2nd gen) function IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_cloudfunctions2_function_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/functions/{{cloud_function}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_cloudfunctions2_function_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/functions/{{cloud_function}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:cloudfunctionsv2/functionIamBinding:FunctionIamBinding editor projects/{{project}}/locations/{{location}}/functions/{{cloud_function}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def FunctionIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.FunctionIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.FunctionIamBindingArgs.builder
    com.pulumi.gcp.cloudfunctionsv2.FunctionIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.FunctionIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.FunctionIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A Cloud Function that contains user computation executed in response to an event.
   * 
   *  To get more information about function, see:
   * 
   *  * [API documentation](https://cloud.google.com/functions/docs/reference/rest/v2beta/projects.locations.functions)
   */
  def Function(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.FunctionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudfunctionsv2.FunctionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudfunctionsv2.Function(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object Cloudfunctionsv2Functions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Get information about a Google Cloud Function (2nd gen). For more information see:
     * 
     *  * [API documentation](https://cloud.google.com/functions/docs/reference/rest/v2beta/projects.locations.functions).
     */
    inline def getFunction(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.GetFunctionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudfunctionsv2.outputs.GetFunctionResult] =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.GetFunctionArgs.builder
      com.pulumi.gcp.cloudfunctionsv2.Cloudfunctionsv2Functions.getFunction(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Function (2nd gen). For more information see:
     * 
     *  * [API documentation](https://cloud.google.com/functions/docs/reference/rest/v2beta/projects.locations.functions).
     */
    inline def getFunctionPlain(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.GetFunctionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudfunctionsv2.outputs.GetFunctionResult] =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.GetFunctionPlainArgs.builder
      com.pulumi.gcp.cloudfunctionsv2.Cloudfunctionsv2Functions.getFunctionPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for function */
    inline def getFunctionIamPolicy(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.GetFunctionIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudfunctionsv2.outputs.GetFunctionIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.GetFunctionIamPolicyArgs.builder
      com.pulumi.gcp.cloudfunctionsv2.Cloudfunctionsv2Functions.getFunctionIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for function */
    inline def getFunctionIamPolicyPlain(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.GetFunctionIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudfunctionsv2.outputs.GetFunctionIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.GetFunctionIamPolicyPlainArgs.builder
      com.pulumi.gcp.cloudfunctionsv2.Cloudfunctionsv2Functions.getFunctionIamPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerArgs.Builder)
    /**
     * @param eventFilters Criteria used to filter events.
     *  Structure is documented below.
     * @return builder
     */
    def eventFilters(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerEventFilterArgs.Builder]*):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerEventFilterArgs.builder
      builder.eventFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretVolumeArgs.Builder)
    /**
     * @param versions List of secret versions to mount for this secret. If empty, the latest version of the secret will be made available in a file named after the secret under the mount point.&#39;
     *  Structure is documented below.
     * @return builder
     */
    def versions(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretVolumeVersionArgs.Builder]*):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretVolumeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretVolumeVersionArgs.builder
      builder.versions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceArgs.Builder)
    /**
     * @param repoSource If provided, get the source from this location in a Cloud Source Repository.
     *  Structure is documented below.
     * @return builder
     */
    def repoSource(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceRepoSourceArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceRepoSourceArgs.builder
      builder.repoSource(args(argsBuilder).build)

    /**
     * @param storageSource If provided, get the source from this location in Google Cloud Storage.
     *  Structure is documented below.
     * @return builder
     */
    def storageSource(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceStorageSourceArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceStorageSourceArgs.builder
      builder.storageSource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.Builder)
    /**
     * @param automaticUpdatePolicy Security patches are applied automatically to the runtime without requiring
     *  the function to be redeployed.
     * @return builder
     */
    def automaticUpdatePolicy(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigAutomaticUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigAutomaticUpdatePolicyArgs.builder
      builder.automaticUpdatePolicy(args(argsBuilder).build)

    /**
     * @param onDeployUpdatePolicy Security patches are only applied when a function is redeployed.
     *  Structure is documented below.
     * @return builder
     */
    def onDeployUpdatePolicy(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigOnDeployUpdatePolicyArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigOnDeployUpdatePolicyArgs.builder
      builder.onDeployUpdatePolicy(args(argsBuilder).build)

    /**
     * @param source The location of the function source code.
     *  Structure is documented below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.Builder)
    /**
     * @param directVpcNetworkInterfaces The Direct VPC network interface for the Cloud Function. Currently only a single Direct VPC is supported.
     *  Structure is documented below.
     * @return builder
     */
    def directVpcNetworkInterfaces(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigDirectVpcNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigDirectVpcNetworkInterfaceArgs.builder
      builder.directVpcNetworkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param secretEnvironmentVariables Secret environment variables configuration.
     *  Structure is documented below.
     * @return builder
     */
    def secretEnvironmentVariables(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretEnvironmentVariableArgs.Builder]*):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretEnvironmentVariableArgs.builder
      builder.secretEnvironmentVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param secretVolumes Secret volumes configuration.
     *  Structure is documented below.
     * @return builder
     */
    def secretVolumes(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretVolumeArgs.Builder]*):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigSecretVolumeArgs.builder
      builder.secretVolumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionState.Builder)
    /**
     * @param buildConfig Describes the Build step of the function that builds a container
     *  from the given source.
     *  Structure is documented below.
     * @return builder
     */
    def buildConfig(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs.builder
      builder.buildConfig(args(argsBuilder).build)

    /**
     * @param eventTrigger An Eventarc trigger managed by Google Cloud Functions that fires events in
     *  response to a condition in another service.
     *  Structure is documented below.
     * @return builder
     */
    def eventTrigger(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionEventTriggerArgs.builder
      builder.eventTrigger(args(argsBuilder).build)

    /**
     * @param serviceConfig Describes the Service being deployed.
     *  Structure is documented below.
     * @return builder
     */
    def serviceConfig(args: Endofunction[com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.Builder]):
        com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs.builder
      builder.serviceConfig(args(argsBuilder).build)
