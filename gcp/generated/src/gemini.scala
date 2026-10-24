package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object gemini:
  /**
   * The resource for managing Code Repository Index for Gemini Code Assist.
   * 
   * To get more information about CodeRepositoryIndex, see:
   * 
   * * [API documentation](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.codeRepositoryIndexes)
   * * How-to Guides
   *     * [Gemini Code Assist overview](https://cloud.google.com/gemini/docs/codeassist/overview)
   */
  def CodeRepositoryIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.CodeRepositoryIndexArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.CodeRepositoryIndexArgs.builder
    com.pulumi.gcp.gemini.CodeRepositoryIndex(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** The resource for managing CodeTools settings for Admin Control. */
  def CodeToolsSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.CodeToolsSettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.CodeToolsSettingArgs.builder
    com.pulumi.gcp.gemini.CodeToolsSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.gemini.CodeToolsSettingArgs.Builder)
    /**
     * @param enabledTools Represents the full set of enabled tools.
     * Structure is documented below.
     * @return builder
     */
    def enabledTools(args: Endofunction[com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.Builder]*):
        com.pulumi.gcp.gemini.CodeToolsSettingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.builder
      builder.enabledTools(args.map(_(argsBuilder).build)*)

  /**
   * The resource for managing CodeTools setting bindings for Admin Control.
   * 
   * To get more information about CodeToolsSettingBinding, see:
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  def CodeToolsSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.CodeToolsSettingBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.CodeToolsSettingBindingArgs.builder
    com.pulumi.gcp.gemini.CodeToolsSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A DataAgent lets users interact with configured data sources by using
   * natural language, as part of the Conversational Analytics API.
   * 
   * &gt; **Note:** Deleting a DataAgent soft-deletes it. A soft-deleted DataAgent
   * is purged after 30 days (see `purgeTime`), and its `dataAgentId` cannot be
   * reused in the same project and location until then. Changing a field that
   * forces replacement (such as `kmsKey`) while keeping the same `dataAgentId`
   * therefore fails with an `ALREADY_EXISTS` error; use a new `dataAgentId`
   * instead.
   * 
   * To get more information about DataAgent, see:
   * 
   * * [API documentation](https://cloud.google.com/gemini/docs/conversational-analytics-api/reference/rest/v1/projects.locations.dataAgents)
   * * How-to Guides
   *     * [Conversational Analytics API overview](https://cloud.google.com/gemini/data-agents/conversational-analytics-api/overview)
   */
  def DataAnalyticsDataAgent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.DataAnalyticsDataAgentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.DataAnalyticsDataAgentArgs.builder
    com.pulumi.gcp.gemini.DataAnalyticsDataAgent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.gemini.DataAnalyticsDataAgentArgs.Builder)
    /**
     * @param dataAnalyticsAgent Data analytics agent configuration.
     * Structure is documented below.
     * @return builder
     */
    def dataAnalyticsAgent(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.Builder]):
        com.pulumi.gcp.gemini.DataAnalyticsDataAgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.builder
      builder.dataAnalyticsAgent(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Gemini Data Analytics DataAgent. Each of these resources serves a different use case:
   * 
   * * `gcp.gemini.DataAnalyticsDataAgentIamPolicy`: Authoritative. Sets the IAM policy for the dataagent and replaces any existing policy already attached.
   * * `gcp.gemini.DataAnalyticsDataAgentIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataagent are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gemini.DataAnalyticsDataAgentIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataagent are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gemini.DataAnalyticsDataAgentIamPolicy`: Retrieves the IAM policy for the dataagent
   * 
   * &gt; **Note:** `gcp.gemini.DataAnalyticsDataAgentIamPolicy` **cannot** be used in conjunction with `gcp.gemini.DataAnalyticsDataAgentIamBinding` and `gcp.gemini.DataAnalyticsDataAgentIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gemini.DataAnalyticsDataAgentIamBinding` resources **can be** used in conjunction with `gcp.gemini.DataAnalyticsDataAgentIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamPolicy
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
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicy;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicyArgs;
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
   *                 .role("roles/geminidataanalytics.dataAgentUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DataAnalyticsDataAgentIamPolicy("policy", DataAnalyticsDataAgentIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBinding;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBindingArgs;
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
   *         var binding = new DataAnalyticsDataAgentIamBinding("binding", DataAnalyticsDataAgentIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .role("roles/geminidataanalytics.dataAgentUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMember;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMemberArgs;
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
   *         var member = new DataAnalyticsDataAgentIamMember("member", DataAnalyticsDataAgentIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .role("roles/geminidataanalytics.dataAgentUser")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Gemini Data Analytics DataAgent
   * 
   * Three different resources help you manage your IAM policy for Gemini Data Analytics DataAgent. Each of these resources serves a different use case:
   * 
   * * `gcp.gemini.DataAnalyticsDataAgentIamPolicy`: Authoritative. Sets the IAM policy for the dataagent and replaces any existing policy already attached.
   * * `gcp.gemini.DataAnalyticsDataAgentIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataagent are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gemini.DataAnalyticsDataAgentIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataagent are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gemini.DataAnalyticsDataAgentIamPolicy`: Retrieves the IAM policy for the dataagent
   * 
   * &gt; **Note:** `gcp.gemini.DataAnalyticsDataAgentIamPolicy` **cannot** be used in conjunction with `gcp.gemini.DataAnalyticsDataAgentIamBinding` and `gcp.gemini.DataAnalyticsDataAgentIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gemini.DataAnalyticsDataAgentIamBinding` resources **can be** used in conjunction with `gcp.gemini.DataAnalyticsDataAgentIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamPolicy
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
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicy;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicyArgs;
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
   *                 .role("roles/geminidataanalytics.dataAgentUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DataAnalyticsDataAgentIamPolicy("policy", DataAnalyticsDataAgentIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBinding;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBindingArgs;
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
   *         var binding = new DataAnalyticsDataAgentIamBinding("binding", DataAnalyticsDataAgentIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .role("roles/geminidataanalytics.dataAgentUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMember;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMemberArgs;
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
   *         var member = new DataAnalyticsDataAgentIamMember("member", DataAnalyticsDataAgentIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .role("roles/geminidataanalytics.dataAgentUser")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/locations/{{location}}/dataAgents/{{data_agent_id}}
   * * {{project}}/{{location}}/{{data_agent_id}}
   * * {{location}}/{{data_agent_id}}
   * * {{data_agent_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Gemini Data Analytics dataagent IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_gemini_data_analytics_data_agent_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataAgents/{{data_agent_id}} roles/geminidataanalytics.dataAgentUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_gemini_data_analytics_data_agent_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataAgents/{{data_agent_id}} roles/geminidataanalytics.dataAgentUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:gemini/dataAnalyticsDataAgentIamBinding:DataAnalyticsDataAgentIamBinding editor projects/{{project}}/locations/{{location}}/dataAgents/{{data_agent_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DataAnalyticsDataAgentIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBindingArgs.builder
    com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Gemini Data Analytics DataAgent. Each of these resources serves a different use case:
   * 
   * * `gcp.gemini.DataAnalyticsDataAgentIamPolicy`: Authoritative. Sets the IAM policy for the dataagent and replaces any existing policy already attached.
   * * `gcp.gemini.DataAnalyticsDataAgentIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataagent are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gemini.DataAnalyticsDataAgentIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataagent are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gemini.DataAnalyticsDataAgentIamPolicy`: Retrieves the IAM policy for the dataagent
   * 
   * &gt; **Note:** `gcp.gemini.DataAnalyticsDataAgentIamPolicy` **cannot** be used in conjunction with `gcp.gemini.DataAnalyticsDataAgentIamBinding` and `gcp.gemini.DataAnalyticsDataAgentIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gemini.DataAnalyticsDataAgentIamBinding` resources **can be** used in conjunction with `gcp.gemini.DataAnalyticsDataAgentIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamPolicy
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
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicy;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicyArgs;
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
   *                 .role("roles/geminidataanalytics.dataAgentUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DataAnalyticsDataAgentIamPolicy("policy", DataAnalyticsDataAgentIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBinding;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBindingArgs;
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
   *         var binding = new DataAnalyticsDataAgentIamBinding("binding", DataAnalyticsDataAgentIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .role("roles/geminidataanalytics.dataAgentUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMember;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMemberArgs;
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
   *         var member = new DataAnalyticsDataAgentIamMember("member", DataAnalyticsDataAgentIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .role("roles/geminidataanalytics.dataAgentUser")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Gemini Data Analytics DataAgent
   * 
   * Three different resources help you manage your IAM policy for Gemini Data Analytics DataAgent. Each of these resources serves a different use case:
   * 
   * * `gcp.gemini.DataAnalyticsDataAgentIamPolicy`: Authoritative. Sets the IAM policy for the dataagent and replaces any existing policy already attached.
   * * `gcp.gemini.DataAnalyticsDataAgentIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataagent are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gemini.DataAnalyticsDataAgentIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataagent are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gemini.DataAnalyticsDataAgentIamPolicy`: Retrieves the IAM policy for the dataagent
   * 
   * &gt; **Note:** `gcp.gemini.DataAnalyticsDataAgentIamPolicy` **cannot** be used in conjunction with `gcp.gemini.DataAnalyticsDataAgentIamBinding` and `gcp.gemini.DataAnalyticsDataAgentIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gemini.DataAnalyticsDataAgentIamBinding` resources **can be** used in conjunction with `gcp.gemini.DataAnalyticsDataAgentIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamPolicy
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
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicy;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicyArgs;
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
   *                 .role("roles/geminidataanalytics.dataAgentUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DataAnalyticsDataAgentIamPolicy("policy", DataAnalyticsDataAgentIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBinding;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBindingArgs;
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
   *         var binding = new DataAnalyticsDataAgentIamBinding("binding", DataAnalyticsDataAgentIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .role("roles/geminidataanalytics.dataAgentUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMember;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMemberArgs;
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
   *         var member = new DataAnalyticsDataAgentIamMember("member", DataAnalyticsDataAgentIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .role("roles/geminidataanalytics.dataAgentUser")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/locations/{{location}}/dataAgents/{{data_agent_id}}
   * * {{project}}/{{location}}/{{data_agent_id}}
   * * {{location}}/{{data_agent_id}}
   * * {{data_agent_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Gemini Data Analytics dataagent IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_gemini_data_analytics_data_agent_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataAgents/{{data_agent_id}} roles/geminidataanalytics.dataAgentUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_gemini_data_analytics_data_agent_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataAgents/{{data_agent_id}} roles/geminidataanalytics.dataAgentUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:gemini/dataAnalyticsDataAgentIamMember:DataAnalyticsDataAgentIamMember editor projects/{{project}}/locations/{{location}}/dataAgents/{{data_agent_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DataAnalyticsDataAgentIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMemberArgs.builder
    com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Gemini Data Analytics DataAgent. Each of these resources serves a different use case:
   * 
   * * `gcp.gemini.DataAnalyticsDataAgentIamPolicy`: Authoritative. Sets the IAM policy for the dataagent and replaces any existing policy already attached.
   * * `gcp.gemini.DataAnalyticsDataAgentIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataagent are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gemini.DataAnalyticsDataAgentIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataagent are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gemini.DataAnalyticsDataAgentIamPolicy`: Retrieves the IAM policy for the dataagent
   * 
   * &gt; **Note:** `gcp.gemini.DataAnalyticsDataAgentIamPolicy` **cannot** be used in conjunction with `gcp.gemini.DataAnalyticsDataAgentIamBinding` and `gcp.gemini.DataAnalyticsDataAgentIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gemini.DataAnalyticsDataAgentIamBinding` resources **can be** used in conjunction with `gcp.gemini.DataAnalyticsDataAgentIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamPolicy
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
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicy;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicyArgs;
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
   *                 .role("roles/geminidataanalytics.dataAgentUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DataAnalyticsDataAgentIamPolicy("policy", DataAnalyticsDataAgentIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBinding;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBindingArgs;
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
   *         var binding = new DataAnalyticsDataAgentIamBinding("binding", DataAnalyticsDataAgentIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .role("roles/geminidataanalytics.dataAgentUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMember;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMemberArgs;
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
   *         var member = new DataAnalyticsDataAgentIamMember("member", DataAnalyticsDataAgentIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .role("roles/geminidataanalytics.dataAgentUser")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Gemini Data Analytics DataAgent
   * 
   * Three different resources help you manage your IAM policy for Gemini Data Analytics DataAgent. Each of these resources serves a different use case:
   * 
   * * `gcp.gemini.DataAnalyticsDataAgentIamPolicy`: Authoritative. Sets the IAM policy for the dataagent and replaces any existing policy already attached.
   * * `gcp.gemini.DataAnalyticsDataAgentIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataagent are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gemini.DataAnalyticsDataAgentIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataagent are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gemini.DataAnalyticsDataAgentIamPolicy`: Retrieves the IAM policy for the dataagent
   * 
   * &gt; **Note:** `gcp.gemini.DataAnalyticsDataAgentIamPolicy` **cannot** be used in conjunction with `gcp.gemini.DataAnalyticsDataAgentIamBinding` and `gcp.gemini.DataAnalyticsDataAgentIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gemini.DataAnalyticsDataAgentIamBinding` resources **can be** used in conjunction with `gcp.gemini.DataAnalyticsDataAgentIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamPolicy
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
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicy;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicyArgs;
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
   *                 .role("roles/geminidataanalytics.dataAgentUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DataAnalyticsDataAgentIamPolicy("policy", DataAnalyticsDataAgentIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBinding;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBindingArgs;
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
   *         var binding = new DataAnalyticsDataAgentIamBinding("binding", DataAnalyticsDataAgentIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .role("roles/geminidataanalytics.dataAgentUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.DataAnalyticsDataAgentIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMember;
   * import com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMemberArgs;
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
   *         var member = new DataAnalyticsDataAgentIamMember("member", DataAnalyticsDataAgentIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .dataAgentId(example.get("dataAgentId"))
   *             .role("roles/geminidataanalytics.dataAgentUser")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/locations/{{location}}/dataAgents/{{data_agent_id}}
   * * {{project}}/{{location}}/{{data_agent_id}}
   * * {{location}}/{{data_agent_id}}
   * * {{data_agent_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Gemini Data Analytics dataagent IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_gemini_data_analytics_data_agent_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataAgents/{{data_agent_id}} roles/geminidataanalytics.dataAgentUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_gemini_data_analytics_data_agent_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataAgents/{{data_agent_id}} roles/geminidataanalytics.dataAgentUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:gemini/dataAnalyticsDataAgentIamPolicy:DataAnalyticsDataAgentIamPolicy editor projects/{{project}}/locations/{{location}}/dataAgents/{{data_agent_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DataAnalyticsDataAgentIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicyArgs.builder
    com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** The resource for managing DataSharingWithGoogle settings for Admin Control. */
  def DataSharingWithGoogleSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.DataSharingWithGoogleSettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.DataSharingWithGoogleSettingArgs.builder
    com.pulumi.gcp.gemini.DataSharingWithGoogleSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The resource for managing DataSharingWithGoogle setting bindings for Admin Control.
   * 
   * To get more information about DataSharingWithGoogleSettingBinding, see:
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  def DataSharingWithGoogleSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.DataSharingWithGoogleSettingBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.DataSharingWithGoogleSettingBindingArgs.builder
    com.pulumi.gcp.gemini.DataSharingWithGoogleSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The resource for managing GdaObservability settings for Admin Control.
   * 
   * To get more information about GdaObservabilitySetting, see:
   * 
   * * [API documentation](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.gdaObservabilitySettings)
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  def GdaObservabilitySetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.GdaObservabilitySettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.GdaObservabilitySettingArgs.builder
    com.pulumi.gcp.gemini.GdaObservabilitySetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.gemini.GdaObservabilitySettingArgs.Builder)
    /**
     * @param conversationalAnalyticsSetting Message describing Setting for Conversational Analytics.
     * Structure is documented below.
     * @return builder
     */
    def conversationalAnalyticsSetting(args: Endofunction[com.pulumi.gcp.gemini.inputs.GdaObservabilitySettingConversationalAnalyticsSettingArgs.Builder]):
        com.pulumi.gcp.gemini.GdaObservabilitySettingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GdaObservabilitySettingConversationalAnalyticsSettingArgs.builder
      builder.conversationalAnalyticsSetting(args(argsBuilder).build)

  /**
   * The resource for managing GdaObservability setting bindings for Admin Control.
   * 
   * To get more information about GdaObservabilitySettingBinding, see:
   * 
   * * [API documentation](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.gdaObservabilitySettings.settingBindings)
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  def GdaObservabilitySettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.GdaObservabilitySettingBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.GdaObservabilitySettingBindingArgs.builder
    com.pulumi.gcp.gemini.GdaObservabilitySettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object GeminiFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for dataagent */
    inline def getDataAnalyticsDataAgentIamPolicy(args: Endofunction[com.pulumi.gcp.gemini.inputs.GetDataAnalyticsDataAgentIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.gemini.outputs.GetDataAnalyticsDataAgentIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GetDataAnalyticsDataAgentIamPolicyArgs.builder
      com.pulumi.gcp.gemini.GeminiFunctions.getDataAnalyticsDataAgentIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for dataagent */
    inline def getDataAnalyticsDataAgentIamPolicyPlain(args: Endofunction[com.pulumi.gcp.gemini.inputs.GetDataAnalyticsDataAgentIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gemini.outputs.GetDataAnalyticsDataAgentIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GetDataAnalyticsDataAgentIamPolicyPlainArgs.builder
      com.pulumi.gcp.gemini.GeminiFunctions.getDataAnalyticsDataAgentIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for repositorygroup */
    inline def getRepositoryGroupIamPolicy(args: Endofunction[com.pulumi.gcp.gemini.inputs.GetRepositoryGroupIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.gemini.outputs.GetRepositoryGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GetRepositoryGroupIamPolicyArgs.builder
      com.pulumi.gcp.gemini.GeminiFunctions.getRepositoryGroupIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for repositorygroup */
    inline def getRepositoryGroupIamPolicyPlain(args: Endofunction[com.pulumi.gcp.gemini.inputs.GetRepositoryGroupIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gemini.outputs.GetRepositoryGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GetRepositoryGroupIamPolicyPlainArgs.builder
      com.pulumi.gcp.gemini.GeminiFunctions.getRepositoryGroupIamPolicyPlain(args(argsBuilder).build)

  /** The resource for managing GeminiGcpEnablement settings for Admin Control. */
  def GeminiGcpEnablementSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.GeminiGcpEnablementSettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.GeminiGcpEnablementSettingArgs.builder
    com.pulumi.gcp.gemini.GeminiGcpEnablementSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The resource for managing GeminiGcpEnablementSetting setting bindings for Admin Control.
   * 
   * To get more information about GeminiGcpEnablementSettingBinding, see:
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  def GeminiGcpEnablementSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.GeminiGcpEnablementSettingBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.GeminiGcpEnablementSettingBindingArgs.builder
    com.pulumi.gcp.gemini.GeminiGcpEnablementSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A setting that controls observability features for Gemini in BigQuery.
   * 
   * To get more information about GibqObservabilitySetting, see:
   * 
   * * [API documentation](https://cloud.google.com/gemini/docs/reference/rest/v1/projects.locations.gibqObservabilitySettings)
   * * How-to Guides
   *     * [Gemini in BigQuery overview](https://cloud.google.com/gemini/docs/bigquery/overview)
   */
  def GibqObservabilitySetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.GibqObservabilitySettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.GibqObservabilitySettingArgs.builder
    com.pulumi.gcp.gemini.GibqObservabilitySetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.gemini.GibqObservabilitySettingArgs.Builder)
    /**
     * @param conversationalAnalyticsSetting Settings for Conversational Analytics, which can be used to enable observability features.
     * Structure is documented below.
     * @return builder
     */
    def conversationalAnalyticsSetting(args: Endofunction[com.pulumi.gcp.gemini.inputs.GibqObservabilitySettingConversationalAnalyticsSettingArgs.Builder]):
        com.pulumi.gcp.gemini.GibqObservabilitySettingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GibqObservabilitySettingConversationalAnalyticsSettingArgs.builder
      builder.conversationalAnalyticsSetting(args(argsBuilder).build)

  /**
   * The resource for managing GibqObservabilitySetting setting bindings for Admin Control.
   * 
   * To get more information about GibqObservabilitySettingBinding, see:
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  def GibqObservabilitySettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.GibqObservabilitySettingBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.GibqObservabilitySettingBindingArgs.builder
    com.pulumi.gcp.gemini.GibqObservabilitySettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** The resource for managing Logging settings for Admin Control. */
  def LoggingSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.LoggingSettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.LoggingSettingArgs.builder
    com.pulumi.gcp.gemini.LoggingSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The resource for managing Logging setting bindings for Admin Control.
   * 
   * To get more information about LoggingSettingBinding, see:
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  def LoggingSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.LoggingSettingBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.LoggingSettingBindingArgs.builder
    com.pulumi.gcp.gemini.LoggingSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** The resource for managing ReleaseChannel settings for Admin Control. */
  def ReleaseChannelSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.ReleaseChannelSettingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.ReleaseChannelSettingArgs.builder
    com.pulumi.gcp.gemini.ReleaseChannelSetting(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The resource for managing ReleaseChannel setting bindings for Admin Control.
   * 
   * To get more information about ReleaseChannelSettingBinding, see:
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  def ReleaseChannelSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.ReleaseChannelSettingBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.ReleaseChannelSettingBindingArgs.builder
    com.pulumi.gcp.gemini.ReleaseChannelSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * The resource for managing Repository Group for Gemini Code Assist.
   * 
   * To get more information about RepositoryGroup, see:
   * 
   * * [API documentation](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.codeRepositoryIndexes.repositoryGroups)
   */
  def RepositoryGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.RepositoryGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.RepositoryGroupArgs.builder
    com.pulumi.gcp.gemini.RepositoryGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.gemini.RepositoryGroupArgs.Builder)
    /**
     * @param repositories Required. List of repositories to group.
     * Structure is documented below.
     * @return builder
     */
    def repositories(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupRepositoryArgs.Builder]*):
        com.pulumi.gcp.gemini.RepositoryGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)

  /**
   * Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
   * * `gcp.gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
   * 
   * &gt; **Note:** `gcp.gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gcp.gemini.RepositoryGroupIamBinding` and `gcp.gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gcp.gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gemini.RepositoryGroupIamPolicy
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
   * import com.pulumi.gcp.gemini.RepositoryGroupIamPolicy;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs;
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
   *                 .role("roles/cloudaicompanion.repositoryGroupsUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new RepositoryGroupIamPolicy("policy", RepositoryGroupIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.RepositoryGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamBinding;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs;
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
   *         var binding = new RepositoryGroupIamBinding("binding", RepositoryGroupIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .role("roles/cloudaicompanion.repositoryGroupsUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.RepositoryGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamMember;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs;
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
   *         var member = new RepositoryGroupIamMember("member", RepositoryGroupIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .role("roles/cloudaicompanion.repositoryGroupsUser")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Gemini for Google Cloud RepositoryGroup
   * 
   * Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
   * * `gcp.gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
   * 
   * &gt; **Note:** `gcp.gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gcp.gemini.RepositoryGroupIamBinding` and `gcp.gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gcp.gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gemini.RepositoryGroupIamPolicy
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
   * import com.pulumi.gcp.gemini.RepositoryGroupIamPolicy;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs;
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
   *                 .role("roles/cloudaicompanion.repositoryGroupsUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new RepositoryGroupIamPolicy("policy", RepositoryGroupIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.RepositoryGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamBinding;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs;
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
   *         var binding = new RepositoryGroupIamBinding("binding", RepositoryGroupIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .role("roles/cloudaicompanion.repositoryGroupsUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.RepositoryGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamMember;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs;
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
   *         var member = new RepositoryGroupIamMember("member", RepositoryGroupIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .role("roles/cloudaicompanion.repositoryGroupsUser")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
   * * {{project}}/{{location}}/{{code_repository_index}}/{{repository_group_id}}
   * * {{location}}/{{code_repository_index}}/{{repository_group_id}}
   * * {{repository_group_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Gemini for Google Cloud repositorygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_gemini_repository_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_gemini_repository_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:gemini/repositoryGroupIamBinding:RepositoryGroupIamBinding editor projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryGroupIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs.builder
    com.pulumi.gcp.gemini.RepositoryGroupIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
   * * `gcp.gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
   * 
   * &gt; **Note:** `gcp.gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gcp.gemini.RepositoryGroupIamBinding` and `gcp.gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gcp.gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gemini.RepositoryGroupIamPolicy
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
   * import com.pulumi.gcp.gemini.RepositoryGroupIamPolicy;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs;
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
   *                 .role("roles/cloudaicompanion.repositoryGroupsUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new RepositoryGroupIamPolicy("policy", RepositoryGroupIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.RepositoryGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamBinding;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs;
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
   *         var binding = new RepositoryGroupIamBinding("binding", RepositoryGroupIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .role("roles/cloudaicompanion.repositoryGroupsUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.RepositoryGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamMember;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs;
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
   *         var member = new RepositoryGroupIamMember("member", RepositoryGroupIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .role("roles/cloudaicompanion.repositoryGroupsUser")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Gemini for Google Cloud RepositoryGroup
   * 
   * Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
   * * `gcp.gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
   * 
   * &gt; **Note:** `gcp.gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gcp.gemini.RepositoryGroupIamBinding` and `gcp.gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gcp.gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gemini.RepositoryGroupIamPolicy
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
   * import com.pulumi.gcp.gemini.RepositoryGroupIamPolicy;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs;
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
   *                 .role("roles/cloudaicompanion.repositoryGroupsUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new RepositoryGroupIamPolicy("policy", RepositoryGroupIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.RepositoryGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamBinding;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs;
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
   *         var binding = new RepositoryGroupIamBinding("binding", RepositoryGroupIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .role("roles/cloudaicompanion.repositoryGroupsUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.RepositoryGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamMember;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs;
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
   *         var member = new RepositoryGroupIamMember("member", RepositoryGroupIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .role("roles/cloudaicompanion.repositoryGroupsUser")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
   * * {{project}}/{{location}}/{{code_repository_index}}/{{repository_group_id}}
   * * {{location}}/{{code_repository_index}}/{{repository_group_id}}
   * * {{repository_group_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Gemini for Google Cloud repositorygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_gemini_repository_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_gemini_repository_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:gemini/repositoryGroupIamMember:RepositoryGroupIamMember editor projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryGroupIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs.builder
    com.pulumi.gcp.gemini.RepositoryGroupIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
   * * `gcp.gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
   * 
   * &gt; **Note:** `gcp.gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gcp.gemini.RepositoryGroupIamBinding` and `gcp.gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gcp.gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gemini.RepositoryGroupIamPolicy
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
   * import com.pulumi.gcp.gemini.RepositoryGroupIamPolicy;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs;
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
   *                 .role("roles/cloudaicompanion.repositoryGroupsUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new RepositoryGroupIamPolicy("policy", RepositoryGroupIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.RepositoryGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamBinding;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs;
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
   *         var binding = new RepositoryGroupIamBinding("binding", RepositoryGroupIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .role("roles/cloudaicompanion.repositoryGroupsUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.RepositoryGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamMember;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs;
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
   *         var member = new RepositoryGroupIamMember("member", RepositoryGroupIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .role("roles/cloudaicompanion.repositoryGroupsUser")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Gemini for Google Cloud RepositoryGroup
   * 
   * Three different resources help you manage your IAM policy for Gemini for Google Cloud RepositoryGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.gemini.RepositoryGroupIamPolicy`: Authoritative. Sets the IAM policy for the repositorygroup and replaces any existing policy already attached.
   * * `gcp.gemini.RepositoryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repositorygroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.gemini.RepositoryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repositorygroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.gemini.RepositoryGroupIamPolicy`: Retrieves the IAM policy for the repositorygroup
   * 
   * &gt; **Note:** `gcp.gemini.RepositoryGroupIamPolicy` **cannot** be used in conjunction with `gcp.gemini.RepositoryGroupIamBinding` and `gcp.gemini.RepositoryGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.gemini.RepositoryGroupIamBinding` resources **can be** used in conjunction with `gcp.gemini.RepositoryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.gemini.RepositoryGroupIamPolicy
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
   * import com.pulumi.gcp.gemini.RepositoryGroupIamPolicy;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs;
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
   *                 .role("roles/cloudaicompanion.repositoryGroupsUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new RepositoryGroupIamPolicy("policy", RepositoryGroupIamPolicyArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.RepositoryGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamBinding;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs;
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
   *         var binding = new RepositoryGroupIamBinding("binding", RepositoryGroupIamBindingArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .role("roles/cloudaicompanion.repositoryGroupsUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.gemini.RepositoryGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamMember;
   * import com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs;
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
   *         var member = new RepositoryGroupIamMember("member", RepositoryGroupIamMemberArgs.builder()
   *             .project(example.get("project"))
   *             .location(example.get("location"))
   *             .codeRepositoryIndex(example.get("codeRepositoryIndex"))
   *             .repositoryGroupId(example.get("repositoryGroupId"))
   *             .role("roles/cloudaicompanion.repositoryGroupsUser")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
   * * {{project}}/{{location}}/{{code_repository_index}}/{{repository_group_id}}
   * * {{location}}/{{code_repository_index}}/{{repository_group_id}}
   * * {{repository_group_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Gemini for Google Cloud repositorygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_gemini_repository_group_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_gemini_repository_group_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}} roles/cloudaicompanion.repositoryGroupsUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:gemini/repositoryGroupIamPolicy:RepositoryGroupIamPolicy editor projects/{{project}}/locations/{{location}}/codeRepositoryIndexes/{{code_repository_index}}/repositoryGroups/{{repository_group_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryGroupIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs.builder
    com.pulumi.gcp.gemini.RepositoryGroupIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.Builder)
    /**
     * @param configs Configuration parameters for the tool.
     * Structure is documented below.
     * @return builder
     */
    def configs(args: Endofunction[com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolConfigArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolConfigArgs.builder
      builder.configs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.CodeToolsSettingState.Builder)
    /**
     * @param enabledTools Represents the full set of enabled tools.
     * Structure is documented below.
     * @return builder
     */
    def enabledTools(args: Endofunction[com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.CodeToolsSettingState.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.builder
      builder.enabledTools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.Builder)
    /**
     * @param lastPublishedContexts (Output)
     * Output only. The last published context for the agent.
     * Structure is documented below.
     * @return builder
     */
    def lastPublishedContexts(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextArgs.builder
      builder.lastPublishedContexts(args.map(_(argsBuilder).build)*)

    /**
     * @param publishedContext Optional. The published context for the agent. This context is used by
     * the Chat API in production.
     * Structure is documented below.
     * @return builder
     */
    def publishedContext(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.builder
      builder.publishedContext(args(argsBuilder).build)

    /**
     * @param stagingContext Optional. The staging context for the agent. This context is used to
     * test and validate changes before publishing.
     * Structure is documented below.
     * @return builder
     */
    def stagingContext(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.builder
      builder.stagingContext(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextArgs.Builder)
    /**
     * @param datasourceReferences Output only. Data sources that are available for answering questions.
     * @return builder
     */
    def datasourceReferences(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesArgs.builder
      builder.datasourceReferences(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesArgs.Builder)
    /**
     * @param bq References to BigQuery tables.
     * Structure is documented below.
     * @return builder
     */
    def bq(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesBqArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesBqArgs.builder
      builder.bq(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesBqArgs.Builder)
    /**
     * @param tableReferences References to BigQuery tables.
     * Structure is documented below.
     * @return builder
     */
    def tableReferences(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesBqTableReferenceArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesBqArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesBqTableReferenceArgs.builder
      builder.tableReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.Builder)
    /**
     * @param datasourceReferences Required. Data sources that are available for answering questions.
     * This Terraform resource currently supports BigQuery table references.
     * Structure is documented below.
     * @return builder
     */
    def datasourceReferences(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesArgs.builder
      builder.datasourceReferences(args(argsBuilder).build)

    /**
     * @param exampleQueries Optional. A list of example queries for BigQuery data sources.
     * Structure is documented below.
     * @return builder
     */
    def exampleQueries(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextExampleQueryArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextExampleQueryArgs.builder
      builder.exampleQueries(args.map(_(argsBuilder).build)*)

    /**
     * @param glossaryTerms Optional. Term definitions for the agent&#39;s domain.
     * Structure is documented below.
     * @return builder
     */
    def glossaryTerms(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextGlossaryTermArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextGlossaryTermArgs.builder
      builder.glossaryTerms(args.map(_(argsBuilder).build)*)

    /**
     * @param options Optional. Additional options for the conversation.
     * Structure is documented below.
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsArgs.builder
      builder.options(args(argsBuilder).build)

    /**
     * @param schemaRelationships Optional. Relationships between table schemas, including referencing
     * and referenced columns.
     * Structure is documented below.
     * @return builder
     */
    def schemaRelationships(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipArgs.builder
      builder.schemaRelationships(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesArgs.Builder)
    /**
     * @param bq References to BigQuery tables.
     * Structure is documented below.
     * @return builder
     */
    def bq(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesBqArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesBqArgs.builder
      builder.bq(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesBqArgs.Builder)
    /**
     * @param tableReferences References to BigQuery tables.
     * Structure is documented below.
     * @return builder
     */
    def tableReferences(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesBqTableReferenceArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesBqArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesBqTableReferenceArgs.builder
      builder.tableReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsAnalysisArgs.Builder)
    /**
     * @param python Optional. Options for Python analysis.
     * Structure is documented below.
     * @return builder
     */
    def python(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsAnalysisPythonArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsAnalysisArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsAnalysisPythonArgs.builder
      builder.python(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsArgs.Builder)
    /**
     * @param analysis Optional. Options for analysis.
     * Structure is documented below.
     * @return builder
     */
    def analysis(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsAnalysisArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

    /**
     * @param datasource Optional. Options for datasource configuration.
     * Structure is documented below.
     * @return builder
     */
    def datasource(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsDatasourceArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsDatasourceArgs.builder
      builder.datasource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipArgs.Builder)
    /**
     * @param leftSchemaPaths Required. An ordered list of fields for the left side of the join.
     * Structure is documented below.
     * @return builder
     */
    def leftSchemaPaths(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipLeftSchemaPathsArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipLeftSchemaPathsArgs.builder
      builder.leftSchemaPaths(args(argsBuilder).build)

    /**
     * @param rightSchemaPaths Required. An ordered list of fields for the right side of the join.
     * Structure is documented below.
     * @return builder
     */
    def rightSchemaPaths(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipRightSchemaPathsArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipRightSchemaPathsArgs.builder
      builder.rightSchemaPaths(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.Builder)
    /**
     * @param datasourceReferences Required. Data sources that are available for answering questions.
     * This Terraform resource currently supports BigQuery table references.
     * Structure is documented below.
     * @return builder
     */
    def datasourceReferences(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesArgs.builder
      builder.datasourceReferences(args(argsBuilder).build)

    /**
     * @param exampleQueries Optional. A list of example queries for BigQuery data sources.
     * Structure is documented below.
     * @return builder
     */
    def exampleQueries(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextExampleQueryArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextExampleQueryArgs.builder
      builder.exampleQueries(args.map(_(argsBuilder).build)*)

    /**
     * @param glossaryTerms Optional. Term definitions for the agent&#39;s domain.
     * Structure is documented below.
     * @return builder
     */
    def glossaryTerms(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextGlossaryTermArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextGlossaryTermArgs.builder
      builder.glossaryTerms(args.map(_(argsBuilder).build)*)

    /**
     * @param options Optional. Additional options for the conversation.
     * Structure is documented below.
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsArgs.builder
      builder.options(args(argsBuilder).build)

    /**
     * @param schemaRelationships Optional. Relationships between table schemas, including referencing
     * and referenced columns.
     * Structure is documented below.
     * @return builder
     */
    def schemaRelationships(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipArgs.builder
      builder.schemaRelationships(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesArgs.Builder)
    /**
     * @param bq References to BigQuery tables.
     * Structure is documented below.
     * @return builder
     */
    def bq(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesBqArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesBqArgs.builder
      builder.bq(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesBqArgs.Builder)
    /**
     * @param tableReferences References to BigQuery tables.
     * Structure is documented below.
     * @return builder
     */
    def tableReferences(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesBqTableReferenceArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesBqArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesBqTableReferenceArgs.builder
      builder.tableReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsAnalysisArgs.Builder)
    /**
     * @param python Optional. Options for Python analysis.
     * Structure is documented below.
     * @return builder
     */
    def python(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsAnalysisPythonArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsAnalysisArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsAnalysisPythonArgs.builder
      builder.python(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsArgs.Builder)
    /**
     * @param analysis Optional. Options for analysis.
     * Structure is documented below.
     * @return builder
     */
    def analysis(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsAnalysisArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

    /**
     * @param datasource Optional. Options for datasource configuration.
     * Structure is documented below.
     * @return builder
     */
    def datasource(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsDatasourceArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsDatasourceArgs.builder
      builder.datasource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipArgs.Builder)
    /**
     * @param leftSchemaPaths Required. An ordered list of fields for the left side of the join.
     * Structure is documented below.
     * @return builder
     */
    def leftSchemaPaths(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipLeftSchemaPathsArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipLeftSchemaPathsArgs.builder
      builder.leftSchemaPaths(args(argsBuilder).build)

    /**
     * @param rightSchemaPaths Required. An ordered list of fields for the right side of the join.
     * Structure is documented below.
     * @return builder
     */
    def rightSchemaPaths(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipRightSchemaPathsArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipRightSchemaPathsArgs.builder
      builder.rightSchemaPaths(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentState.Builder)
    /**
     * @param dataAnalyticsAgent Data analytics agent configuration.
     * Structure is documented below.
     * @return builder
     */
    def dataAnalyticsAgent(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.builder
      builder.dataAnalyticsAgent(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.GdaObservabilitySettingState.Builder)
    /**
     * @param conversationalAnalyticsSetting Message describing Setting for Conversational Analytics.
     * Structure is documented below.
     * @return builder
     */
    def conversationalAnalyticsSetting(args: Endofunction[com.pulumi.gcp.gemini.inputs.GdaObservabilitySettingConversationalAnalyticsSettingArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.GdaObservabilitySettingState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GdaObservabilitySettingConversationalAnalyticsSettingArgs.builder
      builder.conversationalAnalyticsSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.GibqObservabilitySettingState.Builder)
    /**
     * @param conversationalAnalyticsSetting Settings for Conversational Analytics, which can be used to enable observability features.
     * Structure is documented below.
     * @return builder
     */
    def conversationalAnalyticsSetting(args: Endofunction[com.pulumi.gcp.gemini.inputs.GibqObservabilitySettingConversationalAnalyticsSettingArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.GibqObservabilitySettingState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GibqObservabilitySettingConversationalAnalyticsSettingArgs.builder
      builder.conversationalAnalyticsSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.RepositoryGroupState.Builder)
    /**
     * @param repositories Required. List of repositories to group.
     * Structure is documented below.
     * @return builder
     */
    def repositories(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupRepositoryArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.RepositoryGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)
