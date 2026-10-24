package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object logging:
  /**
   * Manages a billing account level logging bucket config. For more information see
   * [the official logging documentation](https://cloud.google.com/logging/docs/) and
   * [Storing Logs](https://cloud.google.com/logging/docs/storage).
   * 
   * &gt; **Note:** Logging buckets are automatically created for a given folder, project, organization, billingAccount and cannot be deleted. Creating a resource of this type will acquire and update the resource that already exists at the desired location. These buckets cannot be removed so deleting this resource will remove the bucket config from your state but will leave the logging bucket unchanged. The buckets that are currently automatically created are &#34;_Default&#34; and &#34;_Required&#34;.
   */
  inline def BillingAccountBucketConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.BillingAccountBucketConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.logging.BillingAccountBucketConfigArgs.builder
    com.pulumi.gcp.logging.BillingAccountBucketConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a billing account logging exclusion. For more information see:
   * 
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.exclusions)
   * * How-to Guides
   *     * [Excluding Logs](https://cloud.google.com/logging/docs/exclusions)
   * 
   * &gt; You can specify exclusions for log sinks created by terraform by using the exclusions field of `gcp.logging.BillingAccountSink`
   */
  inline def BillingAccountExclusion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.BillingAccountExclusionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.BillingAccountExclusionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.BillingAccountExclusion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.sinks)
   * * How-to Guides
   *     * [Exporting Logs](https://cloud.google.com/logging/docs/export)
   * 
   * &gt; **Note** You must have the &#34;Logs Configuration Writer&#34; IAM role (`roles/logging.configWriter`)
   * [granted on the billing account](https://cloud.google.com/billing/reference/rest/v1/billingAccounts/getIamPolicy) to
   * the credentials used with this provider. [IAM roles granted on a billing account](https://cloud.google.com/billing/docs/how-to/billing-access) are separate from the
   * typical IAM roles granted on a project.
   */
  inline def BillingAccountSink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.BillingAccountSinkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.BillingAccountSinkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.BillingAccountSink(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a folder-level logging bucket config. For more information see
   * [the official logging documentation](https://cloud.google.com/logging/docs/) and
   * [Storing Logs](https://cloud.google.com/logging/docs/storage).
   * 
   * &gt; **Note:** Logging buckets are automatically created for a given folder, project, organization, billingAccount and cannot be deleted. Creating a resource of this type will acquire and update the resource that already exists at the desired location. These buckets cannot be removed so deleting this resource will remove the bucket config from your state but will leave the logging bucket unchanged. The buckets that are currently automatically created are &#34;_Default&#34; and &#34;_Required&#34;.
   */
  inline def FolderBucketConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.FolderBucketConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.logging.FolderBucketConfigArgs.builder
    com.pulumi.gcp.logging.FolderBucketConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a folder-level logging exclusion. For more information see:
   * 
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/folders.exclusions)
   * * How-to Guides
   *     * [Excluding Logs](https://cloud.google.com/logging/docs/exclusions)
   * 
   * &gt; You can specify exclusions for log sinks created by the provider by using the exclusions field of `gcp.logging.FolderSink`
   */
  inline def FolderExclusion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.FolderExclusionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.FolderExclusionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.FolderExclusion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Default resource settings control whether CMEK is required for new log buckets. These settings also determine the storage location for the _Default and _Required log buckets, and whether the _Default sink is enabled or disabled.
   * 
   * To get more information about FolderSettings, see:
   * 
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/TopLevel/getSettings)
   * * How-to Guides
   *     * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings)
   */
  inline def FolderSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.FolderSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.logging.FolderSettingsArgs.builder
    com.pulumi.gcp.logging.FolderSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a folder-level logging sink. For more information see:
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/folders.sinks)
   * * How-to Guides
   *     * [Exporting Logs](https://cloud.google.com/logging/docs/export)
   */
  inline def FolderSink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.FolderSinkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.FolderSinkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.FolderSink(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Describes a BigQuery linked dataset
   * 
   * To get more information about LinkedDataset, see:
   * 
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/locations.buckets.links)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/logging/docs/apis)
   */
  inline def LinkedDataset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.LinkedDatasetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.logging.LinkedDatasetArgs.builder
    com.pulumi.gcp.logging.LinkedDataset(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Describes a group of resources to read log entries from
   * 
   * To get more information about LogScope, see:
   * 
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.locations.logScopes)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/logging/docs/apis)
   */
  inline def LogScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.LogScopeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.LogScopeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.LogScope(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Describes a view over log entries in a bucket.
   * 
   * To get more information about LogView, see:
   * 
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.locations.buckets.views)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/logging/docs/apis)
   */
  inline def LogView(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.LogViewArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.LogViewArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.LogView(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud (Stackdriver) Logging LogView. Each of these resources serves a different use case:
   * 
   * * `gcp.logging.LogViewIamPolicy`: Authoritative. Sets the IAM policy for the logview and replaces any existing policy already attached.
   * * `gcp.logging.LogViewIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the logview are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.logging.LogViewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the logview are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.logging.LogViewIamPolicy`: Retrieves the IAM policy for the logview
   * 
   * &gt; **Note:** `gcp.logging.LogViewIamPolicy` **cannot** be used in conjunction with `gcp.logging.LogViewIamBinding` and `gcp.logging.LogViewIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.logging.LogViewIamBinding` resources **can be** used in conjunction with `gcp.logging.LogViewIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.logging.LogViewIamPolicy
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
   * import com.pulumi.gcp.logging.LogViewIamPolicy;
   * import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
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
   *                 .role("roles/logging.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
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
   * import com.pulumi.gcp.logging.LogViewIamPolicy;
   * import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
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
   *                 .role("roles/logging.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.logging.LogViewIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.logging.LogViewIamBinding;
   * import com.pulumi.gcp.logging.LogViewIamBindingArgs;
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
   *         var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
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
   * import com.pulumi.gcp.logging.LogViewIamBinding;
   * import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   * import com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs;
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
   *         var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(LogViewIamBindingConditionArgs.builder()
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
   * ## gcp.logging.LogViewIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.logging.LogViewIamMember;
   * import com.pulumi.gcp.logging.LogViewIamMemberArgs;
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
   *         var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
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
   * import com.pulumi.gcp.logging.LogViewIamMember;
   * import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   * import com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs;
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
   *         var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(LogViewIamMemberConditionArgs.builder()
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
   * ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * ---
   * 
   * # IAM policy for Cloud (Stackdriver) Logging LogView
   * 
   * Three different resources help you manage your IAM policy for Cloud (Stackdriver) Logging LogView. Each of these resources serves a different use case:
   * 
   * * `gcp.logging.LogViewIamPolicy`: Authoritative. Sets the IAM policy for the logview and replaces any existing policy already attached.
   * * `gcp.logging.LogViewIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the logview are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.logging.LogViewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the logview are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.logging.LogViewIamPolicy`: Retrieves the IAM policy for the logview
   * 
   * &gt; **Note:** `gcp.logging.LogViewIamPolicy` **cannot** be used in conjunction with `gcp.logging.LogViewIamBinding` and `gcp.logging.LogViewIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.logging.LogViewIamBinding` resources **can be** used in conjunction with `gcp.logging.LogViewIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.logging.LogViewIamPolicy
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
   * import com.pulumi.gcp.logging.LogViewIamPolicy;
   * import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
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
   *                 .role("roles/logging.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
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
   * import com.pulumi.gcp.logging.LogViewIamPolicy;
   * import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
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
   *                 .role("roles/logging.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.logging.LogViewIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.logging.LogViewIamBinding;
   * import com.pulumi.gcp.logging.LogViewIamBindingArgs;
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
   *         var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
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
   * import com.pulumi.gcp.logging.LogViewIamBinding;
   * import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   * import com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs;
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
   *         var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(LogViewIamBindingConditionArgs.builder()
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
   * ## gcp.logging.LogViewIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.logging.LogViewIamMember;
   * import com.pulumi.gcp.logging.LogViewIamMemberArgs;
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
   *         var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
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
   * import com.pulumi.gcp.logging.LogViewIamMember;
   * import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   * import com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs;
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
   *         var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(LogViewIamMemberConditionArgs.builder()
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
   * * {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud (Stackdriver) Logging logview IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_logging_log_view_iam_member.editor &#34;{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}} roles/logging.admin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_logging_log_view_iam_binding.editor &#34;{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}} roles/logging.admin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:logging/logViewIamBinding:LogViewIamBinding editor {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def LogViewIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.LogViewIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.LogViewIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.LogViewIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud (Stackdriver) Logging LogView. Each of these resources serves a different use case:
   * 
   * * `gcp.logging.LogViewIamPolicy`: Authoritative. Sets the IAM policy for the logview and replaces any existing policy already attached.
   * * `gcp.logging.LogViewIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the logview are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.logging.LogViewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the logview are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.logging.LogViewIamPolicy`: Retrieves the IAM policy for the logview
   * 
   * &gt; **Note:** `gcp.logging.LogViewIamPolicy` **cannot** be used in conjunction with `gcp.logging.LogViewIamBinding` and `gcp.logging.LogViewIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.logging.LogViewIamBinding` resources **can be** used in conjunction with `gcp.logging.LogViewIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.logging.LogViewIamPolicy
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
   * import com.pulumi.gcp.logging.LogViewIamPolicy;
   * import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
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
   *                 .role("roles/logging.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
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
   * import com.pulumi.gcp.logging.LogViewIamPolicy;
   * import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
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
   *                 .role("roles/logging.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.logging.LogViewIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.logging.LogViewIamBinding;
   * import com.pulumi.gcp.logging.LogViewIamBindingArgs;
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
   *         var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
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
   * import com.pulumi.gcp.logging.LogViewIamBinding;
   * import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   * import com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs;
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
   *         var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(LogViewIamBindingConditionArgs.builder()
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
   * ## gcp.logging.LogViewIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.logging.LogViewIamMember;
   * import com.pulumi.gcp.logging.LogViewIamMemberArgs;
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
   *         var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
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
   * import com.pulumi.gcp.logging.LogViewIamMember;
   * import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   * import com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs;
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
   *         var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(LogViewIamMemberConditionArgs.builder()
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
   * ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * ---
   * 
   * # IAM policy for Cloud (Stackdriver) Logging LogView
   * 
   * Three different resources help you manage your IAM policy for Cloud (Stackdriver) Logging LogView. Each of these resources serves a different use case:
   * 
   * * `gcp.logging.LogViewIamPolicy`: Authoritative. Sets the IAM policy for the logview and replaces any existing policy already attached.
   * * `gcp.logging.LogViewIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the logview are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.logging.LogViewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the logview are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.logging.LogViewIamPolicy`: Retrieves the IAM policy for the logview
   * 
   * &gt; **Note:** `gcp.logging.LogViewIamPolicy` **cannot** be used in conjunction with `gcp.logging.LogViewIamBinding` and `gcp.logging.LogViewIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.logging.LogViewIamBinding` resources **can be** used in conjunction with `gcp.logging.LogViewIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.logging.LogViewIamPolicy
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
   * import com.pulumi.gcp.logging.LogViewIamPolicy;
   * import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
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
   *                 .role("roles/logging.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
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
   * import com.pulumi.gcp.logging.LogViewIamPolicy;
   * import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
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
   *                 .role("roles/logging.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.logging.LogViewIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.logging.LogViewIamBinding;
   * import com.pulumi.gcp.logging.LogViewIamBindingArgs;
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
   *         var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
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
   * import com.pulumi.gcp.logging.LogViewIamBinding;
   * import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   * import com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs;
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
   *         var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(LogViewIamBindingConditionArgs.builder()
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
   * ## gcp.logging.LogViewIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.logging.LogViewIamMember;
   * import com.pulumi.gcp.logging.LogViewIamMemberArgs;
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
   *         var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
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
   * import com.pulumi.gcp.logging.LogViewIamMember;
   * import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   * import com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs;
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
   *         var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(LogViewIamMemberConditionArgs.builder()
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
   * * {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud (Stackdriver) Logging logview IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_logging_log_view_iam_member.editor &#34;{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}} roles/logging.admin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_logging_log_view_iam_binding.editor &#34;{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}} roles/logging.admin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:logging/logViewIamMember:LogViewIamMember editor {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def LogViewIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.LogViewIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.LogViewIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.LogViewIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud (Stackdriver) Logging LogView. Each of these resources serves a different use case:
   * 
   * * `gcp.logging.LogViewIamPolicy`: Authoritative. Sets the IAM policy for the logview and replaces any existing policy already attached.
   * * `gcp.logging.LogViewIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the logview are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.logging.LogViewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the logview are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.logging.LogViewIamPolicy`: Retrieves the IAM policy for the logview
   * 
   * &gt; **Note:** `gcp.logging.LogViewIamPolicy` **cannot** be used in conjunction with `gcp.logging.LogViewIamBinding` and `gcp.logging.LogViewIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.logging.LogViewIamBinding` resources **can be** used in conjunction with `gcp.logging.LogViewIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.logging.LogViewIamPolicy
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
   * import com.pulumi.gcp.logging.LogViewIamPolicy;
   * import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
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
   *                 .role("roles/logging.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
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
   * import com.pulumi.gcp.logging.LogViewIamPolicy;
   * import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
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
   *                 .role("roles/logging.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.logging.LogViewIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.logging.LogViewIamBinding;
   * import com.pulumi.gcp.logging.LogViewIamBindingArgs;
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
   *         var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
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
   * import com.pulumi.gcp.logging.LogViewIamBinding;
   * import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   * import com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs;
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
   *         var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(LogViewIamBindingConditionArgs.builder()
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
   * ## gcp.logging.LogViewIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.logging.LogViewIamMember;
   * import com.pulumi.gcp.logging.LogViewIamMemberArgs;
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
   *         var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
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
   * import com.pulumi.gcp.logging.LogViewIamMember;
   * import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   * import com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs;
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
   *         var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(LogViewIamMemberConditionArgs.builder()
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
   * ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * ---
   * 
   * # IAM policy for Cloud (Stackdriver) Logging LogView
   * 
   * Three different resources help you manage your IAM policy for Cloud (Stackdriver) Logging LogView. Each of these resources serves a different use case:
   * 
   * * `gcp.logging.LogViewIamPolicy`: Authoritative. Sets the IAM policy for the logview and replaces any existing policy already attached.
   * * `gcp.logging.LogViewIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the logview are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.logging.LogViewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the logview are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.logging.LogViewIamPolicy`: Retrieves the IAM policy for the logview
   * 
   * &gt; **Note:** `gcp.logging.LogViewIamPolicy` **cannot** be used in conjunction with `gcp.logging.LogViewIamBinding` and `gcp.logging.LogViewIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.logging.LogViewIamBinding` resources **can be** used in conjunction with `gcp.logging.LogViewIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.logging.LogViewIamPolicy
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
   * import com.pulumi.gcp.logging.LogViewIamPolicy;
   * import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
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
   *                 .role("roles/logging.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
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
   * import com.pulumi.gcp.logging.LogViewIamPolicy;
   * import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
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
   *                 .role("roles/logging.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.logging.LogViewIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.logging.LogViewIamBinding;
   * import com.pulumi.gcp.logging.LogViewIamBindingArgs;
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
   *         var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
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
   * import com.pulumi.gcp.logging.LogViewIamBinding;
   * import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   * import com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs;
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
   *         var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(LogViewIamBindingConditionArgs.builder()
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
   * ## gcp.logging.LogViewIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.logging.LogViewIamMember;
   * import com.pulumi.gcp.logging.LogViewIamMemberArgs;
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
   *         var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
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
   * import com.pulumi.gcp.logging.LogViewIamMember;
   * import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   * import com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs;
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
   *         var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *             .parent(loggingLogView.get("parent"))
   *             .location(loggingLogView.get("location"))
   *             .bucket(loggingLogView.get("bucket"))
   *             .name(loggingLogView.get("name"))
   *             .role("roles/logging.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(LogViewIamMemberConditionArgs.builder()
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
   * * {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud (Stackdriver) Logging logview IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_logging_log_view_iam_member.editor &#34;{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}} roles/logging.admin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_logging_log_view_iam_binding.editor &#34;{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}} roles/logging.admin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:logging/logViewIamPolicy:LogViewIamPolicy editor {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def LogViewIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.LogViewIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.LogViewIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.LogViewIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object LoggingFunctions:
    /**
     * Describes the settings associated with a folder.
     * 
     * To get more information about LoggingFolderSettings, see:
     * 
     * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/folders/getSettings)
     * * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
     */
    inline def getFolderSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.GetFolderSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.logging.outputs.GetFolderSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetFolderSettingsArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getFolderSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Describes the settings associated with a folder.
     * 
     * To get more information about LoggingFolderSettings, see:
     * 
     * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/folders/getSettings)
     * * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
     */
    inline def getFolderSettingsPlain(args: Endofunction[com.pulumi.gcp.logging.inputs.GetFolderSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.logging.outputs.GetFolderSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetFolderSettingsPlainArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getFolderSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get information about a Google Cloud Logging Log View. For more information, see the
     * [official documentation](https://cloud.google.com/logging/docs/apis)
     * and [API](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.locations.buckets.views).
     */
    inline def getLogView(args: Endofunction[com.pulumi.gcp.logging.inputs.GetLogViewArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.logging.outputs.GetLogViewResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetLogViewArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getLogView(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get information about a Google Cloud Logging Log View. For more information, see the
     * [official documentation](https://cloud.google.com/logging/docs/apis)
     * and [API](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.locations.buckets.views).
     */
    inline def getLogViewPlain(args: Endofunction[com.pulumi.gcp.logging.inputs.GetLogViewPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.logging.outputs.GetLogViewResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetLogViewPlainArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getLogViewPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for logview */
    inline def getLogViewIamPolicy(args: Endofunction[com.pulumi.gcp.logging.inputs.GetLogViewIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.logging.outputs.GetLogViewIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetLogViewIamPolicyArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getLogViewIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for logview */
    inline def getLogViewIamPolicyPlain(args: Endofunction[com.pulumi.gcp.logging.inputs.GetLogViewIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.logging.outputs.GetLogViewIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetLogViewIamPolicyPlainArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getLogViewIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Describes the settings associated with a organization.
     * 
     * To get more information about LoggingOrganizationSettings, see:
     * 
     * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/organizations/getSettings)
     * * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
     */
    inline def getOrganizationSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.GetOrganizationSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.logging.outputs.GetOrganizationSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetOrganizationSettingsArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getOrganizationSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Describes the settings associated with a organization.
     * 
     * To get more information about LoggingOrganizationSettings, see:
     * 
     * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/organizations/getSettings)
     * * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
     */
    inline def getOrganizationSettingsPlain(args: Endofunction[com.pulumi.gcp.logging.inputs.GetOrganizationSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.logging.outputs.GetOrganizationSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetOrganizationSettingsPlainArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getOrganizationSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Describes the customer-managed encryption key (CMEK) settings associated with a project.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getCmekSettings)
     * * [Enable CMEK](https://cloud.google.com/logging/docs/routing/managed-encryption-storage#enable).
     */
    inline def getProjectCmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.GetProjectCmekSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.logging.outputs.GetProjectCmekSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetProjectCmekSettingsArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getProjectCmekSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Describes the customer-managed encryption key (CMEK) settings associated with a project.
     * 
     * To get more information about Service, see:
     * 
     * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getCmekSettings)
     * * [Enable CMEK](https://cloud.google.com/logging/docs/routing/managed-encryption-storage#enable).
     */
    inline def getProjectCmekSettingsPlain(args: Endofunction[com.pulumi.gcp.logging.inputs.GetProjectCmekSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.logging.outputs.GetProjectCmekSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetProjectCmekSettingsPlainArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getProjectCmekSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Describes the settings associated with a project.
     * 
     * To get more information about LoggingProjectSettings, see:
     * 
     * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getSettings)
     * * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
     */
    inline def getProjectSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.GetProjectSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.logging.outputs.GetProjectSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetProjectSettingsArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getProjectSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Describes the settings associated with a project.
     * 
     * To get more information about LoggingProjectSettings, see:
     * 
     * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getSettings)
     * * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
     */
    inline def getProjectSettingsPlain(args: Endofunction[com.pulumi.gcp.logging.inputs.GetProjectSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.logging.outputs.GetProjectSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetProjectSettingsPlainArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getProjectSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get a project, folder, organization or billing account logging sink details.
     * To get more information about Service, see:
     * 
     * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/sinks)
     */
    inline def getSink(args: Endofunction[com.pulumi.gcp.logging.inputs.GetSinkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.logging.outputs.GetSinkResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetSinkArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getSink(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get a project, folder, organization or billing account logging sink details.
     * To get more information about Service, see:
     * 
     * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/sinks)
     */
    inline def getSinkPlain(args: Endofunction[com.pulumi.gcp.logging.inputs.GetSinkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.logging.outputs.GetSinkResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetSinkPlainArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getSinkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Logs-based metric can also be used to extract values from logs and create a a distribution
   * of the values. The distribution records the statistics of the extracted values along with
   * an optional histogram of the values as specified by the bucket options.
   * 
   * To get more information about Metric, see:
   * 
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.metrics/create)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/logging/docs/apis)
   */
  inline def Metric(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.MetricArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.MetricArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.Metric(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a organization-level logging bucket config. For more information see
   * [the official logging documentation](https://cloud.google.com/logging/docs/) and
   * [Storing Logs](https://cloud.google.com/logging/docs/storage).
   * 
   * &gt; **Note:** Logging buckets are automatically created for a given folder, project, organization, billingAccount and cannot be deleted. Creating a resource of this type will acquire and update the resource that already exists at the desired location. These buckets cannot be removed so deleting this resource will remove the bucket config from your state but will leave the logging bucket unchanged. The buckets that are currently automatically created are &#34;_Default&#34; and &#34;_Required&#34;.
   */
  inline def OrganizationBucketConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.OrganizationBucketConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.logging.OrganizationBucketConfigArgs.builder
    com.pulumi.gcp.logging.OrganizationBucketConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an organization-level logging exclusion. For more information see:
   * 
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/organizations.exclusions)
   * * How-to Guides
   *     * [Excluding Logs](https://cloud.google.com/logging/docs/exclusions)
   * 
   * &gt; You can specify exclusions for log sinks created by the provider by using the exclusions field of `gcp.logging.OrganizationSink`
   */
  inline def OrganizationExclusion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.OrganizationExclusionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.OrganizationExclusionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.OrganizationExclusion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Default resource settings control whether CMEK is required for new log buckets. These settings also determine the storage location for the _Default and _Required log buckets, and whether the _Default sink is enabled or disabled.
   * 
   * To get more information about OrganizationSettings, see:
   * 
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/TopLevel/getSettings)
   * * How-to Guides
   *     * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings)
   */
  inline def OrganizationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.OrganizationSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.logging.OrganizationSettingsArgs.builder
    com.pulumi.gcp.logging.OrganizationSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an organization-level logging sink. For more information see:
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/organizations.sinks)
   * * How-to Guides
   *     * [Exporting Logs](https://cloud.google.com/logging/docs/export)
   */
  inline def OrganizationSink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.OrganizationSinkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.OrganizationSinkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.OrganizationSink(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a project-level logging bucket config. For more information see
   * [the official logging documentation](https://cloud.google.com/logging/docs/) and
   * [Storing Logs](https://cloud.google.com/logging/docs/storage).
   * 
   * &gt; **Note:** Logging buckets are automatically created for a given folder, project, organization, billingAccount and cannot be deleted. Creating a resource of this type will acquire and update the resource that already exists at the desired location. These buckets cannot be removed so deleting this resource will remove the bucket config from your state but will leave the logging bucket unchanged. The buckets that are currently automatically created are &#34;_Default&#34; and &#34;_Required&#34;.
   */
  inline def ProjectBucketConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.ProjectBucketConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.logging.ProjectBucketConfigArgs.builder
    com.pulumi.gcp.logging.ProjectBucketConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a project-level logging exclusion. For more information see:
   * 
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.exclusions)
   * * How-to Guides
   *     * [Excluding Logs](https://cloud.google.com/logging/docs/exclusions)
   * 
   * &gt; You can specify exclusions for log sinks created by the provider by using the exclusions field of `gcp.logging.ProjectSink`
   */
  inline def ProjectExclusion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.ProjectExclusionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.ProjectExclusionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.ProjectExclusion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a project-level logging sink. For more information see:
   * 
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.sinks)
   * * How-to Guides
   *     * [Exporting Logs](https://cloud.google.com/logging/docs/export)
   * 
   * &gt; You can specify exclusions for log sinks created by terraform by using the exclusions field of `gcp.logging.FolderSink`
   * 
   * &gt; **Note:** You must have [granted the &#34;Logs Configuration Writer&#34;](https://cloud.google.com/logging/docs/access-control) IAM role (`roles/logging.configWriter`) to the credentials used with this provider.
   * 
   * &gt; **Note** You must [enable the Cloud Resource Manager API](https://console.cloud.google.com/apis/library/cloudresourcemanager.googleapis.com)
   * 
   * &gt; **Note:** The `_Default` and `_Required` logging sinks are automatically created for a given project and cannot be deleted. Creating a resource of this type will acquire and update the resource that already exists at the desired location. These sinks cannot be removed so deleting this resource will remove the sink config from your terraform state but will leave the logging sink unchanged. The sinks that are currently automatically created are &#34;_Default&#34; and &#34;_Required&#34;.
   */
  inline def ProjectSink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.ProjectSinkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.ProjectSinkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.ProjectSink(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Describes a query that has been saved by a user.
   * 
   * To get more information about SavedQuery, see:
   * 
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.locations.savedQueries)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/logging/docs/apis)
   *     * [Save and share SQL queries](https://docs.cloud.google.com/logging/docs/analyze/save-share-query)
   *     * [Save and share queries](https://docs.cloud.google.com/logging/docs/view/building-queries#saved-queries)
   */
  inline def SavedQuery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.logging.SavedQueryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.SavedQueryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.SavedQuery(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
