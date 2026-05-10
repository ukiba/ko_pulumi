package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object endpoints:
  /**
   * Three different resources help you manage your IAM policy for Cloud Endpoints ServiceConsumers. Each of these resources serves a different use case:
   * 
   *  * `gcp.endpoints.ConsumersIamPolicy`: Authoritative. Sets the IAM policy for the serviceconsumers and replaces any existing policy already attached.
   *  * `gcp.endpoints.ConsumersIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the serviceconsumers are preserved.
   *  * `gcp.endpoints.ConsumersIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the serviceconsumers are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.endpoints.ConsumersIamPolicy`: Retrieves the IAM policy for the serviceconsumers
   * 
   *  &gt; **Note:** `gcp.endpoints.ConsumersIamPolicy` **cannot** be used in conjunction with `gcp.endpoints.ConsumersIamBinding` and `gcp.endpoints.ConsumersIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.endpoints.ConsumersIamBinding` resources **can be** used in conjunction with `gcp.endpoints.ConsumersIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.endpoints.ConsumersIamPolicy
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * services/{{service_name}}/consumers/{{consumer_project}}
   *  * {{service_name}}/{{consumer_project}}
   *  * {{consumer_project}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Endpoints serviceconsumers IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_endpoints_service_consumers_iam_member.editor &#34;services/{{service_name}}/consumers/{{consumer_project}} roles/servicemanagement.serviceController user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_endpoints_service_consumers_iam_binding.editor &#34;services/{{service_name}}/consumers/{{consumer_project}} roles/servicemanagement.serviceController&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:endpoints/consumersIamMember:ConsumersIamMember editor services/{{service_name}}/consumers/{{consumer_project}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConsumersIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.endpoints.ConsumersIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.endpoints.ConsumersIamMemberArgs.builder
    com.pulumi.gcp.endpoints.ConsumersIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.endpoints.ConsumersIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ConsumersIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.ConsumersIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ConsumersIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Endpoints Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.endpoints.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.endpoints.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.endpoints.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.endpoints.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.endpoints.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.endpoints.ServiceIamBinding` and `gcp.endpoints.ServiceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.endpoints.ServiceIamBinding` resources **can be** used in conjunction with `gcp.endpoints.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.endpoints.ServiceIamPolicy
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
   *  import com.pulumi.gcp.endpoints.ServiceIamPolicy;
   *  import com.pulumi.gcp.endpoints.ServiceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.endpoints.ServiceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.endpoints.ServiceIamBinding;
   *  import com.pulumi.gcp.endpoints.ServiceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.endpoints.ServiceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.endpoints.ServiceIamMember;
   *  import com.pulumi.gcp.endpoints.ServiceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
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
   *  # IAM policy for Cloud Endpoints Service
   * 
   *  Three different resources help you manage your IAM policy for Cloud Endpoints Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.endpoints.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.endpoints.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.endpoints.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.endpoints.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.endpoints.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.endpoints.ServiceIamBinding` and `gcp.endpoints.ServiceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.endpoints.ServiceIamBinding` resources **can be** used in conjunction with `gcp.endpoints.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.endpoints.ServiceIamPolicy
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
   *  import com.pulumi.gcp.endpoints.ServiceIamPolicy;
   *  import com.pulumi.gcp.endpoints.ServiceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.endpoints.ServiceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.endpoints.ServiceIamBinding;
   *  import com.pulumi.gcp.endpoints.ServiceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.endpoints.ServiceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.endpoints.ServiceIamMember;
   *  import com.pulumi.gcp.endpoints.ServiceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
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
   *  * services/{{service_name}}
   *  * {{service_name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Endpoints service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_endpoints_service_iam_member.editor &#34;services/{{service_name}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_endpoints_service_iam_binding.editor &#34;services/{{service_name}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:endpoints/serviceIamPolicy:ServiceIamPolicy editor services/{{service_name}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ServiceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.endpoints.ServiceIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.endpoints.ServiceIamPolicyArgs.builder
    com.pulumi.gcp.endpoints.ServiceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.endpoints.ServiceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.ServiceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Endpoints ServiceConsumers. Each of these resources serves a different use case:
   * 
   *  * `gcp.endpoints.ConsumersIamPolicy`: Authoritative. Sets the IAM policy for the serviceconsumers and replaces any existing policy already attached.
   *  * `gcp.endpoints.ConsumersIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the serviceconsumers are preserved.
   *  * `gcp.endpoints.ConsumersIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the serviceconsumers are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.endpoints.ConsumersIamPolicy`: Retrieves the IAM policy for the serviceconsumers
   * 
   *  &gt; **Note:** `gcp.endpoints.ConsumersIamPolicy` **cannot** be used in conjunction with `gcp.endpoints.ConsumersIamBinding` and `gcp.endpoints.ConsumersIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.endpoints.ConsumersIamBinding` resources **can be** used in conjunction with `gcp.endpoints.ConsumersIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.endpoints.ConsumersIamPolicy
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * services/{{service_name}}/consumers/{{consumer_project}}
   *  * {{service_name}}/{{consumer_project}}
   *  * {{consumer_project}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Endpoints serviceconsumers IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_endpoints_service_consumers_iam_member.editor &#34;services/{{service_name}}/consumers/{{consumer_project}} roles/servicemanagement.serviceController user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_endpoints_service_consumers_iam_binding.editor &#34;services/{{service_name}}/consumers/{{consumer_project}} roles/servicemanagement.serviceController&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:endpoints/consumersIamPolicy:ConsumersIamPolicy editor services/{{service_name}}/consumers/{{consumer_project}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConsumersIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.endpoints.ConsumersIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.endpoints.ConsumersIamPolicyArgs.builder
    com.pulumi.gcp.endpoints.ConsumersIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Endpoints ServiceConsumers. Each of these resources serves a different use case:
   * 
   *  * `gcp.endpoints.ConsumersIamPolicy`: Authoritative. Sets the IAM policy for the serviceconsumers and replaces any existing policy already attached.
   *  * `gcp.endpoints.ConsumersIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the serviceconsumers are preserved.
   *  * `gcp.endpoints.ConsumersIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the serviceconsumers are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.endpoints.ConsumersIamPolicy`: Retrieves the IAM policy for the serviceconsumers
   * 
   *  &gt; **Note:** `gcp.endpoints.ConsumersIamPolicy` **cannot** be used in conjunction with `gcp.endpoints.ConsumersIamBinding` and `gcp.endpoints.ConsumersIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.endpoints.ConsumersIamBinding` resources **can be** used in conjunction with `gcp.endpoints.ConsumersIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.endpoints.ConsumersIamPolicy
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * services/{{service_name}}/consumers/{{consumer_project}}
   *  * {{service_name}}/{{consumer_project}}
   *  * {{consumer_project}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Endpoints serviceconsumers IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_endpoints_service_consumers_iam_member.editor &#34;services/{{service_name}}/consumers/{{consumer_project}} roles/servicemanagement.serviceController user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_endpoints_service_consumers_iam_binding.editor &#34;services/{{service_name}}/consumers/{{consumer_project}} roles/servicemanagement.serviceController&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:endpoints/consumersIamBinding:ConsumersIamBinding editor services/{{service_name}}/consumers/{{consumer_project}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConsumersIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.endpoints.ConsumersIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.endpoints.ConsumersIamBindingArgs.builder
    com.pulumi.gcp.endpoints.ConsumersIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Endpoints Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.endpoints.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.endpoints.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.endpoints.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.endpoints.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.endpoints.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.endpoints.ServiceIamBinding` and `gcp.endpoints.ServiceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.endpoints.ServiceIamBinding` resources **can be** used in conjunction with `gcp.endpoints.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.endpoints.ServiceIamPolicy
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
   *  import com.pulumi.gcp.endpoints.ServiceIamPolicy;
   *  import com.pulumi.gcp.endpoints.ServiceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.endpoints.ServiceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.endpoints.ServiceIamBinding;
   *  import com.pulumi.gcp.endpoints.ServiceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.endpoints.ServiceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.endpoints.ServiceIamMember;
   *  import com.pulumi.gcp.endpoints.ServiceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
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
   *  # IAM policy for Cloud Endpoints Service
   * 
   *  Three different resources help you manage your IAM policy for Cloud Endpoints Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.endpoints.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.endpoints.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.endpoints.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.endpoints.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.endpoints.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.endpoints.ServiceIamBinding` and `gcp.endpoints.ServiceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.endpoints.ServiceIamBinding` resources **can be** used in conjunction with `gcp.endpoints.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.endpoints.ServiceIamPolicy
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
   *  import com.pulumi.gcp.endpoints.ServiceIamPolicy;
   *  import com.pulumi.gcp.endpoints.ServiceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.endpoints.ServiceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.endpoints.ServiceIamBinding;
   *  import com.pulumi.gcp.endpoints.ServiceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.endpoints.ServiceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.endpoints.ServiceIamMember;
   *  import com.pulumi.gcp.endpoints.ServiceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
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
   *  * services/{{service_name}}
   *  * {{service_name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Endpoints service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_endpoints_service_iam_member.editor &#34;services/{{service_name}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_endpoints_service_iam_binding.editor &#34;services/{{service_name}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:endpoints/serviceIamMember:ServiceIamMember editor services/{{service_name}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ServiceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.endpoints.ServiceIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.endpoints.ServiceIamMemberArgs.builder
    com.pulumi.gcp.endpoints.ServiceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type EndpointsFunctions = com.pulumi.gcp.endpoints.EndpointsFunctions
  object EndpointsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.endpoints.EndpointsFunctions.*
  extension (self: EndpointsFunctions.type)
    /** Retrieves the current IAM policy data for serviceconsumers */
    def getServiceConsumersIamPolicy(args: Endofunction[com.pulumi.gcp.endpoints.inputs.GetServiceConsumersIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.endpoints.outputs.GetServiceConsumersIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.GetServiceConsumersIamPolicyArgs.builder
      com.pulumi.gcp.endpoints.EndpointsFunctions.getServiceConsumersIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for serviceconsumers */
    def getServiceConsumersIamPolicyPlain(args: Endofunction[com.pulumi.gcp.endpoints.inputs.GetServiceConsumersIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.endpoints.outputs.GetServiceConsumersIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.GetServiceConsumersIamPolicyPlainArgs.builder
      com.pulumi.gcp.endpoints.EndpointsFunctions.getServiceConsumersIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for service */
    def getServiceIamPolicy(args: Endofunction[com.pulumi.gcp.endpoints.inputs.GetServiceIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.endpoints.outputs.GetServiceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.GetServiceIamPolicyArgs.builder
      com.pulumi.gcp.endpoints.EndpointsFunctions.getServiceIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for service */
    def getServiceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.endpoints.inputs.GetServiceIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.endpoints.outputs.GetServiceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.GetServiceIamPolicyPlainArgs.builder
      com.pulumi.gcp.endpoints.EndpointsFunctions.getServiceIamPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.endpoints.ServiceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.ServiceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.endpoints.ConsumersIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ConsumersIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.ConsumersIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ConsumersIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /** This resource creates and rolls out a Cloud Endpoints service using OpenAPI or gRPC.  View the relevant docs for [OpenAPI](https://cloud.google.com/endpoints/docs/openapi/) and [gRPC](https://cloud.google.com/endpoints/docs/grpc/). */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.endpoints.ServiceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.endpoints.ServiceArgs.builder
    com.pulumi.gcp.endpoints.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Endpoints Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.endpoints.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.endpoints.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.endpoints.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.endpoints.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.endpoints.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.endpoints.ServiceIamBinding` and `gcp.endpoints.ServiceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.endpoints.ServiceIamBinding` resources **can be** used in conjunction with `gcp.endpoints.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.endpoints.ServiceIamPolicy
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
   *  import com.pulumi.gcp.endpoints.ServiceIamPolicy;
   *  import com.pulumi.gcp.endpoints.ServiceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.endpoints.ServiceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.endpoints.ServiceIamBinding;
   *  import com.pulumi.gcp.endpoints.ServiceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.endpoints.ServiceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.endpoints.ServiceIamMember;
   *  import com.pulumi.gcp.endpoints.ServiceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
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
   *  # IAM policy for Cloud Endpoints Service
   * 
   *  Three different resources help you manage your IAM policy for Cloud Endpoints Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.endpoints.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.endpoints.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.endpoints.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.endpoints.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.endpoints.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.endpoints.ServiceIamBinding` and `gcp.endpoints.ServiceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.endpoints.ServiceIamBinding` resources **can be** used in conjunction with `gcp.endpoints.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.endpoints.ServiceIamPolicy
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
   *  import com.pulumi.gcp.endpoints.ServiceIamPolicy;
   *  import com.pulumi.gcp.endpoints.ServiceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.endpoints.ServiceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.endpoints.ServiceIamBinding;
   *  import com.pulumi.gcp.endpoints.ServiceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.endpoints.ServiceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.endpoints.ServiceIamMember;
   *  import com.pulumi.gcp.endpoints.ServiceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *              .serviceName(endpointsService.serviceName())
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
   *  * services/{{service_name}}
   *  * {{service_name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Endpoints service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_endpoints_service_iam_member.editor &#34;services/{{service_name}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_endpoints_service_iam_binding.editor &#34;services/{{service_name}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:endpoints/serviceIamBinding:ServiceIamBinding editor services/{{service_name}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ServiceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.endpoints.ServiceIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.endpoints.ServiceIamBindingArgs.builder
    com.pulumi.gcp.endpoints.ServiceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.endpoints.inputs.ServiceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ServiceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.inputs.ServiceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ServiceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.endpoints.inputs.ServiceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ServiceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.inputs.ServiceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ServiceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.endpoints.inputs.ServiceState.Builder)
    /**
     * @param apis A list of API objects; structure is documented below.
     * @return builder
     */
    def apis(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ServiceApiArgs.Builder]*):
        com.pulumi.gcp.endpoints.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.endpoints.inputs.ServiceApiArgs.builder
      builder.apis(args.map(_(argsBuilder).build)*)

    /**
     * @param endpoints A list of Endpoint objects; structure is documented below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ServiceEndpointArgs.Builder]*):
        com.pulumi.gcp.endpoints.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.endpoints.inputs.ServiceEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.endpoints.inputs.ConsumersIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ConsumersIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.inputs.ConsumersIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ConsumersIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.endpoints.inputs.ServiceApiArgs.Builder)
    /**
     * @param methods A list of Method objects; structure is documented below.
     * @return builder
     */
    def methods(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ServiceApiMethodArgs.Builder]*):
        com.pulumi.gcp.endpoints.inputs.ServiceApiArgs.Builder =
      def argsBuilder = com.pulumi.gcp.endpoints.inputs.ServiceApiMethodArgs.builder
      builder.methods(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.endpoints.inputs.ConsumersIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.endpoints.inputs.ConsumersIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.endpoints.inputs.ConsumersIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.endpoints.inputs.ConsumersIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
