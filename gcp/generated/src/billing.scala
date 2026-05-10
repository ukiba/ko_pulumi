package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object billing:
  /**
   * Three different resources help you manage IAM policies on billing accounts. Each of these resources serves a different use case:
   * 
   *  * `gcp.billing.AccountIamPolicy`: Authoritative. Sets the IAM policy for the billing accounts and replaces any existing policy already attached.
   *  * `gcp.billing.AccountIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved.
   *  * `gcp.billing.AccountIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role of the billing accounts are preserved.
   * 
   *  &gt; **Note:** `gcp.billing.AccountIamPolicy` **cannot** be used in conjunction with `gcp.billing.AccountIamBinding` and `gcp.billing.AccountIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the billing account as `gcp.billing.AccountIamPolicy` replaces the entire policy.
   * 
   *  &gt; **Note:** `gcp.billing.AccountIamBinding` resources **can be** used in conjunction with `gcp.billing.AccountIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.billing.AccountIamPolicy
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
   *  import com.pulumi.gcp.billing.AccountIamPolicy;
   *  import com.pulumi.gcp.billing.AccountIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/billing.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new AccountIamPolicy("editor", AccountIamPolicyArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.billing.AccountIamBinding;
   *  import com.pulumi.gcp.billing.AccountIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new AccountIamBinding("editor", AccountIamBindingArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .role("roles/billing.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.billing.AccountIamMember;
   *  import com.pulumi.gcp.billing.AccountIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new AccountIamMember("editor", AccountIamMemberArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .role("roles/billing.viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamPolicy
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
   *  import com.pulumi.gcp.billing.AccountIamPolicy;
   *  import com.pulumi.gcp.billing.AccountIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/billing.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new AccountIamPolicy("editor", AccountIamPolicyArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.billing.AccountIamBinding;
   *  import com.pulumi.gcp.billing.AccountIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new AccountIamBinding("editor", AccountIamBindingArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .role("roles/billing.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.billing.AccountIamMember;
   *  import com.pulumi.gcp.billing.AccountIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new AccountIamMember("editor", AccountIamMemberArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .role("roles/billing.viewer")
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
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `organizations/my-org-id/roles/my-custom-role`.
   */
  def AccountIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.billing.AccountIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.billing.AccountIamMemberArgs.builder
    com.pulumi.gcp.billing.AccountIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.billing.BudgetArgs.Builder)
    /**
     * @param allUpdatesRule Defines notifications that are sent on every update to the
     *  billing account&#39;s spend, regardless of the thresholds defined
     *  using threshold rules.
     *  Structure is documented below.
     * @return builder
     */
    def allUpdatesRule(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetAllUpdatesRuleArgs.Builder]):
        com.pulumi.gcp.billing.BudgetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetAllUpdatesRuleArgs.builder
      builder.allUpdatesRule(args(argsBuilder).build)

    /**
     * @param amount The budgeted amount for each usage period.
     *  Structure is documented below.
     * @return builder
     */
    def amount(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetAmountArgs.Builder]):
        com.pulumi.gcp.billing.BudgetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetAmountArgs.builder
      builder.amount(args(argsBuilder).build)

    /**
     * @param budgetFilter Filters that define which resources are used to compute the actual
     *  spend against the budget.
     *  Structure is documented below.
     * @return builder
     */
    def budgetFilter(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs.Builder]):
        com.pulumi.gcp.billing.BudgetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs.builder
      builder.budgetFilter(args(argsBuilder).build)

    /**
     * @param thresholdRules Rules that trigger alerts (notifications of thresholds being
     *  crossed) when spend exceeds the specified percentages of the
     *  budget.
     *  Structure is documented below.
     * @return builder
     */
    def thresholdRules(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetThresholdRuleArgs.Builder]*):
        com.pulumi.gcp.billing.BudgetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.billing.inputs.BudgetThresholdRuleArgs.builder
      builder.thresholdRules(args.map(_(argsBuilder).build)*)

  type BillingFunctions = com.pulumi.gcp.billing.BillingFunctions
  object BillingFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.billing.BillingFunctions.*
  extension (self: BillingFunctions.type)
    /**
     * Retrieves the current IAM policy data for a Billing Account.
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
     *  import com.pulumi.gcp.billing.BillingFunctions;
     *  import com.pulumi.gcp.billing.inputs.GetAccountIamPolicyArgs;
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
     *          final var policy = BillingFunctions.getAccountIamPolicy(GetAccountIamPolicyArgs.builder()
     *              .billingAccountId("MEEP-MEEP-MEEP-MEEP-MEEP")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getAccountIamPolicy(args: Endofunction[com.pulumi.gcp.billing.inputs.GetAccountIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.billing.outputs.GetAccountIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.billing.inputs.GetAccountIamPolicyArgs.builder
      com.pulumi.gcp.billing.BillingFunctions.getAccountIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Billing Account.
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
     *  import com.pulumi.gcp.billing.BillingFunctions;
     *  import com.pulumi.gcp.billing.inputs.GetAccountIamPolicyArgs;
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
     *          final var policy = BillingFunctions.getAccountIamPolicy(GetAccountIamPolicyArgs.builder()
     *              .billingAccountId("MEEP-MEEP-MEEP-MEEP-MEEP")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getAccountIamPolicyPlain(args: Endofunction[com.pulumi.gcp.billing.inputs.GetAccountIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.billing.outputs.GetAccountIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.billing.inputs.GetAccountIamPolicyPlainArgs.builder
      com.pulumi.gcp.billing.BillingFunctions.getAccountIamPolicyPlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage IAM policies on billing accounts. Each of these resources serves a different use case:
   * 
   *  * `gcp.billing.AccountIamPolicy`: Authoritative. Sets the IAM policy for the billing accounts and replaces any existing policy already attached.
   *  * `gcp.billing.AccountIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved.
   *  * `gcp.billing.AccountIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role of the billing accounts are preserved.
   * 
   *  &gt; **Note:** `gcp.billing.AccountIamPolicy` **cannot** be used in conjunction with `gcp.billing.AccountIamBinding` and `gcp.billing.AccountIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the billing account as `gcp.billing.AccountIamPolicy` replaces the entire policy.
   * 
   *  &gt; **Note:** `gcp.billing.AccountIamBinding` resources **can be** used in conjunction with `gcp.billing.AccountIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.billing.AccountIamPolicy
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
   *  import com.pulumi.gcp.billing.AccountIamPolicy;
   *  import com.pulumi.gcp.billing.AccountIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/billing.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new AccountIamPolicy("editor", AccountIamPolicyArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.billing.AccountIamBinding;
   *  import com.pulumi.gcp.billing.AccountIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new AccountIamBinding("editor", AccountIamBindingArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .role("roles/billing.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.billing.AccountIamMember;
   *  import com.pulumi.gcp.billing.AccountIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new AccountIamMember("editor", AccountIamMemberArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .role("roles/billing.viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamPolicy
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
   *  import com.pulumi.gcp.billing.AccountIamPolicy;
   *  import com.pulumi.gcp.billing.AccountIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/billing.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new AccountIamPolicy("editor", AccountIamPolicyArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.billing.AccountIamBinding;
   *  import com.pulumi.gcp.billing.AccountIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new AccountIamBinding("editor", AccountIamBindingArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .role("roles/billing.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.billing.AccountIamMember;
   *  import com.pulumi.gcp.billing.AccountIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new AccountIamMember("editor", AccountIamMemberArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .role("roles/billing.viewer")
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
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `organizations/my-org-id/roles/my-custom-role`.
   */
  def AccountIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.billing.AccountIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.billing.AccountIamPolicyArgs.builder
    com.pulumi.gcp.billing.AccountIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.billing.AccountIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.billing.inputs.AccountIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.billing.AccountIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.AccountIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Budget configuration for a billing account.
   * 
   *  To get more information about Budget, see:
   * 
   *  * [API documentation](https://cloud.google.com/billing/docs/reference/budget/rest/v1/billingAccounts.budgets)
   *  * How-to Guides
   *      * [Creating a budget](https://cloud.google.com/billing/docs/how-to/budgets)
   * 
   *  &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   *  you must specify a `billingProject` and set `userProjectOverride` to true
   *  in the provider configuration. Otherwise the Billing Budgets API will return a 403 error.
   *  Your account must have the `serviceusage.services.use` permission on the
   *  `billingProject` you defined.
   */
  def Budget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.billing.BudgetArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.billing.BudgetArgs.builder
    com.pulumi.gcp.billing.Budget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage IAM policies on billing accounts. Each of these resources serves a different use case:
   * 
   *  * `gcp.billing.AccountIamPolicy`: Authoritative. Sets the IAM policy for the billing accounts and replaces any existing policy already attached.
   *  * `gcp.billing.AccountIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved.
   *  * `gcp.billing.AccountIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role of the billing accounts are preserved.
   * 
   *  &gt; **Note:** `gcp.billing.AccountIamPolicy` **cannot** be used in conjunction with `gcp.billing.AccountIamBinding` and `gcp.billing.AccountIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the billing account as `gcp.billing.AccountIamPolicy` replaces the entire policy.
   * 
   *  &gt; **Note:** `gcp.billing.AccountIamBinding` resources **can be** used in conjunction with `gcp.billing.AccountIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.billing.AccountIamPolicy
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
   *  import com.pulumi.gcp.billing.AccountIamPolicy;
   *  import com.pulumi.gcp.billing.AccountIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/billing.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new AccountIamPolicy("editor", AccountIamPolicyArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.billing.AccountIamBinding;
   *  import com.pulumi.gcp.billing.AccountIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new AccountIamBinding("editor", AccountIamBindingArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .role("roles/billing.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.billing.AccountIamMember;
   *  import com.pulumi.gcp.billing.AccountIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new AccountIamMember("editor", AccountIamMemberArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .role("roles/billing.viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamPolicy
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
   *  import com.pulumi.gcp.billing.AccountIamPolicy;
   *  import com.pulumi.gcp.billing.AccountIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/billing.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new AccountIamPolicy("editor", AccountIamPolicyArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.billing.AccountIamBinding;
   *  import com.pulumi.gcp.billing.AccountIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new AccountIamBinding("editor", AccountIamBindingArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .role("roles/billing.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.billing.AccountIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.billing.AccountIamMember;
   *  import com.pulumi.gcp.billing.AccountIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new AccountIamMember("editor", AccountIamMemberArgs.builder()
   *              .billingAccountId("00AA00-000AAA-00AA0A")
   *              .role("roles/billing.viewer")
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
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `organizations/my-org-id/roles/my-custom-role`.
   */
  def AccountIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.billing.AccountIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.billing.AccountIamBindingArgs.builder
    com.pulumi.gcp.billing.AccountIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Allows creation and management of a Google Cloud Billing Subaccount.
   * 
   *  !&gt; **WARNING:** Deleting this resource will not delete or close the billing subaccount.
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.billing.SubAccount;
   *  import com.pulumi.gcp.billing.SubAccountArgs;
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
   *          var subaccount = new SubAccount("subaccount", SubAccountArgs.builder()
   *              .displayName("My Billing Account")
   *              .masterBillingAccount("012345-567890-ABCDEF")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  Billing Subaccounts can be imported using any of these accepted formats:
   * 
   *  * `billingAccounts/{billing_account_id}`
   * 
   *  When using the `pulumi import` command, Billing Subaccounts can be imported using one of the formats above. For example:
   * 
   *  ```sh
   *  $ pulumi import gcp:billing/subAccount:SubAccount default billingAccounts/{billing_account_id}
   *  ```
   */
  def SubAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.billing.SubAccountArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.billing.SubAccountArgs.builder
    com.pulumi.gcp.billing.SubAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Billing information for a project.
   * 
   *  To get more information about ProjectInfo, see:
   * 
   *  * [API documentation](https://cloud.google.com/billing/docs/reference/rest/v1/projects)
   *  * How-to Guides
   *      * [Enable, disable, or change billing for a project](https://cloud.google.com/billing/docs/how-to/modify-project)
   */
  def ProjectInfo(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.billing.ProjectInfoArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.billing.ProjectInfoArgs.builder
    com.pulumi.gcp.billing.ProjectInfo(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.billing.inputs.AccountIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.billing.inputs.AccountIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.billing.inputs.AccountIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.AccountIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.billing.inputs.BudgetAmountArgs.Builder)
    /**
     * @param specifiedAmount A specified amount to use as the budget. currencyCode is
     *  optional. If specified, it must match the currency of the
     *  billing account. The currencyCode is provided on output.
     *  Structure is documented below.
     * @return builder
     */
    def specifiedAmount(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetAmountSpecifiedAmountArgs.Builder]):
        com.pulumi.gcp.billing.inputs.BudgetAmountArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetAmountSpecifiedAmountArgs.builder
      builder.specifiedAmount(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodArgs.Builder)
    /**
     * @param endDate Optional. The end date of the time period. Budgets with elapsed end date won&#39;t be processed.
     *  If unset, specifies to track all usage incurred since the startDate.
     *  Structure is documented below.
     * @return builder
     */
    def endDate(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodEndDateArgs.Builder]):
        com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodEndDateArgs.builder
      builder.endDate(args(argsBuilder).build)

    /**
     * @param startDate A start date is required. The start date must be after January 1, 2017.
     *  Structure is documented below.
     * @return builder
     */
    def startDate(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodStartDateArgs.Builder]):
        com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodStartDateArgs.builder
      builder.startDate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.billing.inputs.BudgetState.Builder)
    /**
     * @param allUpdatesRule Defines notifications that are sent on every update to the
     *  billing account&#39;s spend, regardless of the thresholds defined
     *  using threshold rules.
     *  Structure is documented below.
     * @return builder
     */
    def allUpdatesRule(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetAllUpdatesRuleArgs.Builder]):
        com.pulumi.gcp.billing.inputs.BudgetState.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetAllUpdatesRuleArgs.builder
      builder.allUpdatesRule(args(argsBuilder).build)

    /**
     * @param amount The budgeted amount for each usage period.
     *  Structure is documented below.
     * @return builder
     */
    def amount(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetAmountArgs.Builder]):
        com.pulumi.gcp.billing.inputs.BudgetState.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetAmountArgs.builder
      builder.amount(args(argsBuilder).build)

    /**
     * @param budgetFilter Filters that define which resources are used to compute the actual
     *  spend against the budget.
     *  Structure is documented below.
     * @return builder
     */
    def budgetFilter(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs.Builder]):
        com.pulumi.gcp.billing.inputs.BudgetState.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs.builder
      builder.budgetFilter(args(argsBuilder).build)

    /**
     * @param thresholdRules Rules that trigger alerts (notifications of thresholds being
     *  crossed) when spend exceeds the specified percentages of the
     *  budget.
     *  Structure is documented below.
     * @return builder
     */
    def thresholdRules(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetThresholdRuleArgs.Builder]*):
        com.pulumi.gcp.billing.inputs.BudgetState.Builder =
      def argsBuilder = com.pulumi.gcp.billing.inputs.BudgetThresholdRuleArgs.builder
      builder.thresholdRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.billing.inputs.AccountIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.billing.inputs.AccountIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.billing.inputs.AccountIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.AccountIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs.Builder)
    /**
     * @param customPeriod Specifies to track usage from any start date (required) to any end date (optional).
     *  This time period is static, it does not recur.
     *  Exactly one of `calendarPeriod`, `customPeriod` must be provided.
     *  Structure is documented below.
     * @return builder
     */
    def customPeriod(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodArgs.Builder]):
        com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodArgs.builder
      builder.customPeriod(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.billing.AccountIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.billing.inputs.AccountIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.billing.AccountIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.AccountIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)
