package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object folder:
  /**
   * Four different resources help you manage your IAM policy for a folder. Each of these resources serves a different use case:
   * 
   *  * `gcp.folder.IAMPolicy`: Authoritative. Sets the IAM policy for the folder and replaces any existing policy already attached.
   *  * `gcp.folder.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the folder are preserved.
   *  * `gcp.folder.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the folder are preserved.
   *  * `gcp.folder.IamAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
   * 
   *  &gt; **Note:** `gcp.folder.IAMPolicy` **cannot** be used in conjunction with `gcp.folder.IAMBinding`, `gcp.folder.IAMMember`, or `gcp.folder.IamAuditConfig` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.folder.IAMBinding` resources **can be** used in conjunction with `gcp.folder.IAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:** The underlying API method `projects.setIamPolicy` has constraints which are documented [here](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy). In addition to these constraints,
   *     IAM Conditions cannot be used with Basic Roles such as Owner. Violating these constraints will result in the API returning a 400 error code so please review these if you encounter errors with this resource.
   * 
   *  ## gcp.folder.IAMPolicy
   * 
   *  !&gt; **Be careful!** You can accidentally lock yourself out of your folder
   *     using this resource. Deleting a `gcp.folder.IAMPolicy` removes access
   *     from anyone without permissions on its parent folder/organization. Proceed with caution.
   *     It&#39;s not recommended to use `gcp.folder.IAMPolicy` with your provider folder
   *     to avoid locking yourself out, and it should generally only be used with folders
   *     fully managed by this provider. If you do use this resource, it is recommended to **import** the policy before
   *     applying the change.
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
   *  import com.pulumi.gcp.folder.IAMPolicy;
   *  import com.pulumi.gcp.folder.IAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var folder = new IAMPolicy("folder", IAMPolicyArgs.builder()
   *              .folder("folders/1234567")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.folder.IAMPolicy;
   *  import com.pulumi.gcp.folder.IAMPolicyArgs;
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
   *                  .role("roles/compute.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var folder = new IAMPolicy("folder", IAMPolicyArgs.builder()
   *              .folder("folders/1234567")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/container.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/firebase.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IamAuditConfig;
   *  import com.pulumi.gcp.folder.IamAuditConfigArgs;
   *  import com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs;
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
   *          var folder = new IamAuditConfig("folder", IamAuditConfigArgs.builder()
   *              .folder("folders/1234567")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("DATA_READ")
   *                      .exemptedMembers("user:joebloggs}{@literal @}{@code example.com")
   *                      .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/container.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/firebase.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IamAuditConfig;
   *  import com.pulumi.gcp.folder.IamAuditConfigArgs;
   *  import com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs;
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
   *          var folder = new IamAuditConfig("folder", IamAuditConfigArgs.builder()
   *              .folder("folders/1234567")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("DATA_READ")
   *                      .exemptedMembers("user:joebloggs}{@literal @}{@code example.com")
   *                      .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `organizations/{{org_id}}/roles/{{role_id}}`.
   * 
   *  &gt; **Conditional IAM Bindings**: If you&#39;re importing a IAM binding with a condition block, make sure
   *   to include the title of condition, e.g. `terraform import google_folder_iam_binding.my_folder &#34;folder roles/{{role_id}} condition-title&#34;`
   */
  def IAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.folder.IAMPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.folder.IAMPolicyArgs.builder
    com.pulumi.gcp.folder.IAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.folder.OrganizationPolicyArgs.Builder)
    /**
     * @param booleanPolicy A boolean policy is a constraint that is either enforced or not. Structure is documented below.
     * @return builder
     */
    def booleanPolicy(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyBooleanPolicyArgs.Builder]):
        com.pulumi.gcp.folder.OrganizationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyBooleanPolicyArgs.builder
      builder.booleanPolicy(args(argsBuilder).build)

    /**
     * @param listPolicy A policy that can define specific values that are allowed or denied for the given constraint. It
     *  can also be used to allow or deny all values. Structure is documented below.
     * @return builder
     */
    def listPolicy(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs.Builder]):
        com.pulumi.gcp.folder.OrganizationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs.builder
      builder.listPolicy(args(argsBuilder).build)

    /**
     * @param restorePolicy A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     *  &gt; **Note:** If none of [`booleanPolicy`, `listPolicy`, `restorePolicy`] are defined the policy for a given constraint will
     *  effectively be unset. This is represented in the UI as the constraint being &#39;Inherited&#39;.
     * 
     *  ***
     * @return builder
     */
    def restorePolicy(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyRestorePolicyArgs.Builder]):
        com.pulumi.gcp.folder.OrganizationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyRestorePolicyArgs.builder
      builder.restorePolicy(args(argsBuilder).build)

  /**
   * Four different resources help you manage your IAM policy for a folder. Each of these resources serves a different use case:
   * 
   *  * `gcp.folder.IAMPolicy`: Authoritative. Sets the IAM policy for the folder and replaces any existing policy already attached.
   *  * `gcp.folder.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the folder are preserved.
   *  * `gcp.folder.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the folder are preserved.
   *  * `gcp.folder.IamAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
   * 
   *  &gt; **Note:** `gcp.folder.IAMPolicy` **cannot** be used in conjunction with `gcp.folder.IAMBinding`, `gcp.folder.IAMMember`, or `gcp.folder.IamAuditConfig` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.folder.IAMBinding` resources **can be** used in conjunction with `gcp.folder.IAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:** The underlying API method `projects.setIamPolicy` has constraints which are documented [here](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy). In addition to these constraints,
   *     IAM Conditions cannot be used with Basic Roles such as Owner. Violating these constraints will result in the API returning a 400 error code so please review these if you encounter errors with this resource.
   * 
   *  ## gcp.folder.IAMPolicy
   * 
   *  !&gt; **Be careful!** You can accidentally lock yourself out of your folder
   *     using this resource. Deleting a `gcp.folder.IAMPolicy` removes access
   *     from anyone without permissions on its parent folder/organization. Proceed with caution.
   *     It&#39;s not recommended to use `gcp.folder.IAMPolicy` with your provider folder
   *     to avoid locking yourself out, and it should generally only be used with folders
   *     fully managed by this provider. If you do use this resource, it is recommended to **import** the policy before
   *     applying the change.
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
   *  import com.pulumi.gcp.folder.IAMPolicy;
   *  import com.pulumi.gcp.folder.IAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var folder = new IAMPolicy("folder", IAMPolicyArgs.builder()
   *              .folder("folders/1234567")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.folder.IAMPolicy;
   *  import com.pulumi.gcp.folder.IAMPolicyArgs;
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
   *                  .role("roles/compute.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var folder = new IAMPolicy("folder", IAMPolicyArgs.builder()
   *              .folder("folders/1234567")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/container.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/firebase.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IamAuditConfig;
   *  import com.pulumi.gcp.folder.IamAuditConfigArgs;
   *  import com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs;
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
   *          var folder = new IamAuditConfig("folder", IamAuditConfigArgs.builder()
   *              .folder("folders/1234567")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("DATA_READ")
   *                      .exemptedMembers("user:joebloggs}{@literal @}{@code example.com")
   *                      .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/container.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/firebase.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IamAuditConfig;
   *  import com.pulumi.gcp.folder.IamAuditConfigArgs;
   *  import com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs;
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
   *          var folder = new IamAuditConfig("folder", IamAuditConfigArgs.builder()
   *              .folder("folders/1234567")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("DATA_READ")
   *                      .exemptedMembers("user:joebloggs}{@literal @}{@code example.com")
   *                      .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `organizations/{{org_id}}/roles/{{role_id}}`.
   * 
   *  &gt; **Conditional IAM Bindings**: If you&#39;re importing a IAM binding with a condition block, make sure
   *   to include the title of condition, e.g. `terraform import google_folder_iam_binding.my_folder &#34;folder roles/{{role_id}} condition-title&#34;`
   */
  def IamAuditConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.folder.IamAuditConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.folder.IamAuditConfigArgs.builder
    com.pulumi.gcp.folder.IamAuditConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.folder.IAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.folder.IAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Four different resources help you manage your IAM policy for a folder. Each of these resources serves a different use case:
   * 
   *  * `gcp.folder.IAMPolicy`: Authoritative. Sets the IAM policy for the folder and replaces any existing policy already attached.
   *  * `gcp.folder.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the folder are preserved.
   *  * `gcp.folder.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the folder are preserved.
   *  * `gcp.folder.IamAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
   * 
   *  &gt; **Note:** `gcp.folder.IAMPolicy` **cannot** be used in conjunction with `gcp.folder.IAMBinding`, `gcp.folder.IAMMember`, or `gcp.folder.IamAuditConfig` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.folder.IAMBinding` resources **can be** used in conjunction with `gcp.folder.IAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:** The underlying API method `projects.setIamPolicy` has constraints which are documented [here](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy). In addition to these constraints,
   *     IAM Conditions cannot be used with Basic Roles such as Owner. Violating these constraints will result in the API returning a 400 error code so please review these if you encounter errors with this resource.
   * 
   *  ## gcp.folder.IAMPolicy
   * 
   *  !&gt; **Be careful!** You can accidentally lock yourself out of your folder
   *     using this resource. Deleting a `gcp.folder.IAMPolicy` removes access
   *     from anyone without permissions on its parent folder/organization. Proceed with caution.
   *     It&#39;s not recommended to use `gcp.folder.IAMPolicy` with your provider folder
   *     to avoid locking yourself out, and it should generally only be used with folders
   *     fully managed by this provider. If you do use this resource, it is recommended to **import** the policy before
   *     applying the change.
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
   *  import com.pulumi.gcp.folder.IAMPolicy;
   *  import com.pulumi.gcp.folder.IAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var folder = new IAMPolicy("folder", IAMPolicyArgs.builder()
   *              .folder("folders/1234567")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.folder.IAMPolicy;
   *  import com.pulumi.gcp.folder.IAMPolicyArgs;
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
   *                  .role("roles/compute.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var folder = new IAMPolicy("folder", IAMPolicyArgs.builder()
   *              .folder("folders/1234567")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/container.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/firebase.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IamAuditConfig;
   *  import com.pulumi.gcp.folder.IamAuditConfigArgs;
   *  import com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs;
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
   *          var folder = new IamAuditConfig("folder", IamAuditConfigArgs.builder()
   *              .folder("folders/1234567")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("DATA_READ")
   *                      .exemptedMembers("user:joebloggs}{@literal @}{@code example.com")
   *                      .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/container.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/firebase.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IamAuditConfig;
   *  import com.pulumi.gcp.folder.IamAuditConfigArgs;
   *  import com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs;
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
   *          var folder = new IamAuditConfig("folder", IamAuditConfigArgs.builder()
   *              .folder("folders/1234567")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("DATA_READ")
   *                      .exemptedMembers("user:joebloggs}{@literal @}{@code example.com")
   *                      .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `organizations/{{org_id}}/roles/{{role_id}}`.
   * 
   *  &gt; **Conditional IAM Bindings**: If you&#39;re importing a IAM binding with a condition block, make sure
   *   to include the title of condition, e.g. `terraform import google_folder_iam_binding.my_folder &#34;folder roles/{{role_id}} condition-title&#34;`
   */
  def IAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.folder.IAMMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.folder.IAMMemberArgs.builder
    com.pulumi.gcp.folder.IAMMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Four different resources help you manage your IAM policy for a folder. Each of these resources serves a different use case:
   * 
   *  * `gcp.folder.IAMPolicy`: Authoritative. Sets the IAM policy for the folder and replaces any existing policy already attached.
   *  * `gcp.folder.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the folder are preserved.
   *  * `gcp.folder.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the folder are preserved.
   *  * `gcp.folder.IamAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
   * 
   *  &gt; **Note:** `gcp.folder.IAMPolicy` **cannot** be used in conjunction with `gcp.folder.IAMBinding`, `gcp.folder.IAMMember`, or `gcp.folder.IamAuditConfig` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.folder.IAMBinding` resources **can be** used in conjunction with `gcp.folder.IAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:** The underlying API method `projects.setIamPolicy` has constraints which are documented [here](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy). In addition to these constraints,
   *     IAM Conditions cannot be used with Basic Roles such as Owner. Violating these constraints will result in the API returning a 400 error code so please review these if you encounter errors with this resource.
   * 
   *  ## gcp.folder.IAMPolicy
   * 
   *  !&gt; **Be careful!** You can accidentally lock yourself out of your folder
   *     using this resource. Deleting a `gcp.folder.IAMPolicy` removes access
   *     from anyone without permissions on its parent folder/organization. Proceed with caution.
   *     It&#39;s not recommended to use `gcp.folder.IAMPolicy` with your provider folder
   *     to avoid locking yourself out, and it should generally only be used with folders
   *     fully managed by this provider. If you do use this resource, it is recommended to **import** the policy before
   *     applying the change.
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
   *  import com.pulumi.gcp.folder.IAMPolicy;
   *  import com.pulumi.gcp.folder.IAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var folder = new IAMPolicy("folder", IAMPolicyArgs.builder()
   *              .folder("folders/1234567")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.folder.IAMPolicy;
   *  import com.pulumi.gcp.folder.IAMPolicyArgs;
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
   *                  .role("roles/compute.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var folder = new IAMPolicy("folder", IAMPolicyArgs.builder()
   *              .folder("folders/1234567")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/container.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/firebase.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IamAuditConfig;
   *  import com.pulumi.gcp.folder.IamAuditConfigArgs;
   *  import com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs;
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
   *          var folder = new IamAuditConfig("folder", IamAuditConfigArgs.builder()
   *              .folder("folders/1234567")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("DATA_READ")
   *                      .exemptedMembers("user:joebloggs}{@literal @}{@code example.com")
   *                      .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMBinding;
   *  import com.pulumi.gcp.folder.IAMBindingArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs;
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
   *          var folder = new IAMBinding("folder", IAMBindingArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/container.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IAMMember;
   *  import com.pulumi.gcp.folder.IAMMemberArgs;
   *  import com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs;
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
   *          var folder = new IAMMember("folder", IAMMemberArgs.builder()
   *              .folder("folders/1234567")
   *              .role("roles/firebase.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(IAMMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.folder.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.folder.IamAuditConfig;
   *  import com.pulumi.gcp.folder.IamAuditConfigArgs;
   *  import com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs;
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
   *          var folder = new IamAuditConfig("folder", IamAuditConfigArgs.builder()
   *              .folder("folders/1234567")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IamAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("DATA_READ")
   *                      .exemptedMembers("user:joebloggs}{@literal @}{@code example.com")
   *                      .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `organizations/{{org_id}}/roles/{{role_id}}`.
   * 
   *  &gt; **Conditional IAM Bindings**: If you&#39;re importing a IAM binding with a condition block, make sure
   *   to include the title of condition, e.g. `terraform import google_folder_iam_binding.my_folder &#34;folder roles/{{role_id}} condition-title&#34;`
   */
  def IAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.folder.IAMBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.folder.IAMBindingArgs.builder
    com.pulumi.gcp.folder.IAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.folder.AccessApprovalSettingsArgs.Builder)
    /**
     * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     *  Access requests for the resource given by name against any of these services contained here will be required
     *  to have explicit approval. Enrollment can only be done on an all or nothing basis.
     *  A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     *  Structure is documented below.
     * @return builder
     */
    def enrolledServices(args: Endofunction[com.pulumi.gcp.folder.inputs.AccessApprovalSettingsEnrolledServiceArgs.Builder]*):
        com.pulumi.gcp.folder.AccessApprovalSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.folder.inputs.AccessApprovalSettingsEnrolledServiceArgs.builder
      builder.enrolledServices(args.map(_(argsBuilder).build)*)

  /**
   * Access Approval enables you to require your explicit approval whenever Google support and engineering need to access your customer content.
   * 
   *  To get more information about FolderSettings, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-approval/docs/reference/rest/v1/folders)
   */
  def AccessApprovalSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.folder.AccessApprovalSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.folder.AccessApprovalSettingsArgs.builder
    com.pulumi.gcp.folder.AccessApprovalSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Allows management of Organization Policies for a Google Cloud Folder.
   * 
   *  &gt; **Warning:** This resource has been superseded by `gcp.orgpolicy.Policy`. `gcp.orgpolicy.Policy` uses Organization Policy API V2 instead of Cloud Resource Manager API V1 and it supports additional features such as tags and conditions.
   * 
   *  To get more information about Organization Policies, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/resource-manager/reference/rest/v1/folders/setOrgPolicy)
   *  * How-to Guides
   *      * [Introduction to the Organization Policy Service](https://docs.cloud.google.com/resource-manager/docs/organization-policy/overview)
   */
  def OrganizationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.folder.OrganizationPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.folder.OrganizationPolicyArgs.builder
    com.pulumi.gcp.folder.OrganizationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.folder.IamAuditConfigArgs.Builder)
    /**
     * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * @return builder
     */
    def auditLogConfigs(args: Endofunction[com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs.Builder]*):
        com.pulumi.gcp.folder.IamAuditConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  type FolderFunctions = com.pulumi.gcp.folder.FolderFunctions
  object FolderFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.folder.FolderFunctions.*
  extension (self: FolderFunctions.type)
    /**
     * Retrieves the current IAM policy data for a folder.
     * 
     *  ## example
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.folder.FolderFunctions;
     *  import com.pulumi.gcp.folder.inputs.GetIamPolicyArgs;
     *  import java.util.List;
     *  import java.util.ArrayList;
     *  import java.util.Map;
     *  import java.io.File;
     *  import java.nio.file.Files;
     *  import java.nio.file.Paths;
     * 
     *  public class App {
     *      public static void main(String[] args) {
     *          Pulumi.run(App::stack);
     *      }
     * 
     *      public static void stack(Context ctx) {
     *          final var test = FolderFunctions.getIamPolicy(GetIamPolicyArgs.builder()
     *              .folder(permissiontest.name())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getIamPolicy(args: Endofunction[com.pulumi.gcp.folder.inputs.GetIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.folder.outputs.GetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.folder.inputs.GetIamPolicyArgs.builder
      com.pulumi.gcp.folder.FolderFunctions.getIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a folder.
     * 
     *  ## example
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.folder.FolderFunctions;
     *  import com.pulumi.gcp.folder.inputs.GetIamPolicyArgs;
     *  import java.util.List;
     *  import java.util.ArrayList;
     *  import java.util.Map;
     *  import java.io.File;
     *  import java.nio.file.Files;
     *  import java.nio.file.Paths;
     * 
     *  public class App {
     *      public static void main(String[] args) {
     *          Pulumi.run(App::stack);
     *      }
     * 
     *      public static void stack(Context ctx) {
     *          final var test = FolderFunctions.getIamPolicy(GetIamPolicyArgs.builder()
     *              .folder(permissiontest.name())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getIamPolicyPlain(args: Endofunction[com.pulumi.gcp.folder.inputs.GetIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.folder.outputs.GetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.folder.inputs.GetIamPolicyPlainArgs.builder
      com.pulumi.gcp.folder.FolderFunctions.getIamPolicyPlain(args(argsBuilder).build)

    /**
     * Allows management of Organization policies for a Google Folder. For more information see
     *  [the official
     *  documentation](https://docs.cloud.google.com/resource-manager/docs/organization-policy/overview)
     */
    def getOrganizationPolicy(args: Endofunction[com.pulumi.gcp.folder.inputs.GetOrganizationPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.folder.outputs.GetOrganizationPolicyResult] =
      val argsBuilder = com.pulumi.gcp.folder.inputs.GetOrganizationPolicyArgs.builder
      com.pulumi.gcp.folder.FolderFunctions.getOrganizationPolicy(args(argsBuilder).build)

    /**
     * Allows management of Organization policies for a Google Folder. For more information see
     *  [the official
     *  documentation](https://docs.cloud.google.com/resource-manager/docs/organization-policy/overview)
     */
    def getOrganizationPolicyPlain(args: Endofunction[com.pulumi.gcp.folder.inputs.GetOrganizationPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.folder.outputs.GetOrganizationPolicyResult] =
      val argsBuilder = com.pulumi.gcp.folder.inputs.GetOrganizationPolicyPlainArgs.builder
      com.pulumi.gcp.folder.FolderFunctions.getOrganizationPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.folder.inputs.OrganizationPolicyState.Builder)
    /**
     * @param booleanPolicy A boolean policy is a constraint that is either enforced or not. Structure is documented below.
     * @return builder
     */
    def booleanPolicy(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyBooleanPolicyArgs.Builder]):
        com.pulumi.gcp.folder.inputs.OrganizationPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyBooleanPolicyArgs.builder
      builder.booleanPolicy(args(argsBuilder).build)

    /**
     * @param listPolicy A policy that can define specific values that are allowed or denied for the given constraint. It
     *  can also be used to allow or deny all values. Structure is documented below.
     * @return builder
     */
    def listPolicy(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs.Builder]):
        com.pulumi.gcp.folder.inputs.OrganizationPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs.builder
      builder.listPolicy(args(argsBuilder).build)

    /**
     * @param restorePolicy A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     *  &gt; **Note:** If none of [`booleanPolicy`, `listPolicy`, `restorePolicy`] are defined the policy for a given constraint will
     *  effectively be unset. This is represented in the UI as the constraint being &#39;Inherited&#39;.
     * 
     *  ***
     * @return builder
     */
    def restorePolicy(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyRestorePolicyArgs.Builder]):
        com.pulumi.gcp.folder.inputs.OrganizationPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyRestorePolicyArgs.builder
      builder.restorePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.folder.inputs.IamAuditConfigState.Builder)
    /**
     * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * @return builder
     */
    def auditLogConfigs(args: Endofunction[com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs.Builder]*):
        com.pulumi.gcp.folder.inputs.IamAuditConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.folder.inputs.IAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.folder.inputs.IAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.folder.inputs.IAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.folder.inputs.IAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.folder.inputs.AccessApprovalSettingsState.Builder)
    /**
     * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     *  Access requests for the resource given by name against any of these services contained here will be required
     *  to have explicit approval. Enrollment can only be done on an all or nothing basis.
     *  A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     *  Structure is documented below.
     * @return builder
     */
    def enrolledServices(args: Endofunction[com.pulumi.gcp.folder.inputs.AccessApprovalSettingsEnrolledServiceArgs.Builder]*):
        com.pulumi.gcp.folder.inputs.AccessApprovalSettingsState.Builder =
      def argsBuilder = com.pulumi.gcp.folder.inputs.AccessApprovalSettingsEnrolledServiceArgs.builder
      builder.enrolledServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs.Builder)
    /**
     * @param allow or `deny` - (Optional) One or the other must be set.
     * @return builder
     */
    def allow(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyAllowArgs.Builder]):
        com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param deny One or the other must be set.
     * @return builder
     */
    def deny(args: Endofunction[com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyDenyArgs.Builder]):
        com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyDenyArgs.builder
      builder.deny(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.folder.IAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.folder.IAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.folder.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Generate folder service identity for a service.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  &gt; **Note:** Once created, this resource cannot be updated or destroyed. These
   *  actions are a no-op.
   * 
   *  &gt; **Note:** This resource can be used to retrieve the emails of the [Google-managed folder service accounts](https://cloud.google.com/iam/docs/service-agents)
   *  of the APIs that Google has configured with a Service Identity. You can run `gcloud beta services identity create --service SERVICE_NAME.googleapis.com --folder FOLDER` to
   *  verify if an API supports this.
   * 
   *  To get more information about Service Identity, see:
   * 
   *  * [API documentation](https://cloud.google.com/service-usage/docs/reference/rest/v1beta1/services/generateServiceIdentity)
   */
  def ServiceIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.folder.ServiceIdentityArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.folder.ServiceIdentityArgs.builder
    com.pulumi.gcp.folder.ServiceIdentity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
