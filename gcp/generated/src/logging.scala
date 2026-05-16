package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object logging:
  /**
   * Manages a folder-level logging exclusion. For more information see:
   * 
   *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/folders.exclusions)
   *  * How-to Guides
   *      * [Excluding Logs](https://cloud.google.com/logging/docs/exclusions)
   * 
   *  &gt; You can specify exclusions for log sinks created by the provider by using the exclusions field of `gcp.logging.FolderSink`
   */
  def FolderExclusion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.FolderExclusionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.FolderExclusionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.FolderExclusion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a organization-level logging bucket config. For more information see
   *  [the official logging documentation](https://cloud.google.com/logging/docs/) and
   *  [Storing Logs](https://cloud.google.com/logging/docs/storage).
   * 
   *  &gt; **Note:** Logging buckets are automatically created for a given folder, project, organization, billingAccount and cannot be deleted. Creating a resource of this type will acquire and update the resource that already exists at the desired location. These buckets cannot be removed so deleting this resource will remove the bucket config from your state but will leave the logging bucket unchanged. The buckets that are currently automatically created are &#34;_Default&#34; and &#34;_Required&#34;.
   */
  def OrganizationBucketConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.OrganizationBucketConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.logging.OrganizationBucketConfigArgs.builder
    com.pulumi.gcp.logging.OrganizationBucketConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Describes a BigQuery linked dataset
   * 
   *  To get more information about LinkedDataset, see:
   * 
   *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/locations.buckets.links)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/logging/docs/apis)
   */
  def LinkedDataset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.LinkedDatasetArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.logging.LinkedDatasetArgs.builder
    com.pulumi.gcp.logging.LinkedDataset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Describes a query that has been saved by a user.
   * 
   *  To get more information about SavedQuery, see:
   * 
   *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.locations.savedQueries)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/logging/docs/apis)
   *      * [Save and share SQL queries](https://docs.cloud.google.com/logging/docs/analyze/save-share-query)
   *      * [Save and share queries](https://docs.cloud.google.com/logging/docs/view/building-queries#saved-queries)
   */
  def SavedQuery(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.SavedQueryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.SavedQueryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.SavedQuery(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Describes a view over log entries in a bucket.
   * 
   *  To get more information about LogView, see:
   * 
   *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.locations.buckets.views)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/logging/docs/apis)
   */
  def LogView(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.LogViewArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.LogViewArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.LogView(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.logging.LogViewIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.logging.LogViewIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.logging.SavedQueryArgs.Builder)
    /**
     * @param loggingQuery The contents of the saved query.
     *  Structure is documented below.
     * @return builder
     */
    def loggingQuery(args: Endofunction[com.pulumi.gcp.logging.inputs.SavedQueryLoggingQueryArgs.Builder]):
        com.pulumi.gcp.logging.SavedQueryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.SavedQueryLoggingQueryArgs.builder
      builder.loggingQuery(args(argsBuilder).build)

    /**
     * @param opsAnalyticsQuery The contents of the saved query.
     *  Structure is documented below.
     * @return builder
     */
    def opsAnalyticsQuery(args: Endofunction[com.pulumi.gcp.logging.inputs.SavedQueryOpsAnalyticsQueryArgs.Builder]):
        com.pulumi.gcp.logging.SavedQueryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.SavedQueryOpsAnalyticsQueryArgs.builder
      builder.opsAnalyticsQuery(args(argsBuilder).build)

  /**
   * Describes a group of resources to read log entries from
   * 
   *  To get more information about LogScope, see:
   * 
   *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.locations.logScopes)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/logging/docs/apis)
   */
  def LogScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.LogScopeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.LogScopeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.LogScope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud (Stackdriver) Logging LogView. Each of these resources serves a different use case:
   * 
   *  * `gcp.logging.LogViewIamPolicy`: Authoritative. Sets the IAM policy for the logview and replaces any existing policy already attached.
   *  * `gcp.logging.LogViewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the logview are preserved.
   *  * `gcp.logging.LogViewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the logview are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.logging.LogViewIamPolicy`: Retrieves the IAM policy for the logview
   * 
   *  &gt; **Note:** `gcp.logging.LogViewIamPolicy` **cannot** be used in conjunction with `gcp.logging.LogViewIamBinding` and `gcp.logging.LogViewIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.logging.LogViewIamBinding` resources **can be** used in conjunction with `gcp.logging.LogViewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.logging.LogViewIamPolicy
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
   *  import com.pulumi.gcp.logging.LogViewIamPolicy;
   *  import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/logging.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
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
   *  import com.pulumi.gcp.logging.LogViewIamPolicy;
   *  import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/logging.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.logging.LogViewIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.logging.LogViewIamBinding;
   *  import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
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
   *  import com.pulumi.gcp.logging.LogViewIamBinding;
   *  import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   *  import com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(LogViewIamBindingConditionArgs.builder()
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
   *  ## gcp.logging.LogViewIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.logging.LogViewIamMember;
   *  import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
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
   *  import com.pulumi.gcp.logging.LogViewIamMember;
   *  import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   *  import com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(LogViewIamMemberConditionArgs.builder()
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
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Cloud (Stackdriver) Logging LogView
   * 
   *  Three different resources help you manage your IAM policy for Cloud (Stackdriver) Logging LogView. Each of these resources serves a different use case:
   * 
   *  * `gcp.logging.LogViewIamPolicy`: Authoritative. Sets the IAM policy for the logview and replaces any existing policy already attached.
   *  * `gcp.logging.LogViewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the logview are preserved.
   *  * `gcp.logging.LogViewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the logview are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.logging.LogViewIamPolicy`: Retrieves the IAM policy for the logview
   * 
   *  &gt; **Note:** `gcp.logging.LogViewIamPolicy` **cannot** be used in conjunction with `gcp.logging.LogViewIamBinding` and `gcp.logging.LogViewIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.logging.LogViewIamBinding` resources **can be** used in conjunction with `gcp.logging.LogViewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.logging.LogViewIamPolicy
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
   *  import com.pulumi.gcp.logging.LogViewIamPolicy;
   *  import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/logging.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
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
   *  import com.pulumi.gcp.logging.LogViewIamPolicy;
   *  import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/logging.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.logging.LogViewIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.logging.LogViewIamBinding;
   *  import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
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
   *  import com.pulumi.gcp.logging.LogViewIamBinding;
   *  import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   *  import com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(LogViewIamBindingConditionArgs.builder()
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
   *  ## gcp.logging.LogViewIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.logging.LogViewIamMember;
   *  import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
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
   *  import com.pulumi.gcp.logging.LogViewIamMember;
   *  import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   *  import com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(LogViewIamMemberConditionArgs.builder()
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
   *  * {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud (Stackdriver) Logging logview IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_logging_log_view_iam_member.editor &#34;{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}} roles/logging.admin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_logging_log_view_iam_binding.editor &#34;{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}} roles/logging.admin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:logging/logViewIamMember:LogViewIamMember editor {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def LogViewIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.LogViewIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.LogViewIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.LogViewIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.logging.OrganizationBucketConfigArgs.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
     * @return builder
     */
    def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.OrganizationBucketConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.OrganizationBucketConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  /**
   * Default resource settings control whether CMEK is required for new log buckets. These settings also determine the storage location for the _Default and _Required log buckets, and whether the _Default sink is enabled or disabled.
   * 
   *  To get more information about OrganizationSettings, see:
   * 
   *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/TopLevel/getSettings)
   *  * How-to Guides
   *      * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings)
   */
  def OrganizationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.OrganizationSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.logging.OrganizationSettingsArgs.builder
    com.pulumi.gcp.logging.OrganizationSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.sinks)
   *  * How-to Guides
   *      * [Exporting Logs](https://cloud.google.com/logging/docs/export)
   * 
   *  &gt; **Note** You must have the &#34;Logs Configuration Writer&#34; IAM role (`roles/logging.configWriter`)
   *  [granted on the billing account](https://cloud.google.com/billing/reference/rest/v1/billingAccounts/getIamPolicy) to
   *  the credentials used with this provider. [IAM roles granted on a billing account](https://cloud.google.com/billing/docs/how-to/billing-access) are separate from the
   *  typical IAM roles granted on a project.
   */
  def BillingAccountSink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.BillingAccountSinkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.BillingAccountSinkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.BillingAccountSink(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.logging.FolderBucketConfigArgs.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
     * @return builder
     */
    def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.FolderBucketConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.FolderBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.FolderBucketConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.FolderBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.BillingAccountBucketConfigArgs.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
     * @return builder
     */
    def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.BillingAccountBucketConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.BillingAccountBucketConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.LogViewIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.logging.LogViewIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Logs-based metric can also be used to extract values from logs and create a a distribution
   *  of the values. The distribution records the statistics of the extracted values along with
   *  an optional histogram of the values as specified by the bucket options.
   * 
   *  To get more information about Metric, see:
   * 
   *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.metrics/create)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/logging/docs/apis)
   */
  def Metric(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.MetricArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.MetricArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.Metric(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.logging.OrganizationSinkArgs.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.OrganizationSinkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.OrganizationSinkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  /**
   * Three different resources help you manage your IAM policy for Cloud (Stackdriver) Logging LogView. Each of these resources serves a different use case:
   * 
   *  * `gcp.logging.LogViewIamPolicy`: Authoritative. Sets the IAM policy for the logview and replaces any existing policy already attached.
   *  * `gcp.logging.LogViewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the logview are preserved.
   *  * `gcp.logging.LogViewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the logview are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.logging.LogViewIamPolicy`: Retrieves the IAM policy for the logview
   * 
   *  &gt; **Note:** `gcp.logging.LogViewIamPolicy` **cannot** be used in conjunction with `gcp.logging.LogViewIamBinding` and `gcp.logging.LogViewIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.logging.LogViewIamBinding` resources **can be** used in conjunction with `gcp.logging.LogViewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.logging.LogViewIamPolicy
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
   *  import com.pulumi.gcp.logging.LogViewIamPolicy;
   *  import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/logging.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
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
   *  import com.pulumi.gcp.logging.LogViewIamPolicy;
   *  import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/logging.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.logging.LogViewIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.logging.LogViewIamBinding;
   *  import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
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
   *  import com.pulumi.gcp.logging.LogViewIamBinding;
   *  import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   *  import com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(LogViewIamBindingConditionArgs.builder()
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
   *  ## gcp.logging.LogViewIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.logging.LogViewIamMember;
   *  import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
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
   *  import com.pulumi.gcp.logging.LogViewIamMember;
   *  import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   *  import com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(LogViewIamMemberConditionArgs.builder()
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
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Cloud (Stackdriver) Logging LogView
   * 
   *  Three different resources help you manage your IAM policy for Cloud (Stackdriver) Logging LogView. Each of these resources serves a different use case:
   * 
   *  * `gcp.logging.LogViewIamPolicy`: Authoritative. Sets the IAM policy for the logview and replaces any existing policy already attached.
   *  * `gcp.logging.LogViewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the logview are preserved.
   *  * `gcp.logging.LogViewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the logview are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.logging.LogViewIamPolicy`: Retrieves the IAM policy for the logview
   * 
   *  &gt; **Note:** `gcp.logging.LogViewIamPolicy` **cannot** be used in conjunction with `gcp.logging.LogViewIamBinding` and `gcp.logging.LogViewIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.logging.LogViewIamBinding` resources **can be** used in conjunction with `gcp.logging.LogViewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.logging.LogViewIamPolicy
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
   *  import com.pulumi.gcp.logging.LogViewIamPolicy;
   *  import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/logging.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
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
   *  import com.pulumi.gcp.logging.LogViewIamPolicy;
   *  import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/logging.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.logging.LogViewIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.logging.LogViewIamBinding;
   *  import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
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
   *  import com.pulumi.gcp.logging.LogViewIamBinding;
   *  import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   *  import com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(LogViewIamBindingConditionArgs.builder()
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
   *  ## gcp.logging.LogViewIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.logging.LogViewIamMember;
   *  import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
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
   *  import com.pulumi.gcp.logging.LogViewIamMember;
   *  import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   *  import com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(LogViewIamMemberConditionArgs.builder()
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
   *  * {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud (Stackdriver) Logging logview IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_logging_log_view_iam_member.editor &#34;{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}} roles/logging.admin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_logging_log_view_iam_binding.editor &#34;{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}} roles/logging.admin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:logging/logViewIamPolicy:LogViewIamPolicy editor {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def LogViewIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.LogViewIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.LogViewIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.LogViewIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a folder-level logging sink. For more information see:
   *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/folders.sinks)
   *  * How-to Guides
   *      * [Exporting Logs](https://cloud.google.com/logging/docs/export)
   */
  def FolderSink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.FolderSinkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.FolderSinkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.FolderSink(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.logging.MetricArgs.Builder)
    /**
     * @param bucketOptions The bucketOptions are required when the logs-based metric is using a DISTRIBUTION value type and it
     *  describes the bucket boundaries used to create a histogram of the extracted values.
     *  Structure is documented below.
     * @return builder
     */
    def bucketOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.Builder]):
        com.pulumi.gcp.logging.MetricArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.builder
      builder.bucketOptions(args(argsBuilder).build)

    /**
     * @param metricDescriptor The optional metric descriptor associated with the logs-based metric.
     *  If unspecified, it uses a default metric descriptor with a DELTA metric kind,
     *  INT64 value type, with no labels and a unit of &#34;1&#34;. Such a metric counts the
     *  number of log entries matching the filter expression.
     *  Structure is documented below.
     * @return builder
     */
    def metricDescriptor(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricMetricDescriptorArgs.Builder]):
        com.pulumi.gcp.logging.MetricArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.MetricMetricDescriptorArgs.builder
      builder.metricDescriptor(args(argsBuilder).build)

  /**
   * Manages a project-level logging bucket config. For more information see
   *  [the official logging documentation](https://cloud.google.com/logging/docs/) and
   *  [Storing Logs](https://cloud.google.com/logging/docs/storage).
   * 
   *  &gt; **Note:** Logging buckets are automatically created for a given folder, project, organization, billingAccount and cannot be deleted. Creating a resource of this type will acquire and update the resource that already exists at the desired location. These buckets cannot be removed so deleting this resource will remove the bucket config from your state but will leave the logging bucket unchanged. The buckets that are currently automatically created are &#34;_Default&#34; and &#34;_Required&#34;.
   */
  def ProjectBucketConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.ProjectBucketConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.logging.ProjectBucketConfigArgs.builder
    com.pulumi.gcp.logging.ProjectBucketConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud (Stackdriver) Logging LogView. Each of these resources serves a different use case:
   * 
   *  * `gcp.logging.LogViewIamPolicy`: Authoritative. Sets the IAM policy for the logview and replaces any existing policy already attached.
   *  * `gcp.logging.LogViewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the logview are preserved.
   *  * `gcp.logging.LogViewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the logview are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.logging.LogViewIamPolicy`: Retrieves the IAM policy for the logview
   * 
   *  &gt; **Note:** `gcp.logging.LogViewIamPolicy` **cannot** be used in conjunction with `gcp.logging.LogViewIamBinding` and `gcp.logging.LogViewIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.logging.LogViewIamBinding` resources **can be** used in conjunction with `gcp.logging.LogViewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.logging.LogViewIamPolicy
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
   *  import com.pulumi.gcp.logging.LogViewIamPolicy;
   *  import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/logging.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
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
   *  import com.pulumi.gcp.logging.LogViewIamPolicy;
   *  import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/logging.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.logging.LogViewIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.logging.LogViewIamBinding;
   *  import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
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
   *  import com.pulumi.gcp.logging.LogViewIamBinding;
   *  import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   *  import com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(LogViewIamBindingConditionArgs.builder()
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
   *  ## gcp.logging.LogViewIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.logging.LogViewIamMember;
   *  import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
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
   *  import com.pulumi.gcp.logging.LogViewIamMember;
   *  import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   *  import com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(LogViewIamMemberConditionArgs.builder()
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
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Cloud (Stackdriver) Logging LogView
   * 
   *  Three different resources help you manage your IAM policy for Cloud (Stackdriver) Logging LogView. Each of these resources serves a different use case:
   * 
   *  * `gcp.logging.LogViewIamPolicy`: Authoritative. Sets the IAM policy for the logview and replaces any existing policy already attached.
   *  * `gcp.logging.LogViewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the logview are preserved.
   *  * `gcp.logging.LogViewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the logview are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.logging.LogViewIamPolicy`: Retrieves the IAM policy for the logview
   * 
   *  &gt; **Note:** `gcp.logging.LogViewIamPolicy` **cannot** be used in conjunction with `gcp.logging.LogViewIamBinding` and `gcp.logging.LogViewIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.logging.LogViewIamBinding` resources **can be** used in conjunction with `gcp.logging.LogViewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.logging.LogViewIamPolicy
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
   *  import com.pulumi.gcp.logging.LogViewIamPolicy;
   *  import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/logging.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
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
   *  import com.pulumi.gcp.logging.LogViewIamPolicy;
   *  import com.pulumi.gcp.logging.LogViewIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/logging.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new LogViewIamPolicy("policy", LogViewIamPolicyArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.logging.LogViewIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.logging.LogViewIamBinding;
   *  import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
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
   *  import com.pulumi.gcp.logging.LogViewIamBinding;
   *  import com.pulumi.gcp.logging.LogViewIamBindingArgs;
   *  import com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new LogViewIamBinding("binding", LogViewIamBindingArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(LogViewIamBindingConditionArgs.builder()
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
   *  ## gcp.logging.LogViewIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.logging.LogViewIamMember;
   *  import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
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
   *  import com.pulumi.gcp.logging.LogViewIamMember;
   *  import com.pulumi.gcp.logging.LogViewIamMemberArgs;
   *  import com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new LogViewIamMember("member", LogViewIamMemberArgs.builder()
   *              .parent(loggingLogView.parent())
   *              .location(loggingLogView.location())
   *              .bucket(loggingLogView.bucket())
   *              .name(loggingLogView.name())
   *              .role("roles/logging.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(LogViewIamMemberConditionArgs.builder()
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
   *  * {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud (Stackdriver) Logging logview IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_logging_log_view_iam_member.editor &#34;{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}} roles/logging.admin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_logging_log_view_iam_binding.editor &#34;{{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}} roles/logging.admin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:logging/logViewIamBinding:LogViewIamBinding editor {{parent}}/locations/{{location}}/buckets/{{bucket}}/views/{{log_view}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def LogViewIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.LogViewIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.LogViewIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.LogViewIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an organization-level logging sink. For more information see:
   *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/organizations.sinks)
   *  * How-to Guides
   *      * [Exporting Logs](https://cloud.google.com/logging/docs/export)
   */
  def OrganizationSink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.OrganizationSinkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.OrganizationSinkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.OrganizationSink(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object LoggingFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Describes the settings associated with a folder.
     * 
     *  To get more information about LoggingFolderSettings, see:
     * 
     *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/folders/getSettings)
     *  * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
     */
    inline def getFolderSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.GetFolderSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.logging.outputs.GetFolderSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetFolderSettingsArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getFolderSettings(args(argsBuilder).build)

    /**
     * Describes the settings associated with a folder.
     * 
     *  To get more information about LoggingFolderSettings, see:
     * 
     *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/folders/getSettings)
     *  * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
     */
    inline def getFolderSettingsPlain(args: Endofunction[com.pulumi.gcp.logging.inputs.GetFolderSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.logging.outputs.GetFolderSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetFolderSettingsPlainArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getFolderSettingsPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for logview */
    inline def getLogViewIamPolicy(args: Endofunction[com.pulumi.gcp.logging.inputs.GetLogViewIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.logging.outputs.GetLogViewIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetLogViewIamPolicyArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getLogViewIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for logview */
    inline def getLogViewIamPolicyPlain(args: Endofunction[com.pulumi.gcp.logging.inputs.GetLogViewIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.logging.outputs.GetLogViewIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetLogViewIamPolicyPlainArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getLogViewIamPolicyPlain(args(argsBuilder).build)

    /**
     * Describes the settings associated with a organization.
     * 
     *  To get more information about LoggingOrganizationSettings, see:
     * 
     *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/organizations/getSettings)
     *  * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
     */
    inline def getOrganizationSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.GetOrganizationSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.logging.outputs.GetOrganizationSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetOrganizationSettingsArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getOrganizationSettings(args(argsBuilder).build)

    /**
     * Describes the settings associated with a organization.
     * 
     *  To get more information about LoggingOrganizationSettings, see:
     * 
     *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/organizations/getSettings)
     *  * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
     */
    inline def getOrganizationSettingsPlain(args: Endofunction[com.pulumi.gcp.logging.inputs.GetOrganizationSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.logging.outputs.GetOrganizationSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetOrganizationSettingsPlainArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getOrganizationSettingsPlain(args(argsBuilder).build)

    /**
     * Describes the customer-managed encryption key (CMEK) settings associated with a project.
     * 
     *  To get more information about Service, see:
     * 
     *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getCmekSettings)
     *  * [Enable CMEK](https://cloud.google.com/logging/docs/routing/managed-encryption-storage#enable).
     */
    inline def getProjectCmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.GetProjectCmekSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.logging.outputs.GetProjectCmekSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetProjectCmekSettingsArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getProjectCmekSettings(args(argsBuilder).build)

    /**
     * Describes the customer-managed encryption key (CMEK) settings associated with a project.
     * 
     *  To get more information about Service, see:
     * 
     *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getCmekSettings)
     *  * [Enable CMEK](https://cloud.google.com/logging/docs/routing/managed-encryption-storage#enable).
     */
    inline def getProjectCmekSettingsPlain(args: Endofunction[com.pulumi.gcp.logging.inputs.GetProjectCmekSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.logging.outputs.GetProjectCmekSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetProjectCmekSettingsPlainArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getProjectCmekSettingsPlain(args(argsBuilder).build)

    /**
     * Describes the settings associated with a project.
     * 
     *  To get more information about LoggingProjectSettings, see:
     * 
     *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getSettings)
     *  * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
     */
    inline def getProjectSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.GetProjectSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.logging.outputs.GetProjectSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetProjectSettingsArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getProjectSettings(args(argsBuilder).build)

    /**
     * Describes the settings associated with a project.
     * 
     *  To get more information about LoggingProjectSettings, see:
     * 
     *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects/getSettings)
     *  * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings).
     */
    inline def getProjectSettingsPlain(args: Endofunction[com.pulumi.gcp.logging.inputs.GetProjectSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.logging.outputs.GetProjectSettingsResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetProjectSettingsPlainArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getProjectSettingsPlain(args(argsBuilder).build)

    /**
     * Use this data source to get a project, folder, organization or billing account logging sink details.
     *  To get more information about Service, see:
     * 
     *  [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/sinks)
     */
    inline def getSink(args: Endofunction[com.pulumi.gcp.logging.inputs.GetSinkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.logging.outputs.GetSinkResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetSinkArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getSink(args(argsBuilder).build)

    /**
     * Use this data source to get a project, folder, organization or billing account logging sink details.
     *  To get more information about Service, see:
     * 
     *  [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/sinks)
     */
    inline def getSinkPlain(args: Endofunction[com.pulumi.gcp.logging.inputs.GetSinkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.logging.outputs.GetSinkResult] =
      val argsBuilder = com.pulumi.gcp.logging.inputs.GetSinkPlainArgs.builder
      com.pulumi.gcp.logging.LoggingFunctions.getSinkPlain(args(argsBuilder).build)

  /**
   * Manages a billing account logging exclusion. For more information see:
   * 
   *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/billingAccounts.exclusions)
   *  * How-to Guides
   *      * [Excluding Logs](https://cloud.google.com/logging/docs/exclusions)
   * 
   *  &gt; You can specify exclusions for log sinks created by terraform by using the exclusions field of `gcp.logging.BillingAccountSink`
   */
  def BillingAccountExclusion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.BillingAccountExclusionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.BillingAccountExclusionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.BillingAccountExclusion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.logging.BillingAccountSinkArgs.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.BillingAccountSinkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.BillingAccountSinkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.ProjectBucketConfigArgs.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed. Structure is documented below.
     * @return builder
     */
    def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.ProjectBucketConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.ProjectBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.ProjectBucketConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.ProjectBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  /**
   * Default resource settings control whether CMEK is required for new log buckets. These settings also determine the storage location for the _Default and _Required log buckets, and whether the _Default sink is enabled or disabled.
   * 
   *  To get more information about FolderSettings, see:
   * 
   *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/TopLevel/getSettings)
   *  * How-to Guides
   *      * [Configure default settings for organizations and folders](https://cloud.google.com/logging/docs/default-settings)
   */
  def FolderSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.FolderSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.logging.FolderSettingsArgs.builder
    com.pulumi.gcp.logging.FolderSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a billing account level logging bucket config. For more information see
   *  [the official logging documentation](https://cloud.google.com/logging/docs/) and
   *  [Storing Logs](https://cloud.google.com/logging/docs/storage).
   * 
   *  &gt; **Note:** Logging buckets are automatically created for a given folder, project, organization, billingAccount and cannot be deleted. Creating a resource of this type will acquire and update the resource that already exists at the desired location. These buckets cannot be removed so deleting this resource will remove the bucket config from your state but will leave the logging bucket unchanged. The buckets that are currently automatically created are &#34;_Default&#34; and &#34;_Required&#34;.
   */
  def BillingAccountBucketConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.BillingAccountBucketConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.logging.BillingAccountBucketConfigArgs.builder
    com.pulumi.gcp.logging.BillingAccountBucketConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a folder-level logging bucket config. For more information see
   *  [the official logging documentation](https://cloud.google.com/logging/docs/) and
   *  [Storing Logs](https://cloud.google.com/logging/docs/storage).
   * 
   *  &gt; **Note:** Logging buckets are automatically created for a given folder, project, organization, billingAccount and cannot be deleted. Creating a resource of this type will acquire and update the resource that already exists at the desired location. These buckets cannot be removed so deleting this resource will remove the bucket config from your state but will leave the logging bucket unchanged. The buckets that are currently automatically created are &#34;_Default&#34; and &#34;_Required&#34;.
   */
  def FolderBucketConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.FolderBucketConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.logging.FolderBucketConfigArgs.builder
    com.pulumi.gcp.logging.FolderBucketConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a project-level logging sink. For more information see:
   * 
   *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.sinks)
   *  * How-to Guides
   *      * [Exporting Logs](https://cloud.google.com/logging/docs/export)
   * 
   *  &gt; You can specify exclusions for log sinks created by terraform by using the exclusions field of `gcp.logging.FolderSink`
   * 
   *  &gt; **Note:** You must have [granted the &#34;Logs Configuration Writer&#34;](https://cloud.google.com/logging/docs/access-control) IAM role (`roles/logging.configWriter`) to the credentials used with this provider.
   * 
   *  &gt; **Note** You must [enable the Cloud Resource Manager API](https://console.cloud.google.com/apis/library/cloudresourcemanager.googleapis.com)
   * 
   *  &gt; **Note:** The `_Default` and `_Required` logging sinks are automatically created for a given project and cannot be deleted. Creating a resource of this type will acquire and update the resource that already exists at the desired location. These sinks cannot be removed so deleting this resource will remove the sink config from your terraform state but will leave the logging sink unchanged. The sinks that are currently automatically created are &#34;_Default&#34; and &#34;_Required&#34;.
   */
  def ProjectSink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.ProjectSinkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.ProjectSinkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.ProjectSink(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.logging.ProjectSinkArgs.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.ProjectSinkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.ProjectSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.ProjectSinkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.ProjectSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.FolderSinkArgs.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.FolderSinkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.FolderSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.FolderSinkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.FolderSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.LinkedDatasetArgs.Builder)
    /**
     * @param bigqueryDatasets The information of a BigQuery Dataset. When a link is created, a BigQuery dataset is created along
     *  with it, in the same project as the LogBucket it&#39;s linked to. This dataset will also have BigQuery
     *  Views corresponding to the LogViews in the bucket.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryDatasets(args: Endofunction[com.pulumi.gcp.logging.inputs.LinkedDatasetBigqueryDatasetArgs.Builder]*):
        com.pulumi.gcp.logging.LinkedDatasetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.LinkedDatasetBigqueryDatasetArgs.builder
      builder.bigqueryDatasets(args.map(_(argsBuilder).build)*)

  /**
   * Manages an organization-level logging exclusion. For more information see:
   * 
   *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/organizations.exclusions)
   *  * How-to Guides
   *      * [Excluding Logs](https://cloud.google.com/logging/docs/exclusions)
   * 
   *  &gt; You can specify exclusions for log sinks created by the provider by using the exclusions field of `gcp.logging.OrganizationSink`
   */
  def OrganizationExclusion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.OrganizationExclusionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.OrganizationExclusionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.OrganizationExclusion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a project-level logging exclusion. For more information see:
   * 
   *  * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.exclusions)
   *  * How-to Guides
   *      * [Excluding Logs](https://cloud.google.com/logging/docs/exclusions)
   * 
   *  &gt; You can specify exclusions for log sinks created by the provider by using the exclusions field of `gcp.logging.ProjectSink`
   */
  def ProjectExclusion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.logging.ProjectExclusionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.logging.ProjectExclusionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.logging.ProjectExclusion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.logging.inputs.ProjectSinkState.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.ProjectSinkState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.ProjectSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.ProjectSinkState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.ProjectSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.MetricMetricDescriptorArgs.Builder)
    /**
     * @param labels The set of labels that can be used to describe a specific instance of this metric type. For
     *  example, the appengine.googleapis.com/http/server/response_latencies metric type has a label
     *  for the HTTP response code, response_code, so you can look at latencies for successful responses
     *  or just for responses that failed.
     *  Structure is documented below.
     * @return builder
     */
    def labels(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricMetricDescriptorLabelArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.MetricMetricDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.MetricMetricDescriptorLabelArgs.builder
      builder.labels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.OrganizationSinkState.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.OrganizationSinkState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.OrganizationSinkState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.SavedQueryLoggingQueryArgs.Builder)
    /**
     * @param summaryFields The names of the fields to display in the summary.
     *  Structure is documented below.
     * @return builder
     */
    def summaryFields(args: Endofunction[com.pulumi.gcp.logging.inputs.SavedQueryLoggingQuerySummaryFieldArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.SavedQueryLoggingQueryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.SavedQueryLoggingQuerySummaryFieldArgs.builder
      builder.summaryFields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.MetricState.Builder)
    /**
     * @param bucketOptions The bucketOptions are required when the logs-based metric is using a DISTRIBUTION value type and it
     *  describes the bucket boundaries used to create a histogram of the extracted values.
     *  Structure is documented below.
     * @return builder
     */
    def bucketOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.MetricState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.builder
      builder.bucketOptions(args(argsBuilder).build)

    /**
     * @param metricDescriptor The optional metric descriptor associated with the logs-based metric.
     *  If unspecified, it uses a default metric descriptor with a DELTA metric kind,
     *  INT64 value type, with no labels and a unit of &#34;1&#34;. Such a metric counts the
     *  number of log entries matching the filter expression.
     *  Structure is documented below.
     * @return builder
     */
    def metricDescriptor(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricMetricDescriptorArgs.Builder]):
        com.pulumi.gcp.logging.inputs.MetricState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.MetricMetricDescriptorArgs.builder
      builder.metricDescriptor(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.logging.inputs.BillingAccountSinkState.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.BillingAccountSinkState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.BillingAccountSinkState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.ProjectBucketConfigState.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed. Structure is documented below.
     * @return builder
     */
    def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.ProjectBucketConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.ProjectBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.ProjectBucketConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.ProjectBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.SavedQueryState.Builder)
    /**
     * @param loggingQuery The contents of the saved query.
     *  Structure is documented below.
     * @return builder
     */
    def loggingQuery(args: Endofunction[com.pulumi.gcp.logging.inputs.SavedQueryLoggingQueryArgs.Builder]):
        com.pulumi.gcp.logging.inputs.SavedQueryState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.SavedQueryLoggingQueryArgs.builder
      builder.loggingQuery(args(argsBuilder).build)

    /**
     * @param opsAnalyticsQuery The contents of the saved query.
     *  Structure is documented below.
     * @return builder
     */
    def opsAnalyticsQuery(args: Endofunction[com.pulumi.gcp.logging.inputs.SavedQueryOpsAnalyticsQueryArgs.Builder]):
        com.pulumi.gcp.logging.inputs.SavedQueryState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.SavedQueryOpsAnalyticsQueryArgs.builder
      builder.opsAnalyticsQuery(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigState.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
     * @return builder
     */
    def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.FolderBucketConfigState.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
     * @return builder
     */
    def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.FolderBucketConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.FolderBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.FolderBucketConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.FolderBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.LogViewIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.logging.inputs.LogViewIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.logging.inputs.OrganizationBucketConfigState.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
     * @return builder
     */
    def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.OrganizationBucketConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.OrganizationBucketConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.Builder)
    /**
     * @param explicitBuckets Specifies a set of buckets with arbitrary widths.
     *  Structure is documented below.
     * @return builder
     */
    def explicitBuckets(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricBucketOptionsExplicitBucketsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.MetricBucketOptionsExplicitBucketsArgs.builder
      builder.explicitBuckets(args(argsBuilder).build)

    /**
     * @param exponentialBuckets Specifies an exponential sequence of buckets that have a width that is proportional to the value of
     *  the lower bound. Each bucket represents a constant relative uncertainty on a specific value in the bucket.
     *  Structure is documented below.
     * @return builder
     */
    def exponentialBuckets(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricBucketOptionsExponentialBucketsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.MetricBucketOptionsExponentialBucketsArgs.builder
      builder.exponentialBuckets(args(argsBuilder).build)

    /**
     * @param linearBuckets Specifies a linear sequence of buckets that all have the same width (except overflow and underflow).
     *  Each bucket represents a constant absolute uncertainty on the specific value in the bucket.
     *  Structure is documented below.
     * @return builder
     */
    def linearBuckets(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricBucketOptionsLinearBucketsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.MetricBucketOptionsLinearBucketsArgs.builder
      builder.linearBuckets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.logging.inputs.FolderSinkState.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.FolderSinkState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.FolderSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.FolderSinkState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.FolderSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.LinkedDatasetState.Builder)
    /**
     * @param bigqueryDatasets The information of a BigQuery Dataset. When a link is created, a BigQuery dataset is created along
     *  with it, in the same project as the LogBucket it&#39;s linked to. This dataset will also have BigQuery
     *  Views corresponding to the LogViews in the bucket.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryDatasets(args: Endofunction[com.pulumi.gcp.logging.inputs.LinkedDatasetBigqueryDatasetArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.LinkedDatasetState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.LinkedDatasetBigqueryDatasetArgs.builder
      builder.bigqueryDatasets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.LogViewIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.logging.inputs.LogViewIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)
