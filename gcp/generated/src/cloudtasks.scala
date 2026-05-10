package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudtasks:
  extension (builder: com.pulumi.gcp.cloudtasks.QueueArgs.Builder)
    /**
     * @param appEngineRoutingOverride Overrides for task-level appEngineRouting. These settings apply only
     *  to App Engine tasks in this queue
     *  Structure is documented below.
     * @return builder
     */
    def appEngineRoutingOverride(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueAppEngineRoutingOverrideArgs.Builder]):
        com.pulumi.gcp.cloudtasks.QueueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueAppEngineRoutingOverrideArgs.builder
      builder.appEngineRoutingOverride(args(argsBuilder).build)

    /**
     * @param httpTarget Modifies HTTP target for HTTP tasks.
     *  Structure is documented below.
     * @return builder
     */
    def httpTarget(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.Builder]):
        com.pulumi.gcp.cloudtasks.QueueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.builder
      builder.httpTarget(args(argsBuilder).build)

    /**
     * @param rateLimits Rate limits for task dispatches.
     *  The queue&#39;s actual dispatch rate is the result of:
     *  * Number of tasks in the queue
     *  * User-specified throttling: rateLimits, retryConfig, and the queue&#39;s state.
     *  * System throttling due to 429 (Too Many Requests) or 503 (Service
     *    Unavailable) responses from the worker, high error rates, or to
     *    smooth sudden large traffic spikes.
     *    Structure is documented below.
     * @return builder
     */
    def rateLimits(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueRateLimitsArgs.Builder]):
        com.pulumi.gcp.cloudtasks.QueueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueRateLimitsArgs.builder
      builder.rateLimits(args(argsBuilder).build)

    /**
     * @param retryConfig Settings that determine the retry behavior.
     *  Structure is documented below.
     * @return builder
     */
    def retryConfig(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueRetryConfigArgs.Builder]):
        com.pulumi.gcp.cloudtasks.QueueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueRetryConfigArgs.builder
      builder.retryConfig(args(argsBuilder).build)

    /**
     * @param stackdriverLoggingConfig Configuration options for writing logs to Stackdriver Logging.
     *  Structure is documented below.
     * @return builder
     */
    def stackdriverLoggingConfig(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueStackdriverLoggingConfigArgs.Builder]):
        com.pulumi.gcp.cloudtasks.QueueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueStackdriverLoggingConfigArgs.builder
      builder.stackdriverLoggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.QueueIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudtasks.QueueIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /** A named resource to which messages are sent by publishers. */
  def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudtasks.QueueArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudtasks.QueueArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudtasks.Queue(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Tasks Queue. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudtasks.QueueIamPolicy`: Authoritative. Sets the IAM policy for the queue and replaces any existing policy already attached.
   *  * `gcp.cloudtasks.QueueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the queue are preserved.
   *  * `gcp.cloudtasks.QueueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the queue are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudtasks.QueueIamPolicy`: Retrieves the IAM policy for the queue
   * 
   *  &gt; **Note:** `gcp.cloudtasks.QueueIamPolicy` **cannot** be used in conjunction with `gcp.cloudtasks.QueueIamBinding` and `gcp.cloudtasks.QueueIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudtasks.QueueIamBinding` resources **can be** used in conjunction with `gcp.cloudtasks.QueueIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudtasks.QueueIamPolicy
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
   *  import com.pulumi.gcp.cloudtasks.QueueIamPolicy;
   *  import com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new QueueIamPolicy("policy", QueueIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudtasks.QueueIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudtasks.QueueIamBinding;
   *  import com.pulumi.gcp.cloudtasks.QueueIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new QueueIamBinding("binding", QueueIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudtasks.QueueIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudtasks.QueueIamMember;
   *  import com.pulumi.gcp.cloudtasks.QueueIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new QueueIamMember("member", QueueIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
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
   *  # IAM policy for Cloud Tasks Queue
   * 
   *  Three different resources help you manage your IAM policy for Cloud Tasks Queue. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudtasks.QueueIamPolicy`: Authoritative. Sets the IAM policy for the queue and replaces any existing policy already attached.
   *  * `gcp.cloudtasks.QueueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the queue are preserved.
   *  * `gcp.cloudtasks.QueueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the queue are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudtasks.QueueIamPolicy`: Retrieves the IAM policy for the queue
   * 
   *  &gt; **Note:** `gcp.cloudtasks.QueueIamPolicy` **cannot** be used in conjunction with `gcp.cloudtasks.QueueIamBinding` and `gcp.cloudtasks.QueueIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudtasks.QueueIamBinding` resources **can be** used in conjunction with `gcp.cloudtasks.QueueIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudtasks.QueueIamPolicy
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
   *  import com.pulumi.gcp.cloudtasks.QueueIamPolicy;
   *  import com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new QueueIamPolicy("policy", QueueIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudtasks.QueueIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudtasks.QueueIamBinding;
   *  import com.pulumi.gcp.cloudtasks.QueueIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new QueueIamBinding("binding", QueueIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudtasks.QueueIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudtasks.QueueIamMember;
   *  import com.pulumi.gcp.cloudtasks.QueueIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new QueueIamMember("member", QueueIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .role("roles/viewer")
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
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/locations/{{location}}/queues/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Tasks queue IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_cloud_tasks_queue_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/queues/{{queue}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_cloud_tasks_queue_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/queues/{{queue}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:cloudtasks/queueIamPolicy:QueueIamPolicy editor projects/{{project}}/locations/{{location}}/queues/{{queue}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def QueueIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudtasks.QueueIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type CloudtasksFunctions = com.pulumi.gcp.cloudtasks.CloudtasksFunctions
  object CloudtasksFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.cloudtasks.CloudtasksFunctions.*
  extension (self: CloudtasksFunctions.type)
    /** Retrieves the current IAM policy data for queue */
    def getQueueIamPolicy(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.GetQueueIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudtasks.outputs.GetQueueIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.GetQueueIamPolicyArgs.builder
      com.pulumi.gcp.cloudtasks.CloudtasksFunctions.getQueueIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for queue */
    def getQueueIamPolicyPlain(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.GetQueueIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudtasks.outputs.GetQueueIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.GetQueueIamPolicyPlainArgs.builder
      com.pulumi.gcp.cloudtasks.CloudtasksFunctions.getQueueIamPolicyPlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Tasks Queue. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudtasks.QueueIamPolicy`: Authoritative. Sets the IAM policy for the queue and replaces any existing policy already attached.
   *  * `gcp.cloudtasks.QueueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the queue are preserved.
   *  * `gcp.cloudtasks.QueueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the queue are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudtasks.QueueIamPolicy`: Retrieves the IAM policy for the queue
   * 
   *  &gt; **Note:** `gcp.cloudtasks.QueueIamPolicy` **cannot** be used in conjunction with `gcp.cloudtasks.QueueIamBinding` and `gcp.cloudtasks.QueueIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudtasks.QueueIamBinding` resources **can be** used in conjunction with `gcp.cloudtasks.QueueIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudtasks.QueueIamPolicy
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
   *  import com.pulumi.gcp.cloudtasks.QueueIamPolicy;
   *  import com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new QueueIamPolicy("policy", QueueIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudtasks.QueueIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudtasks.QueueIamBinding;
   *  import com.pulumi.gcp.cloudtasks.QueueIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new QueueIamBinding("binding", QueueIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudtasks.QueueIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudtasks.QueueIamMember;
   *  import com.pulumi.gcp.cloudtasks.QueueIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new QueueIamMember("member", QueueIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
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
   *  # IAM policy for Cloud Tasks Queue
   * 
   *  Three different resources help you manage your IAM policy for Cloud Tasks Queue. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudtasks.QueueIamPolicy`: Authoritative. Sets the IAM policy for the queue and replaces any existing policy already attached.
   *  * `gcp.cloudtasks.QueueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the queue are preserved.
   *  * `gcp.cloudtasks.QueueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the queue are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudtasks.QueueIamPolicy`: Retrieves the IAM policy for the queue
   * 
   *  &gt; **Note:** `gcp.cloudtasks.QueueIamPolicy` **cannot** be used in conjunction with `gcp.cloudtasks.QueueIamBinding` and `gcp.cloudtasks.QueueIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudtasks.QueueIamBinding` resources **can be** used in conjunction with `gcp.cloudtasks.QueueIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudtasks.QueueIamPolicy
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
   *  import com.pulumi.gcp.cloudtasks.QueueIamPolicy;
   *  import com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new QueueIamPolicy("policy", QueueIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudtasks.QueueIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudtasks.QueueIamBinding;
   *  import com.pulumi.gcp.cloudtasks.QueueIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new QueueIamBinding("binding", QueueIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudtasks.QueueIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudtasks.QueueIamMember;
   *  import com.pulumi.gcp.cloudtasks.QueueIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new QueueIamMember("member", QueueIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .role("roles/viewer")
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
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/locations/{{location}}/queues/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Tasks queue IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_cloud_tasks_queue_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/queues/{{queue}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_cloud_tasks_queue_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/queues/{{queue}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:cloudtasks/queueIamBinding:QueueIamBinding editor projects/{{project}}/locations/{{location}}/queues/{{queue}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def QueueIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudtasks.QueueIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudtasks.QueueIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudtasks.QueueIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Tasks Queue. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudtasks.QueueIamPolicy`: Authoritative. Sets the IAM policy for the queue and replaces any existing policy already attached.
   *  * `gcp.cloudtasks.QueueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the queue are preserved.
   *  * `gcp.cloudtasks.QueueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the queue are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudtasks.QueueIamPolicy`: Retrieves the IAM policy for the queue
   * 
   *  &gt; **Note:** `gcp.cloudtasks.QueueIamPolicy` **cannot** be used in conjunction with `gcp.cloudtasks.QueueIamBinding` and `gcp.cloudtasks.QueueIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudtasks.QueueIamBinding` resources **can be** used in conjunction with `gcp.cloudtasks.QueueIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudtasks.QueueIamPolicy
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
   *  import com.pulumi.gcp.cloudtasks.QueueIamPolicy;
   *  import com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new QueueIamPolicy("policy", QueueIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudtasks.QueueIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudtasks.QueueIamBinding;
   *  import com.pulumi.gcp.cloudtasks.QueueIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new QueueIamBinding("binding", QueueIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudtasks.QueueIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudtasks.QueueIamMember;
   *  import com.pulumi.gcp.cloudtasks.QueueIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new QueueIamMember("member", QueueIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
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
   *  # IAM policy for Cloud Tasks Queue
   * 
   *  Three different resources help you manage your IAM policy for Cloud Tasks Queue. Each of these resources serves a different use case:
   * 
   *  * `gcp.cloudtasks.QueueIamPolicy`: Authoritative. Sets the IAM policy for the queue and replaces any existing policy already attached.
   *  * `gcp.cloudtasks.QueueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the queue are preserved.
   *  * `gcp.cloudtasks.QueueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the queue are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.cloudtasks.QueueIamPolicy`: Retrieves the IAM policy for the queue
   * 
   *  &gt; **Note:** `gcp.cloudtasks.QueueIamPolicy` **cannot** be used in conjunction with `gcp.cloudtasks.QueueIamBinding` and `gcp.cloudtasks.QueueIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.cloudtasks.QueueIamBinding` resources **can be** used in conjunction with `gcp.cloudtasks.QueueIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.cloudtasks.QueueIamPolicy
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
   *  import com.pulumi.gcp.cloudtasks.QueueIamPolicy;
   *  import com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new QueueIamPolicy("policy", QueueIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudtasks.QueueIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudtasks.QueueIamBinding;
   *  import com.pulumi.gcp.cloudtasks.QueueIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new QueueIamBinding("binding", QueueIamBindingArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.cloudtasks.QueueIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.cloudtasks.QueueIamMember;
   *  import com.pulumi.gcp.cloudtasks.QueueIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new QueueIamMember("member", QueueIamMemberArgs.builder()
   *              .project(default_.project())
   *              .location(default_.location())
   *              .name(default_.name())
   *              .role("roles/viewer")
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
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/locations/{{location}}/queues/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Tasks queue IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_cloud_tasks_queue_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/queues/{{queue}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_cloud_tasks_queue_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/queues/{{queue}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:cloudtasks/queueIamMember:QueueIamMember editor projects/{{project}}/locations/{{location}}/queues/{{queue}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def QueueIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudtasks.QueueIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudtasks.QueueIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudtasks.QueueIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.inputs.QueueIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.Builder)
    /**
     * @param headerOverrides HTTP target headers.
     *  This map contains the header field names and values.
     *  Headers will be set when running the CreateTask and/or BufferTask.
     *  These headers represent a subset of the headers that will be configured for the task&#39;s HTTP request.
     *  Some HTTP request headers will be ignored or replaced.
     *  Headers which can have multiple values (according to RFC2616) can be specified using comma-separated values.
     *  The size of the headers must be less than 80KB. Queue-level headers to override headers of all the tasks in the queue.
     *  Structure is documented below.
     * @return builder
     */
    def headerOverrides(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetHeaderOverrideArgs.Builder]*):
        com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetHeaderOverrideArgs.builder
      builder.headerOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param oauthToken If specified, an OAuth token is generated and attached as the Authorization header in the HTTP request.
     *  This type of authorization should generally be used only when calling Google APIs hosted on *.googleapis.com.
     *  Note that both the service account email and the scope MUST be specified when using the queue-level authorization override.
     *  Structure is documented below.
     * @return builder
     */
    def oauthToken(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetOauthTokenArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetOauthTokenArgs.builder
      builder.oauthToken(args(argsBuilder).build)

    /**
     * @param oidcToken If specified, an OIDC token is generated and attached as an Authorization header in the HTTP request.
     *  This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
     *  Note that both the service account email and the audience MUST be specified when using the queue-level authorization override.
     *  Structure is documented below.
     * @return builder
     */
    def oidcToken(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetOidcTokenArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetOidcTokenArgs.builder
      builder.oidcToken(args(argsBuilder).build)

    /**
     * @param uriOverride URI override.
     *  When specified, overrides the execution URI for all the tasks in the queue.
     *  Structure is documented below.
     * @return builder
     */
    def uriOverride(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverrideArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverrideArgs.builder
      builder.uriOverride(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.inputs.QueueState.Builder)
    /**
     * @param appEngineRoutingOverride Overrides for task-level appEngineRouting. These settings apply only
     *  to App Engine tasks in this queue
     *  Structure is documented below.
     * @return builder
     */
    def appEngineRoutingOverride(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueAppEngineRoutingOverrideArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueAppEngineRoutingOverrideArgs.builder
      builder.appEngineRoutingOverride(args(argsBuilder).build)

    /**
     * @param httpTarget Modifies HTTP target for HTTP tasks.
     *  Structure is documented below.
     * @return builder
     */
    def httpTarget(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetArgs.builder
      builder.httpTarget(args(argsBuilder).build)

    /**
     * @param rateLimits Rate limits for task dispatches.
     *  The queue&#39;s actual dispatch rate is the result of:
     *  * Number of tasks in the queue
     *  * User-specified throttling: rateLimits, retryConfig, and the queue&#39;s state.
     *  * System throttling due to 429 (Too Many Requests) or 503 (Service
     *    Unavailable) responses from the worker, high error rates, or to
     *    smooth sudden large traffic spikes.
     *    Structure is documented below.
     * @return builder
     */
    def rateLimits(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueRateLimitsArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueRateLimitsArgs.builder
      builder.rateLimits(args(argsBuilder).build)

    /**
     * @param retryConfig Settings that determine the retry behavior.
     *  Structure is documented below.
     * @return builder
     */
    def retryConfig(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueRetryConfigArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueRetryConfigArgs.builder
      builder.retryConfig(args(argsBuilder).build)

    /**
     * @param stackdriverLoggingConfig Configuration options for writing logs to Stackdriver Logging.
     *  Structure is documented below.
     * @return builder
     */
    def stackdriverLoggingConfig(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueStackdriverLoggingConfigArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueStackdriverLoggingConfigArgs.builder
      builder.stackdriverLoggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.inputs.QueueIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetHeaderOverrideArgs.Builder)
    /**
     * @param header Header embodying a key and a value.
     *  Structure is documented below.
     * @return builder
     */
    def header(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetHeaderOverrideHeaderArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetHeaderOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetHeaderOverrideHeaderArgs.builder
      builder.header(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverrideArgs.Builder)
    /**
     * @param pathOverride URI path.
     *  When specified, replaces the existing path of the task URL.
     *  Setting the path value to an empty string clears the URI path segment.
     *  Structure is documented below.
     * @return builder
     */
    def pathOverride(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverridePathOverrideArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverridePathOverrideArgs.builder
      builder.pathOverride(args(argsBuilder).build)

    /**
     * @param queryOverride URI query.
     *  When specified, replaces the query part of the task URI. Setting the query value to an empty string clears the URI query segment.
     *  Structure is documented below.
     * @return builder
     */
    def queryOverride(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverrideQueryOverrideArgs.Builder]):
        com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetUriOverrideQueryOverrideArgs.builder
      builder.queryOverride(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudtasks.QueueIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.QueueIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.cloudtasks.QueueIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.QueueIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)
