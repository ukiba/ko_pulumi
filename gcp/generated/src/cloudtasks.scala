package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudtasks:
  object CloudtasksFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for queue */
    inline def getQueueIamPolicy(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.GetQueueIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudtasks.outputs.GetQueueIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.GetQueueIamPolicyArgs.builder
      com.pulumi.gcp.cloudtasks.CloudtasksFunctions.getQueueIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for queue */
    inline def getQueueIamPolicyPlain(args: Endofunction[com.pulumi.gcp.cloudtasks.inputs.GetQueueIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudtasks.outputs.GetQueueIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudtasks.inputs.GetQueueIamPolicyPlainArgs.builder
      com.pulumi.gcp.cloudtasks.CloudtasksFunctions.getQueueIamPolicyPlain(args(argsBuilder).build)

  /** A named resource to which messages are sent by publishers. */
  def Queue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudtasks.QueueArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudtasks.QueueArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudtasks.Queue(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Tasks Queue. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudtasks.QueueIamPolicy`: Authoritative. Sets the IAM policy for the queue and replaces any existing policy already attached.
   * * `gcp.cloudtasks.QueueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the queue are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudtasks.QueueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the queue are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudtasks.QueueIamPolicy`: Retrieves the IAM policy for the queue
   * 
   * &gt; **Note:** `gcp.cloudtasks.QueueIamPolicy` **cannot** be used in conjunction with `gcp.cloudtasks.QueueIamBinding` and `gcp.cloudtasks.QueueIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudtasks.QueueIamBinding` resources **can be** used in conjunction with `gcp.cloudtasks.QueueIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudtasks.QueueIamPolicy
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
   * import com.pulumi.gcp.cloudtasks.QueueIamPolicy;
   * import com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new QueueIamPolicy("policy", QueueIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudtasks.QueueIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudtasks.QueueIamBinding;
   * import com.pulumi.gcp.cloudtasks.QueueIamBindingArgs;
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
   *         var binding = new QueueIamBinding("binding", QueueIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudtasks.QueueIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudtasks.QueueIamMember;
   * import com.pulumi.gcp.cloudtasks.QueueIamMemberArgs;
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
   *         var member = new QueueIamMember("member", QueueIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .role("roles/viewer")
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
   * # IAM policy for Cloud Tasks Queue
   * 
   * Three different resources help you manage your IAM policy for Cloud Tasks Queue. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudtasks.QueueIamPolicy`: Authoritative. Sets the IAM policy for the queue and replaces any existing policy already attached.
   * * `gcp.cloudtasks.QueueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the queue are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudtasks.QueueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the queue are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudtasks.QueueIamPolicy`: Retrieves the IAM policy for the queue
   * 
   * &gt; **Note:** `gcp.cloudtasks.QueueIamPolicy` **cannot** be used in conjunction with `gcp.cloudtasks.QueueIamBinding` and `gcp.cloudtasks.QueueIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudtasks.QueueIamBinding` resources **can be** used in conjunction with `gcp.cloudtasks.QueueIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudtasks.QueueIamPolicy
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
   * import com.pulumi.gcp.cloudtasks.QueueIamPolicy;
   * import com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new QueueIamPolicy("policy", QueueIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudtasks.QueueIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudtasks.QueueIamBinding;
   * import com.pulumi.gcp.cloudtasks.QueueIamBindingArgs;
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
   *         var binding = new QueueIamBinding("binding", QueueIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudtasks.QueueIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudtasks.QueueIamMember;
   * import com.pulumi.gcp.cloudtasks.QueueIamMemberArgs;
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
   *         var member = new QueueIamMember("member", QueueIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/queues/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Tasks queue IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloud_tasks_queue_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/queues/{{queue}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloud_tasks_queue_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/queues/{{queue}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudtasks/queueIamBinding:QueueIamBinding editor projects/{{project}}/locations/{{location}}/queues/{{queue}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def QueueIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudtasks.QueueIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudtasks.QueueIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudtasks.QueueIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Tasks Queue. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudtasks.QueueIamPolicy`: Authoritative. Sets the IAM policy for the queue and replaces any existing policy already attached.
   * * `gcp.cloudtasks.QueueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the queue are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudtasks.QueueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the queue are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudtasks.QueueIamPolicy`: Retrieves the IAM policy for the queue
   * 
   * &gt; **Note:** `gcp.cloudtasks.QueueIamPolicy` **cannot** be used in conjunction with `gcp.cloudtasks.QueueIamBinding` and `gcp.cloudtasks.QueueIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudtasks.QueueIamBinding` resources **can be** used in conjunction with `gcp.cloudtasks.QueueIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudtasks.QueueIamPolicy
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
   * import com.pulumi.gcp.cloudtasks.QueueIamPolicy;
   * import com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new QueueIamPolicy("policy", QueueIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudtasks.QueueIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudtasks.QueueIamBinding;
   * import com.pulumi.gcp.cloudtasks.QueueIamBindingArgs;
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
   *         var binding = new QueueIamBinding("binding", QueueIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudtasks.QueueIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudtasks.QueueIamMember;
   * import com.pulumi.gcp.cloudtasks.QueueIamMemberArgs;
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
   *         var member = new QueueIamMember("member", QueueIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .role("roles/viewer")
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
   * # IAM policy for Cloud Tasks Queue
   * 
   * Three different resources help you manage your IAM policy for Cloud Tasks Queue. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudtasks.QueueIamPolicy`: Authoritative. Sets the IAM policy for the queue and replaces any existing policy already attached.
   * * `gcp.cloudtasks.QueueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the queue are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudtasks.QueueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the queue are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudtasks.QueueIamPolicy`: Retrieves the IAM policy for the queue
   * 
   * &gt; **Note:** `gcp.cloudtasks.QueueIamPolicy` **cannot** be used in conjunction with `gcp.cloudtasks.QueueIamBinding` and `gcp.cloudtasks.QueueIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudtasks.QueueIamBinding` resources **can be** used in conjunction with `gcp.cloudtasks.QueueIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudtasks.QueueIamPolicy
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
   * import com.pulumi.gcp.cloudtasks.QueueIamPolicy;
   * import com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new QueueIamPolicy("policy", QueueIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudtasks.QueueIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudtasks.QueueIamBinding;
   * import com.pulumi.gcp.cloudtasks.QueueIamBindingArgs;
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
   *         var binding = new QueueIamBinding("binding", QueueIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudtasks.QueueIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudtasks.QueueIamMember;
   * import com.pulumi.gcp.cloudtasks.QueueIamMemberArgs;
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
   *         var member = new QueueIamMember("member", QueueIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/queues/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Tasks queue IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloud_tasks_queue_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/queues/{{queue}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloud_tasks_queue_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/queues/{{queue}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudtasks/queueIamMember:QueueIamMember editor projects/{{project}}/locations/{{location}}/queues/{{queue}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def QueueIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudtasks.QueueIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudtasks.QueueIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudtasks.QueueIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Tasks Queue. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudtasks.QueueIamPolicy`: Authoritative. Sets the IAM policy for the queue and replaces any existing policy already attached.
   * * `gcp.cloudtasks.QueueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the queue are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudtasks.QueueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the queue are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudtasks.QueueIamPolicy`: Retrieves the IAM policy for the queue
   * 
   * &gt; **Note:** `gcp.cloudtasks.QueueIamPolicy` **cannot** be used in conjunction with `gcp.cloudtasks.QueueIamBinding` and `gcp.cloudtasks.QueueIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudtasks.QueueIamBinding` resources **can be** used in conjunction with `gcp.cloudtasks.QueueIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudtasks.QueueIamPolicy
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
   * import com.pulumi.gcp.cloudtasks.QueueIamPolicy;
   * import com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new QueueIamPolicy("policy", QueueIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudtasks.QueueIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudtasks.QueueIamBinding;
   * import com.pulumi.gcp.cloudtasks.QueueIamBindingArgs;
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
   *         var binding = new QueueIamBinding("binding", QueueIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudtasks.QueueIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudtasks.QueueIamMember;
   * import com.pulumi.gcp.cloudtasks.QueueIamMemberArgs;
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
   *         var member = new QueueIamMember("member", QueueIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .role("roles/viewer")
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
   * # IAM policy for Cloud Tasks Queue
   * 
   * Three different resources help you manage your IAM policy for Cloud Tasks Queue. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudtasks.QueueIamPolicy`: Authoritative. Sets the IAM policy for the queue and replaces any existing policy already attached.
   * * `gcp.cloudtasks.QueueIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the queue are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudtasks.QueueIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the queue are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudtasks.QueueIamPolicy`: Retrieves the IAM policy for the queue
   * 
   * &gt; **Note:** `gcp.cloudtasks.QueueIamPolicy` **cannot** be used in conjunction with `gcp.cloudtasks.QueueIamBinding` and `gcp.cloudtasks.QueueIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudtasks.QueueIamBinding` resources **can be** used in conjunction with `gcp.cloudtasks.QueueIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudtasks.QueueIamPolicy
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
   * import com.pulumi.gcp.cloudtasks.QueueIamPolicy;
   * import com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new QueueIamPolicy("policy", QueueIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudtasks.QueueIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudtasks.QueueIamBinding;
   * import com.pulumi.gcp.cloudtasks.QueueIamBindingArgs;
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
   *         var binding = new QueueIamBinding("binding", QueueIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudtasks.QueueIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudtasks.QueueIamMember;
   * import com.pulumi.gcp.cloudtasks.QueueIamMemberArgs;
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
   *         var member = new QueueIamMember("member", QueueIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .location(default_.get("location"))
   *             .name(default_.get("name"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/queues/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Tasks queue IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloud_tasks_queue_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/queues/{{queue}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloud_tasks_queue_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/queues/{{queue}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudtasks/queueIamPolicy:QueueIamPolicy editor projects/{{project}}/locations/{{location}}/queues/{{queue}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def QueueIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudtasks.QueueIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudtasks.QueueIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
