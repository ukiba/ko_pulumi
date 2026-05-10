package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudrun:
  extension (builder: com.pulumi.gcp.cloudrun.ServiceArgs.Builder)
    /**
     * @param metadata Metadata associated with this Service, including name, namespace, labels,
     *  and annotations.
     *  Structure is documented below.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceMetadataArgs.Builder]):
        com.pulumi.gcp.cloudrun.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

    /**
     * @param template template holds the latest specification for the Revision to
     *  be stamped out. The template references the container image, and may also
     *  include labels and annotations that should be attached to the Revision.
     *  To correlate a Revision, and/or to force a Revision to be created when the
     *  spec doesn&#39;t otherwise change, a nonce label may be provided in the
     *  template metadata. For more details, see:
     *  https://github.com/knative/serving/blob/main/docs/client-conventions.md#associate-modifications-with-revisions
     *  Cloud Run does not currently support referencing a build that is
     *  responsible for materializing the container image from source.
     *  Structure is documented below.
     * @return builder
     */
    def template(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateArgs.Builder]):
        com.pulumi.gcp.cloudrun.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateArgs.builder
      builder.template(args(argsBuilder).build)

    /**
     * @param traffics Traffic specifies how to distribute traffic over a collection of Knative Revisions
     *  and Configurations
     *  Structure is documented below.
     * @return builder
     */
    def traffics(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTrafficArgs.Builder]*):
        com.pulumi.gcp.cloudrun.ServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTrafficArgs.builder
      builder.traffics(args.map(_(argsBuilder).build)*)

  /**
   * Three different resources help you manage your IAM policy for Cloud Run Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudrun.IamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.cloudrun.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.cloudrun.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudrun.IamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.cloudrun.IamPolicy` **cannot** be used in conjunction with `gcp.cloudrun.IamBinding` and `gcp.cloudrun.IamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudrun.IamBinding` resources **can be** used in conjunction with `gcp.cloudrun.IamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudrun.IamPolicy
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
   *  import com.pulumi.gcp.cloudrun.IamPolicy;
   *  import com.pulumi.gcp.cloudrun.IamPolicyArgs;
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
   *          var policy = new IamPolicy("policy", IamPolicyArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudrun.IamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudrun.IamBinding;
   *  import com.pulumi.gcp.cloudrun.IamBindingArgs;
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
   *          var binding = new IamBinding("binding", IamBindingArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudrun.IamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudrun.IamMember;
   *  import com.pulumi.gcp.cloudrun.IamMemberArgs;
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
   *          var member = new IamMember("member", IamMemberArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
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
   *  # IAM policy for Cloud Run Service
   * 
   *  Three different resources help you manage your IAM policy for Cloud Run Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudrun.IamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.cloudrun.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.cloudrun.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudrun.IamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.cloudrun.IamPolicy` **cannot** be used in conjunction with `gcp.cloudrun.IamBinding` and `gcp.cloudrun.IamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudrun.IamBinding` resources **can be** used in conjunction with `gcp.cloudrun.IamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudrun.IamPolicy
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
   *  import com.pulumi.gcp.cloudrun.IamPolicy;
   *  import com.pulumi.gcp.cloudrun.IamPolicyArgs;
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
   *          var policy = new IamPolicy("policy", IamPolicyArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudrun.IamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudrun.IamBinding;
   *  import com.pulumi.gcp.cloudrun.IamBindingArgs;
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
   *          var binding = new IamBinding("binding", IamBindingArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudrun.IamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudrun.IamMember;
   *  import com.pulumi.gcp.cloudrun.IamMemberArgs;
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
   *          var member = new IamMember("member", IamMemberArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
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
   *  * projects/{{project}}/locations/{{location}}/services/{{service}}
   *  * {{project}}/{{location}}/{{service}}
   *  * {{location}}/{{service}}
   *  * {{service}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Run service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_cloud_run_service_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_cloud_run_service_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:cloudrun/iamPolicy:IamPolicy editor projects/{{project}}/locations/{{location}}/services/{{service}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrun.IamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudrun.IamPolicyArgs.builder
    com.pulumi.gcp.cloudrun.IamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudrun.DomainMappingArgs.Builder)
    /**
     * @param metadata Metadata associated with this DomainMapping.
     *  Structure is documented below.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.DomainMappingMetadataArgs.Builder]):
        com.pulumi.gcp.cloudrun.DomainMappingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.DomainMappingMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

    /**
     * @param spec The spec for this DomainMapping.
     *  Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.DomainMappingSpecArgs.Builder]):
        com.pulumi.gcp.cloudrun.DomainMappingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.DomainMappingSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrun.IamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.IamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudrun.IamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.IamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Run Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudrun.IamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.cloudrun.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.cloudrun.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudrun.IamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.cloudrun.IamPolicy` **cannot** be used in conjunction with `gcp.cloudrun.IamBinding` and `gcp.cloudrun.IamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudrun.IamBinding` resources **can be** used in conjunction with `gcp.cloudrun.IamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudrun.IamPolicy
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
   *  import com.pulumi.gcp.cloudrun.IamPolicy;
   *  import com.pulumi.gcp.cloudrun.IamPolicyArgs;
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
   *          var policy = new IamPolicy("policy", IamPolicyArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudrun.IamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudrun.IamBinding;
   *  import com.pulumi.gcp.cloudrun.IamBindingArgs;
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
   *          var binding = new IamBinding("binding", IamBindingArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudrun.IamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudrun.IamMember;
   *  import com.pulumi.gcp.cloudrun.IamMemberArgs;
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
   *          var member = new IamMember("member", IamMemberArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
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
   *  # IAM policy for Cloud Run Service
   * 
   *  Three different resources help you manage your IAM policy for Cloud Run Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudrun.IamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.cloudrun.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.cloudrun.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudrun.IamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.cloudrun.IamPolicy` **cannot** be used in conjunction with `gcp.cloudrun.IamBinding` and `gcp.cloudrun.IamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudrun.IamBinding` resources **can be** used in conjunction with `gcp.cloudrun.IamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudrun.IamPolicy
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
   *  import com.pulumi.gcp.cloudrun.IamPolicy;
   *  import com.pulumi.gcp.cloudrun.IamPolicyArgs;
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
   *          var policy = new IamPolicy("policy", IamPolicyArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudrun.IamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudrun.IamBinding;
   *  import com.pulumi.gcp.cloudrun.IamBindingArgs;
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
   *          var binding = new IamBinding("binding", IamBindingArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudrun.IamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudrun.IamMember;
   *  import com.pulumi.gcp.cloudrun.IamMemberArgs;
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
   *          var member = new IamMember("member", IamMemberArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
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
   *  * projects/{{project}}/locations/{{location}}/services/{{service}}
   *  * {{project}}/{{location}}/{{service}}
   *  * {{location}}/{{service}}
   *  * {{service}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Run service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_cloud_run_service_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_cloud_run_service_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:cloudrun/iamMember:IamMember editor projects/{{project}}/locations/{{location}}/services/{{service}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrun.IamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudrun.IamMemberArgs.builder
    com.pulumi.gcp.cloudrun.IamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Run Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudrun.IamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.cloudrun.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.cloudrun.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudrun.IamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.cloudrun.IamPolicy` **cannot** be used in conjunction with `gcp.cloudrun.IamBinding` and `gcp.cloudrun.IamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudrun.IamBinding` resources **can be** used in conjunction with `gcp.cloudrun.IamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudrun.IamPolicy
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
   *  import com.pulumi.gcp.cloudrun.IamPolicy;
   *  import com.pulumi.gcp.cloudrun.IamPolicyArgs;
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
   *          var policy = new IamPolicy("policy", IamPolicyArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudrun.IamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudrun.IamBinding;
   *  import com.pulumi.gcp.cloudrun.IamBindingArgs;
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
   *          var binding = new IamBinding("binding", IamBindingArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudrun.IamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudrun.IamMember;
   *  import com.pulumi.gcp.cloudrun.IamMemberArgs;
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
   *          var member = new IamMember("member", IamMemberArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
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
   *  # IAM policy for Cloud Run Service
   * 
   *  Three different resources help you manage your IAM policy for Cloud Run Service. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudrun.IamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   *  * `gcp.cloudrun.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved.
   *  * `gcp.cloudrun.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudrun.IamPolicy`: Retrieves the IAM policy for the service
   * 
   *  &gt; **Note:** `gcp.cloudrun.IamPolicy` **cannot** be used in conjunction with `gcp.cloudrun.IamBinding` and `gcp.cloudrun.IamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudrun.IamBinding` resources **can be** used in conjunction with `gcp.cloudrun.IamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudrun.IamPolicy
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
   *  import com.pulumi.gcp.cloudrun.IamPolicy;
   *  import com.pulumi.gcp.cloudrun.IamPolicyArgs;
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
   *          var policy = new IamPolicy("policy", IamPolicyArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudrun.IamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudrun.IamBinding;
   *  import com.pulumi.gcp.cloudrun.IamBindingArgs;
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
   *          var binding = new IamBinding("binding", IamBindingArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudrun.IamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudrun.IamMember;
   *  import com.pulumi.gcp.cloudrun.IamMemberArgs;
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
   *          var member = new IamMember("member", IamMemberArgs.builder()
   *              .location(default_.location())
   *              .project(default_.project())
   *              .service(default_.name())
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
   *  * projects/{{project}}/locations/{{location}}/services/{{service}}
   *  * {{project}}/{{location}}/{{service}}
   *  * {{location}}/{{service}}
   *  * {{service}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Run service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_cloud_run_service_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_cloud_run_service_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:cloudrun/iamBinding:IamBinding editor projects/{{project}}/locations/{{location}}/services/{{service}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrun.IamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudrun.IamBindingArgs.builder
    com.pulumi.gcp.cloudrun.IamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Cloud Run service has a unique endpoint and autoscales containers.
   * 
   *  To get more information about Service, see:
   * 
   *  * [API documentation](https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/run/docs/)
   * 
   *  &gt; **Warning:** We recommend using the `gcp.cloudrunv2.Service` resource which offers a better
   *  developer experience and broader support of Cloud Run features.
   */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrun.ServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudrun.ServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudrun.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource to hold the state and status of a user&#39;s domain mapping.
   * 
   *  To get more information about DomainMapping, see:
   * 
   *  * [API documentation](https://cloud.google.com/run/docs/reference/rest/v1/projects.locations.domainmappings)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/run/docs/mapping-custom-domains)
   */
  def DomainMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrun.DomainMappingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudrun.DomainMappingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudrun.DomainMapping(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.DomainMappingState.Builder)
    /**
     * @param metadata Metadata associated with this DomainMapping.
     *  Structure is documented below.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.DomainMappingMetadataArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.DomainMappingState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.DomainMappingMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

    /**
     * @param spec The spec for this DomainMapping.
     *  Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.DomainMappingSpecArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.DomainMappingState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.DomainMappingSpecArgs.builder
      builder.spec(args(argsBuilder).build)

    /**
     * @param statuses (Output)
     *  Status of the condition, one of True, False, Unknown.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.DomainMappingStatusArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.DomainMappingState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.DomainMappingStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.IamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.IamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.IamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.IamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromSecretRefArgs.Builder)
    /**
     * @param localObjectReference The Secret to select from.
     *  Structure is documented below.
     * @return builder
     */
    def localObjectReference(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromSecretRefArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs.builder
      builder.localObjectReference(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerReadinessProbeArgs.Builder)
    /**
     * @param grpc GRPC specifies an action involving a GRPC port.
     *  Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerReadinessProbeGrpcArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerReadinessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerReadinessProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet HttpGet specifies the http request to perform.
     *  Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerReadinessProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerReadinessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerReadinessProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.DomainMappingStatusArgs.Builder)
    /**
     * @param conditions (Output)
     *  Array of observed DomainMappingConditions, indicating the current state
     *  of the DomainMapping.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.DomainMappingStatusConditionArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.DomainMappingStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.DomainMappingStatusConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceRecords The resource records required to configure this domain mapping. These
     *  records must be added to the domain&#39;s DNS configuration in order to
     *  serve the application via this domain mapping.
     *  Structure is documented below.
     * @return builder
     */
    def resourceRecords(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.DomainMappingStatusResourceRecordArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.DomainMappingStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.DomainMappingStatusResourceRecordArgs.builder
      builder.resourceRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecArgs.Builder)
    /**
     * @param containers Containers defines the unit of execution for this Revision.
     *  Structure is documented below.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param volumes Volume represents a named volume in a container.
     *  Structure is documented below.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerLivenessProbeArgs.Builder)
    /**
     * @param grpc GRPC specifies an action involving a GRPC port.
     *  Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerLivenessProbeGrpcArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerLivenessProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet HttpGet specifies the http request to perform.
     *  Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerLivenessProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerLivenessProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromConfigMapRefArgs.Builder)
    /**
     * @param localObjectReference The ConfigMap to select from.
     *  Structure is documented below.
     * @return builder
     */
    def localObjectReference(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromConfigMapRefArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReferenceArgs.builder
      builder.localObjectReference(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvArgs.Builder)
    /**
     * @param valueFrom Source for the environment variable&#39;s value. Only supports secret_key_ref.
     *  Structure is documented below.
     * @return builder
     */
    def valueFrom(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvValueFromArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvValueFromArgs.builder
      builder.valueFrom(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.IamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.IamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.IamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.IamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerArgs.Builder)
    /**
     * @param envFroms (Optional, Deprecated)
     *  List of sources to populate environment variables in the container.
     *  All invalid keys will be reported as an event when the container is starting.
     *  When a key exists in multiple sources, the value associated with the last source will
     *  take precedence. Values defined by an Env with a duplicate key will take
     *  precedence.
     *  Structure is documented below.
     * 
     *  &gt; **Warning:** `envFrom` is deprecated and will be removed in a future major release. This field is not supported by the Cloud Run API.
     * @return builder
     * @deprecated `envFrom` is deprecated and will be removed in a future major release. This field is not supported by the Cloud Run API.
     */
    @deprecated def envFroms(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromArgs.builder
      builder.envFroms(args.map(_(argsBuilder).build)*)

    /**
     * @param envs List of environment variables to set in the container.
     *  Structure is documented below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param livenessProbe Periodic probe of container liveness. Container will be restarted if the probe fails. More info:
     *  https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     *  Structure is documented below.
     * @return builder
     */
    def livenessProbe(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerLivenessProbeArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerLivenessProbeArgs.builder
      builder.livenessProbe(args(argsBuilder).build)

    /**
     * @param ports List of open ports in the container.
     *  Structure is documented below.
     * @return builder
     */
    def ports(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerPortArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerPortArgs.builder
      builder.ports(args.map(_(argsBuilder).build)*)

    /**
     * @param readinessProbe Periodic probe of container readiness.
     *  Structure is documented below.
     * @return builder
     */
    def readinessProbe(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerReadinessProbeArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerReadinessProbeArgs.builder
      builder.readinessProbe(args(argsBuilder).build)

    /**
     * @param resources Compute Resources required by this container. Used to set values such as max memory
     *  Structure is documented below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerResourcesArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerResourcesArgs.builder
      builder.resources(args(argsBuilder).build)

    /**
     * @param startupProbe Startup probe of application within the container.
     *  All other probes are disabled if a startup probe is provided, until it
     *  succeeds. Container will not be added to service endpoints if the probe fails.
     *  Structure is documented below.
     * @return builder
     */
    def startupProbe(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeArgs.builder
      builder.startupProbe(args(argsBuilder).build)

    /**
     * @param volumeMounts Volume to mount into the container&#39;s filesystem.
     *  Only supports SecretVolumeSources.
     *  Structure is documented below.
     * @return builder
     */
    def volumeMounts(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerVolumeMountArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerVolumeMountArgs.builder
      builder.volumeMounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerLivenessProbeHttpGetArgs.Builder)
    /**
     * @param httpHeaders Custom headers to set in the request. HTTP allows repeated headers.
     *  Structure is documented below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerLivenessProbeHttpGetHttpHeaderArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerLivenessProbeHttpGetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerLivenessProbeHttpGetHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateArgs.Builder)
    /**
     * @param metadata Optional metadata for this Revision, including labels and annotations.
     *  Name will be generated by the Configuration. To set minimum instances
     *  for this revision, use the &#34;autoscaling.knative.dev/minScale&#34; annotation
     *  key. To set maximum instances for this revision, use the
     *  &#34;autoscaling.knative.dev/maxScale&#34; annotation key. To set Cloud SQL
     *  connections for the revision, use the &#34;run.googleapis.com/cloudsql-instances&#34;
     *  annotation key.
     *  Structure is documented below.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateMetadataArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

    /**
     * @param spec RevisionSpec holds the desired state of the Revision (from the client).
     *  Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceState.Builder)
    /**
     * @param metadata Metadata associated with this Service, including name, namespace, labels,
     *  and annotations.
     *  Structure is documented below.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceMetadataArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

    /**
     * @param statuses (Output)
     *  Status of the condition, one of True, False, Unknown.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceStatusArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

    /**
     * @param template template holds the latest specification for the Revision to
     *  be stamped out. The template references the container image, and may also
     *  include labels and annotations that should be attached to the Revision.
     *  To correlate a Revision, and/or to force a Revision to be created when the
     *  spec doesn&#39;t otherwise change, a nonce label may be provided in the
     *  template metadata. For more details, see:
     *  https://github.com/knative/serving/blob/main/docs/client-conventions.md#associate-modifications-with-revisions
     *  Cloud Run does not currently support referencing a build that is
     *  responsible for materializing the container image from source.
     *  Structure is documented below.
     * @return builder
     */
    def template(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateArgs.builder
      builder.template(args(argsBuilder).build)

    /**
     * @param traffics Traffic specifies how to distribute traffic over a collection of Knative Revisions
     *  and Configurations
     *  Structure is documented below.
     * @return builder
     */
    def traffics(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTrafficArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.ServiceState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTrafficArgs.builder
      builder.traffics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeHttpGetArgs.Builder)
    /**
     * @param httpHeaders Custom headers to set in the request. HTTP allows repeated headers.
     *  Structure is documented below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeHttpGetHttpHeaderArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeHttpGetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeHttpGetHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvValueFromArgs.Builder)
    /**
     * @param secretKeyRef Selects a key (version) of a secret in Secret Manager.
     *  Structure is documented below.
     * @return builder
     */
    def secretKeyRef(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvValueFromArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs.builder
      builder.secretKeyRef(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeArgs.Builder)
    /**
     * @param csi A filesystem specified by the Container Storage Interface (CSI).
     *  Structure is documented below.
     * @return builder
     */
    def csi(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeCsiArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeCsiArgs.builder
      builder.csi(args(argsBuilder).build)

    /**
     * @param emptyDir Ephemeral storage which can be backed by real disks (HD, SSD), network storage or memory (i.e. tmpfs). For now only in memory (tmpfs) is supported. It is ephemeral in the sense that when the sandbox is taken down, the data is destroyed with it (it does not persist across sandbox runs).
     *  Structure is documented below.
     * @return builder
     */
    def emptyDir(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeEmptyDirArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeEmptyDirArgs.builder
      builder.emptyDir(args(argsBuilder).build)

    /**
     * @param nfs A filesystem backed by a Network File System share. This filesystem requires the
     *  run.googleapis.com/execution-environment annotation to be unset or set to &#34;gen2&#34;
     *  Structure is documented below.
     * @return builder
     */
    def nfs(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeNfsArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeNfsArgs.builder
      builder.nfs(args(argsBuilder).build)

    /**
     * @param secret The secret&#39;s value will be presented as the content of a file whose
     *  name is defined in the item path. If no items are defined, the name of
     *  the file is the secret_name.
     *  Structure is documented below.
     * @return builder
     */
    def secret(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeSecretArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeSecretArgs.builder
      builder.secret(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeArgs.Builder)
    /**
     * @param grpc GRPC specifies an action involving a GRPC port.
     *  Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeGrpcArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet HttpGet specifies the http request to perform.
     *  Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

    /**
     * @param tcpSocket TcpSocket specifies an action involving a TCP port.
     *  Structure is documented below.
     * @return builder
     */
    def tcpSocket(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeTcpSocketArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerStartupProbeTcpSocketArgs.builder
      builder.tcpSocket(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeSecretArgs.Builder)
    /**
     * @param items If unspecified, the volume will expose a file whose name is the
     *  secret_name.
     *  If specified, the key will be used as the version to fetch from Cloud
     *  Secret Manager and the path will be the name of the file exposed in the
     *  volume. When items are defined, they must specify a key and a path.
     *  Structure is documented below.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeSecretItemArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeSecretArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeSecretItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromArgs.Builder)
    /**
     * @param configMapRef The ConfigMap to select from.
     *  Structure is documented below.
     * @return builder
     */
    def configMapRef(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromConfigMapRefArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromConfigMapRefArgs.builder
      builder.configMapRef(args(argsBuilder).build)

    /**
     * @param secretRef The Secret to select from.
     *  Structure is documented below.
     * @return builder
     */
    def secretRef(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromSecretRefArgs.Builder]):
        com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromSecretRefArgs.builder
      builder.secretRef(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudrun.inputs.ServiceStatusArgs.Builder)
    /**
     * @param conditions (Output)
     *  Array of observed Service Conditions, indicating the current ready state of the service.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceStatusConditionArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.ServiceStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceStatusConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param traffics Traffic specifies how to distribute traffic over a collection of Knative Revisions
     *  and Configurations
     *  Structure is documented below.
     * @return builder
     */
    def traffics(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.ServiceStatusTrafficArgs.Builder]*):
        com.pulumi.gcp.cloudrun.inputs.ServiceStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudrun.inputs.ServiceStatusTrafficArgs.builder
      builder.traffics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudrun.IamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.IamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudrun.IamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.IamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  type CloudrunFunctions = com.pulumi.gcp.cloudrun.CloudrunFunctions
  object CloudrunFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.cloudrun.CloudrunFunctions.*
  extension (self: CloudrunFunctions.type)
    /**
     * Get Cloud Run locations available for a project.
     * 
     *  To get more information about Cloud Run, see:
     * 
     *  * [API documentation](https://cloud.google.com/run/docs/reference/rest/v1/projects.locations)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/run/docs/)
     */
    def getLocations(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.GetLocationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudrun.outputs.GetLocationsResult] =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.GetLocationsArgs.builder
      com.pulumi.gcp.cloudrun.CloudrunFunctions.getLocations(args(argsBuilder).build)

    /**
     * Get Cloud Run locations available for a project.
     * 
     *  To get more information about Cloud Run, see:
     * 
     *  * [API documentation](https://cloud.google.com/run/docs/reference/rest/v1/projects.locations)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/run/docs/)
     */
    def getLocationsPlain(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.GetLocationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudrun.outputs.GetLocationsResult] =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.GetLocationsPlainArgs.builder
      com.pulumi.gcp.cloudrun.CloudrunFunctions.getLocationsPlain(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Run Service. For more information see
     *  the [official documentation](https://cloud.google.com/run/docs/)
     *  and [API](https://cloud.google.com/run/docs/apis).
     */
    def getService(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.GetServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudrun.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.GetServiceArgs.builder
      com.pulumi.gcp.cloudrun.CloudrunFunctions.getService(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Run Service. For more information see
     *  the [official documentation](https://cloud.google.com/run/docs/)
     *  and [API](https://cloud.google.com/run/docs/apis).
     */
    def getServicePlain(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.GetServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudrun.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.GetServicePlainArgs.builder
      com.pulumi.gcp.cloudrun.CloudrunFunctions.getServicePlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for service */
    def getServiceIamPolicy(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.GetServiceIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudrun.outputs.GetServiceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.GetServiceIamPolicyArgs.builder
      com.pulumi.gcp.cloudrun.CloudrunFunctions.getServiceIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for service */
    def getServiceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.cloudrun.inputs.GetServiceIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudrun.outputs.GetServiceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudrun.inputs.GetServiceIamPolicyPlainArgs.builder
      com.pulumi.gcp.cloudrun.CloudrunFunctions.getServiceIamPolicyPlain(args(argsBuilder).build)
