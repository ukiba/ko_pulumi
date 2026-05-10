package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object organizations:
  /**
   * Four different resources help you manage your IAM policy for a organization. Each of these resources serves a different use case:
   * 
   *  * `gcp.organizations.IAMPolicy`: Authoritative. Sets the IAM policy for the organization and replaces any existing policy already attached.
   *  * `gcp.organizations.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organization are preserved.
   *  * `gcp.organizations.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organization are preserved.
   *  * `gcp.organizations.IamAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
   * 
   *  &gt; **Note:** `gcp.organizations.IAMPolicy` **cannot** be used in conjunction with `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.organizations.IAMBinding` resources **can be** used in conjunction with `gcp.organizations.IAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.organizations.IAMPolicy
   * 
   *  !&gt; **Warning:** New organizations have several default policies which will,
   *     without extreme caution, be **overwritten** by use of this resource.
   *     The safest alternative is to use multiple `gcp.organizations.IAMBinding`
   *     resources. This resource makes it easy to remove your own access to
   *     an organization, which will require a call to Google Support to have
   *     fixed, and can take multiple days to resolve.
   * 
   *     In general, this resource should only be used with organizations
   *     fully managed by this provider. If you do use this resource,
   *     the best way to be sure that you are not making dangerous changes is to start
   *     by **importing** your existing policy, and examining the diff very closely.
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
   *  import com.pulumi.gcp.organizations.IAMPolicy;
   *  import com.pulumi.gcp.organizations.IAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var organization = new IAMPolicy("organization", IAMPolicyArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMPolicy;
   *  import com.pulumi.gcp.organizations.IAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var organization = new IAMPolicy("organization", IAMPolicyArgs.builder()
   *              .orgId("1234567890")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.organizations.IAMBinding
   * 
   *  &gt; **Note:** If `role` is set to `roles/owner` and you don&#39;t specify a user or service account you have access to in `members`, you can lock yourself out of your organization.
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IamAuditConfig;
   *  import com.pulumi.gcp.organizations.IamAuditConfigArgs;
   *  import com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IamAuditConfig("organization", IamAuditConfigArgs.builder()
   *              .orgId("1234567890")
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
   *  ## gcp.organizations.IAMBinding
   * 
   *  &gt; **Note:** If `role` is set to `roles/owner` and you don&#39;t specify a user or service account you have access to in `members`, you can lock yourself out of your organization.
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IamAuditConfig;
   *  import com.pulumi.gcp.organizations.IamAuditConfigArgs;
   *  import com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IamAuditConfig("organization", IamAuditConfigArgs.builder()
   *              .orgId("1234567890")
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
   *   to include the title of condition, e.g. `terraform import google_organization_iam_binding.my_organization &#34;your-org-id roles/{{role_id}} condition-title&#34;`
   */
  def IAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.organizations.IAMPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.organizations.IAMPolicyArgs.builder
    com.pulumi.gcp.organizations.IAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Four different resources help you manage your IAM policy for a organization. Each of these resources serves a different use case:
   * 
   *  * `gcp.organizations.IAMPolicy`: Authoritative. Sets the IAM policy for the organization and replaces any existing policy already attached.
   *  * `gcp.organizations.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organization are preserved.
   *  * `gcp.organizations.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organization are preserved.
   *  * `gcp.organizations.IamAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
   * 
   *  &gt; **Note:** `gcp.organizations.IAMPolicy` **cannot** be used in conjunction with `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.organizations.IAMBinding` resources **can be** used in conjunction with `gcp.organizations.IAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.organizations.IAMPolicy
   * 
   *  !&gt; **Warning:** New organizations have several default policies which will,
   *     without extreme caution, be **overwritten** by use of this resource.
   *     The safest alternative is to use multiple `gcp.organizations.IAMBinding`
   *     resources. This resource makes it easy to remove your own access to
   *     an organization, which will require a call to Google Support to have
   *     fixed, and can take multiple days to resolve.
   * 
   *     In general, this resource should only be used with organizations
   *     fully managed by this provider. If you do use this resource,
   *     the best way to be sure that you are not making dangerous changes is to start
   *     by **importing** your existing policy, and examining the diff very closely.
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
   *  import com.pulumi.gcp.organizations.IAMPolicy;
   *  import com.pulumi.gcp.organizations.IAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var organization = new IAMPolicy("organization", IAMPolicyArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMPolicy;
   *  import com.pulumi.gcp.organizations.IAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var organization = new IAMPolicy("organization", IAMPolicyArgs.builder()
   *              .orgId("1234567890")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.organizations.IAMBinding
   * 
   *  &gt; **Note:** If `role` is set to `roles/owner` and you don&#39;t specify a user or service account you have access to in `members`, you can lock yourself out of your organization.
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IamAuditConfig;
   *  import com.pulumi.gcp.organizations.IamAuditConfigArgs;
   *  import com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IamAuditConfig("organization", IamAuditConfigArgs.builder()
   *              .orgId("1234567890")
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
   *  ## gcp.organizations.IAMBinding
   * 
   *  &gt; **Note:** If `role` is set to `roles/owner` and you don&#39;t specify a user or service account you have access to in `members`, you can lock yourself out of your organization.
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IamAuditConfig;
   *  import com.pulumi.gcp.organizations.IamAuditConfigArgs;
   *  import com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IamAuditConfig("organization", IamAuditConfigArgs.builder()
   *              .orgId("1234567890")
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
   *   to include the title of condition, e.g. `terraform import google_organization_iam_binding.my_organization &#34;your-org-id roles/{{role_id}} condition-title&#34;`
   */
  def IamAuditConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.organizations.IamAuditConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.organizations.IamAuditConfigArgs.builder
    com.pulumi.gcp.organizations.IamAuditConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.organizations.IAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.organizations.IAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Allows management of a customized Cloud IAM organization role. For more information see
   *  [the official documentation](https://cloud.google.com/iam/docs/understanding-custom-roles)
   *  and
   *  [API](https://cloud.google.com/iam/reference/rest/v1/organizations.roles).
   * 
   *  &gt; **Warning:** Note that custom roles in GCP have the concept of a soft-delete. There are two issues that may arise
   *   from this and how roles are propagated. 1) creating a role may involve undeleting and then updating a role with the
   *   same name, possibly causing confusing behavior between undelete and update. 2) A deleted role is permanently deleted
   *   after 7 days, but it can take up to 30 more days (i.e. between 7 and 37 days after deletion) before the role name is
   *   made available again. This means a deleted role that has been deleted for more than 7 days cannot be changed at all
   *   by the provider, and new roles cannot share that name.
   */
  def IAMCustomRole(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.organizations.IAMCustomRoleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.organizations.IAMCustomRoleArgs.builder
    com.pulumi.gcp.organizations.IAMCustomRole(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Four different resources help you manage your IAM policy for a organization. Each of these resources serves a different use case:
   * 
   *  * `gcp.organizations.IAMPolicy`: Authoritative. Sets the IAM policy for the organization and replaces any existing policy already attached.
   *  * `gcp.organizations.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organization are preserved.
   *  * `gcp.organizations.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organization are preserved.
   *  * `gcp.organizations.IamAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
   * 
   *  &gt; **Note:** `gcp.organizations.IAMPolicy` **cannot** be used in conjunction with `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.organizations.IAMBinding` resources **can be** used in conjunction with `gcp.organizations.IAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.organizations.IAMPolicy
   * 
   *  !&gt; **Warning:** New organizations have several default policies which will,
   *     without extreme caution, be **overwritten** by use of this resource.
   *     The safest alternative is to use multiple `gcp.organizations.IAMBinding`
   *     resources. This resource makes it easy to remove your own access to
   *     an organization, which will require a call to Google Support to have
   *     fixed, and can take multiple days to resolve.
   * 
   *     In general, this resource should only be used with organizations
   *     fully managed by this provider. If you do use this resource,
   *     the best way to be sure that you are not making dangerous changes is to start
   *     by **importing** your existing policy, and examining the diff very closely.
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
   *  import com.pulumi.gcp.organizations.IAMPolicy;
   *  import com.pulumi.gcp.organizations.IAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var organization = new IAMPolicy("organization", IAMPolicyArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMPolicy;
   *  import com.pulumi.gcp.organizations.IAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var organization = new IAMPolicy("organization", IAMPolicyArgs.builder()
   *              .orgId("1234567890")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.organizations.IAMBinding
   * 
   *  &gt; **Note:** If `role` is set to `roles/owner` and you don&#39;t specify a user or service account you have access to in `members`, you can lock yourself out of your organization.
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IamAuditConfig;
   *  import com.pulumi.gcp.organizations.IamAuditConfigArgs;
   *  import com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IamAuditConfig("organization", IamAuditConfigArgs.builder()
   *              .orgId("1234567890")
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
   *  ## gcp.organizations.IAMBinding
   * 
   *  &gt; **Note:** If `role` is set to `roles/owner` and you don&#39;t specify a user or service account you have access to in `members`, you can lock yourself out of your organization.
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IamAuditConfig;
   *  import com.pulumi.gcp.organizations.IamAuditConfigArgs;
   *  import com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IamAuditConfig("organization", IamAuditConfigArgs.builder()
   *              .orgId("1234567890")
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
   *   to include the title of condition, e.g. `terraform import google_organization_iam_binding.my_organization &#34;your-org-id roles/{{role_id}} condition-title&#34;`
   */
  def IAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.organizations.IAMMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.organizations.IAMMemberArgs.builder
    com.pulumi.gcp.organizations.IAMMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Four different resources help you manage your IAM policy for a organization. Each of these resources serves a different use case:
   * 
   *  * `gcp.organizations.IAMPolicy`: Authoritative. Sets the IAM policy for the organization and replaces any existing policy already attached.
   *  * `gcp.organizations.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the organization are preserved.
   *  * `gcp.organizations.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the organization are preserved.
   *  * `gcp.organizations.IamAuditConfig`: Authoritative for a given service. Updates the IAM policy to enable audit logging for the given service.
   * 
   *  &gt; **Note:** `gcp.organizations.IAMPolicy` **cannot** be used in conjunction with `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.organizations.IAMBinding` resources **can be** used in conjunction with `gcp.organizations.IAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.organizations.IAMPolicy
   * 
   *  !&gt; **Warning:** New organizations have several default policies which will,
   *     without extreme caution, be **overwritten** by use of this resource.
   *     The safest alternative is to use multiple `gcp.organizations.IAMBinding`
   *     resources. This resource makes it easy to remove your own access to
   *     an organization, which will require a call to Google Support to have
   *     fixed, and can take multiple days to resolve.
   * 
   *     In general, this resource should only be used with organizations
   *     fully managed by this provider. If you do use this resource,
   *     the best way to be sure that you are not making dangerous changes is to start
   *     by **importing** your existing policy, and examining the diff very closely.
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
   *  import com.pulumi.gcp.organizations.IAMPolicy;
   *  import com.pulumi.gcp.organizations.IAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var organization = new IAMPolicy("organization", IAMPolicyArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMPolicy;
   *  import com.pulumi.gcp.organizations.IAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var organization = new IAMPolicy("organization", IAMPolicyArgs.builder()
   *              .orgId("1234567890")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.organizations.IAMBinding
   * 
   *  &gt; **Note:** If `role` is set to `roles/owner` and you don&#39;t specify a user or service account you have access to in `members`, you can lock yourself out of your organization.
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IamAuditConfig;
   *  import com.pulumi.gcp.organizations.IamAuditConfigArgs;
   *  import com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IamAuditConfig("organization", IamAuditConfigArgs.builder()
   *              .orgId("1234567890")
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
   *  ## gcp.organizations.IAMBinding
   * 
   *  &gt; **Note:** If `role` is set to `roles/owner` and you don&#39;t specify a user or service account you have access to in `members`, you can lock yourself out of your organization.
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMBinding;
   *  import com.pulumi.gcp.organizations.IAMBindingArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMBinding("organization", IAMBindingArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
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
   *  import com.pulumi.gcp.organizations.IAMMember;
   *  import com.pulumi.gcp.organizations.IAMMemberArgs;
   *  import com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IAMMember("organization", IAMMemberArgs.builder()
   *              .orgId("1234567890")
   *              .role("roles/editor")
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
   *  ## gcp.organizations.IamAuditConfig
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.IamAuditConfig;
   *  import com.pulumi.gcp.organizations.IamAuditConfigArgs;
   *  import com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var organization = new IamAuditConfig("organization", IamAuditConfigArgs.builder()
   *              .orgId("1234567890")
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
   *   to include the title of condition, e.g. `terraform import google_organization_iam_binding.my_organization &#34;your-org-id roles/{{role_id}} condition-title&#34;`
   */
  def IAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.organizations.IAMBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.organizations.IAMBindingArgs.builder
    com.pulumi.gcp.organizations.IAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type OrganizationsFunctions = com.pulumi.gcp.organizations.OrganizationsFunctions
  object OrganizationsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.organizations.OrganizationsFunctions.*
  extension (self: OrganizationsFunctions.type)
    /** Get an active folder within GCP by `displayName` and `parent`. */
    def getActiveFolder(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetActiveFolderArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.organizations.outputs.GetActiveFolderResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetActiveFolderArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getActiveFolder(args(argsBuilder).build)

    /** Get an active folder within GCP by `displayName` and `parent`. */
    def getActiveFolderPlain(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetActiveFolderPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.organizations.outputs.GetActiveFolderResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetActiveFolderPlainArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getActiveFolderPlain(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Google Billing Account.
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
     *  import com.pulumi.gcp.organizations.inputs.GetBillingAccountArgs;
     *  import com.pulumi.gcp.organizations.Project;
     *  import com.pulumi.gcp.organizations.ProjectArgs;
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
     *          final var acct = OrganizationsFunctions.getBillingAccount(GetBillingAccountArgs.builder()
     *              .displayName("My Billing Account")
     *              .open(true)
     *              .build());
     * 
     *          var myProject = new Project("myProject", ProjectArgs.builder()
     *              .name("My Project")
     *              .projectId("your-project-id")
     *              .orgId("1234567")
     *              .billingAccount(acct.id())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getBillingAccount(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetBillingAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.organizations.outputs.GetBillingAccountResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetBillingAccountArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getBillingAccount(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Google Billing Account.
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
     *  import com.pulumi.gcp.organizations.inputs.GetBillingAccountArgs;
     *  import com.pulumi.gcp.organizations.Project;
     *  import com.pulumi.gcp.organizations.ProjectArgs;
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
     *          final var acct = OrganizationsFunctions.getBillingAccount(GetBillingAccountArgs.builder()
     *              .displayName("My Billing Account")
     *              .open(true)
     *              .build());
     * 
     *          var myProject = new Project("myProject", ProjectArgs.builder()
     *              .name("My Project")
     *              .projectId("your-project-id")
     *              .orgId("1234567")
     *              .billingAccount(acct.id())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getBillingAccountPlain(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetBillingAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.organizations.outputs.GetBillingAccountResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetBillingAccountPlainArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getBillingAccountPlain(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Google Cloud Folder.
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
     *  import com.pulumi.gcp.organizations.inputs.GetFolderArgs;
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
     *          final var myFolder1 = OrganizationsFunctions.getFolder(GetFolderArgs.builder()
     *              .folder("folders/12345")
     *              .lookupOrganization(true)
     *              .build());
     * 
     *          final var myFolder2 = OrganizationsFunctions.getFolder(GetFolderArgs.builder()
     *              .folder("folders/23456")
     *              .build());
     * 
     *          ctx.export("myFolder1Organization", myFolder1.organization());
     *          ctx.export("myFolder2Parent", myFolder2.parent());
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getFolder(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetFolderArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.organizations.outputs.GetFolderResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetFolderArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getFolder(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Google Cloud Folder.
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
     *  import com.pulumi.gcp.organizations.inputs.GetFolderArgs;
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
     *          final var myFolder1 = OrganizationsFunctions.getFolder(GetFolderArgs.builder()
     *              .folder("folders/12345")
     *              .lookupOrganization(true)
     *              .build());
     * 
     *          final var myFolder2 = OrganizationsFunctions.getFolder(GetFolderArgs.builder()
     *              .folder("folders/23456")
     *              .build());
     * 
     *          ctx.export("myFolder1Organization", myFolder1.organization());
     *          ctx.export("myFolder2Parent", myFolder2.parent());
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getFolderPlain(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetFolderPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.organizations.outputs.GetFolderResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetFolderPlainArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getFolderPlain(args(argsBuilder).build)

    /**
     * Retrieve information about a set of folders based on a parent ID. See the
     *  [REST API](https://docs.cloud.google.com/resource-manager/reference/rest/v3/folders/list)
     *  for more details.
     */
    def getFolders(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetFoldersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.organizations.outputs.GetFoldersResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetFoldersArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getFolders(args(argsBuilder).build)

    /**
     * Retrieve information about a set of folders based on a parent ID. See the
     *  [REST API](https://docs.cloud.google.com/resource-manager/reference/rest/v3/folders/list)
     *  for more details.
     */
    def getFoldersPlain(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetFoldersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.organizations.outputs.GetFoldersResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetFoldersPlainArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getFoldersPlain(args(argsBuilder).build)

    /**
     * Generates an IAM policy document that may be referenced by and applied to
     *  other Google Cloud Platform IAM resources, such as the `gcp.projects.IAMPolicy` resource.
     * 
     *  **Note:** Please review the documentation of the resource that you will be using the datasource with. Some resources such as `gcp.projects.IAMPolicy` and others have limitations in their API methods which are noted on their respective page.
     */
    def getIAMPolicy(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.organizations.outputs.GetIAMPolicyResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getIAMPolicy(args(argsBuilder).build)

    /**
     * Generates an IAM policy document that may be referenced by and applied to
     *  other Google Cloud Platform IAM resources, such as the `gcp.projects.IAMPolicy` resource.
     * 
     *  **Note:** Please review the documentation of the resource that you will be using the datasource with. Some resources such as `gcp.projects.IAMPolicy` and others have limitations in their API methods which are noted on their respective page.
     */
    def getIAMPolicyPlain(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIAMPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.organizations.outputs.GetIAMPolicyResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetIAMPolicyPlainArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getIAMPolicyPlain(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Organization IAM Custom Role. Note that you must have the `roles/iam.organizationRoleViewer` role (or equivalent permissions) at the organization level to use this datasource.
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
     *  import com.pulumi.gcp.organizations.inputs.GetIamCustomRoleArgs;
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
     *          final var example = OrganizationsFunctions.getIamCustomRole(GetIamCustomRoleArgs.builder()
     *              .orgId("1234567890")
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
    def getIamCustomRole(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIamCustomRoleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.organizations.outputs.GetIamCustomRoleResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetIamCustomRoleArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getIamCustomRole(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Organization IAM Custom Role. Note that you must have the `roles/iam.organizationRoleViewer` role (or equivalent permissions) at the organization level to use this datasource.
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
     *  import com.pulumi.gcp.organizations.inputs.GetIamCustomRoleArgs;
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
     *          final var example = OrganizationsFunctions.getIamCustomRole(GetIamCustomRoleArgs.builder()
     *              .orgId("1234567890")
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
    def getIamCustomRolePlain(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIamCustomRolePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.organizations.outputs.GetIamCustomRoleResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetIamCustomRolePlainArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getIamCustomRolePlain(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Organization IAM Custom Roles.
     *  Note that you must have the `roles/iam.organizationRoleViewer`.
     *  See [the official documentation](https://cloud.google.com/iam/docs/creating-custom-roles)
     *  and [API](https://cloud.google.com/iam/docs/reference/rest/v1/organizations.roles/list).
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
     *  import com.pulumi.gcp.organizations.inputs.GetIamCustomRolesArgs;
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
     *          final var example = OrganizationsFunctions.getIamCustomRoles(GetIamCustomRolesArgs.builder()
     *              .orgId("1234567890")
     *              .showDeleted(true)
     *              .view("FULL")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getIamCustomRoles(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIamCustomRolesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.organizations.outputs.GetIamCustomRolesResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetIamCustomRolesArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getIamCustomRoles(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Organization IAM Custom Roles.
     *  Note that you must have the `roles/iam.organizationRoleViewer`.
     *  See [the official documentation](https://cloud.google.com/iam/docs/creating-custom-roles)
     *  and [API](https://cloud.google.com/iam/docs/reference/rest/v1/organizations.roles/list).
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
     *  import com.pulumi.gcp.organizations.inputs.GetIamCustomRolesArgs;
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
     *          final var example = OrganizationsFunctions.getIamCustomRoles(GetIamCustomRolesArgs.builder()
     *              .orgId("1234567890")
     *              .showDeleted(true)
     *              .view("FULL")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getIamCustomRolesPlain(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIamCustomRolesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.organizations.outputs.GetIamCustomRolesResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetIamCustomRolesPlainArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getIamCustomRolesPlain(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Organization. Note that you must have the `roles/resourcemanager.organizationViewer` role (or equivalent permissions) at the organization level to use this datasource.
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
     *  import com.pulumi.gcp.organizations.inputs.GetOrganizationArgs;
     *  import com.pulumi.gcp.organizations.Folder;
     *  import com.pulumi.gcp.organizations.FolderArgs;
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
     *          final var org = OrganizationsFunctions.getOrganization(GetOrganizationArgs.builder()
     *              .domain("example.com")
     *              .build());
     * 
     *          var sales = new Folder("sales", FolderArgs.builder()
     *              .displayName("Sales")
     *              .parent(org.name())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getOrganization(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetOrganizationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.organizations.outputs.GetOrganizationResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetOrganizationArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getOrganization(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Organization. Note that you must have the `roles/resourcemanager.organizationViewer` role (or equivalent permissions) at the organization level to use this datasource.
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
     *  import com.pulumi.gcp.organizations.inputs.GetOrganizationArgs;
     *  import com.pulumi.gcp.organizations.Folder;
     *  import com.pulumi.gcp.organizations.FolderArgs;
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
     *          final var org = OrganizationsFunctions.getOrganization(GetOrganizationArgs.builder()
     *              .domain("example.com")
     *              .build());
     * 
     *          var sales = new Folder("sales", FolderArgs.builder()
     *              .displayName("Sales")
     *              .parent(org.name())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getOrganizationPlain(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetOrganizationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.organizations.outputs.GetOrganizationResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetOrganizationPlainArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getOrganizationPlain(args(argsBuilder).build)

    /**
     * Use this data source to get project details.
     *  For more information see
     *  [API](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects#Project)
     */
    def getProject(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetProjectArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.organizations.outputs.GetProjectResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetProjectArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getProject(args(argsBuilder).build)

    /**
     * Use this data source to get project details.
     *  For more information see
     *  [API](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects#Project)
     */
    def getProjectPlain(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetProjectPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.organizations.outputs.GetProjectResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetProjectPlainArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getProjectPlain(args(argsBuilder).build)

    /**
     * Gets a list of all organizations.
     *  See [the official documentation](https://docs.cloud.google.com/resource-manager/docs/creating-managing-organization)
     *  and [API](https://docs.cloud.google.com/resource-manager/reference/rest/v1/organizations/search).
     */
    def getS(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetSArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.organizations.outputs.GetSResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetSArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getS(args(argsBuilder).build)

    /**
     * Gets a list of all organizations.
     *  See [the official documentation](https://docs.cloud.google.com/resource-manager/docs/creating-managing-organization)
     *  and [API](https://docs.cloud.google.com/resource-manager/reference/rest/v1/organizations/search).
     */
    def getSPlain(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetSPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.organizations.outputs.GetSResult] =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetSPlainArgs.builder
      com.pulumi.gcp.organizations.OrganizationsFunctions.getSPlain(args(argsBuilder).build)

  /**
   * Allows creation and management of a Google Cloud Platform project.
   * 
   *  Projects created with this resource must be associated with an Organization.
   *  See the [Organization documentation](https://docs.cloud.google.com/resource-manager/docs/quickstarts) for more details.
   * 
   *  The user or service account that is running this provider when creating a `gcp.organizations.Project`
   *  resource must have `roles/resourcemanager.projectCreator` on the specified organization. See the
   *  [Access Control for Organizations Using IAM](https://docs.cloud.google.com/resource-manager/docs/access-control-org)
   *  doc for more information.
   * 
   *  &gt; This resource reads the specified billing account on every pulumi up and plan operation so you must have permissions on the specified billing account.
   * 
   *  &gt; It is recommended to use the `constraints/compute.skipDefaultNetworkCreation` [constraint](https://www.terraform.io/docs/providers/google/r/google_organization_policy.html) to remove the default network instead of setting `autoCreateNetwork` to false, when possible.
   * 
   *  &gt; It may take a while for the attached tag bindings to be deleted after the project is scheduled to be deleted.
   * 
   *  To get more information about projects, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/resource-manager/reference/rest/v1/projects)
   *  * How-to Guides
   *      * [Creating and managing projects](https://docs.cloud.google.com/resource-manager/docs/creating-managing-projects)
   */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.organizations.ProjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.organizations.ProjectArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.gcp.organizations.Project(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.organizations.AccessApprovalSettingsArgs.Builder)
    /**
     * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     *  Access requests for the resource given by name against any of these services contained here will be required
     *  to have explicit approval. Enrollment can be done for individual services.
     *  A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     *  Structure is documented below.
     * @return builder
     */
    def enrolledServices(args: Endofunction[com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs.Builder]*):
        com.pulumi.gcp.organizations.AccessApprovalSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs.builder
      builder.enrolledServices(args.map(_(argsBuilder).build)*)

  /**
   * Access Approval enables you to require your explicit approval whenever Google support and engineering need to access your customer content.
   * 
   *  To get more information about OrganizationSettings, see:
   * 
   *  * [API documentation](https://cloud.google.com/access-approval/docs/reference/rest/v1/organizations)
   */
  def AccessApprovalSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.organizations.AccessApprovalSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.organizations.AccessApprovalSettingsArgs.builder
    com.pulumi.gcp.organizations.AccessApprovalSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.organizations.IamAuditConfigArgs.Builder)
    /**
     * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * @return builder
     */
    def auditLogConfigs(args: Endofunction[com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs.Builder]*):
        com.pulumi.gcp.organizations.IamAuditConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.organizations.PolicyArgs.Builder)
    /**
     * @param booleanPolicy A boolean policy is a constraint that is either enforced or not. Structure is documented
     *  below.
     * @return builder
     */
    def booleanPolicy(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyBooleanPolicyArgs.Builder]):
        com.pulumi.gcp.organizations.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyBooleanPolicyArgs.builder
      builder.booleanPolicy(args(argsBuilder).build)

    /**
     * @param listPolicy A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * @return builder
     */
    def listPolicy(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs.Builder]):
        com.pulumi.gcp.organizations.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs.builder
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
    def restorePolicy(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyRestorePolicyArgs.Builder]):
        com.pulumi.gcp.organizations.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyRestorePolicyArgs.builder
      builder.restorePolicy(args(argsBuilder).build)

  /**
   * Allows management of Organization Policies for a Google Cloud Organization.
   * 
   *  &gt; **Warning:** This resource has been superseded by `gcp.orgpolicy.Policy`. `gcp.orgpolicy.Policy` uses Organization Policy API V2 instead of Cloud Resource Manager API V1 and it supports additional features such as tags and conditions.
   * 
   *  To get more information about Organization Policies, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/resource-manager/reference/rest/v1/organizations/setOrgPolicy)
   *  * How-to Guides
   *      * [Introduction to the Organization Policy Service](https://docs.cloud.google.com/resource-manager/docs/organization-policy/overview)
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.organizations.PolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.organizations.PolicyArgs.builder
    com.pulumi.gcp.organizations.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Allows management of a Google Cloud Platform folder. For more information see
   *  [the official documentation](https://docs.cloud.google.com/resource-manager/docs/creating-managing-folders)
   *  and
   *  [API](https://docs.cloud.google.com/resource-manager/reference/rest/v2/folders).
   * 
   *  A folder can contain projects, other folders, or a combination of both. You can use folders to group projects under an organization in a hierarchy. For example, your organization might contain multiple departments, each with its own set of Cloud Platform resources. Folders allows you to group these resources on a per-department basis. Folders are used to group resources that share common IAM policies.
   * 
   *  Folders created live inside an Organization. See the [Organization documentation](https://docs.cloud.google.com/resource-manager/docs/quickstarts) for more details.
   * 
   *  The service account used to run the provider when creating a `gcp.organizations.Folder`
   *  resource must have `roles/resourcemanager.folderCreator`. See the
   *  [Access Control for Folders Using IAM](https://docs.cloud.google.com/resource-manager/docs/access-control-folders)
   *  doc for more information.
   * 
   *  &gt; It may take a while for the attached tag bindings to be deleted after the folder is scheduled to be deleted.
   * 
   *  ## Import
   * 
   *  Folders can be imported using the folder&#39;s id, e.g.
   * 
   *  * `folders/{{folder_id}}`
   *  * `{{folder_id}}`
   * 
   *  When using the `pulumi import` command, Folders can be imported using one of the formats above. For example:
   * 
   *  ```sh
   *  $ pulumi import gcp:organizations/folder:Folder default {{folder_id}}
   *  $ pulumi import gcp:organizations/folder:Folder default folders/{{folder_id}}
   *  ```
   */
  def Folder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.organizations.FolderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.organizations.FolderArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.gcp.organizations.Folder(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.organizations.inputs.IamAuditConfigState.Builder)
    /**
     * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * @return builder
     */
    def auditLogConfigs(args: Endofunction[com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs.Builder]*):
        com.pulumi.gcp.organizations.inputs.IamAuditConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.organizations.inputs.IAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.IAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs.Builder)
    /**
     * @param allow or `deny` - (Optional) One or the other must be set.
     * @return builder
     */
    def allow(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyListPolicyAllowArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyListPolicyAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param deny One or the other must be set.
     * @return builder
     */
    def deny(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyListPolicyDenyArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyListPolicyDenyArgs.builder
      builder.deny(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.organizations.inputs.IAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.IAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsState.Builder)
    /**
     * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     *  Access requests for the resource given by name against any of these services contained here will be required
     *  to have explicit approval. Enrollment can be done for individual services.
     *  A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     *  Structure is documented below.
     * @return builder
     */
    def enrolledServices(args: Endofunction[com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs.Builder]*):
        com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsState.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs.builder
      builder.enrolledServices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigArgs.Builder)
    /**
     * @param auditLogConfigs A nested block that defines the operations you&#39;d like to log.
     * @return builder
     */
    def auditLogConfigs(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigAuditLogConfigArgs.Builder]*):
        com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigAuditLogConfigArgs.builder
      builder.auditLogConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.organizations.inputs.PolicyState.Builder)
    /**
     * @param booleanPolicy A boolean policy is a constraint that is either enforced or not. Structure is documented
     *  below.
     * @return builder
     */
    def booleanPolicy(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyBooleanPolicyArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyBooleanPolicyArgs.builder
      builder.booleanPolicy(args(argsBuilder).build)

    /**
     * @param listPolicy A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * @return builder
     */
    def listPolicy(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs.builder
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
    def restorePolicy(args: Endofunction[com.pulumi.gcp.organizations.inputs.PolicyRestorePolicyArgs.Builder]):
        com.pulumi.gcp.organizations.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.PolicyRestorePolicyArgs.builder
      builder.restorePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs.Builder)
    /**
     * @param auditConfigs A nested configuration block that defines logging additional configuration for your project. This field is only supported on `gcp.projects.IAMPolicy`, `gcp.folder.IAMPolicy` and `gcp.organizations.IAMPolicy`.
     * @return builder
     */
    def auditConfigs(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigArgs.Builder]*):
        com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.GetIAMPolicyAuditConfigArgs.builder
      builder.auditConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param bindings A nested configuration block (described below)
     *  defining a binding to be included in the policy document. Multiple
     *  `binding` arguments are supported.
     * 
     *  Each document configuration must have one or more `binding` blocks, which
     *  each accept the following arguments:
     * @return builder
     */
    def bindings(args: Endofunction[com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs.Builder]*):
        com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs.builder
      builder.bindings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.organizations.IAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.organizations.IAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Generate organization service identity for a service.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  &gt; **Note:** Once created, this resource cannot be updated or destroyed. These
   *  actions are a no-op.
   * 
   *  &gt; **Note:** This resource can be used to retrieve the emails of the [Google-managed organization service accounts](https://cloud.google.com/iam/docs/service-agents)
   *  of the APIs that Google has configured with a Service Identity. You can run `gcloud beta services identity create --service SERVICE_NAME.googleapis.com --organization ORGANIZATION` to
   *  verify if an API supports this.
   * 
   *  To get more information about Service Identity, see:
   * 
   *  * [API documentation](https://cloud.google.com/service-usage/docs/reference/rest/v1beta1/services/generateServiceIdentity)
   */
  def ServiceIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.organizations.ServiceIdentityArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.organizations.ServiceIdentityArgs.builder
    com.pulumi.gcp.organizations.ServiceIdentity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
