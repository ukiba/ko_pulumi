package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object projects:
  /**
   * Ensures that a member:role pairing does not exist in a project&#39;s IAM policy.
   * 
   *  On create, this resource will modify the policy to remove the `member` from the
   *  `role`. If the membership is ever re-added, the next refresh will clear this
   *  resource from state, proposing re-adding it to correct the membership. Import is
   *  not supported- this resource will acquire the current policy and modify it as
   *  part of creating the resource.
   * 
   *  This resource will conflict with `gcp.projects.IAMPolicy` and
   *  `gcp.projects.IAMBinding` resources that share a role, as well as
   *  `gcp.projects.IAMMember` resources that target the same membership. When
   *  multiple resources conflict the final state is not guaranteed to include or omit
   *  the membership. Subsequent `pulumi up` calls will always show a diff
   *  until the configuration is corrected.
   * 
   *  For more information see
   *  [the official documentation](https://cloud.google.com/iam/docs/granting-changing-revoking-access)
   *  and
   *  [API reference](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy).
   */
  def IamMemberRemove(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.projects.IamMemberRemoveArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.projects.IamMemberRemoveArgs.builder
    com.pulumi.gcp.projects.IamMemberRemove(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Four different resources help you manage your IAM policy for a project. Each of these resources serves a different use case:
   * 
   *  * `gcp.projects.IAMPolicy`: Authoritative. Sets the IAM policy for the project and replaces any existing policy already attached.
   *  * `gcp.projects.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the project are preserved.
   *  * `gcp.projects.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the project are preserved.
   *  * `gcp.projects.IAMAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
   * 
   *  &gt; **Note:** `gcp.projects.IAMPolicy` **cannot** be used in conjunction with `gcp.projects.IAMBinding`, `gcp.projects.IAMMember`, or `gcp.projects.IAMAuditConfig` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.projects.IAMBinding` resources **can be** used in conjunction with `gcp.projects.IAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:** The underlying API method `projects.setIamPolicy` has a lot of constraints which are documented [here](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy). In addition to these constraints,
   *     IAM Conditions cannot be used with Basic Roles such as Owner. Violating these constraints will result in the API returning 400 error code so please review these if you encounter errors with this resource.
   * 
   *  ## gcp.projects.IAMPolicy
   * 
   *  !&gt; **Be careful!** You can accidentally lock yourself out of your project
   *     using this resource. Deleting a `gcp.projects.IAMPolicy` removes access
   *     from anyone without organization-level access to the project. Proceed with caution.
   *     It&#39;s not recommended to use `gcp.projects.IAMPolicy` with your provider project
   *     to avoid locking yourself out, and it should generally only be used with projects
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.projects.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMAuditConfig;
   *  import com.pulumi.gcp.projects.IAMAuditConfigArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs;
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
   *          var project = new IAMAuditConfig("project", IAMAuditConfigArgs.builder()
   *              .project("your-project-id")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
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
   *  ## gcp.projects.IAMPolicy
   * 
   *  !&gt; **Be careful!** You can accidentally lock yourself out of your project
   *     using this resource. Deleting a `gcp.projects.IAMPolicy` removes access
   *     from anyone without organization-level access to the project. Proceed with caution.
   *     It&#39;s not recommended to use `gcp.projects.IAMPolicy` with your provider project
   *     to avoid locking yourself out, and it should generally only be used with projects
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.projects.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMAuditConfig;
   *  import com.pulumi.gcp.projects.IAMAuditConfigArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs;
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
   *          var project = new IAMAuditConfig("project", IAMAuditConfigArgs.builder()
   *              .project("your-project-id")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
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
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * 
   *  &gt; **Conditional IAM Bindings**: If you&#39;re importing a IAM binding with a condition block, make sure
   *   to include the title of condition, e.g. `terraform import google_project_iam_binding.my_project &#34;{{your-project-id}} roles/{{role_id}} condition-title&#34;`
   */
  def IAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.projects.IAMPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.projects.IAMPolicyArgs.builder
    com.pulumi.gcp.projects.IAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.projects.OrganizationPolicyArgs.Builder)
    /**
     * @param booleanPolicy A boolean policy is a constraint that is either enforced or not. Structure is documented below.
     * @return builder
     */
    def booleanPolicy(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyBooleanPolicyArgs.Builder]):
        com.pulumi.gcp.projects.OrganizationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyBooleanPolicyArgs.builder
      builder.booleanPolicy(args(argsBuilder).build)

    /**
     * @param listPolicy A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * @return builder
     */
    def listPolicy(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyArgs.Builder]):
        com.pulumi.gcp.projects.OrganizationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyArgs.builder
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
    def restorePolicy(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyRestorePolicyArgs.Builder]):
        com.pulumi.gcp.projects.OrganizationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyRestorePolicyArgs.builder
      builder.restorePolicy(args(argsBuilder).build)

  /**
   * Four different resources help you manage your IAM policy for a project. Each of these resources serves a different use case:
   * 
   *  * `gcp.projects.IAMPolicy`: Authoritative. Sets the IAM policy for the project and replaces any existing policy already attached.
   *  * `gcp.projects.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the project are preserved.
   *  * `gcp.projects.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the project are preserved.
   *  * `gcp.projects.IAMAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
   * 
   *  &gt; **Note:** `gcp.projects.IAMPolicy` **cannot** be used in conjunction with `gcp.projects.IAMBinding`, `gcp.projects.IAMMember`, or `gcp.projects.IAMAuditConfig` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.projects.IAMBinding` resources **can be** used in conjunction with `gcp.projects.IAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:** The underlying API method `projects.setIamPolicy` has a lot of constraints which are documented [here](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy). In addition to these constraints,
   *     IAM Conditions cannot be used with Basic Roles such as Owner. Violating these constraints will result in the API returning 400 error code so please review these if you encounter errors with this resource.
   * 
   *  ## gcp.projects.IAMPolicy
   * 
   *  !&gt; **Be careful!** You can accidentally lock yourself out of your project
   *     using this resource. Deleting a `gcp.projects.IAMPolicy` removes access
   *     from anyone without organization-level access to the project. Proceed with caution.
   *     It&#39;s not recommended to use `gcp.projects.IAMPolicy` with your provider project
   *     to avoid locking yourself out, and it should generally only be used with projects
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.projects.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMAuditConfig;
   *  import com.pulumi.gcp.projects.IAMAuditConfigArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs;
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
   *          var project = new IAMAuditConfig("project", IAMAuditConfigArgs.builder()
   *              .project("your-project-id")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
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
   *  ## gcp.projects.IAMPolicy
   * 
   *  !&gt; **Be careful!** You can accidentally lock yourself out of your project
   *     using this resource. Deleting a `gcp.projects.IAMPolicy` removes access
   *     from anyone without organization-level access to the project. Proceed with caution.
   *     It&#39;s not recommended to use `gcp.projects.IAMPolicy` with your provider project
   *     to avoid locking yourself out, and it should generally only be used with projects
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.projects.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMAuditConfig;
   *  import com.pulumi.gcp.projects.IAMAuditConfigArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs;
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
   *          var project = new IAMAuditConfig("project", IAMAuditConfigArgs.builder()
   *              .project("your-project-id")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
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
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * 
   *  &gt; **Conditional IAM Bindings**: If you&#39;re importing a IAM binding with a condition block, make sure
   *   to include the title of condition, e.g. `terraform import google_project_iam_binding.my_project &#34;{{your-project-id}} roles/{{role_id}} condition-title&#34;`
   */
  def IAMAuditConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.projects.IAMAuditConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.projects.IAMAuditConfigArgs.builder
    com.pulumi.gcp.projects.IAMAuditConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.projects.IAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.projects.IAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Allows management of a customized Cloud IAM project role. For more information see
   *  [the official documentation](https://cloud.google.com/iam/docs/understanding-custom-roles)
   *  and
   *  [API](https://cloud.google.com/iam/reference/rest/v1/projects.roles).
   * 
   *  &gt; **Warning:** Note that custom roles in GCP have the concept of a soft-delete. There are two issues that may arise
   *   from this and how roles are propagated. 1) creating a role may involve undeleting and then updating a role with the
   *   same name, possibly causing confusing behavior between undelete and update. 2) A deleted role is permanently deleted
   *   after 7 days, but it can take up to 30 more days (i.e. between 7 and 37 days after deletion) before the role name is
   *   made available again. This means a deleted role that has been deleted for more than 7 days cannot be changed at all
   *   by the provider, and new roles cannot share that name.
   */
  def IAMCustomRole(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.projects.IAMCustomRoleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.projects.IAMCustomRoleArgs.builder
    com.pulumi.gcp.projects.IAMCustomRole(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Four different resources help you manage your IAM policy for a project. Each of these resources serves a different use case:
   * 
   *  * `gcp.projects.IAMPolicy`: Authoritative. Sets the IAM policy for the project and replaces any existing policy already attached.
   *  * `gcp.projects.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the project are preserved.
   *  * `gcp.projects.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the project are preserved.
   *  * `gcp.projects.IAMAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
   * 
   *  &gt; **Note:** `gcp.projects.IAMPolicy` **cannot** be used in conjunction with `gcp.projects.IAMBinding`, `gcp.projects.IAMMember`, or `gcp.projects.IAMAuditConfig` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.projects.IAMBinding` resources **can be** used in conjunction with `gcp.projects.IAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:** The underlying API method `projects.setIamPolicy` has a lot of constraints which are documented [here](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy). In addition to these constraints,
   *     IAM Conditions cannot be used with Basic Roles such as Owner. Violating these constraints will result in the API returning 400 error code so please review these if you encounter errors with this resource.
   * 
   *  ## gcp.projects.IAMPolicy
   * 
   *  !&gt; **Be careful!** You can accidentally lock yourself out of your project
   *     using this resource. Deleting a `gcp.projects.IAMPolicy` removes access
   *     from anyone without organization-level access to the project. Proceed with caution.
   *     It&#39;s not recommended to use `gcp.projects.IAMPolicy` with your provider project
   *     to avoid locking yourself out, and it should generally only be used with projects
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.projects.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMAuditConfig;
   *  import com.pulumi.gcp.projects.IAMAuditConfigArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs;
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
   *          var project = new IAMAuditConfig("project", IAMAuditConfigArgs.builder()
   *              .project("your-project-id")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
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
   *  ## gcp.projects.IAMPolicy
   * 
   *  !&gt; **Be careful!** You can accidentally lock yourself out of your project
   *     using this resource. Deleting a `gcp.projects.IAMPolicy` removes access
   *     from anyone without organization-level access to the project. Proceed with caution.
   *     It&#39;s not recommended to use `gcp.projects.IAMPolicy` with your provider project
   *     to avoid locking yourself out, and it should generally only be used with projects
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.projects.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMAuditConfig;
   *  import com.pulumi.gcp.projects.IAMAuditConfigArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs;
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
   *          var project = new IAMAuditConfig("project", IAMAuditConfigArgs.builder()
   *              .project("your-project-id")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
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
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * 
   *  &gt; **Conditional IAM Bindings**: If you&#39;re importing a IAM binding with a condition block, make sure
   *   to include the title of condition, e.g. `terraform import google_project_iam_binding.my_project &#34;{{your-project-id}} roles/{{role_id}} condition-title&#34;`
   */
  def IAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.projects.IAMMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.projects.IAMMemberArgs.builder
    com.pulumi.gcp.projects.IAMMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type ProjectsFunctions = com.pulumi.gcp.projects.ProjectsFunctions
  object ProjectsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.projects.ProjectsFunctions.*
  extension (self: ProjectsFunctions.type)
    /**
     * Retrieve the ancestors for a project.
     *  See the [REST API](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects/getAncestry) for more details.
     */
    def getAncestry(args: Endofunction[com.pulumi.gcp.projects.inputs.GetAncestryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.projects.outputs.GetAncestryResult] =
      val argsBuilder = com.pulumi.gcp.projects.inputs.GetAncestryArgs.builder
      com.pulumi.gcp.projects.ProjectsFunctions.getAncestry(args(argsBuilder).build)

    /**
     * Retrieve the ancestors for a project.
     *  See the [REST API](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects/getAncestry) for more details.
     */
    def getAncestryPlain(args: Endofunction[com.pulumi.gcp.projects.inputs.GetAncestryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.projects.outputs.GetAncestryResult] =
      val argsBuilder = com.pulumi.gcp.projects.inputs.GetAncestryPlainArgs.builder
      com.pulumi.gcp.projects.ProjectsFunctions.getAncestryPlain(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Project IAM Custom Role. Note that you must have the `roles/iam.roleViewer` role (or equivalent permissions) at the project level to use this datasource.
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.projects.ProjectsFunctions;
     *  import com.pulumi.gcp.projects.inputs.GetIamCustomRoleArgs;
     *  import com.pulumi.gcp.projects.IAMMember;
     *  import com.pulumi.gcp.projects.IAMMemberArgs;
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
     *          final var example = ProjectsFunctions.getIamCustomRole(GetIamCustomRoleArgs.builder()
     *              .project("your-project-id")
     *              .roleId("your-role-id")
     *              .build());
     * 
     *          var project = new IAMMember("project", IAMMemberArgs.builder()
     *              .project("your-project-id")
     *              .role(example.name())
     *              .member("user:jane}{@literal @}{@code example.com")
     *              .build());
     * 
     *      }}{@code
     *  }}{@code
     *  }
     *  </pre>
     */
    def getIamCustomRole(args: Endofunction[com.pulumi.gcp.projects.inputs.GetIamCustomRoleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.projects.outputs.GetIamCustomRoleResult] =
      val argsBuilder = com.pulumi.gcp.projects.inputs.GetIamCustomRoleArgs.builder
      com.pulumi.gcp.projects.ProjectsFunctions.getIamCustomRole(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Project IAM Custom Role. Note that you must have the `roles/iam.roleViewer` role (or equivalent permissions) at the project level to use this datasource.
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.projects.ProjectsFunctions;
     *  import com.pulumi.gcp.projects.inputs.GetIamCustomRoleArgs;
     *  import com.pulumi.gcp.projects.IAMMember;
     *  import com.pulumi.gcp.projects.IAMMemberArgs;
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
     *          final var example = ProjectsFunctions.getIamCustomRole(GetIamCustomRoleArgs.builder()
     *              .project("your-project-id")
     *              .roleId("your-role-id")
     *              .build());
     * 
     *          var project = new IAMMember("project", IAMMemberArgs.builder()
     *              .project("your-project-id")
     *              .role(example.name())
     *              .member("user:jane}{@literal @}{@code example.com")
     *              .build());
     * 
     *      }}{@code
     *  }}{@code
     *  }
     *  </pre>
     */
    def getIamCustomRolePlain(args: Endofunction[com.pulumi.gcp.projects.inputs.GetIamCustomRolePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.projects.outputs.GetIamCustomRoleResult] =
      val argsBuilder = com.pulumi.gcp.projects.inputs.GetIamCustomRolePlainArgs.builder
      com.pulumi.gcp.projects.ProjectsFunctions.getIamCustomRolePlain(args(argsBuilder).build)

    /**
     * Get information about Google Cloud IAM Custom Roles from a project.
     *  Note that you must have the `roles/iam.roleViewer`.
     *  See [the official documentation](https://cloud.google.com/iam/docs/creating-custom-roles)
     *  and [API](https://cloud.google.com/iam/docs/reference/rest/v1/projects.roles/list).
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.projects.ProjectsFunctions;
     *  import com.pulumi.gcp.projects.inputs.GetIamCustomRolesArgs;
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
     *          final var example = ProjectsFunctions.getIamCustomRoles(GetIamCustomRolesArgs.builder()
     *              .project("your-project-id")
     *              .showDeleted(true)
     *              .view("FULL")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getIamCustomRoles(args: Endofunction[com.pulumi.gcp.projects.inputs.GetIamCustomRolesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.projects.outputs.GetIamCustomRolesResult] =
      val argsBuilder = com.pulumi.gcp.projects.inputs.GetIamCustomRolesArgs.builder
      com.pulumi.gcp.projects.ProjectsFunctions.getIamCustomRoles(args(argsBuilder).build)

    /**
     * Get information about Google Cloud IAM Custom Roles from a project.
     *  Note that you must have the `roles/iam.roleViewer`.
     *  See [the official documentation](https://cloud.google.com/iam/docs/creating-custom-roles)
     *  and [API](https://cloud.google.com/iam/docs/reference/rest/v1/projects.roles/list).
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.projects.ProjectsFunctions;
     *  import com.pulumi.gcp.projects.inputs.GetIamCustomRolesArgs;
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
     *          final var example = ProjectsFunctions.getIamCustomRoles(GetIamCustomRolesArgs.builder()
     *              .project("your-project-id")
     *              .showDeleted(true)
     *              .view("FULL")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getIamCustomRolesPlain(args: Endofunction[com.pulumi.gcp.projects.inputs.GetIamCustomRolesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.projects.outputs.GetIamCustomRolesResult] =
      val argsBuilder = com.pulumi.gcp.projects.inputs.GetIamCustomRolesPlainArgs.builder
      com.pulumi.gcp.projects.ProjectsFunctions.getIamCustomRolesPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a project.
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
     *  import com.pulumi.gcp.projects.ProjectsFunctions;
     *  import com.pulumi.gcp.projects.inputs.GetIamPolicyArgs;
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
     *          final var policy = ProjectsFunctions.getIamPolicy(GetIamPolicyArgs.builder()
     *              .project("myproject")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getIamPolicy(args: Endofunction[com.pulumi.gcp.projects.inputs.GetIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.projects.outputs.GetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.projects.inputs.GetIamPolicyArgs.builder
      com.pulumi.gcp.projects.ProjectsFunctions.getIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a project.
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
     *  import com.pulumi.gcp.projects.ProjectsFunctions;
     *  import com.pulumi.gcp.projects.inputs.GetIamPolicyArgs;
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
     *          final var policy = ProjectsFunctions.getIamPolicy(GetIamPolicyArgs.builder()
     *              .project("myproject")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getIamPolicyPlain(args: Endofunction[com.pulumi.gcp.projects.inputs.GetIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.projects.outputs.GetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.projects.inputs.GetIamPolicyPlainArgs.builder
      com.pulumi.gcp.projects.ProjectsFunctions.getIamPolicyPlain(args(argsBuilder).build)

    /**
     * Allows management of Organization policies for a Google Project. For more information see
     *  [the official
     *  documentation](https://docs.cloud.google.com/resource-manager/docs/organization-policy/overview)
     */
    def getOrganizationPolicy(args: Endofunction[com.pulumi.gcp.projects.inputs.GetOrganizationPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.projects.outputs.GetOrganizationPolicyResult] =
      val argsBuilder = com.pulumi.gcp.projects.inputs.GetOrganizationPolicyArgs.builder
      com.pulumi.gcp.projects.ProjectsFunctions.getOrganizationPolicy(args(argsBuilder).build)

    /**
     * Allows management of Organization policies for a Google Project. For more information see
     *  [the official
     *  documentation](https://docs.cloud.google.com/resource-manager/docs/organization-policy/overview)
     */
    def getOrganizationPolicyPlain(args: Endofunction[com.pulumi.gcp.projects.inputs.GetOrganizationPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.projects.outputs.GetOrganizationPolicyResult] =
      val argsBuilder = com.pulumi.gcp.projects.inputs.GetOrganizationPolicyPlainArgs.builder
      com.pulumi.gcp.projects.ProjectsFunctions.getOrganizationPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieve information about a set of projects based on a filter. See the
     *  [REST API](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects/list)
     *  for more details.
     */
    def getProject(args: Endofunction[com.pulumi.gcp.projects.inputs.GetProjectArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.projects.outputs.GetProjectResult] =
      val argsBuilder = com.pulumi.gcp.projects.inputs.GetProjectArgs.builder
      com.pulumi.gcp.projects.ProjectsFunctions.getProject(args(argsBuilder).build)

    /**
     * Retrieve information about a set of projects based on a filter. See the
     *  [REST API](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects/list)
     *  for more details.
     */
    def getProjectPlain(args: Endofunction[com.pulumi.gcp.projects.inputs.GetProjectPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.projects.outputs.GetProjectResult] =
      val argsBuilder = com.pulumi.gcp.projects.inputs.GetProjectPlainArgs.builder
      com.pulumi.gcp.projects.ProjectsFunctions.getProjectPlain(args(argsBuilder).build)

    /**
     * Verify the API service for the Google Cloud Platform project to see if it is enabled or not.
     * 
     *  For a list of services available, visit the [API library page](https://console.cloud.google.com/apis/library)
     *  or run `gcloud services list --available`.
     * 
     *  This datasource requires the [Service Usage API](https://console.cloud.google.com/apis/library/serviceusage.googleapis.com)
     *  to use.
     * 
     *  To get more information about `gcp.projects.Service`, see:
     * 
     *  * [API documentation](https://cloud.google.com/service-usage/docs/reference/rest/v1/services)
     *  * How-to Guides
     *      * [Enabling and Disabling Services](https://cloud.google.com/service-usage/docs/enable-disable)
     */
    def getProjectService(args: Endofunction[com.pulumi.gcp.projects.inputs.GetProjectServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.projects.outputs.GetProjectServiceResult] =
      val argsBuilder = com.pulumi.gcp.projects.inputs.GetProjectServiceArgs.builder
      com.pulumi.gcp.projects.ProjectsFunctions.getProjectService(args(argsBuilder).build)

    /**
     * Verify the API service for the Google Cloud Platform project to see if it is enabled or not.
     * 
     *  For a list of services available, visit the [API library page](https://console.cloud.google.com/apis/library)
     *  or run `gcloud services list --available`.
     * 
     *  This datasource requires the [Service Usage API](https://console.cloud.google.com/apis/library/serviceusage.googleapis.com)
     *  to use.
     * 
     *  To get more information about `gcp.projects.Service`, see:
     * 
     *  * [API documentation](https://cloud.google.com/service-usage/docs/reference/rest/v1/services)
     *  * How-to Guides
     *      * [Enabling and Disabling Services](https://cloud.google.com/service-usage/docs/enable-disable)
     */
    def getProjectServicePlain(args: Endofunction[com.pulumi.gcp.projects.inputs.GetProjectServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.projects.outputs.GetProjectServiceResult] =
      val argsBuilder = com.pulumi.gcp.projects.inputs.GetProjectServicePlainArgs.builder
      com.pulumi.gcp.projects.ProjectsFunctions.getProjectServicePlain(args(argsBuilder).build)

  /** The Apikeys Key resource */
  def ApiKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.projects.ApiKeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.projects.ApiKeyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.projects.ApiKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Four different resources help you manage your IAM policy for a project. Each of these resources serves a different use case:
   * 
   *  * `gcp.projects.IAMPolicy`: Authoritative. Sets the IAM policy for the project and replaces any existing policy already attached.
   *  * `gcp.projects.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the project are preserved.
   *  * `gcp.projects.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the project are preserved.
   *  * `gcp.projects.IAMAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
   * 
   *  &gt; **Note:** `gcp.projects.IAMPolicy` **cannot** be used in conjunction with `gcp.projects.IAMBinding`, `gcp.projects.IAMMember`, or `gcp.projects.IAMAuditConfig` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.projects.IAMBinding` resources **can be** used in conjunction with `gcp.projects.IAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:** The underlying API method `projects.setIamPolicy` has a lot of constraints which are documented [here](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects/setIamPolicy). In addition to these constraints,
   *     IAM Conditions cannot be used with Basic Roles such as Owner. Violating these constraints will result in the API returning 400 error code so please review these if you encounter errors with this resource.
   * 
   *  ## gcp.projects.IAMPolicy
   * 
   *  !&gt; **Be careful!** You can accidentally lock yourself out of your project
   *     using this resource. Deleting a `gcp.projects.IAMPolicy` removes access
   *     from anyone without organization-level access to the project. Proceed with caution.
   *     It&#39;s not recommended to use `gcp.projects.IAMPolicy` with your provider project
   *     to avoid locking yourself out, and it should generally only be used with projects
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.projects.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMAuditConfig;
   *  import com.pulumi.gcp.projects.IAMAuditConfigArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs;
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
   *          var project = new IAMAuditConfig("project", IAMAuditConfigArgs.builder()
   *              .project("your-project-id")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
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
   *  ## gcp.projects.IAMPolicy
   * 
   *  !&gt; **Be careful!** You can accidentally lock yourself out of your project
   *     using this resource. Deleting a `gcp.projects.IAMPolicy` removes access
   *     from anyone without organization-level access to the project. Proceed with caution.
   *     It&#39;s not recommended to use `gcp.projects.IAMPolicy` with your provider project
   *     to avoid locking yourself out, and it should generally only be used with projects
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMPolicy;
   *  import com.pulumi.gcp.projects.IAMPolicyArgs;
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
   *          var project = new IAMPolicy("project", IAMPolicyArgs.builder()
   *              .project("your-project-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.projects.IAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMBinding;
   *  import com.pulumi.gcp.projects.IAMBindingArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs;
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
   *          var project = new IAMBinding("project", IAMBindingArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  import com.pulumi.gcp.projects.IAMMember;
   *  import com.pulumi.gcp.projects.IAMMemberArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs;
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
   *          var project = new IAMMember("project", IAMMemberArgs.builder()
   *              .project("your-project-id")
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
   *  ## gcp.projects.IAMAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.projects.IAMAuditConfig;
   *  import com.pulumi.gcp.projects.IAMAuditConfigArgs;
   *  import com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs;
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
   *          var project = new IAMAuditConfig("project", IAMAuditConfigArgs.builder()
   *              .project("your-project-id")
   *              .service("allServices")
   *              .auditLogConfigs(
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
   *                      .logType("ADMIN_READ")
   *                      .build(),
   *                  IAMAuditConfigAuditLogConfigArgs.builder()
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
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * 
   *  &gt; **Conditional IAM Bindings**: If you&#39;re importing a IAM binding with a condition block, make sure
   *   to include the title of condition, e.g. `terraform import google_project_iam_binding.my_project &#34;{{your-project-id}} roles/{{role_id}} condition-title&#34;`
   */
  def IAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.projects.IAMBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.projects.IAMBindingArgs.builder
    com.pulumi.gcp.projects.IAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Allows management of a single API service for a Google Cloud project.
   * 
   *  For a list of services available, visit the [API library page](https://console.cloud.google.com/apis/library)
   *  or run `gcloud services list --available`.
   * 
   *  This resource requires the [Service Usage API](https://console.cloud.google.com/apis/library/serviceusage.googleapis.com)
   *  to use.
   * 
   *  To get more information about `gcp.projects.Service`, see:
   * 
   *  * [API documentation](https://cloud.google.com/service-usage/docs/reference/rest/v1/services)
   *  * How-to Guides
   *      * [Enabling and Disabling Services](https://cloud.google.com/service-usage/docs/enable-disable)
   *  * Terraform guidance
   *      * [User Guide - gcp.projects.Service](https://www.terraform.io/docs/providers/google/guides/google_project_service.html)
   */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.projects.ServiceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.projects.ServiceArgs.builder
    com.pulumi.gcp.projects.Service(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.projects.ApiKeyArgs.Builder)
    /**
     * @param restrictions Key restrictions.
     * @return builder
     */
    def restrictions(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder]):
        com.pulumi.gcp.projects.ApiKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.builder
      builder.restrictions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.AccessApprovalSettingsArgs.Builder)
    /**
     * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     *  Access requests for the resource given by name against any of these services contained here will be required
     *  to have explicit approval. Enrollment can only be done on an all or nothing basis.
     *  A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     *  Structure is documented below.
     * @return builder
     */
    def enrolledServices(args: Endofunction[com.pulumi.gcp.projects.inputs.AccessApprovalSettingsEnrolledServiceArgs.Builder]*):
        com.pulumi.gcp.projects.AccessApprovalSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.projects.inputs.AccessApprovalSettingsEnrolledServiceArgs.builder
      builder.enrolledServices(args.map(_(argsBuilder).build)*)

  /**
   * Access Approval enables you to require your explicit approval whenever Google support and engineering need to access your customer content.
   * 
   *  To get more information about ProjectSettings, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-approval/docs/reference/rest/v1/projects)
   */
  def AccessApprovalSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.projects.AccessApprovalSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.projects.AccessApprovalSettingsArgs.builder
    com.pulumi.gcp.projects.AccessApprovalSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Allows management of Organization Policies for a Google Cloud Project.
   * 
   *  &gt; **Warning:** This resource has been superseded by `gcp.orgpolicy.Policy`. `gcp.orgpolicy.Policy` uses Organization Policy API V2 instead of Cloud Resource Manager API V1 and it supports additional features such as tags and conditions.
   * 
   *  To get more information about Organization Policies, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects/setOrgPolicy)
   *  * How-to Guides
   *      * [Introduction to the Organization Policy Service](https://docs.cloud.google.com/resource-manager/docs/organization-policy/overview)
   */
  def OrganizationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.projects.OrganizationPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.projects.OrganizationPolicyArgs.builder
    com.pulumi.gcp.projects.OrganizationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.projects.IAMAuditConfigArgs.Builder)
    /**
     * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * @return builder
     */
    def auditLogConfigs(args: Endofunction[com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs.Builder]*):
        com.pulumi.gcp.projects.IAMAuditConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  /**
   * Allows management of Google Cloud Platform project default service accounts.
   * 
   *  When certain service APIs are enabled, Google Cloud Platform automatically creates service accounts to help get started, but
   *  this is not recommended for production environments as per [Google&#39;s documentation](https://cloud.google.com/iam/docs/service-accounts#default).
   *  See the [Organization documentation](https://docs.cloud.google.com/resource-manager/docs/quickstarts) for more details.
   * 
   *  &gt; **WARNING** Some Google Cloud products do not work if the default service accounts are deleted so it is better to `DEPRIVILEGE` as
   *  Google **CAN NOT** recover service accounts that have been deleted for more than 30 days.
   *  Also Google recommends using the `constraints/iam.automaticIamGrantsForDefaultServiceAccounts` [constraint](https://www.terraform.io/docs/providers/google/r/google_organization_policy.html)
   *  to disable automatic IAM Grants to default service accounts.
   * 
   *  &gt; This resource works on a best-effort basis, as no API formally describes the default service accounts
   *  and it is for users who are unable to use constraints. If the default service accounts change their name
   *  or additional service accounts are added, this resource will need to be updated.
   */
  def DefaultServiceAccounts(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.projects.DefaultServiceAccountsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.projects.DefaultServiceAccountsArgs.builder
    com.pulumi.gcp.projects.DefaultServiceAccounts(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.projects.inputs.OrganizationPolicyState.Builder)
    /**
     * @param booleanPolicy A boolean policy is a constraint that is either enforced or not. Structure is documented below.
     * @return builder
     */
    def booleanPolicy(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyBooleanPolicyArgs.Builder]):
        com.pulumi.gcp.projects.inputs.OrganizationPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyBooleanPolicyArgs.builder
      builder.booleanPolicy(args(argsBuilder).build)

    /**
     * @param listPolicy A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * @return builder
     */
    def listPolicy(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyArgs.Builder]):
        com.pulumi.gcp.projects.inputs.OrganizationPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyArgs.builder
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
    def restorePolicy(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyRestorePolicyArgs.Builder]):
        com.pulumi.gcp.projects.inputs.OrganizationPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyRestorePolicyArgs.builder
      builder.restorePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsAndroidKeyRestrictionsArgs.Builder)
    /**
     * @param allowedApplications A list of Android applications that are allowed to make API calls with this key.
     * @return builder
     */
    def allowedApplications(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs.Builder]*):
        com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsAndroidKeyRestrictionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsAndroidKeyRestrictionsAllowedApplicationArgs.builder
      builder.allowedApplications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.projects.inputs.IAMAuditConfigState.Builder)
    /**
     * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * @return builder
     */
    def auditLogConfigs(args: Endofunction[com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs.Builder]*):
        com.pulumi.gcp.projects.inputs.IAMAuditConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.projects.inputs.IAMAuditConfigAuditLogConfigArgs.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.projects.inputs.IAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.projects.inputs.IAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.inputs.IAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.projects.inputs.IAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.inputs.AccessApprovalSettingsState.Builder)
    /**
     * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     *  Access requests for the resource given by name against any of these services contained here will be required
     *  to have explicit approval. Enrollment can only be done on an all or nothing basis.
     *  A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     *  Structure is documented below.
     * @return builder
     */
    def enrolledServices(args: Endofunction[com.pulumi.gcp.projects.inputs.AccessApprovalSettingsEnrolledServiceArgs.Builder]*):
        com.pulumi.gcp.projects.inputs.AccessApprovalSettingsState.Builder =
      def argsBuilder = com.pulumi.gcp.projects.inputs.AccessApprovalSettingsEnrolledServiceArgs.builder
      builder.enrolledServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.projects.inputs.ApiKeyState.Builder)
    /**
     * @param restrictions Key restrictions.
     * @return builder
     */
    def restrictions(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder]):
        com.pulumi.gcp.projects.inputs.ApiKeyState.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.builder
      builder.restrictions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder)
    /**
     * @param androidKeyRestrictions The Android apps that are allowed to use the key.
     * @return builder
     */
    def androidKeyRestrictions(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsAndroidKeyRestrictionsArgs.Builder]):
        com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsAndroidKeyRestrictionsArgs.builder
      builder.androidKeyRestrictions(args(argsBuilder).build)

    /**
     * @param apiTargets A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
     * @return builder
     */
    def apiTargets(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsApiTargetArgs.Builder]*):
        com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsApiTargetArgs.builder
      builder.apiTargets(args.map(_(argsBuilder).build)*)

    /**
     * @param browserKeyRestrictions The HTTP referrers (websites) that are allowed to use the key.
     * @return builder
     */
    def browserKeyRestrictions(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsBrowserKeyRestrictionsArgs.Builder]):
        com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsBrowserKeyRestrictionsArgs.builder
      builder.browserKeyRestrictions(args(argsBuilder).build)

    /**
     * @param iosKeyRestrictions The iOS apps that are allowed to use the key.
     * @return builder
     */
    def iosKeyRestrictions(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsIosKeyRestrictionsArgs.Builder]):
        com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsIosKeyRestrictionsArgs.builder
      builder.iosKeyRestrictions(args(argsBuilder).build)

    /**
     * @param serverKeyRestrictions The IP addresses of callers that are allowed to use the key.
     * @return builder
     */
    def serverKeyRestrictions(args: Endofunction[com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsServerKeyRestrictionsArgs.Builder]):
        com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsServerKeyRestrictionsArgs.builder
      builder.serverKeyRestrictions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyArgs.Builder)
    /**
     * @param allow or `deny` - (Optional) One or the other must be set.
     * @return builder
     */
    def allow(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyAllowArgs.Builder]):
        com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param deny One or the other must be set.
     * @return builder
     */
    def deny(args: Endofunction[com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyDenyArgs.Builder]):
        com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyDenyArgs.builder
      builder.deny(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.projects.IAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.projects.IAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.projects.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * &gt; **Warning:** These resources are in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  Generate service identity for a service.
   * 
   *  &gt; **Note:** Once created, this resource cannot be updated or destroyed. These
   *  actions are a no-op.
   * 
   *  &gt; **Note:** This resource can be used to retrieve the emails of the [Google-managed service accounts](https://cloud.google.com/iam/docs/service-agents)
   *  of the APIs that Google has configured with a Service Identity. You can run `gcloud beta services identity create --service SERVICE_NAME.googleapis.com` to
   *  verify if an API supports this.
   * 
   *  To get more information about Service Identity, see:
   * 
   *  * [API documentation](https://cloud.google.com/service-usage/docs/reference/rest/v1beta1/services/generateServiceIdentity)
   */
  def ServiceIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.projects.ServiceIdentityArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.projects.ServiceIdentityArgs.builder
    com.pulumi.gcp.projects.ServiceIdentity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Sets up a usage export bucket for a particular project.  A usage export bucket
   *  is a pre-configured GCS bucket which is set up to receive daily and monthly
   *  reports of the GCE resources used.
   * 
   *  For more information see the [Docs](https://cloud.google.com/compute/docs/usage-export)
   *  and for further details, the
   *  [API Documentation](https://cloud.google.com/compute/docs/reference/rest/beta/projects/setUsageExportBucket).
   * 
   *  &gt; **Note:** You should specify only one of these per project.  If there are two or more
   *  they will fight over which bucket the reports should be stored in.  It is
   *  safe to have multiple resources with the same backing bucket.
   */
  def UsageExportBucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.projects.UsageExportBucketArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.projects.UsageExportBucketArgs.builder
    com.pulumi.gcp.projects.UsageExportBucket(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
