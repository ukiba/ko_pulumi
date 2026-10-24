package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
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
  inline def CodeRepositoryIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.CodeRepositoryIndexArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.CodeRepositoryIndexArgs.builder
    com.pulumi.gcp.gemini.CodeRepositoryIndex(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** The resource for managing CodeTools settings for Admin Control. */
  inline def CodeToolsSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.CodeToolsSettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.CodeToolsSettingArgs.builder
    com.pulumi.gcp.gemini.CodeToolsSetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The resource for managing CodeTools setting bindings for Admin Control.
   * 
   * To get more information about CodeToolsSettingBinding, see:
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  inline def CodeToolsSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.CodeToolsSettingBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.CodeToolsSettingBindingArgs.builder
    com.pulumi.gcp.gemini.CodeToolsSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
  inline def DataAnalyticsDataAgent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.DataAnalyticsDataAgentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.DataAnalyticsDataAgentArgs.builder
    com.pulumi.gcp.gemini.DataAnalyticsDataAgent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
  inline def DataAnalyticsDataAgentIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBindingArgs.builder
    com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
  inline def DataAnalyticsDataAgentIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMemberArgs.builder
    com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
  inline def DataAnalyticsDataAgentIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicyArgs.builder
    com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** The resource for managing DataSharingWithGoogle settings for Admin Control. */
  inline def DataSharingWithGoogleSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.DataSharingWithGoogleSettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.DataSharingWithGoogleSettingArgs.builder
    com.pulumi.gcp.gemini.DataSharingWithGoogleSetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The resource for managing DataSharingWithGoogle setting bindings for Admin Control.
   * 
   * To get more information about DataSharingWithGoogleSettingBinding, see:
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  inline def DataSharingWithGoogleSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.DataSharingWithGoogleSettingBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.DataSharingWithGoogleSettingBindingArgs.builder
    com.pulumi.gcp.gemini.DataSharingWithGoogleSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The resource for managing GdaObservability settings for Admin Control.
   * 
   * To get more information about GdaObservabilitySetting, see:
   * 
   * * [API documentation](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.gdaObservabilitySettings)
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  inline def GdaObservabilitySetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.GdaObservabilitySettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.GdaObservabilitySettingArgs.builder
    com.pulumi.gcp.gemini.GdaObservabilitySetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The resource for managing GdaObservability setting bindings for Admin Control.
   * 
   * To get more information about GdaObservabilitySettingBinding, see:
   * 
   * * [API documentation](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.gdaObservabilitySettings.settingBindings)
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  inline def GdaObservabilitySettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.GdaObservabilitySettingBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.GdaObservabilitySettingBindingArgs.builder
    com.pulumi.gcp.gemini.GdaObservabilitySettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object GeminiFunctions:
    /** Retrieves the current IAM policy data for dataagent */
    inline def getDataAnalyticsDataAgentIamPolicy(args: Endofunction[com.pulumi.gcp.gemini.inputs.GetDataAnalyticsDataAgentIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.gemini.outputs.GetDataAnalyticsDataAgentIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GetDataAnalyticsDataAgentIamPolicyArgs.builder
      com.pulumi.gcp.gemini.GeminiFunctions.getDataAnalyticsDataAgentIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for dataagent */
    inline def getDataAnalyticsDataAgentIamPolicyPlain(args: Endofunction[com.pulumi.gcp.gemini.inputs.GetDataAnalyticsDataAgentIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gemini.outputs.GetDataAnalyticsDataAgentIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GetDataAnalyticsDataAgentIamPolicyPlainArgs.builder
      com.pulumi.gcp.gemini.GeminiFunctions.getDataAnalyticsDataAgentIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for repositorygroup */
    inline def getRepositoryGroupIamPolicy(args: Endofunction[com.pulumi.gcp.gemini.inputs.GetRepositoryGroupIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.gemini.outputs.GetRepositoryGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GetRepositoryGroupIamPolicyArgs.builder
      com.pulumi.gcp.gemini.GeminiFunctions.getRepositoryGroupIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for repositorygroup */
    inline def getRepositoryGroupIamPolicyPlain(args: Endofunction[com.pulumi.gcp.gemini.inputs.GetRepositoryGroupIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gemini.outputs.GetRepositoryGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GetRepositoryGroupIamPolicyPlainArgs.builder
      com.pulumi.gcp.gemini.GeminiFunctions.getRepositoryGroupIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** The resource for managing GeminiGcpEnablement settings for Admin Control. */
  inline def GeminiGcpEnablementSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.GeminiGcpEnablementSettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.GeminiGcpEnablementSettingArgs.builder
    com.pulumi.gcp.gemini.GeminiGcpEnablementSetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The resource for managing GeminiGcpEnablementSetting setting bindings for Admin Control.
   * 
   * To get more information about GeminiGcpEnablementSettingBinding, see:
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  inline def GeminiGcpEnablementSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.GeminiGcpEnablementSettingBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.GeminiGcpEnablementSettingBindingArgs.builder
    com.pulumi.gcp.gemini.GeminiGcpEnablementSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A setting that controls observability features for Gemini in BigQuery.
   * 
   * To get more information about GibqObservabilitySetting, see:
   * 
   * * [API documentation](https://cloud.google.com/gemini/docs/reference/rest/v1/projects.locations.gibqObservabilitySettings)
   * * How-to Guides
   *     * [Gemini in BigQuery overview](https://cloud.google.com/gemini/docs/bigquery/overview)
   */
  inline def GibqObservabilitySetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.GibqObservabilitySettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.GibqObservabilitySettingArgs.builder
    com.pulumi.gcp.gemini.GibqObservabilitySetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The resource for managing GibqObservabilitySetting setting bindings for Admin Control.
   * 
   * To get more information about GibqObservabilitySettingBinding, see:
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  inline def GibqObservabilitySettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.GibqObservabilitySettingBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.GibqObservabilitySettingBindingArgs.builder
    com.pulumi.gcp.gemini.GibqObservabilitySettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** The resource for managing Logging settings for Admin Control. */
  inline def LoggingSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.LoggingSettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.LoggingSettingArgs.builder
    com.pulumi.gcp.gemini.LoggingSetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The resource for managing Logging setting bindings for Admin Control.
   * 
   * To get more information about LoggingSettingBinding, see:
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  inline def LoggingSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.LoggingSettingBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.LoggingSettingBindingArgs.builder
    com.pulumi.gcp.gemini.LoggingSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** The resource for managing ReleaseChannel settings for Admin Control. */
  inline def ReleaseChannelSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.ReleaseChannelSettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.ReleaseChannelSettingArgs.builder
    com.pulumi.gcp.gemini.ReleaseChannelSetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The resource for managing ReleaseChannel setting bindings for Admin Control.
   * 
   * To get more information about ReleaseChannelSettingBinding, see:
   * * How-to Guides
   *     * [Gemini Cloud Assist overview](https://cloud.google.com/gemini/docs/cloud-assist/overview)
   */
  inline def ReleaseChannelSettingBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.ReleaseChannelSettingBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.ReleaseChannelSettingBindingArgs.builder
    com.pulumi.gcp.gemini.ReleaseChannelSettingBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The resource for managing Repository Group for Gemini Code Assist.
   * 
   * To get more information about RepositoryGroup, see:
   * 
   * * [API documentation](https://cloud.google.com/gemini/docs/api/reference/rest/v1/projects.locations.codeRepositoryIndexes.repositoryGroups)
   */
  inline def RepositoryGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.RepositoryGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.RepositoryGroupArgs.builder
    com.pulumi.gcp.gemini.RepositoryGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
  inline def RepositoryGroupIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs.builder
    com.pulumi.gcp.gemini.RepositoryGroupIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
  inline def RepositoryGroupIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs.builder
    com.pulumi.gcp.gemini.RepositoryGroupIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
  inline def RepositoryGroupIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.gemini.RepositoryGroupIamPolicyArgs.builder
    com.pulumi.gcp.gemini.RepositoryGroupIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
