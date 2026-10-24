package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object beyondcorp:
  object BeyondcorpFunctions:
    /** Get information about a Google BeyondCorp Security Gateway. */
    inline def getSecurityGateway(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.beyondcorp.outputs.GetSecurityGatewayResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getSecurityGateway(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get information about a Google BeyondCorp Security Gateway. */
    inline def getSecurityGatewayPlain(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.beyondcorp.outputs.GetSecurityGatewayResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayPlainArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getSecurityGatewayPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for securitygatewayapplication */
    inline def getSecurityGatewayApplicationIamPolicy(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayApplicationIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.beyondcorp.outputs.GetSecurityGatewayApplicationIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayApplicationIamPolicyArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getSecurityGatewayApplicationIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for securitygatewayapplication */
    inline def getSecurityGatewayApplicationIamPolicyPlain(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayApplicationIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.beyondcorp.outputs.GetSecurityGatewayApplicationIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayApplicationIamPolicyPlainArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getSecurityGatewayApplicationIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for securitygateway */
    inline def getSecurityGatewayIamPolicy(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.beyondcorp.outputs.GetSecurityGatewayIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayIamPolicyArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getSecurityGatewayIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for securitygateway */
    inline def getSecurityGatewayIamPolicyPlain(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.beyondcorp.outputs.GetSecurityGatewayIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayIamPolicyPlainArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getSecurityGatewayIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Deployment of Security Gateway. */
  inline def SecurityGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGateway(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Specifies application endpoint(s) to protect behind a Security Gateway. */
  inline def SecurityGatewayApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGatewayApplication(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGatewayApplication. Each of these resources serves a different use case:
   * 
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Authoritative. Sets the IAM policy for the securitygatewayapplication and replaces any existing policy already attached.
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the securitygatewayapplication are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the securitygatewayapplication are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Retrieves the IAM policy for the securitygatewayapplication
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` and `gcp.beyondcorp.SecurityGatewayApplicationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayApplicationIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayApplicationIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## This resource supports User Project Overrides.
   * 
   * -
   * 
   * # IAM policy for BeyondCorp SecurityGatewayApplication
   * 
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGatewayApplication. Each of these resources serves a different use case:
   * 
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Authoritative. Sets the IAM policy for the securitygatewayapplication and replaces any existing policy already attached.
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the securitygatewayapplication are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the securitygatewayapplication are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Retrieves the IAM policy for the securitygatewayapplication
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` and `gcp.beyondcorp.SecurityGatewayApplicationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayApplicationIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayApplicationIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
   * * {{project}}/{{security_gateway_id}}/{{application_id}}
   * * {{security_gateway_id}}/{{application_id}}
   * * {{application_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BeyondCorp securitygatewayapplication IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_beyondcorp_security_gateway_application_iam_member.editor &#34;projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}} roles/beyondcorp.securityGatewayUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_beyondcorp_security_gateway_application_iam_binding.editor &#34;projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}} roles/beyondcorp.securityGatewayUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:beyondcorp/securityGatewayApplicationIamBinding:SecurityGatewayApplicationIamBinding editor projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def SecurityGatewayApplicationIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGatewayApplication. Each of these resources serves a different use case:
   * 
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Authoritative. Sets the IAM policy for the securitygatewayapplication and replaces any existing policy already attached.
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the securitygatewayapplication are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the securitygatewayapplication are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Retrieves the IAM policy for the securitygatewayapplication
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` and `gcp.beyondcorp.SecurityGatewayApplicationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayApplicationIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayApplicationIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## This resource supports User Project Overrides.
   * 
   * -
   * 
   * # IAM policy for BeyondCorp SecurityGatewayApplication
   * 
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGatewayApplication. Each of these resources serves a different use case:
   * 
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Authoritative. Sets the IAM policy for the securitygatewayapplication and replaces any existing policy already attached.
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the securitygatewayapplication are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the securitygatewayapplication are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Retrieves the IAM policy for the securitygatewayapplication
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` and `gcp.beyondcorp.SecurityGatewayApplicationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayApplicationIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayApplicationIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
   * * {{project}}/{{security_gateway_id}}/{{application_id}}
   * * {{security_gateway_id}}/{{application_id}}
   * * {{application_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BeyondCorp securitygatewayapplication IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_beyondcorp_security_gateway_application_iam_member.editor &#34;projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}} roles/beyondcorp.securityGatewayUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_beyondcorp_security_gateway_application_iam_binding.editor &#34;projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}} roles/beyondcorp.securityGatewayUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:beyondcorp/securityGatewayApplicationIamMember:SecurityGatewayApplicationIamMember editor projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def SecurityGatewayApplicationIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGatewayApplication. Each of these resources serves a different use case:
   * 
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Authoritative. Sets the IAM policy for the securitygatewayapplication and replaces any existing policy already attached.
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the securitygatewayapplication are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the securitygatewayapplication are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Retrieves the IAM policy for the securitygatewayapplication
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` and `gcp.beyondcorp.SecurityGatewayApplicationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayApplicationIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayApplicationIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## This resource supports User Project Overrides.
   * 
   * -
   * 
   * # IAM policy for BeyondCorp SecurityGatewayApplication
   * 
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGatewayApplication. Each of these resources serves a different use case:
   * 
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Authoritative. Sets the IAM policy for the securitygatewayapplication and replaces any existing policy already attached.
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the securitygatewayapplication are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the securitygatewayapplication are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Retrieves the IAM policy for the securitygatewayapplication
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` and `gcp.beyondcorp.SecurityGatewayApplicationIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayApplicationIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayApplicationIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .applicationId(example.get("applicationId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayApplicationIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
   * * {{project}}/{{security_gateway_id}}/{{application_id}}
   * * {{security_gateway_id}}/{{application_id}}
   * * {{application_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BeyondCorp securitygatewayapplication IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_beyondcorp_security_gateway_application_iam_member.editor &#34;projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}} roles/beyondcorp.securityGatewayUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_beyondcorp_security_gateway_application_iam_binding.editor &#34;projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}} roles/beyondcorp.securityGatewayUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:beyondcorp/securityGatewayApplicationIamPolicy:SecurityGatewayApplicationIamPolicy editor projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def SecurityGatewayApplicationIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGateway. Each of these resources serves a different use case:
   * 
   * * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Authoritative. Sets the IAM policy for the securitygateway and replaces any existing policy already attached.
   * * `gcp.beyondcorp.SecurityGatewayIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the securitygateway are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.beyondcorp.SecurityGatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the securitygateway are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Retrieves the IAM policy for the securitygateway
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayIamBinding` and `gcp.beyondcorp.SecurityGatewayIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.beyondcorp.SecurityGatewayIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## This resource supports User Project Overrides.
   * 
   * -
   * 
   * # IAM policy for BeyondCorp SecurityGateway
   * 
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGateway. Each of these resources serves a different use case:
   * 
   * * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Authoritative. Sets the IAM policy for the securitygateway and replaces any existing policy already attached.
   * * `gcp.beyondcorp.SecurityGatewayIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the securitygateway are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.beyondcorp.SecurityGatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the securitygateway are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Retrieves the IAM policy for the securitygateway
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayIamBinding` and `gcp.beyondcorp.SecurityGatewayIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.beyondcorp.SecurityGatewayIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}}
   * * {{project}}/{{location}}/{{security_gateway_id}}
   * * {{location}}/{{security_gateway_id}}
   * * {{security_gateway_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BeyondCorp securitygateway IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_beyondcorp_security_gateway_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}} roles/beyondcorp.securityGatewayUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_beyondcorp_security_gateway_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}} roles/beyondcorp.securityGatewayUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:beyondcorp/securityGatewayIamBinding:SecurityGatewayIamBinding editor projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def SecurityGatewayIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGateway. Each of these resources serves a different use case:
   * 
   * * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Authoritative. Sets the IAM policy for the securitygateway and replaces any existing policy already attached.
   * * `gcp.beyondcorp.SecurityGatewayIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the securitygateway are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.beyondcorp.SecurityGatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the securitygateway are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Retrieves the IAM policy for the securitygateway
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayIamBinding` and `gcp.beyondcorp.SecurityGatewayIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.beyondcorp.SecurityGatewayIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## This resource supports User Project Overrides.
   * 
   * -
   * 
   * # IAM policy for BeyondCorp SecurityGateway
   * 
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGateway. Each of these resources serves a different use case:
   * 
   * * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Authoritative. Sets the IAM policy for the securitygateway and replaces any existing policy already attached.
   * * `gcp.beyondcorp.SecurityGatewayIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the securitygateway are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.beyondcorp.SecurityGatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the securitygateway are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Retrieves the IAM policy for the securitygateway
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayIamBinding` and `gcp.beyondcorp.SecurityGatewayIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.beyondcorp.SecurityGatewayIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}}
   * * {{project}}/{{location}}/{{security_gateway_id}}
   * * {{location}}/{{security_gateway_id}}
   * * {{security_gateway_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BeyondCorp securitygateway IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_beyondcorp_security_gateway_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}} roles/beyondcorp.securityGatewayUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_beyondcorp_security_gateway_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}} roles/beyondcorp.securityGatewayUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:beyondcorp/securityGatewayIamMember:SecurityGatewayIamMember editor projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def SecurityGatewayIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGateway. Each of these resources serves a different use case:
   * 
   * * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Authoritative. Sets the IAM policy for the securitygateway and replaces any existing policy already attached.
   * * `gcp.beyondcorp.SecurityGatewayIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the securitygateway are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.beyondcorp.SecurityGatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the securitygateway are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Retrieves the IAM policy for the securitygateway
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayIamBinding` and `gcp.beyondcorp.SecurityGatewayIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.beyondcorp.SecurityGatewayIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## This resource supports User Project Overrides.
   * 
   * -
   * 
   * # IAM policy for BeyondCorp SecurityGateway
   * 
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGateway. Each of these resources serves a different use case:
   * 
   * * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Authoritative. Sets the IAM policy for the securitygateway and replaces any existing policy already attached.
   * * `gcp.beyondcorp.SecurityGatewayIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the securitygateway are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.beyondcorp.SecurityGatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the securitygateway are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Retrieves the IAM policy for the securitygateway
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayIamBinding` and `gcp.beyondcorp.SecurityGatewayIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.beyondcorp.SecurityGatewayIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/beyondcorp.securityGatewayUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.beyondcorp.SecurityGatewayIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   * import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   * import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .securityGatewayId(example.get("securityGatewayId"))
   *             .role("roles/beyondcorp.securityGatewayUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(SecurityGatewayIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}}
   * * {{project}}/{{location}}/{{security_gateway_id}}
   * * {{location}}/{{security_gateway_id}}
   * * {{security_gateway_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BeyondCorp securitygateway IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_beyondcorp_security_gateway_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}} roles/beyondcorp.securityGatewayUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_beyondcorp_security_gateway_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}} roles/beyondcorp.securityGatewayUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:beyondcorp/securityGatewayIamPolicy:SecurityGatewayIamPolicy editor projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def SecurityGatewayIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
