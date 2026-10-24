package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object eventarc:
  /**
   * The Eventarc Channel resource
   * 
   * To get more information about Channel, see:
   * 
   * * [API documentation](https://cloud.google.com/eventarc/docs/reference/rest/v1/projects.locations.channels)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/eventarc/standard/docs/third-parties/create-channels)
   */
  def Channel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.ChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.eventarc.ChannelArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.eventarc.Channel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The Eventarc Enrollment resource
   * 
   * To get more information about Enrollment, see:
   * 
   * * [API documentation](https://cloud.google.com/eventarc/docs/reference/rest/v1/projects.locations.enrollments)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/eventarc/advanced/docs/receive-events/create-enrollment)
   */
  def Enrollment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.EnrollmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.eventarc.EnrollmentArgs.builder
    com.pulumi.gcp.eventarc.Enrollment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object EventarcFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for pipeline */
    inline def getPipelineIamPolicy(args: Endofunction[com.pulumi.gcp.eventarc.inputs.GetPipelineIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.eventarc.outputs.GetPipelineIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.GetPipelineIamPolicyArgs.builder
      com.pulumi.gcp.eventarc.EventarcFunctions.getPipelineIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for pipeline */
    inline def getPipelineIamPolicyPlain(args: Endofunction[com.pulumi.gcp.eventarc.inputs.GetPipelineIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.eventarc.outputs.GetPipelineIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.GetPipelineIamPolicyPlainArgs.builder
      com.pulumi.gcp.eventarc.EventarcFunctions.getPipelineIamPolicyPlain(args(argsBuilder).build)

  /**
   * The Eventarc GoogleApiSource resource
   * 
   * To get more information about GoogleApiSource, see:
   * 
   * * [API documentation](https://cloud.google.com/eventarc/docs/reference/rest/v1/projects.locations.googleApiSources)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/eventarc/advanced/docs/publish-events/publish-events-google-sources)
   */
  def GoogleApiSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.GoogleApiSourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.eventarc.GoogleApiSourceArgs.builder
    com.pulumi.gcp.eventarc.GoogleApiSource(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The Eventarc GoogleChannelConfig resource
   * 
   * To get more information about GoogleChannelConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/eventarc/docs/reference/rest/v1/projects.locations)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/eventarc/docs/use-cmek#enable-cmek-google-channel)
   */
  def GoogleChannelConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.GoogleChannelConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.eventarc.GoogleChannelConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.eventarc.GoogleChannelConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The Eventarc MessageBus resource
   * 
   * To get more information about MessageBus, see:
   * 
   * * [API documentation](https://cloud.google.com/eventarc/docs/reference/rest/v1/projects.locations.messageBuses)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/eventarc/advanced/docs/publish-events/create-bus)
   */
  def MessageBus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.MessageBusArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.eventarc.MessageBusArgs.builder
    com.pulumi.gcp.eventarc.MessageBus(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The Eventarc Pipeline resource
   * 
   * To get more information about Pipeline, see:
   * 
   * * [API documentation](https://cloud.google.com/eventarc/docs/reference/rest/v1/projects.locations.pipelines)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/eventarc/advanced/docs/receive-events/create-enrollment)
   */
  def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.PipelineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.eventarc.PipelineArgs.builder
    com.pulumi.gcp.eventarc.Pipeline(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Eventarc Pipeline. Each of these resources serves a different use case:
   * 
   * * `gcp.eventarc.PipelineIamPolicy`: Authoritative. Sets the IAM policy for the pipeline and replaces any existing policy already attached.
   * * `gcp.eventarc.PipelineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the pipeline are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.eventarc.PipelineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the pipeline are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.eventarc.PipelineIamPolicy`: Retrieves the IAM policy for the pipeline
   * 
   * &gt; **Note:** `gcp.eventarc.PipelineIamPolicy` **cannot** be used in conjunction with `gcp.eventarc.PipelineIamBinding` and `gcp.eventarc.PipelineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.eventarc.PipelineIamBinding` resources **can be** used in conjunction with `gcp.eventarc.PipelineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.eventarc.PipelineIamPolicy
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
   * import com.pulumi.gcp.eventarc.PipelineIamPolicy;
   * import com.pulumi.gcp.eventarc.PipelineIamPolicyArgs;
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
   *                 .role("roles/eventarc.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new PipelineIamPolicy("policy", PipelineIamPolicyArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.eventarc.PipelineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.eventarc.PipelineIamBinding;
   * import com.pulumi.gcp.eventarc.PipelineIamBindingArgs;
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
   *         var binding = new PipelineIamBinding("binding", PipelineIamBindingArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .role("roles/eventarc.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.eventarc.PipelineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.eventarc.PipelineIamMember;
   * import com.pulumi.gcp.eventarc.PipelineIamMemberArgs;
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
   *         var member = new PipelineIamMember("member", PipelineIamMemberArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .role("roles/eventarc.admin")
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
   * # IAM policy for Eventarc Pipeline
   * 
   * Three different resources help you manage your IAM policy for Eventarc Pipeline. Each of these resources serves a different use case:
   * 
   * * `gcp.eventarc.PipelineIamPolicy`: Authoritative. Sets the IAM policy for the pipeline and replaces any existing policy already attached.
   * * `gcp.eventarc.PipelineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the pipeline are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.eventarc.PipelineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the pipeline are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.eventarc.PipelineIamPolicy`: Retrieves the IAM policy for the pipeline
   * 
   * &gt; **Note:** `gcp.eventarc.PipelineIamPolicy` **cannot** be used in conjunction with `gcp.eventarc.PipelineIamBinding` and `gcp.eventarc.PipelineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.eventarc.PipelineIamBinding` resources **can be** used in conjunction with `gcp.eventarc.PipelineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.eventarc.PipelineIamPolicy
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
   * import com.pulumi.gcp.eventarc.PipelineIamPolicy;
   * import com.pulumi.gcp.eventarc.PipelineIamPolicyArgs;
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
   *                 .role("roles/eventarc.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new PipelineIamPolicy("policy", PipelineIamPolicyArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.eventarc.PipelineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.eventarc.PipelineIamBinding;
   * import com.pulumi.gcp.eventarc.PipelineIamBindingArgs;
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
   *         var binding = new PipelineIamBinding("binding", PipelineIamBindingArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .role("roles/eventarc.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.eventarc.PipelineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.eventarc.PipelineIamMember;
   * import com.pulumi.gcp.eventarc.PipelineIamMemberArgs;
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
   *         var member = new PipelineIamMember("member", PipelineIamMemberArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .role("roles/eventarc.admin")
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
   * * projects/{{project}}/locations/{{location}}/pipelines/{{pipeline_id}}
   * * {{project}}/{{location}}/{{pipeline_id}}
   * * {{location}}/{{pipeline_id}}
   * * {{pipeline_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Eventarc pipeline IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_eventarc_pipeline_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/pipelines/{{pipeline_id}} roles/eventarc.admin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_eventarc_pipeline_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/pipelines/{{pipeline_id}} roles/eventarc.admin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:eventarc/pipelineIamBinding:PipelineIamBinding editor projects/{{project}}/locations/{{location}}/pipelines/{{pipeline_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def PipelineIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.PipelineIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.eventarc.PipelineIamBindingArgs.builder
    com.pulumi.gcp.eventarc.PipelineIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Eventarc Pipeline. Each of these resources serves a different use case:
   * 
   * * `gcp.eventarc.PipelineIamPolicy`: Authoritative. Sets the IAM policy for the pipeline and replaces any existing policy already attached.
   * * `gcp.eventarc.PipelineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the pipeline are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.eventarc.PipelineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the pipeline are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.eventarc.PipelineIamPolicy`: Retrieves the IAM policy for the pipeline
   * 
   * &gt; **Note:** `gcp.eventarc.PipelineIamPolicy` **cannot** be used in conjunction with `gcp.eventarc.PipelineIamBinding` and `gcp.eventarc.PipelineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.eventarc.PipelineIamBinding` resources **can be** used in conjunction with `gcp.eventarc.PipelineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.eventarc.PipelineIamPolicy
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
   * import com.pulumi.gcp.eventarc.PipelineIamPolicy;
   * import com.pulumi.gcp.eventarc.PipelineIamPolicyArgs;
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
   *                 .role("roles/eventarc.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new PipelineIamPolicy("policy", PipelineIamPolicyArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.eventarc.PipelineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.eventarc.PipelineIamBinding;
   * import com.pulumi.gcp.eventarc.PipelineIamBindingArgs;
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
   *         var binding = new PipelineIamBinding("binding", PipelineIamBindingArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .role("roles/eventarc.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.eventarc.PipelineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.eventarc.PipelineIamMember;
   * import com.pulumi.gcp.eventarc.PipelineIamMemberArgs;
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
   *         var member = new PipelineIamMember("member", PipelineIamMemberArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .role("roles/eventarc.admin")
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
   * # IAM policy for Eventarc Pipeline
   * 
   * Three different resources help you manage your IAM policy for Eventarc Pipeline. Each of these resources serves a different use case:
   * 
   * * `gcp.eventarc.PipelineIamPolicy`: Authoritative. Sets the IAM policy for the pipeline and replaces any existing policy already attached.
   * * `gcp.eventarc.PipelineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the pipeline are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.eventarc.PipelineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the pipeline are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.eventarc.PipelineIamPolicy`: Retrieves the IAM policy for the pipeline
   * 
   * &gt; **Note:** `gcp.eventarc.PipelineIamPolicy` **cannot** be used in conjunction with `gcp.eventarc.PipelineIamBinding` and `gcp.eventarc.PipelineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.eventarc.PipelineIamBinding` resources **can be** used in conjunction with `gcp.eventarc.PipelineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.eventarc.PipelineIamPolicy
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
   * import com.pulumi.gcp.eventarc.PipelineIamPolicy;
   * import com.pulumi.gcp.eventarc.PipelineIamPolicyArgs;
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
   *                 .role("roles/eventarc.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new PipelineIamPolicy("policy", PipelineIamPolicyArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.eventarc.PipelineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.eventarc.PipelineIamBinding;
   * import com.pulumi.gcp.eventarc.PipelineIamBindingArgs;
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
   *         var binding = new PipelineIamBinding("binding", PipelineIamBindingArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .role("roles/eventarc.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.eventarc.PipelineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.eventarc.PipelineIamMember;
   * import com.pulumi.gcp.eventarc.PipelineIamMemberArgs;
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
   *         var member = new PipelineIamMember("member", PipelineIamMemberArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .role("roles/eventarc.admin")
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
   * * projects/{{project}}/locations/{{location}}/pipelines/{{pipeline_id}}
   * * {{project}}/{{location}}/{{pipeline_id}}
   * * {{location}}/{{pipeline_id}}
   * * {{pipeline_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Eventarc pipeline IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_eventarc_pipeline_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/pipelines/{{pipeline_id}} roles/eventarc.admin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_eventarc_pipeline_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/pipelines/{{pipeline_id}} roles/eventarc.admin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:eventarc/pipelineIamMember:PipelineIamMember editor projects/{{project}}/locations/{{location}}/pipelines/{{pipeline_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def PipelineIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.PipelineIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.eventarc.PipelineIamMemberArgs.builder
    com.pulumi.gcp.eventarc.PipelineIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Eventarc Pipeline. Each of these resources serves a different use case:
   * 
   * * `gcp.eventarc.PipelineIamPolicy`: Authoritative. Sets the IAM policy for the pipeline and replaces any existing policy already attached.
   * * `gcp.eventarc.PipelineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the pipeline are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.eventarc.PipelineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the pipeline are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.eventarc.PipelineIamPolicy`: Retrieves the IAM policy for the pipeline
   * 
   * &gt; **Note:** `gcp.eventarc.PipelineIamPolicy` **cannot** be used in conjunction with `gcp.eventarc.PipelineIamBinding` and `gcp.eventarc.PipelineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.eventarc.PipelineIamBinding` resources **can be** used in conjunction with `gcp.eventarc.PipelineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.eventarc.PipelineIamPolicy
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
   * import com.pulumi.gcp.eventarc.PipelineIamPolicy;
   * import com.pulumi.gcp.eventarc.PipelineIamPolicyArgs;
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
   *                 .role("roles/eventarc.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new PipelineIamPolicy("policy", PipelineIamPolicyArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.eventarc.PipelineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.eventarc.PipelineIamBinding;
   * import com.pulumi.gcp.eventarc.PipelineIamBindingArgs;
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
   *         var binding = new PipelineIamBinding("binding", PipelineIamBindingArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .role("roles/eventarc.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.eventarc.PipelineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.eventarc.PipelineIamMember;
   * import com.pulumi.gcp.eventarc.PipelineIamMemberArgs;
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
   *         var member = new PipelineIamMember("member", PipelineIamMemberArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .role("roles/eventarc.admin")
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
   * # IAM policy for Eventarc Pipeline
   * 
   * Three different resources help you manage your IAM policy for Eventarc Pipeline. Each of these resources serves a different use case:
   * 
   * * `gcp.eventarc.PipelineIamPolicy`: Authoritative. Sets the IAM policy for the pipeline and replaces any existing policy already attached.
   * * `gcp.eventarc.PipelineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the pipeline are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.eventarc.PipelineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the pipeline are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.eventarc.PipelineIamPolicy`: Retrieves the IAM policy for the pipeline
   * 
   * &gt; **Note:** `gcp.eventarc.PipelineIamPolicy` **cannot** be used in conjunction with `gcp.eventarc.PipelineIamBinding` and `gcp.eventarc.PipelineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.eventarc.PipelineIamBinding` resources **can be** used in conjunction with `gcp.eventarc.PipelineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.eventarc.PipelineIamPolicy
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
   * import com.pulumi.gcp.eventarc.PipelineIamPolicy;
   * import com.pulumi.gcp.eventarc.PipelineIamPolicyArgs;
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
   *                 .role("roles/eventarc.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new PipelineIamPolicy("policy", PipelineIamPolicyArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.eventarc.PipelineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.eventarc.PipelineIamBinding;
   * import com.pulumi.gcp.eventarc.PipelineIamBindingArgs;
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
   *         var binding = new PipelineIamBinding("binding", PipelineIamBindingArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .role("roles/eventarc.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.eventarc.PipelineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.eventarc.PipelineIamMember;
   * import com.pulumi.gcp.eventarc.PipelineIamMemberArgs;
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
   *         var member = new PipelineIamMember("member", PipelineIamMemberArgs.builder()
   *             .project(primary.get("project"))
   *             .location(primary.get("location"))
   *             .pipelineId(primary.get("pipelineId"))
   *             .role("roles/eventarc.admin")
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
   * * projects/{{project}}/locations/{{location}}/pipelines/{{pipeline_id}}
   * * {{project}}/{{location}}/{{pipeline_id}}
   * * {{location}}/{{pipeline_id}}
   * * {{pipeline_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Eventarc pipeline IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_eventarc_pipeline_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/pipelines/{{pipeline_id}} roles/eventarc.admin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_eventarc_pipeline_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/pipelines/{{pipeline_id}} roles/eventarc.admin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:eventarc/pipelineIamPolicy:PipelineIamPolicy editor projects/{{project}}/locations/{{location}}/pipelines/{{pipeline_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def PipelineIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.PipelineIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.eventarc.PipelineIamPolicyArgs.builder
    com.pulumi.gcp.eventarc.PipelineIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The Eventarc Trigger resource
   * 
   * To get more information about Trigger, see:
   * 
   * * [API documentation](https://cloud.google.com/eventarc/docs/reference/rest/v1/projects.locations.triggers)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/eventarc/standard/docs/overview#eventarc-triggers)
   */
  def Trigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.TriggerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.eventarc.TriggerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.eventarc.Trigger(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
