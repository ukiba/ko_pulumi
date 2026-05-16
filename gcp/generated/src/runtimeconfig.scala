package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object runtimeconfig:
  extension (builder: com.pulumi.gcp.runtimeconfig.ConfigIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.runtimeconfig.inputs.ConfigIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.runtimeconfig.ConfigIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.runtimeconfig.inputs.ConfigIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Runtime Configurator Config. Each of these resources serves a different use case:
   * 
   *  * `gcp.runtimeconfig.ConfigIamPolicy`: Authoritative. Sets the IAM policy for the config and replaces any existing policy already attached.
   *  * `gcp.runtimeconfig.ConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the config are preserved.
   *  * `gcp.runtimeconfig.ConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the config are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.runtimeconfig.ConfigIamPolicy`: Retrieves the IAM policy for the config
   * 
   *  &gt; **Note:** `gcp.runtimeconfig.ConfigIamPolicy` **cannot** be used in conjunction with `gcp.runtimeconfig.ConfigIamBinding` and `gcp.runtimeconfig.ConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.runtimeconfig.ConfigIamBinding` resources **can be** used in conjunction with `gcp.runtimeconfig.ConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.runtimeconfig.ConfigIamPolicy
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
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamPolicy;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ConfigIamPolicy("policy", ConfigIamPolicyArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.runtimeconfig.ConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamBinding;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ConfigIamBinding("binding", ConfigIamBindingArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.runtimeconfig.ConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamMember;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ConfigIamMember("member", ConfigIamMemberArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
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
   *  # IAM policy for Runtime Configurator Config
   * 
   *  Three different resources help you manage your IAM policy for Runtime Configurator Config. Each of these resources serves a different use case:
   * 
   *  * `gcp.runtimeconfig.ConfigIamPolicy`: Authoritative. Sets the IAM policy for the config and replaces any existing policy already attached.
   *  * `gcp.runtimeconfig.ConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the config are preserved.
   *  * `gcp.runtimeconfig.ConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the config are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.runtimeconfig.ConfigIamPolicy`: Retrieves the IAM policy for the config
   * 
   *  &gt; **Note:** `gcp.runtimeconfig.ConfigIamPolicy` **cannot** be used in conjunction with `gcp.runtimeconfig.ConfigIamBinding` and `gcp.runtimeconfig.ConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.runtimeconfig.ConfigIamBinding` resources **can be** used in conjunction with `gcp.runtimeconfig.ConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.runtimeconfig.ConfigIamPolicy
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
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamPolicy;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ConfigIamPolicy("policy", ConfigIamPolicyArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.runtimeconfig.ConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamBinding;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ConfigIamBinding("binding", ConfigIamBindingArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.runtimeconfig.ConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamMember;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ConfigIamMember("member", ConfigIamMemberArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
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
   *  * projects/{{project}}/configs/{{config}}
   *  * {{project}}/{{config}}
   *  * {{config}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Runtime Configurator config IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_runtimeconfig_config_iam_member.editor &#34;projects/{{project}}/configs/{{config}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_runtimeconfig_config_iam_binding.editor &#34;projects/{{project}}/configs/{{config}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:runtimeconfig/configIamBinding:ConfigIamBinding editor projects/{{project}}/configs/{{config}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConfigIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.runtimeconfig.ConfigIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.runtimeconfig.ConfigIamBindingArgs.builder
    com.pulumi.gcp.runtimeconfig.ConfigIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a RuntimeConfig variable in Google Cloud. For more information, see the
   *  [official documentation](https://cloud.google.com/deployment-manager/runtime-configurator/),
   *  or the
   *  [JSON API](https://cloud.google.com/deployment-manager/runtime-configurator/reference/rest/).
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def Variable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.runtimeconfig.VariableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.runtimeconfig.VariableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.runtimeconfig.Variable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.runtimeconfig.ConfigIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.runtimeconfig.inputs.ConfigIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.runtimeconfig.ConfigIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.runtimeconfig.inputs.ConfigIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Runtime Configurator Config. Each of these resources serves a different use case:
   * 
   *  * `gcp.runtimeconfig.ConfigIamPolicy`: Authoritative. Sets the IAM policy for the config and replaces any existing policy already attached.
   *  * `gcp.runtimeconfig.ConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the config are preserved.
   *  * `gcp.runtimeconfig.ConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the config are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.runtimeconfig.ConfigIamPolicy`: Retrieves the IAM policy for the config
   * 
   *  &gt; **Note:** `gcp.runtimeconfig.ConfigIamPolicy` **cannot** be used in conjunction with `gcp.runtimeconfig.ConfigIamBinding` and `gcp.runtimeconfig.ConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.runtimeconfig.ConfigIamBinding` resources **can be** used in conjunction with `gcp.runtimeconfig.ConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.runtimeconfig.ConfigIamPolicy
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
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamPolicy;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ConfigIamPolicy("policy", ConfigIamPolicyArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.runtimeconfig.ConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamBinding;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ConfigIamBinding("binding", ConfigIamBindingArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.runtimeconfig.ConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamMember;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ConfigIamMember("member", ConfigIamMemberArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
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
   *  # IAM policy for Runtime Configurator Config
   * 
   *  Three different resources help you manage your IAM policy for Runtime Configurator Config. Each of these resources serves a different use case:
   * 
   *  * `gcp.runtimeconfig.ConfigIamPolicy`: Authoritative. Sets the IAM policy for the config and replaces any existing policy already attached.
   *  * `gcp.runtimeconfig.ConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the config are preserved.
   *  * `gcp.runtimeconfig.ConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the config are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.runtimeconfig.ConfigIamPolicy`: Retrieves the IAM policy for the config
   * 
   *  &gt; **Note:** `gcp.runtimeconfig.ConfigIamPolicy` **cannot** be used in conjunction with `gcp.runtimeconfig.ConfigIamBinding` and `gcp.runtimeconfig.ConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.runtimeconfig.ConfigIamBinding` resources **can be** used in conjunction with `gcp.runtimeconfig.ConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.runtimeconfig.ConfigIamPolicy
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
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamPolicy;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ConfigIamPolicy("policy", ConfigIamPolicyArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.runtimeconfig.ConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamBinding;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ConfigIamBinding("binding", ConfigIamBindingArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.runtimeconfig.ConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamMember;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ConfigIamMember("member", ConfigIamMemberArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
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
   *  * projects/{{project}}/configs/{{config}}
   *  * {{project}}/{{config}}
   *  * {{config}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Runtime Configurator config IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_runtimeconfig_config_iam_member.editor &#34;projects/{{project}}/configs/{{config}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_runtimeconfig_config_iam_binding.editor &#34;projects/{{project}}/configs/{{config}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:runtimeconfig/configIamPolicy:ConfigIamPolicy editor projects/{{project}}/configs/{{config}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConfigIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.runtimeconfig.ConfigIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.runtimeconfig.ConfigIamPolicyArgs.builder
    com.pulumi.gcp.runtimeconfig.ConfigIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a RuntimeConfig resource in Google Cloud.
   * 
   *  To get more information about RuntimeConfigs, see:
   * 
   *  * [API documentation](https://cloud.google.com/deployment-manager/runtime-configurator/reference/rest/v1beta1/projects.configs)
   *  * How-to Guides
   *      * [Runtime Configurator Fundamentals](https://cloud.google.com/deployment-manager/runtime-configurator/)
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def Config(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.runtimeconfig.ConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.runtimeconfig.ConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.runtimeconfig.Config(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object RuntimeconfigFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * To get more information about RuntimeConfigs, see:
     * 
     *  * [API documentation](https://cloud.google.com/deployment-manager/runtime-configurator/reference/rest/v1beta1/projects.configs)
     *  * How-to Guides
     *      * [Runtime Configurator Fundamentals](https://cloud.google.com/deployment-manager/runtime-configurator/)
     * 
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta datasources.
     */
    inline def getConfig(args: Endofunction[com.pulumi.gcp.runtimeconfig.inputs.GetConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.runtimeconfig.outputs.GetConfigResult] =
      val argsBuilder = com.pulumi.gcp.runtimeconfig.inputs.GetConfigArgs.builder
      com.pulumi.gcp.runtimeconfig.RuntimeconfigFunctions.getConfig(args(argsBuilder).build)

    /**
     * To get more information about RuntimeConfigs, see:
     * 
     *  * [API documentation](https://cloud.google.com/deployment-manager/runtime-configurator/reference/rest/v1beta1/projects.configs)
     *  * How-to Guides
     *      * [Runtime Configurator Fundamentals](https://cloud.google.com/deployment-manager/runtime-configurator/)
     * 
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta datasources.
     */
    inline def getConfigPlain(args: Endofunction[com.pulumi.gcp.runtimeconfig.inputs.GetConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.runtimeconfig.outputs.GetConfigResult] =
      val argsBuilder = com.pulumi.gcp.runtimeconfig.inputs.GetConfigPlainArgs.builder
      com.pulumi.gcp.runtimeconfig.RuntimeconfigFunctions.getConfigPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for config
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getConfigIamPolicy(args: Endofunction[com.pulumi.gcp.runtimeconfig.inputs.GetConfigIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.runtimeconfig.outputs.GetConfigIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.runtimeconfig.inputs.GetConfigIamPolicyArgs.builder
      com.pulumi.gcp.runtimeconfig.RuntimeconfigFunctions.getConfigIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for config
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getConfigIamPolicyPlain(args: Endofunction[com.pulumi.gcp.runtimeconfig.inputs.GetConfigIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.runtimeconfig.outputs.GetConfigIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.runtimeconfig.inputs.GetConfigIamPolicyPlainArgs.builder
      com.pulumi.gcp.runtimeconfig.RuntimeconfigFunctions.getConfigIamPolicyPlain(args(argsBuilder).build)

    /**
     * To get more information about RuntimeConfigs, see:
     * 
     *  * [API documentation](https://cloud.google.com/deployment-manager/runtime-configurator/reference/rest/v1beta1/projects.configs)
     *  * How-to Guides
     *      * [Runtime Configurator Fundamentals](https://cloud.google.com/deployment-manager/runtime-configurator/)
     * 
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta datasources.
     */
    inline def getVariable(args: Endofunction[com.pulumi.gcp.runtimeconfig.inputs.GetVariableArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.runtimeconfig.outputs.GetVariableResult] =
      val argsBuilder = com.pulumi.gcp.runtimeconfig.inputs.GetVariableArgs.builder
      com.pulumi.gcp.runtimeconfig.RuntimeconfigFunctions.getVariable(args(argsBuilder).build)

    /**
     * To get more information about RuntimeConfigs, see:
     * 
     *  * [API documentation](https://cloud.google.com/deployment-manager/runtime-configurator/reference/rest/v1beta1/projects.configs)
     *  * How-to Guides
     *      * [Runtime Configurator Fundamentals](https://cloud.google.com/deployment-manager/runtime-configurator/)
     * 
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta datasources.
     */
    inline def getVariablePlain(args: Endofunction[com.pulumi.gcp.runtimeconfig.inputs.GetVariablePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.runtimeconfig.outputs.GetVariableResult] =
      val argsBuilder = com.pulumi.gcp.runtimeconfig.inputs.GetVariablePlainArgs.builder
      com.pulumi.gcp.runtimeconfig.RuntimeconfigFunctions.getVariablePlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Runtime Configurator Config. Each of these resources serves a different use case:
   * 
   *  * `gcp.runtimeconfig.ConfigIamPolicy`: Authoritative. Sets the IAM policy for the config and replaces any existing policy already attached.
   *  * `gcp.runtimeconfig.ConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the config are preserved.
   *  * `gcp.runtimeconfig.ConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the config are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.runtimeconfig.ConfigIamPolicy`: Retrieves the IAM policy for the config
   * 
   *  &gt; **Note:** `gcp.runtimeconfig.ConfigIamPolicy` **cannot** be used in conjunction with `gcp.runtimeconfig.ConfigIamBinding` and `gcp.runtimeconfig.ConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.runtimeconfig.ConfigIamBinding` resources **can be** used in conjunction with `gcp.runtimeconfig.ConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.runtimeconfig.ConfigIamPolicy
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
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamPolicy;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ConfigIamPolicy("policy", ConfigIamPolicyArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.runtimeconfig.ConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamBinding;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ConfigIamBinding("binding", ConfigIamBindingArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.runtimeconfig.ConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamMember;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ConfigIamMember("member", ConfigIamMemberArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
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
   *  # IAM policy for Runtime Configurator Config
   * 
   *  Three different resources help you manage your IAM policy for Runtime Configurator Config. Each of these resources serves a different use case:
   * 
   *  * `gcp.runtimeconfig.ConfigIamPolicy`: Authoritative. Sets the IAM policy for the config and replaces any existing policy already attached.
   *  * `gcp.runtimeconfig.ConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the config are preserved.
   *  * `gcp.runtimeconfig.ConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the config are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.runtimeconfig.ConfigIamPolicy`: Retrieves the IAM policy for the config
   * 
   *  &gt; **Note:** `gcp.runtimeconfig.ConfigIamPolicy` **cannot** be used in conjunction with `gcp.runtimeconfig.ConfigIamBinding` and `gcp.runtimeconfig.ConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.runtimeconfig.ConfigIamBinding` resources **can be** used in conjunction with `gcp.runtimeconfig.ConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.runtimeconfig.ConfigIamPolicy
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
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamPolicy;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ConfigIamPolicy("policy", ConfigIamPolicyArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.runtimeconfig.ConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamBinding;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ConfigIamBinding("binding", ConfigIamBindingArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.runtimeconfig.ConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamMember;
   *  import com.pulumi.gcp.runtimeconfig.ConfigIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ConfigIamMember("member", ConfigIamMemberArgs.builder()
   *              .project(config.project())
   *              .config(config.name())
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
   *  * projects/{{project}}/configs/{{config}}
   *  * {{project}}/{{config}}
   *  * {{config}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Runtime Configurator config IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_runtimeconfig_config_iam_member.editor &#34;projects/{{project}}/configs/{{config}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_runtimeconfig_config_iam_binding.editor &#34;projects/{{project}}/configs/{{config}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:runtimeconfig/configIamMember:ConfigIamMember editor projects/{{project}}/configs/{{config}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConfigIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.runtimeconfig.ConfigIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.runtimeconfig.ConfigIamMemberArgs.builder
    com.pulumi.gcp.runtimeconfig.ConfigIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.runtimeconfig.inputs.ConfigIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.runtimeconfig.inputs.ConfigIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.runtimeconfig.inputs.ConfigIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.runtimeconfig.inputs.ConfigIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.runtimeconfig.inputs.ConfigIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.runtimeconfig.inputs.ConfigIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.runtimeconfig.inputs.ConfigIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.runtimeconfig.inputs.ConfigIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
