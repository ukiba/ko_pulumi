package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object secretmanager:
  /**
   * Three different resources help you manage your IAM policy for Secret Manager RegionalSecret. Each of these resources serves a different use case:
   * 
   *  * `gcp.secretmanager.RegionalSecretIamPolicy`: Authoritative. Sets the IAM policy for the regionalsecret and replaces any existing policy already attached.
   *  * `gcp.secretmanager.RegionalSecretIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the regionalsecret are preserved.
   *  * `gcp.secretmanager.RegionalSecretIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the regionalsecret are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.secretmanager.RegionalSecretIamPolicy`: Retrieves the IAM policy for the regionalsecret
   * 
   *  &gt; **Note:** `gcp.secretmanager.RegionalSecretIamPolicy` **cannot** be used in conjunction with `gcp.secretmanager.RegionalSecretIamBinding` and `gcp.secretmanager.RegionalSecretIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.secretmanager.RegionalSecretIamBinding` resources **can be** used in conjunction with `gcp.secretmanager.RegionalSecretIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.secretmanager.RegionalSecretIamPolicy
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RegionalSecretIamPolicy("policy", RegionalSecretIamPolicyArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new RegionalSecretIamPolicy("policy", RegionalSecretIamPolicyArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.secretmanager.RegionalSecretIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RegionalSecretIamBinding("binding", RegionalSecretIamBindingArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RegionalSecretIamBinding("binding", RegionalSecretIamBindingArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(RegionalSecretIamBindingConditionArgs.builder()
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
   *  ## gcp.secretmanager.RegionalSecretIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMember;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RegionalSecretIamMember("member", RegionalSecretIamMemberArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMember;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RegionalSecretIamMember("member", RegionalSecretIamMemberArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(RegionalSecretIamMemberConditionArgs.builder()
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
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Secret Manager RegionalSecret
   * 
   *  Three different resources help you manage your IAM policy for Secret Manager RegionalSecret. Each of these resources serves a different use case:
   * 
   *  * `gcp.secretmanager.RegionalSecretIamPolicy`: Authoritative. Sets the IAM policy for the regionalsecret and replaces any existing policy already attached.
   *  * `gcp.secretmanager.RegionalSecretIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the regionalsecret are preserved.
   *  * `gcp.secretmanager.RegionalSecretIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the regionalsecret are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.secretmanager.RegionalSecretIamPolicy`: Retrieves the IAM policy for the regionalsecret
   * 
   *  &gt; **Note:** `gcp.secretmanager.RegionalSecretIamPolicy` **cannot** be used in conjunction with `gcp.secretmanager.RegionalSecretIamBinding` and `gcp.secretmanager.RegionalSecretIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.secretmanager.RegionalSecretIamBinding` resources **can be** used in conjunction with `gcp.secretmanager.RegionalSecretIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.secretmanager.RegionalSecretIamPolicy
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RegionalSecretIamPolicy("policy", RegionalSecretIamPolicyArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new RegionalSecretIamPolicy("policy", RegionalSecretIamPolicyArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.secretmanager.RegionalSecretIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RegionalSecretIamBinding("binding", RegionalSecretIamBindingArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RegionalSecretIamBinding("binding", RegionalSecretIamBindingArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(RegionalSecretIamBindingConditionArgs.builder()
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
   *  ## gcp.secretmanager.RegionalSecretIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMember;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RegionalSecretIamMember("member", RegionalSecretIamMemberArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMember;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RegionalSecretIamMember("member", RegionalSecretIamMemberArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(RegionalSecretIamMemberConditionArgs.builder()
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
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/locations/{{location}}/secrets/{{secret_id}}
   *  * {{project}}/{{location}}/{{secret_id}}
   *  * {{location}}/{{secret_id}}
   *  * {{secret_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Secret Manager regionalsecret IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_secret_manager_regional_secret_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/secrets/{{secret_id}} roles/secretmanager.secretAccessor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_secret_manager_regional_secret_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/secrets/{{secret_id}} roles/secretmanager.secretAccessor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:secretmanager/regionalSecretIamMember:RegionalSecretIamMember editor projects/{{project}}/locations/{{location}}/secrets/{{secret_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RegionalSecretIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs.builder
    com.pulumi.gcp.secretmanager.RegionalSecretIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.secretmanager.SecretIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.SecretIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.RegionalSecretArgs.Builder)
    /**
     * @param customerManagedEncryption The customer-managed encryption configuration of the regional secret.
     *  Structure is documented below.
     * @return builder
     */
    def customerManagedEncryption(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretCustomerManagedEncryptionArgs.Builder]):
        com.pulumi.gcp.secretmanager.RegionalSecretArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretCustomerManagedEncryptionArgs.builder
      builder.customerManagedEncryption(args(argsBuilder).build)

    /**
     * @param rotation The rotation time and period for a regional secret. At `nextRotationTime`, Secret Manager
     *  will send a Pub/Sub notification to the topics configured on the Secret. `topics` must be
     *  set to configure rotation.
     *  Structure is documented below.
     * @return builder
     */
    def rotation(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretRotationArgs.Builder]):
        com.pulumi.gcp.secretmanager.RegionalSecretArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretRotationArgs.builder
      builder.rotation(args(argsBuilder).build)

    /**
     * @param topics A list of up to 10 Pub/Sub topics to which messages are published when control plane
     *  operations are called on the regional secret or its versions.
     *  Structure is documented below.
     * @return builder
     */
    def topics(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretTopicArgs.Builder]*):
        com.pulumi.gcp.secretmanager.RegionalSecretArgs.Builder =
      def argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.secretmanager.RegionalSecretArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * A Secret is a logical secret whose value and versions can be accessed.
   * 
   *  To get more information about Secret, see:
   * 
   *  * [API documentation](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets)
   *  * How-to Guides
   *      * [Create and deploy a Secret](https://cloud.google.com/secret-manager/docs/creating-and-accessing-secrets)
   */
  def Secret(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.secretmanager.SecretArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.secretmanager.SecretArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.gcp.secretmanager.Secret(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Secret Manager RegionalSecret. Each of these resources serves a different use case:
   * 
   *  * `gcp.secretmanager.RegionalSecretIamPolicy`: Authoritative. Sets the IAM policy for the regionalsecret and replaces any existing policy already attached.
   *  * `gcp.secretmanager.RegionalSecretIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the regionalsecret are preserved.
   *  * `gcp.secretmanager.RegionalSecretIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the regionalsecret are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.secretmanager.RegionalSecretIamPolicy`: Retrieves the IAM policy for the regionalsecret
   * 
   *  &gt; **Note:** `gcp.secretmanager.RegionalSecretIamPolicy` **cannot** be used in conjunction with `gcp.secretmanager.RegionalSecretIamBinding` and `gcp.secretmanager.RegionalSecretIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.secretmanager.RegionalSecretIamBinding` resources **can be** used in conjunction with `gcp.secretmanager.RegionalSecretIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.secretmanager.RegionalSecretIamPolicy
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RegionalSecretIamPolicy("policy", RegionalSecretIamPolicyArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new RegionalSecretIamPolicy("policy", RegionalSecretIamPolicyArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.secretmanager.RegionalSecretIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RegionalSecretIamBinding("binding", RegionalSecretIamBindingArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RegionalSecretIamBinding("binding", RegionalSecretIamBindingArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(RegionalSecretIamBindingConditionArgs.builder()
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
   *  ## gcp.secretmanager.RegionalSecretIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMember;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RegionalSecretIamMember("member", RegionalSecretIamMemberArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMember;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RegionalSecretIamMember("member", RegionalSecretIamMemberArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(RegionalSecretIamMemberConditionArgs.builder()
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
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Secret Manager RegionalSecret
   * 
   *  Three different resources help you manage your IAM policy for Secret Manager RegionalSecret. Each of these resources serves a different use case:
   * 
   *  * `gcp.secretmanager.RegionalSecretIamPolicy`: Authoritative. Sets the IAM policy for the regionalsecret and replaces any existing policy already attached.
   *  * `gcp.secretmanager.RegionalSecretIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the regionalsecret are preserved.
   *  * `gcp.secretmanager.RegionalSecretIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the regionalsecret are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.secretmanager.RegionalSecretIamPolicy`: Retrieves the IAM policy for the regionalsecret
   * 
   *  &gt; **Note:** `gcp.secretmanager.RegionalSecretIamPolicy` **cannot** be used in conjunction with `gcp.secretmanager.RegionalSecretIamBinding` and `gcp.secretmanager.RegionalSecretIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.secretmanager.RegionalSecretIamBinding` resources **can be** used in conjunction with `gcp.secretmanager.RegionalSecretIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.secretmanager.RegionalSecretIamPolicy
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RegionalSecretIamPolicy("policy", RegionalSecretIamPolicyArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new RegionalSecretIamPolicy("policy", RegionalSecretIamPolicyArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.secretmanager.RegionalSecretIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RegionalSecretIamBinding("binding", RegionalSecretIamBindingArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RegionalSecretIamBinding("binding", RegionalSecretIamBindingArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(RegionalSecretIamBindingConditionArgs.builder()
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
   *  ## gcp.secretmanager.RegionalSecretIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMember;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RegionalSecretIamMember("member", RegionalSecretIamMemberArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMember;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RegionalSecretIamMember("member", RegionalSecretIamMemberArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(RegionalSecretIamMemberConditionArgs.builder()
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
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/locations/{{location}}/secrets/{{secret_id}}
   *  * {{project}}/{{location}}/{{secret_id}}
   *  * {{location}}/{{secret_id}}
   *  * {{secret_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Secret Manager regionalsecret IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_secret_manager_regional_secret_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/secrets/{{secret_id}} roles/secretmanager.secretAccessor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_secret_manager_regional_secret_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/secrets/{{secret_id}} roles/secretmanager.secretAccessor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:secretmanager/regionalSecretIamPolicy:RegionalSecretIamPolicy editor projects/{{project}}/locations/{{location}}/secrets/{{secret_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RegionalSecretIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.secretmanager.RegionalSecretIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.secretmanager.RegionalSecretIamPolicyArgs.builder
    com.pulumi.gcp.secretmanager.RegionalSecretIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A regional secret version resource.
   * 
   *  To get more information about RegionalSecretVersion, see:
   * 
   *  * [API documentation](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.locations.secrets.versions)
   *  * How-to Guides
   *      * [Create and deploy a Regional Secret Version](https://cloud.google.com/secret-manager/regional-secrets/add-secret-version-rs)
   * 
   *  &gt; **Warning:** The behavior of the `secretData` field is force new.
   *  While updating this field, Terraform deletes the existing resource and then creates a new one, which may cause potential outages. To mitigate
   *  this, use the `createBeforeDestroy` field within the lifecycle block.
   * 
   *  For more details, refer to the Terraform lifecycle documentation.
   */
  def RegionalSecretVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.secretmanager.RegionalSecretVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.secretmanager.RegionalSecretVersionArgs.builder
    com.pulumi.gcp.secretmanager.RegionalSecretVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.secretmanager.SecretIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.SecretIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Secret Manager Secret. Each of these resources serves a different use case:
   * 
   *  * `gcp.secretmanager.SecretIamPolicy`: Authoritative. Sets the IAM policy for the secret and replaces any existing policy already attached.
   *  * `gcp.secretmanager.SecretIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the secret are preserved.
   *  * `gcp.secretmanager.SecretIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the secret are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.secretmanager.SecretIamPolicy`: Retrieves the IAM policy for the secret
   * 
   *  &gt; **Note:** `gcp.secretmanager.SecretIamPolicy` **cannot** be used in conjunction with `gcp.secretmanager.SecretIamBinding` and `gcp.secretmanager.SecretIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.secretmanager.SecretIamBinding` resources **can be** used in conjunction with `gcp.secretmanager.SecretIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.secretmanager.SecretIamPolicy
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
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecretIamPolicy("policy", SecretIamPolicyArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
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
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecretIamPolicy("policy", SecretIamPolicyArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.secretmanager.SecretIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.SecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.SecretIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SecretIamBinding("binding", SecretIamBindingArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.SecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.SecretIamBindingArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SecretIamBinding("binding", SecretIamBindingArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecretIamBindingConditionArgs.builder()
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
   *  ## gcp.secretmanager.SecretIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.SecretIamMember;
   *  import com.pulumi.gcp.secretmanager.SecretIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SecretIamMember("member", SecretIamMemberArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.SecretIamMember;
   *  import com.pulumi.gcp.secretmanager.SecretIamMemberArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SecretIamMember("member", SecretIamMemberArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecretIamMemberConditionArgs.builder()
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
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Secret Manager Secret
   * 
   *  Three different resources help you manage your IAM policy for Secret Manager Secret. Each of these resources serves a different use case:
   * 
   *  * `gcp.secretmanager.SecretIamPolicy`: Authoritative. Sets the IAM policy for the secret and replaces any existing policy already attached.
   *  * `gcp.secretmanager.SecretIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the secret are preserved.
   *  * `gcp.secretmanager.SecretIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the secret are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.secretmanager.SecretIamPolicy`: Retrieves the IAM policy for the secret
   * 
   *  &gt; **Note:** `gcp.secretmanager.SecretIamPolicy` **cannot** be used in conjunction with `gcp.secretmanager.SecretIamBinding` and `gcp.secretmanager.SecretIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.secretmanager.SecretIamBinding` resources **can be** used in conjunction with `gcp.secretmanager.SecretIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.secretmanager.SecretIamPolicy
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
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecretIamPolicy("policy", SecretIamPolicyArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
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
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecretIamPolicy("policy", SecretIamPolicyArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.secretmanager.SecretIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.SecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.SecretIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SecretIamBinding("binding", SecretIamBindingArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.SecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.SecretIamBindingArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SecretIamBinding("binding", SecretIamBindingArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecretIamBindingConditionArgs.builder()
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
   *  ## gcp.secretmanager.SecretIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.SecretIamMember;
   *  import com.pulumi.gcp.secretmanager.SecretIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SecretIamMember("member", SecretIamMemberArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.SecretIamMember;
   *  import com.pulumi.gcp.secretmanager.SecretIamMemberArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SecretIamMember("member", SecretIamMemberArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecretIamMemberConditionArgs.builder()
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
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/secrets/{{secret_id}}
   *  * {{project}}/{{secret_id}}
   *  * {{secret_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Secret Manager secret IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_secret_manager_secret_iam_member.editor &#34;projects/{{project}}/secrets/{{secret_id}} roles/secretmanager.secretAccessor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_secret_manager_secret_iam_binding.editor &#34;projects/{{project}}/secrets/{{secret_id}} roles/secretmanager.secretAccessor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:secretmanager/secretIamBinding:SecretIamBinding editor projects/{{project}}/secrets/{{secret_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SecretIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.secretmanager.SecretIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.secretmanager.SecretIamBindingArgs.builder
    com.pulumi.gcp.secretmanager.SecretIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Secret Manager RegionalSecret. Each of these resources serves a different use case:
   * 
   *  * `gcp.secretmanager.RegionalSecretIamPolicy`: Authoritative. Sets the IAM policy for the regionalsecret and replaces any existing policy already attached.
   *  * `gcp.secretmanager.RegionalSecretIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the regionalsecret are preserved.
   *  * `gcp.secretmanager.RegionalSecretIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the regionalsecret are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.secretmanager.RegionalSecretIamPolicy`: Retrieves the IAM policy for the regionalsecret
   * 
   *  &gt; **Note:** `gcp.secretmanager.RegionalSecretIamPolicy` **cannot** be used in conjunction with `gcp.secretmanager.RegionalSecretIamBinding` and `gcp.secretmanager.RegionalSecretIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.secretmanager.RegionalSecretIamBinding` resources **can be** used in conjunction with `gcp.secretmanager.RegionalSecretIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.secretmanager.RegionalSecretIamPolicy
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RegionalSecretIamPolicy("policy", RegionalSecretIamPolicyArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new RegionalSecretIamPolicy("policy", RegionalSecretIamPolicyArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.secretmanager.RegionalSecretIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RegionalSecretIamBinding("binding", RegionalSecretIamBindingArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RegionalSecretIamBinding("binding", RegionalSecretIamBindingArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(RegionalSecretIamBindingConditionArgs.builder()
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
   *  ## gcp.secretmanager.RegionalSecretIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMember;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RegionalSecretIamMember("member", RegionalSecretIamMemberArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMember;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RegionalSecretIamMember("member", RegionalSecretIamMemberArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(RegionalSecretIamMemberConditionArgs.builder()
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
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Secret Manager RegionalSecret
   * 
   *  Three different resources help you manage your IAM policy for Secret Manager RegionalSecret. Each of these resources serves a different use case:
   * 
   *  * `gcp.secretmanager.RegionalSecretIamPolicy`: Authoritative. Sets the IAM policy for the regionalsecret and replaces any existing policy already attached.
   *  * `gcp.secretmanager.RegionalSecretIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the regionalsecret are preserved.
   *  * `gcp.secretmanager.RegionalSecretIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the regionalsecret are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.secretmanager.RegionalSecretIamPolicy`: Retrieves the IAM policy for the regionalsecret
   * 
   *  &gt; **Note:** `gcp.secretmanager.RegionalSecretIamPolicy` **cannot** be used in conjunction with `gcp.secretmanager.RegionalSecretIamBinding` and `gcp.secretmanager.RegionalSecretIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.secretmanager.RegionalSecretIamBinding` resources **can be** used in conjunction with `gcp.secretmanager.RegionalSecretIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.secretmanager.RegionalSecretIamPolicy
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RegionalSecretIamPolicy("policy", RegionalSecretIamPolicyArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new RegionalSecretIamPolicy("policy", RegionalSecretIamPolicyArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.secretmanager.RegionalSecretIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RegionalSecretIamBinding("binding", RegionalSecretIamBindingArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RegionalSecretIamBinding("binding", RegionalSecretIamBindingArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(RegionalSecretIamBindingConditionArgs.builder()
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
   *  ## gcp.secretmanager.RegionalSecretIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMember;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RegionalSecretIamMember("member", RegionalSecretIamMemberArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMember;
   *  import com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RegionalSecretIamMember("member", RegionalSecretIamMemberArgs.builder()
   *              .project(regional_secret_basic.project())
   *              .location(regional_secret_basic.location())
   *              .secretId(regional_secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(RegionalSecretIamMemberConditionArgs.builder()
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
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/locations/{{location}}/secrets/{{secret_id}}
   *  * {{project}}/{{location}}/{{secret_id}}
   *  * {{location}}/{{secret_id}}
   *  * {{secret_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Secret Manager regionalsecret IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_secret_manager_regional_secret_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/secrets/{{secret_id}} roles/secretmanager.secretAccessor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_secret_manager_regional_secret_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/secrets/{{secret_id}} roles/secretmanager.secretAccessor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:secretmanager/regionalSecretIamBinding:RegionalSecretIamBinding editor projects/{{project}}/locations/{{location}}/secrets/{{secret_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RegionalSecretIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs.builder
    com.pulumi.gcp.secretmanager.RegionalSecretIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.secretmanager.SecretArgs.Builder)
    /**
     * @param replication The replication policy of the secret data attached to the Secret. It cannot be changed
     *  after the Secret has been created.
     *  Structure is documented below.
     * @return builder
     */
    def replication(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs.Builder]):
        com.pulumi.gcp.secretmanager.SecretArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs.builder
      builder.replication(args(argsBuilder).build)

    /**
     * @param rotation The rotation time and period for a Secret. At `nextRotationTime`, Secret Manager will send a Pub/Sub notification to the topics configured on the Secret. `topics` must be set to configure rotation.
     *  Structure is documented below.
     * @return builder
     */
    def rotation(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretRotationArgs.Builder]):
        com.pulumi.gcp.secretmanager.SecretArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretRotationArgs.builder
      builder.rotation(args(argsBuilder).build)

    /**
     * @param topics A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     *  Structure is documented below.
     * @return builder
     */
    def topics(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretTopicArgs.Builder]*):
        com.pulumi.gcp.secretmanager.SecretArgs.Builder =
      def argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.secretmanager.SecretArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Three different resources help you manage your IAM policy for Secret Manager Secret. Each of these resources serves a different use case:
   * 
   *  * `gcp.secretmanager.SecretIamPolicy`: Authoritative. Sets the IAM policy for the secret and replaces any existing policy already attached.
   *  * `gcp.secretmanager.SecretIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the secret are preserved.
   *  * `gcp.secretmanager.SecretIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the secret are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.secretmanager.SecretIamPolicy`: Retrieves the IAM policy for the secret
   * 
   *  &gt; **Note:** `gcp.secretmanager.SecretIamPolicy` **cannot** be used in conjunction with `gcp.secretmanager.SecretIamBinding` and `gcp.secretmanager.SecretIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.secretmanager.SecretIamBinding` resources **can be** used in conjunction with `gcp.secretmanager.SecretIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.secretmanager.SecretIamPolicy
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
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecretIamPolicy("policy", SecretIamPolicyArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
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
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecretIamPolicy("policy", SecretIamPolicyArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.secretmanager.SecretIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.SecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.SecretIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SecretIamBinding("binding", SecretIamBindingArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.SecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.SecretIamBindingArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SecretIamBinding("binding", SecretIamBindingArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecretIamBindingConditionArgs.builder()
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
   *  ## gcp.secretmanager.SecretIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.SecretIamMember;
   *  import com.pulumi.gcp.secretmanager.SecretIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SecretIamMember("member", SecretIamMemberArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.SecretIamMember;
   *  import com.pulumi.gcp.secretmanager.SecretIamMemberArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SecretIamMember("member", SecretIamMemberArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecretIamMemberConditionArgs.builder()
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
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Secret Manager Secret
   * 
   *  Three different resources help you manage your IAM policy for Secret Manager Secret. Each of these resources serves a different use case:
   * 
   *  * `gcp.secretmanager.SecretIamPolicy`: Authoritative. Sets the IAM policy for the secret and replaces any existing policy already attached.
   *  * `gcp.secretmanager.SecretIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the secret are preserved.
   *  * `gcp.secretmanager.SecretIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the secret are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.secretmanager.SecretIamPolicy`: Retrieves the IAM policy for the secret
   * 
   *  &gt; **Note:** `gcp.secretmanager.SecretIamPolicy` **cannot** be used in conjunction with `gcp.secretmanager.SecretIamBinding` and `gcp.secretmanager.SecretIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.secretmanager.SecretIamBinding` resources **can be** used in conjunction with `gcp.secretmanager.SecretIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.secretmanager.SecretIamPolicy
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
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecretIamPolicy("policy", SecretIamPolicyArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
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
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecretIamPolicy("policy", SecretIamPolicyArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.secretmanager.SecretIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.SecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.SecretIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SecretIamBinding("binding", SecretIamBindingArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.SecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.SecretIamBindingArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SecretIamBinding("binding", SecretIamBindingArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecretIamBindingConditionArgs.builder()
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
   *  ## gcp.secretmanager.SecretIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.SecretIamMember;
   *  import com.pulumi.gcp.secretmanager.SecretIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SecretIamMember("member", SecretIamMemberArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.SecretIamMember;
   *  import com.pulumi.gcp.secretmanager.SecretIamMemberArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SecretIamMember("member", SecretIamMemberArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecretIamMemberConditionArgs.builder()
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
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/secrets/{{secret_id}}
   *  * {{project}}/{{secret_id}}
   *  * {{secret_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Secret Manager secret IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_secret_manager_secret_iam_member.editor &#34;projects/{{project}}/secrets/{{secret_id}} roles/secretmanager.secretAccessor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_secret_manager_secret_iam_binding.editor &#34;projects/{{project}}/secrets/{{secret_id}} roles/secretmanager.secretAccessor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:secretmanager/secretIamMember:SecretIamMember editor projects/{{project}}/secrets/{{secret_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SecretIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.secretmanager.SecretIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.secretmanager.SecretIamMemberArgs.builder
    com.pulumi.gcp.secretmanager.SecretIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type SecretmanagerFunctions = com.pulumi.gcp.secretmanager.SecretmanagerFunctions
  object SecretmanagerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.secretmanager.SecretmanagerFunctions.*
  extension (self: SecretmanagerFunctions.type)
    /** Use this data source to get information about a Secret Manager Regional Secret */
    def getRegionalSecret(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.secretmanager.outputs.GetRegionalSecretResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getRegionalSecret(args(argsBuilder).build)

    /** Use this data source to get information about a Secret Manager Regional Secret */
    def getRegionalSecretPlain(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.secretmanager.outputs.GetRegionalSecretResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretPlainArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getRegionalSecretPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for regionalsecret */
    def getRegionalSecretIamPolicy(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.secretmanager.outputs.GetRegionalSecretIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretIamPolicyArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getRegionalSecretIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for regionalsecret */
    def getRegionalSecretIamPolicyPlain(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.secretmanager.outputs.GetRegionalSecretIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretIamPolicyPlainArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getRegionalSecretIamPolicyPlain(args(argsBuilder).build)

    /**
     * subcategory: &#34;Secret Manager&#34;
     *  description: |-
     *    Get a Secret Manager regional secret&#39;s version.
     *  ---
     * 
     *  Get the value and metadata from a Secret Manager regional secret version. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/regional-secrets-overview) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.locations.secrets.versions). If you don&#39;t need the metadata (i.e., if you want to use a more limited role to access the regional secret version only), see also the gcp.secretmanager.getRegionalSecretVersionAccess datasource.
     */
    def getRegionalSecretVersion(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.secretmanager.outputs.GetRegionalSecretVersionResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretVersionArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getRegionalSecretVersion(args(argsBuilder).build)

    /**
     * subcategory: &#34;Secret Manager&#34;
     *  description: |-
     *    Get a Secret Manager regional secret&#39;s version.
     *  ---
     * 
     *  Get the value and metadata from a Secret Manager regional secret version. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/regional-secrets-overview) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.locations.secrets.versions). If you don&#39;t need the metadata (i.e., if you want to use a more limited role to access the regional secret version only), see also the gcp.secretmanager.getRegionalSecretVersionAccess datasource.
     */
    def getRegionalSecretVersionPlain(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.secretmanager.outputs.GetRegionalSecretVersionResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretVersionPlainArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getRegionalSecretVersionPlain(args(argsBuilder).build)

    /**
     * subcategory: &#34;Secret Manager&#34;
     *  page_title: &#34;Google: gcp.secretmanager.getRegionalSecretVersionAccess&#34;
     *  description: |-
     *    Get a payload of Secret Manager regional secret&#39;s version.
     *  ---
     * 
     *  Get the value from a Secret Manager regional secret version. This is similar to the gcp.secretmanager.RegionalSecretVersion datasource, but it only requires the [Secret Manager Secret Accessor](https://cloud.google.com/secret-manager/docs/access-control#secretmanager.secretAccessor) role. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/regional-secrets-overview) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.locations.secrets.versions/access).
     */
    def getRegionalSecretVersionAccess(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretVersionAccessArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.secretmanager.outputs.GetRegionalSecretVersionAccessResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretVersionAccessArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getRegionalSecretVersionAccess(args(argsBuilder).build)

    /**
     * subcategory: &#34;Secret Manager&#34;
     *  page_title: &#34;Google: gcp.secretmanager.getRegionalSecretVersionAccess&#34;
     *  description: |-
     *    Get a payload of Secret Manager regional secret&#39;s version.
     *  ---
     * 
     *  Get the value from a Secret Manager regional secret version. This is similar to the gcp.secretmanager.RegionalSecretVersion datasource, but it only requires the [Secret Manager Secret Accessor](https://cloud.google.com/secret-manager/docs/access-control#secretmanager.secretAccessor) role. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/regional-secrets-overview) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.locations.secrets.versions/access).
     */
    def getRegionalSecretVersionAccessPlain(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretVersionAccessPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.secretmanager.outputs.GetRegionalSecretVersionAccessResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretVersionAccessPlainArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getRegionalSecretVersionAccessPlain(args(argsBuilder).build)

    /**
     * subcategory: &#34;Secret Manager&#34;
     *  description: |-
     *    List the Secret Manager Regional Secrets.
     *  ---
     * 
     *  Use this data source to list the Secret Manager Regional Secrets.
     */
    def getRegionalSecrets(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.secretmanager.outputs.GetRegionalSecretsResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretsArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getRegionalSecrets(args(argsBuilder).build)

    /**
     * subcategory: &#34;Secret Manager&#34;
     *  description: |-
     *    List the Secret Manager Regional Secrets.
     *  ---
     * 
     *  Use this data source to list the Secret Manager Regional Secrets.
     */
    def getRegionalSecretsPlain(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.secretmanager.outputs.GetRegionalSecretsResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetRegionalSecretsPlainArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getRegionalSecretsPlain(args(argsBuilder).build)

    /** Use this data source to get information about a Secret Manager Secret */
    def getSecret(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetSecretArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.secretmanager.outputs.GetSecretResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetSecretArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getSecret(args(argsBuilder).build)

    /** Use this data source to get information about a Secret Manager Secret */
    def getSecretPlain(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetSecretPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.secretmanager.outputs.GetSecretResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetSecretPlainArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getSecretPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for secret */
    def getSecretIamPolicy(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetSecretIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.secretmanager.outputs.GetSecretIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetSecretIamPolicyArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getSecretIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for secret */
    def getSecretIamPolicyPlain(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetSecretIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.secretmanager.outputs.GetSecretIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetSecretIamPolicyPlainArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getSecretIamPolicyPlain(args(argsBuilder).build)

    /** Get the value and metadata from a Secret Manager secret version. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets.versions). If you don&#39;t need the metadata (i.e., if you want to use a more limited role to access the secret version only), see also the gcp.secretmanager.getSecretVersionAccess datasource. */
    def getSecretVersion(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetSecretVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.secretmanager.outputs.GetSecretVersionResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetSecretVersionArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getSecretVersion(args(argsBuilder).build)

    /** Get the value and metadata from a Secret Manager secret version. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets.versions). If you don&#39;t need the metadata (i.e., if you want to use a more limited role to access the secret version only), see also the gcp.secretmanager.getSecretVersionAccess datasource. */
    def getSecretVersionPlain(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetSecretVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.secretmanager.outputs.GetSecretVersionResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetSecretVersionPlainArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getSecretVersionPlain(args(argsBuilder).build)

    /** Get the value from a Secret Manager secret version. This is similar to the gcp.secretmanager.SecretVersion datasource, but it only requires the [Secret Manager Secret Accessor](https://cloud.google.com/secret-manager/docs/access-control#secretmanager.secretAccessor) role. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets.versions/access). */
    def getSecretVersionAccess(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetSecretVersionAccessArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.secretmanager.outputs.GetSecretVersionAccessResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetSecretVersionAccessArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getSecretVersionAccess(args(argsBuilder).build)

    /** Get the value from a Secret Manager secret version. This is similar to the gcp.secretmanager.SecretVersion datasource, but it only requires the [Secret Manager Secret Accessor](https://cloud.google.com/secret-manager/docs/access-control#secretmanager.secretAccessor) role. For more information see the [official documentation](https://cloud.google.com/secret-manager/docs/) and [API](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets.versions/access). */
    def getSecretVersionAccessPlain(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetSecretVersionAccessPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.secretmanager.outputs.GetSecretVersionAccessResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetSecretVersionAccessPlainArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getSecretVersionAccessPlain(args(argsBuilder).build)

    /** Use this data source to list the Secret Manager Secrets */
    def getSecrets(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetSecretsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.secretmanager.outputs.GetSecretsResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetSecretsArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getSecrets(args(argsBuilder).build)

    /** Use this data source to list the Secret Manager Secrets */
    def getSecretsPlain(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.GetSecretsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.secretmanager.outputs.GetSecretsResult] =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.GetSecretsPlainArgs.builder
      com.pulumi.gcp.secretmanager.SecretmanagerFunctions.getSecretsPlain(args(argsBuilder).build)

  /**
   * A secret version resource.
   * 
   *  To get more information about SecretVersion, see:
   * 
   *  * [API documentation](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.secrets.versions)
   *  * How-to Guides
   *      * [Create and deploy a Secret Version](https://cloud.google.com/secret-manager/docs/add-secret-version)
   * 
   *  &gt; **Warning:** The behavior of the `secretData` field is force new.
   *  While updating this field, Terraform deletes the existing resource and then creates a new one, which may cause potential outages. To mitigate
   *  this, use the `createBeforeDestroy` field within the lifecycle block.
   * 
   *  For more details, refer to the Terraform lifecycle documentation.
   * 
   *  &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `secretDataWo`.
   *  Read more about Write-only Arguments.
   */
  def SecretVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.secretmanager.SecretVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.secretmanager.SecretVersionArgs.builder
    com.pulumi.gcp.secretmanager.SecretVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Secret Manager Secret. Each of these resources serves a different use case:
   * 
   *  * `gcp.secretmanager.SecretIamPolicy`: Authoritative. Sets the IAM policy for the secret and replaces any existing policy already attached.
   *  * `gcp.secretmanager.SecretIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the secret are preserved.
   *  * `gcp.secretmanager.SecretIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the secret are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.secretmanager.SecretIamPolicy`: Retrieves the IAM policy for the secret
   * 
   *  &gt; **Note:** `gcp.secretmanager.SecretIamPolicy` **cannot** be used in conjunction with `gcp.secretmanager.SecretIamBinding` and `gcp.secretmanager.SecretIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.secretmanager.SecretIamBinding` resources **can be** used in conjunction with `gcp.secretmanager.SecretIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.secretmanager.SecretIamPolicy
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
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecretIamPolicy("policy", SecretIamPolicyArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
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
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecretIamPolicy("policy", SecretIamPolicyArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.secretmanager.SecretIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.SecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.SecretIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SecretIamBinding("binding", SecretIamBindingArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.SecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.SecretIamBindingArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SecretIamBinding("binding", SecretIamBindingArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecretIamBindingConditionArgs.builder()
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
   *  ## gcp.secretmanager.SecretIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.SecretIamMember;
   *  import com.pulumi.gcp.secretmanager.SecretIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SecretIamMember("member", SecretIamMemberArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.SecretIamMember;
   *  import com.pulumi.gcp.secretmanager.SecretIamMemberArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SecretIamMember("member", SecretIamMemberArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecretIamMemberConditionArgs.builder()
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
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Secret Manager Secret
   * 
   *  Three different resources help you manage your IAM policy for Secret Manager Secret. Each of these resources serves a different use case:
   * 
   *  * `gcp.secretmanager.SecretIamPolicy`: Authoritative. Sets the IAM policy for the secret and replaces any existing policy already attached.
   *  * `gcp.secretmanager.SecretIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the secret are preserved.
   *  * `gcp.secretmanager.SecretIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the secret are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.secretmanager.SecretIamPolicy`: Retrieves the IAM policy for the secret
   * 
   *  &gt; **Note:** `gcp.secretmanager.SecretIamPolicy` **cannot** be used in conjunction with `gcp.secretmanager.SecretIamBinding` and `gcp.secretmanager.SecretIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.secretmanager.SecretIamBinding` resources **can be** used in conjunction with `gcp.secretmanager.SecretIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.secretmanager.SecretIamPolicy
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
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecretIamPolicy("policy", SecretIamPolicyArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
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
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicy;
   *  import com.pulumi.gcp.secretmanager.SecretIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/secretmanager.secretAccessor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecretIamPolicy("policy", SecretIamPolicyArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.secretmanager.SecretIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.SecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.SecretIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SecretIamBinding("binding", SecretIamBindingArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.SecretIamBinding;
   *  import com.pulumi.gcp.secretmanager.SecretIamBindingArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SecretIamBinding("binding", SecretIamBindingArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecretIamBindingConditionArgs.builder()
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
   *  ## gcp.secretmanager.SecretIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.secretmanager.SecretIamMember;
   *  import com.pulumi.gcp.secretmanager.SecretIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SecretIamMember("member", SecretIamMemberArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
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
   *  import com.pulumi.gcp.secretmanager.SecretIamMember;
   *  import com.pulumi.gcp.secretmanager.SecretIamMemberArgs;
   *  import com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SecretIamMember("member", SecretIamMemberArgs.builder()
   *              .project(secret_basic.project())
   *              .secretId(secret_basic.secretId())
   *              .role("roles/secretmanager.secretAccessor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecretIamMemberConditionArgs.builder()
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
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/secrets/{{secret_id}}
   *  * {{project}}/{{secret_id}}
   *  * {{secret_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Secret Manager secret IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_secret_manager_secret_iam_member.editor &#34;projects/{{project}}/secrets/{{secret_id}} roles/secretmanager.secretAccessor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_secret_manager_secret_iam_binding.editor &#34;projects/{{project}}/secrets/{{secret_id}} roles/secretmanager.secretAccessor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:secretmanager/secretIamPolicy:SecretIamPolicy editor projects/{{project}}/secrets/{{secret_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SecretIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.secretmanager.SecretIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.secretmanager.SecretIamPolicyArgs.builder
    com.pulumi.gcp.secretmanager.SecretIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs.Builder)
    /**
     * @param auto The Secret will automatically be replicated without any restrictions.
     *  Structure is documented below.
     * @return builder
     */
    def auto(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoArgs.builder
      builder.auto(args(argsBuilder).build)

    /**
     * @param userManaged The Secret will be replicated to the regions specified by the user.
     *  Structure is documented below.
     * @return builder
     */
    def userManaged(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedArgs.builder
      builder.userManaged(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoArgs.Builder)
    /**
     * @param customerManagedEncryption The customer-managed encryption configuration of the Secret.
     *  If no configuration is provided, Google-managed default
     *  encryption is used.
     *  Structure is documented below.
     * @return builder
     */
    def customerManagedEncryption(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoCustomerManagedEncryptionArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoCustomerManagedEncryptionArgs.builder
      builder.customerManagedEncryption(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.SecretState.Builder)
    /**
     * @param replication The replication policy of the secret data attached to the Secret. It cannot be changed
     *  after the Secret has been created.
     *  Structure is documented below.
     * @return builder
     */
    def replication(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs.builder
      builder.replication(args(argsBuilder).build)

    /**
     * @param rotation The rotation time and period for a Secret. At `nextRotationTime`, Secret Manager will send a Pub/Sub notification to the topics configured on the Secret. `topics` must be set to configure rotation.
     *  Structure is documented below.
     * @return builder
     */
    def rotation(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretRotationArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretRotationArgs.builder
      builder.rotation(args(argsBuilder).build)

    /**
     * @param topics A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     *  Structure is documented below.
     * @return builder
     */
    def topics(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretTopicArgs.Builder]*):
        com.pulumi.gcp.secretmanager.inputs.SecretState.Builder =
      def argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.secretmanager.inputs.SecretState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.gcp.secretmanager.inputs.RegionalSecretState.Builder)
    /**
     * @param customerManagedEncryption The customer-managed encryption configuration of the regional secret.
     *  Structure is documented below.
     * @return builder
     */
    def customerManagedEncryption(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretCustomerManagedEncryptionArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.RegionalSecretState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretCustomerManagedEncryptionArgs.builder
      builder.customerManagedEncryption(args(argsBuilder).build)

    /**
     * @param rotation The rotation time and period for a regional secret. At `nextRotationTime`, Secret Manager
     *  will send a Pub/Sub notification to the topics configured on the Secret. `topics` must be
     *  set to configure rotation.
     *  Structure is documented below.
     * @return builder
     */
    def rotation(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretRotationArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.RegionalSecretState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretRotationArgs.builder
      builder.rotation(args(argsBuilder).build)

    /**
     * @param topics A list of up to 10 Pub/Sub topics to which messages are published when control plane
     *  operations are called on the regional secret or its versions.
     *  Structure is documented below.
     * @return builder
     */
    def topics(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretTopicArgs.Builder]*):
        com.pulumi.gcp.secretmanager.inputs.RegionalSecretState.Builder =
      def argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.secretmanager.inputs.RegionalSecretState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedReplicaArgs.Builder)
    /**
     * @param customerManagedEncryption Customer Managed Encryption for the secret.
     *  Structure is documented below.
     * @return builder
     */
    def customerManagedEncryption(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedReplicaArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs.builder
      builder.customerManagedEncryption(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.SecretIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedArgs.Builder)
    /**
     * @param replicas The list of Replicas for this Secret. Cannot be empty.
     *  Structure is documented below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedReplicaArgs.Builder]*):
        com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedArgs.Builder =
      def argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.RegionalSecretVersionState.Builder)
    /**
     * @param customerManagedEncryptions The customer-managed encryption configuration of the regional secret.
     *  Structure is documented below.
     * @return builder
     */
    def customerManagedEncryptions(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretVersionCustomerManagedEncryptionArgs.Builder]*):
        com.pulumi.gcp.secretmanager.inputs.RegionalSecretVersionState.Builder =
      def argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretVersionCustomerManagedEncryptionArgs.builder
      builder.customerManagedEncryptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.SecretIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A Regional Secret is a logical secret whose value and versions can be created and accessed within a region only.
   * 
   *  To get more information about RegionalSecret, see:
   * 
   *  * [API documentation](https://cloud.google.com/secret-manager/docs/reference/rest/v1/projects.locations.secrets)
   *  * How-to Guides
   *      * [Create and deploy a Regional Secret](https://cloud.google.com/secret-manager/regional-secrets/create-regional-secret)
   */
  def RegionalSecret(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.secretmanager.RegionalSecretArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.secretmanager.RegionalSecretArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.gcp.secretmanager.RegionalSecret(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
