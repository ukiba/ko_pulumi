package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object servicedirectory:
  /**
   * Three different resources help you manage your IAM policy for Service Directory Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.servicedirectory.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.servicedirectory.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.servicedirectory.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.servicedirectory.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.servicedirectory.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.servicedirectory.ServiceIamBinding` and `gcp.servicedirectory.ServiceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.servicedirectory.ServiceIamBinding` resources **can be** used in conjunction with `gcp.servicedirectory.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.servicedirectory.ServiceIamPolicy
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
   *  import com.pulumi.gcp.servicedirectory.ServiceIamPolicy;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ServiceIamPolicy("policy", ServiceIamPolicyArgs.builder()
   *              .name(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.ServiceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamBinding;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ServiceIamBinding("binding", ServiceIamBindingArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.ServiceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamMember;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ServiceIamMember("member", ServiceIamMemberArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Service Directory Service
   * 
   *  Three different resources help you manage your IAM policy for Service Directory Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.servicedirectory.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.servicedirectory.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.servicedirectory.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.servicedirectory.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.servicedirectory.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.servicedirectory.ServiceIamBinding` and `gcp.servicedirectory.ServiceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.servicedirectory.ServiceIamBinding` resources **can be** used in conjunction with `gcp.servicedirectory.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.servicedirectory.ServiceIamPolicy
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
   *  import com.pulumi.gcp.servicedirectory.ServiceIamPolicy;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ServiceIamPolicy("policy", ServiceIamPolicyArgs.builder()
   *              .name(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.ServiceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamBinding;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ServiceIamBinding("binding", ServiceIamBindingArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.ServiceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamMember;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ServiceIamMember("member", ServiceIamMemberArgs.builder()
   *              .name(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}}
   *  * {{project}}/{{location}}/{{namespace_id}}/{{service_id}}
   *  * {{location}}/{{namespace_id}}/{{service_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Service Directory service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_service_directory_service_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_service_directory_service_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:servicedirectory/serviceIamPolicy:ServiceIamPolicy editor projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ServiceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.servicedirectory.ServiceIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.servicedirectory.ServiceIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.servicedirectory.ServiceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.ServiceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.ServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.ServiceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.ServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A container for `services`. Namespaces allow administrators to group services
   *  together and define permissions for a collection of services.
   * 
   *  To get more information about Namespace, see:
   * 
   *  * [API documentation](https://cloud.google.com/service-directory/docs/reference/rest/v1/projects.locations.namespaces)
   *  * How-to Guides
   *      * [Configuring a namespace](https://cloud.google.com/service-directory/docs/configuring-service-directory#configuring_a_namespace)
   */
  def Namespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.servicedirectory.NamespaceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.servicedirectory.NamespaceArgs.builder
    com.pulumi.gcp.servicedirectory.Namespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Service Directory Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.servicedirectory.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.servicedirectory.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.servicedirectory.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.servicedirectory.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.servicedirectory.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.servicedirectory.ServiceIamBinding` and `gcp.servicedirectory.ServiceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.servicedirectory.ServiceIamBinding` resources **can be** used in conjunction with `gcp.servicedirectory.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.servicedirectory.ServiceIamPolicy
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
   *  import com.pulumi.gcp.servicedirectory.ServiceIamPolicy;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ServiceIamPolicy("policy", ServiceIamPolicyArgs.builder()
   *              .name(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.ServiceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamBinding;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ServiceIamBinding("binding", ServiceIamBindingArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.ServiceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamMember;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ServiceIamMember("member", ServiceIamMemberArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Service Directory Service
   * 
   *  Three different resources help you manage your IAM policy for Service Directory Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.servicedirectory.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.servicedirectory.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.servicedirectory.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.servicedirectory.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.servicedirectory.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.servicedirectory.ServiceIamBinding` and `gcp.servicedirectory.ServiceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.servicedirectory.ServiceIamBinding` resources **can be** used in conjunction with `gcp.servicedirectory.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.servicedirectory.ServiceIamPolicy
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
   *  import com.pulumi.gcp.servicedirectory.ServiceIamPolicy;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ServiceIamPolicy("policy", ServiceIamPolicyArgs.builder()
   *              .name(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.ServiceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamBinding;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ServiceIamBinding("binding", ServiceIamBindingArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.ServiceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamMember;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ServiceIamMember("member", ServiceIamMemberArgs.builder()
   *              .name(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}}
   *  * {{project}}/{{location}}/{{namespace_id}}/{{service_id}}
   *  * {{location}}/{{namespace_id}}/{{service_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Service Directory service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_service_directory_service_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_service_directory_service_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:servicedirectory/serviceIamMember:ServiceIamMember editor projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ServiceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.servicedirectory.ServiceIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.servicedirectory.ServiceIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.servicedirectory.ServiceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.NamespaceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.NamespaceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.ServiceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.ServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.ServiceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.ServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * An individual service. A service contains a name and optional metadata.
   * 
   *  To get more information about Service, see:
   * 
   *  * [API documentation](https://cloud.google.com/service-directory/docs/reference/rest/v1/projects.locations.namespaces.services)
   *  * How-to Guides
   *      * [Configuring a service](https://cloud.google.com/service-directory/docs/configuring-service-directory#configuring_a_service)
   */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.servicedirectory.ServiceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.servicedirectory.ServiceArgs.builder
    com.pulumi.gcp.servicedirectory.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Service Directory Namespace. Each of these resources serves a different use case:
   * 
   *  * `gcp.servicedirectory.NamespaceIamPolicy`: Authoritative. Sets the IAM policy for the namespace and replaces any existing policy already attached.
   *  * `gcp.servicedirectory.NamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the namespace are preserved.
   *  * `gcp.servicedirectory.NamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the namespace are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.servicedirectory.NamespaceIamPolicy`: Retrieves the IAM policy for the namespace
   * 
   *  &gt; **Note:** `gcp.servicedirectory.NamespaceIamPolicy` **cannot** be used in conjunction with `gcp.servicedirectory.NamespaceIamBinding` and `gcp.servicedirectory.NamespaceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.servicedirectory.NamespaceIamBinding` resources **can be** used in conjunction with `gcp.servicedirectory.NamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.servicedirectory.NamespaceIamPolicy
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
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamPolicy;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new NamespaceIamPolicy("policy", NamespaceIamPolicyArgs.builder()
   *              .name(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.NamespaceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamBinding;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new NamespaceIamBinding("binding", NamespaceIamBindingArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.NamespaceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamMember;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new NamespaceIamMember("member", NamespaceIamMemberArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Service Directory Namespace
   * 
   *  Three different resources help you manage your IAM policy for Service Directory Namespace. Each of these resources serves a different use case:
   * 
   *  * `gcp.servicedirectory.NamespaceIamPolicy`: Authoritative. Sets the IAM policy for the namespace and replaces any existing policy already attached.
   *  * `gcp.servicedirectory.NamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the namespace are preserved.
   *  * `gcp.servicedirectory.NamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the namespace are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.servicedirectory.NamespaceIamPolicy`: Retrieves the IAM policy for the namespace
   * 
   *  &gt; **Note:** `gcp.servicedirectory.NamespaceIamPolicy` **cannot** be used in conjunction with `gcp.servicedirectory.NamespaceIamBinding` and `gcp.servicedirectory.NamespaceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.servicedirectory.NamespaceIamBinding` resources **can be** used in conjunction with `gcp.servicedirectory.NamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.servicedirectory.NamespaceIamPolicy
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
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamPolicy;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new NamespaceIamPolicy("policy", NamespaceIamPolicyArgs.builder()
   *              .name(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.NamespaceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamBinding;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new NamespaceIamBinding("binding", NamespaceIamBindingArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.NamespaceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamMember;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new NamespaceIamMember("member", NamespaceIamMemberArgs.builder()
   *              .name(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}
   *  * {{project}}/{{location}}/{{namespace_id}}
   *  * {{location}}/{{namespace_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Service Directory namespace IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_service_directory_namespace_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_service_directory_namespace_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:servicedirectory/namespaceIamMember:NamespaceIamMember editor projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def NamespaceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.servicedirectory.NamespaceIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.servicedirectory.NamespaceIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.servicedirectory.NamespaceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An individual endpoint that provides a service.
   * 
   *  To get more information about Endpoint, see:
   * 
   *  * [API documentation](https://cloud.google.com/service-directory/docs/reference/rest/v1/projects.locations.namespaces.services.endpoints)
   *  * How-to Guides
   *      * [Configuring an endpoint](https://cloud.google.com/service-directory/docs/configuring-service-directory#configuring_an_endpoint)
   */
  def Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.servicedirectory.EndpointArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.servicedirectory.EndpointArgs.builder
    com.pulumi.gcp.servicedirectory.Endpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type ServicedirectoryFunctions = com.pulumi.gcp.servicedirectory.ServicedirectoryFunctions
  object ServicedirectoryFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.servicedirectory.ServicedirectoryFunctions.*
  extension (self: ServicedirectoryFunctions.type)
    /** Retrieves the current IAM policy data for namespace */
    def getNamespaceIamPolicy(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.GetNamespaceIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.servicedirectory.outputs.GetNamespaceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.GetNamespaceIamPolicyArgs.builder
      com.pulumi.gcp.servicedirectory.ServicedirectoryFunctions.getNamespaceIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for namespace */
    def getNamespaceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.GetNamespaceIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.servicedirectory.outputs.GetNamespaceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.GetNamespaceIamPolicyPlainArgs.builder
      com.pulumi.gcp.servicedirectory.ServicedirectoryFunctions.getNamespaceIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for service */
    def getServiceIamPolicy(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.GetServiceIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.servicedirectory.outputs.GetServiceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.GetServiceIamPolicyArgs.builder
      com.pulumi.gcp.servicedirectory.ServicedirectoryFunctions.getServiceIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for service */
    def getServiceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.GetServiceIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.servicedirectory.outputs.GetServiceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.GetServiceIamPolicyPlainArgs.builder
      com.pulumi.gcp.servicedirectory.ServicedirectoryFunctions.getServiceIamPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.NamespaceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.NamespaceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.NamespaceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.NamespaceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Service Directory Namespace. Each of these resources serves a different use case:
   * 
   *  * `gcp.servicedirectory.NamespaceIamPolicy`: Authoritative. Sets the IAM policy for the namespace and replaces any existing policy already attached.
   *  * `gcp.servicedirectory.NamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the namespace are preserved.
   *  * `gcp.servicedirectory.NamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the namespace are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.servicedirectory.NamespaceIamPolicy`: Retrieves the IAM policy for the namespace
   * 
   *  &gt; **Note:** `gcp.servicedirectory.NamespaceIamPolicy` **cannot** be used in conjunction with `gcp.servicedirectory.NamespaceIamBinding` and `gcp.servicedirectory.NamespaceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.servicedirectory.NamespaceIamBinding` resources **can be** used in conjunction with `gcp.servicedirectory.NamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.servicedirectory.NamespaceIamPolicy
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
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamPolicy;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new NamespaceIamPolicy("policy", NamespaceIamPolicyArgs.builder()
   *              .name(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.NamespaceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamBinding;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new NamespaceIamBinding("binding", NamespaceIamBindingArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.NamespaceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamMember;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new NamespaceIamMember("member", NamespaceIamMemberArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Service Directory Namespace
   * 
   *  Three different resources help you manage your IAM policy for Service Directory Namespace. Each of these resources serves a different use case:
   * 
   *  * `gcp.servicedirectory.NamespaceIamPolicy`: Authoritative. Sets the IAM policy for the namespace and replaces any existing policy already attached.
   *  * `gcp.servicedirectory.NamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the namespace are preserved.
   *  * `gcp.servicedirectory.NamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the namespace are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.servicedirectory.NamespaceIamPolicy`: Retrieves the IAM policy for the namespace
   * 
   *  &gt; **Note:** `gcp.servicedirectory.NamespaceIamPolicy` **cannot** be used in conjunction with `gcp.servicedirectory.NamespaceIamBinding` and `gcp.servicedirectory.NamespaceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.servicedirectory.NamespaceIamBinding` resources **can be** used in conjunction with `gcp.servicedirectory.NamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.servicedirectory.NamespaceIamPolicy
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
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamPolicy;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new NamespaceIamPolicy("policy", NamespaceIamPolicyArgs.builder()
   *              .name(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.NamespaceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamBinding;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new NamespaceIamBinding("binding", NamespaceIamBindingArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.NamespaceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamMember;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new NamespaceIamMember("member", NamespaceIamMemberArgs.builder()
   *              .name(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}
   *  * {{project}}/{{location}}/{{namespace_id}}
   *  * {{location}}/{{namespace_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Service Directory namespace IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_service_directory_namespace_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_service_directory_namespace_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:servicedirectory/namespaceIamBinding:NamespaceIamBinding editor projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def NamespaceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.servicedirectory.NamespaceIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.servicedirectory.NamespaceIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.servicedirectory.NamespaceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Service Directory Namespace. Each of these resources serves a different use case:
   * 
   *  * `gcp.servicedirectory.NamespaceIamPolicy`: Authoritative. Sets the IAM policy for the namespace and replaces any existing policy already attached.
   *  * `gcp.servicedirectory.NamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the namespace are preserved.
   *  * `gcp.servicedirectory.NamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the namespace are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.servicedirectory.NamespaceIamPolicy`: Retrieves the IAM policy for the namespace
   * 
   *  &gt; **Note:** `gcp.servicedirectory.NamespaceIamPolicy` **cannot** be used in conjunction with `gcp.servicedirectory.NamespaceIamBinding` and `gcp.servicedirectory.NamespaceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.servicedirectory.NamespaceIamBinding` resources **can be** used in conjunction with `gcp.servicedirectory.NamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.servicedirectory.NamespaceIamPolicy
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
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamPolicy;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new NamespaceIamPolicy("policy", NamespaceIamPolicyArgs.builder()
   *              .name(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.NamespaceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamBinding;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new NamespaceIamBinding("binding", NamespaceIamBindingArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.NamespaceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamMember;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new NamespaceIamMember("member", NamespaceIamMemberArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Service Directory Namespace
   * 
   *  Three different resources help you manage your IAM policy for Service Directory Namespace. Each of these resources serves a different use case:
   * 
   *  * `gcp.servicedirectory.NamespaceIamPolicy`: Authoritative. Sets the IAM policy for the namespace and replaces any existing policy already attached.
   *  * `gcp.servicedirectory.NamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the namespace are preserved.
   *  * `gcp.servicedirectory.NamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the namespace are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.servicedirectory.NamespaceIamPolicy`: Retrieves the IAM policy for the namespace
   * 
   *  &gt; **Note:** `gcp.servicedirectory.NamespaceIamPolicy` **cannot** be used in conjunction with `gcp.servicedirectory.NamespaceIamBinding` and `gcp.servicedirectory.NamespaceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.servicedirectory.NamespaceIamBinding` resources **can be** used in conjunction with `gcp.servicedirectory.NamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.servicedirectory.NamespaceIamPolicy
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
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamPolicy;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new NamespaceIamPolicy("policy", NamespaceIamPolicyArgs.builder()
   *              .name(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.NamespaceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamBinding;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new NamespaceIamBinding("binding", NamespaceIamBindingArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.NamespaceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamMember;
   *  import com.pulumi.gcp.servicedirectory.NamespaceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new NamespaceIamMember("member", NamespaceIamMemberArgs.builder()
   *              .name(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}
   *  * {{project}}/{{location}}/{{namespace_id}}
   *  * {{location}}/{{namespace_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Service Directory namespace IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_service_directory_namespace_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_service_directory_namespace_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:servicedirectory/namespaceIamPolicy:NamespaceIamPolicy editor projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def NamespaceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.servicedirectory.NamespaceIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.servicedirectory.NamespaceIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.servicedirectory.NamespaceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Service Directory Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.servicedirectory.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.servicedirectory.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.servicedirectory.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.servicedirectory.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.servicedirectory.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.servicedirectory.ServiceIamBinding` and `gcp.servicedirectory.ServiceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.servicedirectory.ServiceIamBinding` resources **can be** used in conjunction with `gcp.servicedirectory.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.servicedirectory.ServiceIamPolicy
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
   *  import com.pulumi.gcp.servicedirectory.ServiceIamPolicy;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ServiceIamPolicy("policy", ServiceIamPolicyArgs.builder()
   *              .name(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.ServiceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamBinding;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ServiceIamBinding("binding", ServiceIamBindingArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.ServiceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamMember;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ServiceIamMember("member", ServiceIamMemberArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Service Directory Service
   * 
   *  Three different resources help you manage your IAM policy for Service Directory Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.servicedirectory.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.servicedirectory.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.servicedirectory.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.servicedirectory.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.servicedirectory.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.servicedirectory.ServiceIamBinding` and `gcp.servicedirectory.ServiceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.servicedirectory.ServiceIamBinding` resources **can be** used in conjunction with `gcp.servicedirectory.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.servicedirectory.ServiceIamPolicy
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
   *  import com.pulumi.gcp.servicedirectory.ServiceIamPolicy;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ServiceIamPolicy("policy", ServiceIamPolicyArgs.builder()
   *              .name(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.ServiceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamBinding;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ServiceIamBinding("binding", ServiceIamBindingArgs.builder()
   *              .name(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.servicedirectory.ServiceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamMember;
   *  import com.pulumi.gcp.servicedirectory.ServiceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ServiceIamMember("member", ServiceIamMemberArgs.builder()
   *              .name(example.name())
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
   *  * projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}}
   *  * {{project}}/{{location}}/{{namespace_id}}/{{service_id}}
   *  * {{location}}/{{namespace_id}}/{{service_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Service Directory service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_service_directory_service_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_service_directory_service_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:servicedirectory/serviceIamBinding:ServiceIamBinding editor projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ServiceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.servicedirectory.ServiceIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.servicedirectory.ServiceIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.servicedirectory.ServiceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.inputs.ServiceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.ServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.inputs.ServiceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.ServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.inputs.ServiceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.ServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.inputs.ServiceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.ServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.servicedirectory.inputs.NamespaceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.servicedirectory.inputs.NamespaceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.servicedirectory.inputs.NamespaceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.servicedirectory.inputs.NamespaceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)
