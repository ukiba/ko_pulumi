package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object cloudrunv2:
  object Cloudrunv2Functions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Get information about a Google Cloud Run v2 Job. For more information see
     * the [official documentation](https://cloud.google.com/run/docs/)
     * and [API](https://cloud.google.com/run/docs/apis).
     */
    inline def getJob(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.GetJobArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudrunv2.outputs.GetJobResult] =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.GetJobArgs.builder
      com.pulumi.gcp.cloudrunv2.Cloudrunv2Functions.getJob(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get information about a Google Cloud Run v2 Job. For more information see
     * the [official documentation](https://cloud.google.com/run/docs/)
     * and [API](https://cloud.google.com/run/docs/apis).
     */
    inline def getJobPlain(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.GetJobPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudrunv2.outputs.GetJobResult] =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.GetJobPlainArgs.builder
      com.pulumi.gcp.cloudrunv2.Cloudrunv2Functions.getJobPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for job */
    inline def getJobIamPolicy(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.GetJobIamPolicyArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudrunv2.outputs.GetJobIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.GetJobIamPolicyArgs.builder
      com.pulumi.gcp.cloudrunv2.Cloudrunv2Functions.getJobIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for job */
    inline def getJobIamPolicyPlain(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.GetJobIamPolicyPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudrunv2.outputs.GetJobIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.GetJobIamPolicyPlainArgs.builder
      com.pulumi.gcp.cloudrunv2.Cloudrunv2Functions.getJobIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get information about a Google Cloud Run v2 Service. For more information see
     * the [official documentation](https://cloud.google.com/run/docs/)
     * and [API](https://cloud.google.com/run/docs/apis).
     */
    inline def getService(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.GetServiceArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudrunv2.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.GetServiceArgs.builder
      com.pulumi.gcp.cloudrunv2.Cloudrunv2Functions.getService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get information about a Google Cloud Run v2 Service. For more information see
     * the [official documentation](https://cloud.google.com/run/docs/)
     * and [API](https://cloud.google.com/run/docs/apis).
     */
    inline def getServicePlain(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.GetServicePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudrunv2.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.GetServicePlainArgs.builder
      com.pulumi.gcp.cloudrunv2.Cloudrunv2Functions.getServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for service */
    inline def getServiceIamPolicy(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.GetServiceIamPolicyArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudrunv2.outputs.GetServiceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.GetServiceIamPolicyArgs.builder
      com.pulumi.gcp.cloudrunv2.Cloudrunv2Functions.getServiceIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for service */
    inline def getServiceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.GetServiceIamPolicyPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudrunv2.outputs.GetServiceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.GetServiceIamPolicyPlainArgs.builder
      com.pulumi.gcp.cloudrunv2.Cloudrunv2Functions.getServiceIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get information about a Google Cloud Run v2 Worker Pool. For more information see
     * the [official documentation](https://cloud.google.com/run/docs/)
     * and [API](https://cloud.google.com/run/docs/apis).
     */
    inline def getWorkerPool(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.GetWorkerPoolArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudrunv2.outputs.GetWorkerPoolResult] =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.GetWorkerPoolArgs.builder
      com.pulumi.gcp.cloudrunv2.Cloudrunv2Functions.getWorkerPool(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get information about a Google Cloud Run v2 Worker Pool. For more information see
     * the [official documentation](https://cloud.google.com/run/docs/)
     * and [API](https://cloud.google.com/run/docs/apis).
     */
    inline def getWorkerPoolPlain(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.GetWorkerPoolPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudrunv2.outputs.GetWorkerPoolResult] =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.GetWorkerPoolPlainArgs.builder
      com.pulumi.gcp.cloudrunv2.Cloudrunv2Functions.getWorkerPoolPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for workerpool */
    inline def getWorkerPoolIamPolicy(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.GetWorkerPoolIamPolicyArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudrunv2.outputs.GetWorkerPoolIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.GetWorkerPoolIamPolicyArgs.builder
      com.pulumi.gcp.cloudrunv2.Cloudrunv2Functions.getWorkerPoolIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for workerpool */
    inline def getWorkerPoolIamPolicyPlain(args: Endofunction[com.pulumi.gcp.cloudrunv2.inputs.GetWorkerPoolIamPolicyPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudrunv2.outputs.GetWorkerPoolIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudrunv2.inputs.GetWorkerPoolIamPolicyPlainArgs.builder
      com.pulumi.gcp.cloudrunv2.Cloudrunv2Functions.getWorkerPoolIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * A Cloud Run Job resource that references a container image which is run to completion.
   * 
   * To get more information about Job, see:
   * 
   * * [API documentation](https://cloud.google.com/run/docs/reference/rest/v2/projects.locations.jobs)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/run/docs/)
   */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrunv2.JobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudrunv2.JobArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudrunv2.Job(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) Job. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.JobIamPolicy`: Authoritative. Sets the IAM policy for the job and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.JobIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the job are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.JobIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the job are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.JobIamPolicy`: Retrieves the IAM policy for the job
   * 
   * &gt; **Note:** `gcp.cloudrunv2.JobIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.JobIamBinding` and `gcp.cloudrunv2.JobIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.JobIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.JobIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.JobIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.JobIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.JobIamPolicyArgs;
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
   *         var policy = new JobIamPolicy("policy", JobIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.JobIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.JobIamBinding;
   * import com.pulumi.gcp.cloudrunv2.JobIamBindingArgs;
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
   *         var binding = new JobIamBinding("binding", JobIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.JobIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.JobIamMember;
   * import com.pulumi.gcp.cloudrunv2.JobIamMemberArgs;
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
   *         var member = new JobIamMember("member", JobIamMemberArgs.builder()
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
   * # IAM policy for Cloud Run (v2 API) Job
   * 
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) Job. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.JobIamPolicy`: Authoritative. Sets the IAM policy for the job and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.JobIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the job are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.JobIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the job are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.JobIamPolicy`: Retrieves the IAM policy for the job
   * 
   * &gt; **Note:** `gcp.cloudrunv2.JobIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.JobIamBinding` and `gcp.cloudrunv2.JobIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.JobIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.JobIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.JobIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.JobIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.JobIamPolicyArgs;
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
   *         var policy = new JobIamPolicy("policy", JobIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.JobIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.JobIamBinding;
   * import com.pulumi.gcp.cloudrunv2.JobIamBindingArgs;
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
   *         var binding = new JobIamBinding("binding", JobIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.JobIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.JobIamMember;
   * import com.pulumi.gcp.cloudrunv2.JobIamMemberArgs;
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
   *         var member = new JobIamMember("member", JobIamMemberArgs.builder()
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
   * * projects/{{project}}/locations/{{location}}/jobs/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Run (v2 API) job IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_job_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/jobs/{{job}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_job_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/jobs/{{job}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudrunv2/jobIamBinding:JobIamBinding editor projects/{{project}}/locations/{{location}}/jobs/{{job}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def JobIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrunv2.JobIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudrunv2.JobIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudrunv2.JobIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) Job. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.JobIamPolicy`: Authoritative. Sets the IAM policy for the job and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.JobIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the job are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.JobIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the job are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.JobIamPolicy`: Retrieves the IAM policy for the job
   * 
   * &gt; **Note:** `gcp.cloudrunv2.JobIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.JobIamBinding` and `gcp.cloudrunv2.JobIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.JobIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.JobIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.JobIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.JobIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.JobIamPolicyArgs;
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
   *         var policy = new JobIamPolicy("policy", JobIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.JobIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.JobIamBinding;
   * import com.pulumi.gcp.cloudrunv2.JobIamBindingArgs;
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
   *         var binding = new JobIamBinding("binding", JobIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.JobIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.JobIamMember;
   * import com.pulumi.gcp.cloudrunv2.JobIamMemberArgs;
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
   *         var member = new JobIamMember("member", JobIamMemberArgs.builder()
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
   * # IAM policy for Cloud Run (v2 API) Job
   * 
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) Job. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.JobIamPolicy`: Authoritative. Sets the IAM policy for the job and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.JobIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the job are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.JobIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the job are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.JobIamPolicy`: Retrieves the IAM policy for the job
   * 
   * &gt; **Note:** `gcp.cloudrunv2.JobIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.JobIamBinding` and `gcp.cloudrunv2.JobIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.JobIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.JobIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.JobIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.JobIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.JobIamPolicyArgs;
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
   *         var policy = new JobIamPolicy("policy", JobIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.JobIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.JobIamBinding;
   * import com.pulumi.gcp.cloudrunv2.JobIamBindingArgs;
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
   *         var binding = new JobIamBinding("binding", JobIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.JobIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.JobIamMember;
   * import com.pulumi.gcp.cloudrunv2.JobIamMemberArgs;
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
   *         var member = new JobIamMember("member", JobIamMemberArgs.builder()
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
   * * projects/{{project}}/locations/{{location}}/jobs/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Run (v2 API) job IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_job_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/jobs/{{job}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_job_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/jobs/{{job}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudrunv2/jobIamMember:JobIamMember editor projects/{{project}}/locations/{{location}}/jobs/{{job}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def JobIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrunv2.JobIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudrunv2.JobIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudrunv2.JobIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) Job. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.JobIamPolicy`: Authoritative. Sets the IAM policy for the job and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.JobIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the job are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.JobIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the job are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.JobIamPolicy`: Retrieves the IAM policy for the job
   * 
   * &gt; **Note:** `gcp.cloudrunv2.JobIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.JobIamBinding` and `gcp.cloudrunv2.JobIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.JobIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.JobIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.JobIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.JobIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.JobIamPolicyArgs;
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
   *         var policy = new JobIamPolicy("policy", JobIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.JobIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.JobIamBinding;
   * import com.pulumi.gcp.cloudrunv2.JobIamBindingArgs;
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
   *         var binding = new JobIamBinding("binding", JobIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.JobIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.JobIamMember;
   * import com.pulumi.gcp.cloudrunv2.JobIamMemberArgs;
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
   *         var member = new JobIamMember("member", JobIamMemberArgs.builder()
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
   * # IAM policy for Cloud Run (v2 API) Job
   * 
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) Job. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.JobIamPolicy`: Authoritative. Sets the IAM policy for the job and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.JobIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the job are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.JobIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the job are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.JobIamPolicy`: Retrieves the IAM policy for the job
   * 
   * &gt; **Note:** `gcp.cloudrunv2.JobIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.JobIamBinding` and `gcp.cloudrunv2.JobIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.JobIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.JobIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.JobIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.JobIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.JobIamPolicyArgs;
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
   *         var policy = new JobIamPolicy("policy", JobIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.JobIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.JobIamBinding;
   * import com.pulumi.gcp.cloudrunv2.JobIamBindingArgs;
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
   *         var binding = new JobIamBinding("binding", JobIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.JobIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.JobIamMember;
   * import com.pulumi.gcp.cloudrunv2.JobIamMemberArgs;
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
   *         var member = new JobIamMember("member", JobIamMemberArgs.builder()
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
   * * projects/{{project}}/locations/{{location}}/jobs/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Run (v2 API) job IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_job_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/jobs/{{job}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_job_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/jobs/{{job}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudrunv2/jobIamPolicy:JobIamPolicy editor projects/{{project}}/locations/{{location}}/jobs/{{job}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def JobIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrunv2.JobIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudrunv2.JobIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudrunv2.JobIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Service acts as a top-level container that manages a set of configurations and revision templates which implement a network service. Service exists to provide a singular abstraction which can be access controlled, reasoned about, and which encapsulates software lifecycle decisions such as rollout policy and team resource ownership.
   * 
   * To get more information about Service, see:
   * 
   * * [API documentation](https://cloud.google.com/run/docs/reference/rest/v2/projects.locations.services)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/run/docs/)
   */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrunv2.ServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudrunv2.ServiceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudrunv2.Service(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) Service. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   * &gt; **Note:** `gcp.cloudrunv2.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.ServiceIamBinding` and `gcp.cloudrunv2.ServiceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.ServiceIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.ServiceIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.ServiceIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamPolicyArgs;
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
   *         var policy = new ServiceIamPolicy("policy", ServiceIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.ServiceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamBinding;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamBindingArgs;
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
   *         var binding = new ServiceIamBinding("binding", ServiceIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.ServiceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamMember;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamMemberArgs;
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
   *         var member = new ServiceIamMember("member", ServiceIamMemberArgs.builder()
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
   * # IAM policy for Cloud Run (v2 API) Service
   * 
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) Service. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   * &gt; **Note:** `gcp.cloudrunv2.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.ServiceIamBinding` and `gcp.cloudrunv2.ServiceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.ServiceIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.ServiceIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.ServiceIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamPolicyArgs;
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
   *         var policy = new ServiceIamPolicy("policy", ServiceIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.ServiceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamBinding;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamBindingArgs;
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
   *         var binding = new ServiceIamBinding("binding", ServiceIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.ServiceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamMember;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamMemberArgs;
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
   *         var member = new ServiceIamMember("member", ServiceIamMemberArgs.builder()
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
   * * projects/{{project}}/locations/{{location}}/services/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Run (v2 API) service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_service_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_service_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudrunv2/serviceIamBinding:ServiceIamBinding editor projects/{{project}}/locations/{{location}}/services/{{service}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ServiceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrunv2.ServiceIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudrunv2.ServiceIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudrunv2.ServiceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) Service. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   * &gt; **Note:** `gcp.cloudrunv2.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.ServiceIamBinding` and `gcp.cloudrunv2.ServiceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.ServiceIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.ServiceIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.ServiceIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamPolicyArgs;
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
   *         var policy = new ServiceIamPolicy("policy", ServiceIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.ServiceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamBinding;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamBindingArgs;
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
   *         var binding = new ServiceIamBinding("binding", ServiceIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.ServiceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamMember;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamMemberArgs;
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
   *         var member = new ServiceIamMember("member", ServiceIamMemberArgs.builder()
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
   * # IAM policy for Cloud Run (v2 API) Service
   * 
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) Service. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   * &gt; **Note:** `gcp.cloudrunv2.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.ServiceIamBinding` and `gcp.cloudrunv2.ServiceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.ServiceIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.ServiceIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.ServiceIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamPolicyArgs;
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
   *         var policy = new ServiceIamPolicy("policy", ServiceIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.ServiceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamBinding;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamBindingArgs;
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
   *         var binding = new ServiceIamBinding("binding", ServiceIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.ServiceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamMember;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamMemberArgs;
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
   *         var member = new ServiceIamMember("member", ServiceIamMemberArgs.builder()
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
   * * projects/{{project}}/locations/{{location}}/services/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Run (v2 API) service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_service_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_service_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudrunv2/serviceIamMember:ServiceIamMember editor projects/{{project}}/locations/{{location}}/services/{{service}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ServiceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrunv2.ServiceIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudrunv2.ServiceIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudrunv2.ServiceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) Service. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   * &gt; **Note:** `gcp.cloudrunv2.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.ServiceIamBinding` and `gcp.cloudrunv2.ServiceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.ServiceIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.ServiceIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.ServiceIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamPolicyArgs;
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
   *         var policy = new ServiceIamPolicy("policy", ServiceIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.ServiceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamBinding;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamBindingArgs;
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
   *         var binding = new ServiceIamBinding("binding", ServiceIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.ServiceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamMember;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamMemberArgs;
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
   *         var member = new ServiceIamMember("member", ServiceIamMemberArgs.builder()
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
   * # IAM policy for Cloud Run (v2 API) Service
   * 
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) Service. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.ServiceIamPolicy`: Authoritative. Sets the IAM policy for the service and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.ServiceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.ServiceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.ServiceIamPolicy`: Retrieves the IAM policy for the service
   * 
   * &gt; **Note:** `gcp.cloudrunv2.ServiceIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.ServiceIamBinding` and `gcp.cloudrunv2.ServiceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.ServiceIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.ServiceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.ServiceIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.ServiceIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamPolicyArgs;
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
   *         var policy = new ServiceIamPolicy("policy", ServiceIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.ServiceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamBinding;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamBindingArgs;
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
   *         var binding = new ServiceIamBinding("binding", ServiceIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.ServiceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamMember;
   * import com.pulumi.gcp.cloudrunv2.ServiceIamMemberArgs;
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
   *         var member = new ServiceIamMember("member", ServiceIamMemberArgs.builder()
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
   * * projects/{{project}}/locations/{{location}}/services/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Run (v2 API) service IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_service_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_service_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/services/{{service}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudrunv2/serviceIamPolicy:ServiceIamPolicy editor projects/{{project}}/locations/{{location}}/services/{{service}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ServiceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrunv2.ServiceIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudrunv2.ServiceIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudrunv2.ServiceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * WorkerPool acts as a top-level container that manages a set of configurations and revision templates which implement a pull-based workload. WorkerPool exists to provide a singular abstraction which can be access controlled, reasoned about, and which encapsulates software lifecycle decisions such as rollout policy and team resource ownership.
   * 
   * To get more information about WorkerPool, see:
   * 
   * * [API documentation](https://cloud.google.com/run/docs/reference/rest/v2/projects.locations.workerPools)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/run/docs/)
   */
  def WorkerPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrunv2.WorkerPoolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudrunv2.WorkerPoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudrunv2.WorkerPool(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) WorkerPool. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.WorkerPoolIamPolicy`: Authoritative. Sets the IAM policy for the workerpool and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.WorkerPoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workerpool are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.WorkerPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workerpool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.WorkerPoolIamPolicy`: Retrieves the IAM policy for the workerpool
   * 
   * &gt; **Note:** `gcp.cloudrunv2.WorkerPoolIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.WorkerPoolIamBinding` and `gcp.cloudrunv2.WorkerPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.WorkerPoolIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.WorkerPoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.WorkerPoolIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicyArgs;
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
   *         var policy = new WorkerPoolIamPolicy("policy", WorkerPoolIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.WorkerPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamBinding;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamBindingArgs;
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
   *         var binding = new WorkerPoolIamBinding("binding", WorkerPoolIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.WorkerPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamMember;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamMemberArgs;
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
   *         var member = new WorkerPoolIamMember("member", WorkerPoolIamMemberArgs.builder()
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
   * # IAM policy for Cloud Run (v2 API) WorkerPool
   * 
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) WorkerPool. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.WorkerPoolIamPolicy`: Authoritative. Sets the IAM policy for the workerpool and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.WorkerPoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workerpool are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.WorkerPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workerpool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.WorkerPoolIamPolicy`: Retrieves the IAM policy for the workerpool
   * 
   * &gt; **Note:** `gcp.cloudrunv2.WorkerPoolIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.WorkerPoolIamBinding` and `gcp.cloudrunv2.WorkerPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.WorkerPoolIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.WorkerPoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.WorkerPoolIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicyArgs;
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
   *         var policy = new WorkerPoolIamPolicy("policy", WorkerPoolIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.WorkerPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamBinding;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamBindingArgs;
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
   *         var binding = new WorkerPoolIamBinding("binding", WorkerPoolIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.WorkerPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamMember;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamMemberArgs;
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
   *         var member = new WorkerPoolIamMember("member", WorkerPoolIamMemberArgs.builder()
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
   * * projects/{{project}}/locations/{{location}}/workerPools/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Run (v2 API) workerpool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_worker_pool_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workerPools/{{worker_pool}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_worker_pool_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workerPools/{{worker_pool}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudrunv2/workerPoolIamBinding:WorkerPoolIamBinding editor projects/{{project}}/locations/{{location}}/workerPools/{{worker_pool}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkerPoolIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrunv2.WorkerPoolIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudrunv2.WorkerPoolIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudrunv2.WorkerPoolIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) WorkerPool. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.WorkerPoolIamPolicy`: Authoritative. Sets the IAM policy for the workerpool and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.WorkerPoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workerpool are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.WorkerPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workerpool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.WorkerPoolIamPolicy`: Retrieves the IAM policy for the workerpool
   * 
   * &gt; **Note:** `gcp.cloudrunv2.WorkerPoolIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.WorkerPoolIamBinding` and `gcp.cloudrunv2.WorkerPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.WorkerPoolIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.WorkerPoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.WorkerPoolIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicyArgs;
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
   *         var policy = new WorkerPoolIamPolicy("policy", WorkerPoolIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.WorkerPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamBinding;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamBindingArgs;
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
   *         var binding = new WorkerPoolIamBinding("binding", WorkerPoolIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.WorkerPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamMember;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamMemberArgs;
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
   *         var member = new WorkerPoolIamMember("member", WorkerPoolIamMemberArgs.builder()
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
   * # IAM policy for Cloud Run (v2 API) WorkerPool
   * 
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) WorkerPool. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.WorkerPoolIamPolicy`: Authoritative. Sets the IAM policy for the workerpool and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.WorkerPoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workerpool are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.WorkerPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workerpool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.WorkerPoolIamPolicy`: Retrieves the IAM policy for the workerpool
   * 
   * &gt; **Note:** `gcp.cloudrunv2.WorkerPoolIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.WorkerPoolIamBinding` and `gcp.cloudrunv2.WorkerPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.WorkerPoolIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.WorkerPoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.WorkerPoolIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicyArgs;
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
   *         var policy = new WorkerPoolIamPolicy("policy", WorkerPoolIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.WorkerPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamBinding;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamBindingArgs;
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
   *         var binding = new WorkerPoolIamBinding("binding", WorkerPoolIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.WorkerPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamMember;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamMemberArgs;
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
   *         var member = new WorkerPoolIamMember("member", WorkerPoolIamMemberArgs.builder()
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
   * * projects/{{project}}/locations/{{location}}/workerPools/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Run (v2 API) workerpool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_worker_pool_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workerPools/{{worker_pool}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_worker_pool_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workerPools/{{worker_pool}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudrunv2/workerPoolIamMember:WorkerPoolIamMember editor projects/{{project}}/locations/{{location}}/workerPools/{{worker_pool}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkerPoolIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrunv2.WorkerPoolIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudrunv2.WorkerPoolIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudrunv2.WorkerPoolIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) WorkerPool. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.WorkerPoolIamPolicy`: Authoritative. Sets the IAM policy for the workerpool and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.WorkerPoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workerpool are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.WorkerPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workerpool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.WorkerPoolIamPolicy`: Retrieves the IAM policy for the workerpool
   * 
   * &gt; **Note:** `gcp.cloudrunv2.WorkerPoolIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.WorkerPoolIamBinding` and `gcp.cloudrunv2.WorkerPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.WorkerPoolIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.WorkerPoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.WorkerPoolIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicyArgs;
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
   *         var policy = new WorkerPoolIamPolicy("policy", WorkerPoolIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.WorkerPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamBinding;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamBindingArgs;
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
   *         var binding = new WorkerPoolIamBinding("binding", WorkerPoolIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.WorkerPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamMember;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamMemberArgs;
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
   *         var member = new WorkerPoolIamMember("member", WorkerPoolIamMemberArgs.builder()
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
   * # IAM policy for Cloud Run (v2 API) WorkerPool
   * 
   * Three different resources help you manage your IAM policy for Cloud Run (v2 API) WorkerPool. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudrunv2.WorkerPoolIamPolicy`: Authoritative. Sets the IAM policy for the workerpool and replaces any existing policy already attached.
   * * `gcp.cloudrunv2.WorkerPoolIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the workerpool are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudrunv2.WorkerPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the workerpool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudrunv2.WorkerPoolIamPolicy`: Retrieves the IAM policy for the workerpool
   * 
   * &gt; **Note:** `gcp.cloudrunv2.WorkerPoolIamPolicy` **cannot** be used in conjunction with `gcp.cloudrunv2.WorkerPoolIamBinding` and `gcp.cloudrunv2.WorkerPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudrunv2.WorkerPoolIamBinding` resources **can be** used in conjunction with `gcp.cloudrunv2.WorkerPoolIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudrunv2.WorkerPoolIamPolicy
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
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicy;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicyArgs;
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
   *         var policy = new WorkerPoolIamPolicy("policy", WorkerPoolIamPolicyArgs.builder()
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
   * ## gcp.cloudrunv2.WorkerPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamBinding;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamBindingArgs;
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
   *         var binding = new WorkerPoolIamBinding("binding", WorkerPoolIamBindingArgs.builder()
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
   * ## gcp.cloudrunv2.WorkerPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamMember;
   * import com.pulumi.gcp.cloudrunv2.WorkerPoolIamMemberArgs;
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
   *         var member = new WorkerPoolIamMember("member", WorkerPoolIamMemberArgs.builder()
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
   * * projects/{{project}}/locations/{{location}}/workerPools/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Run (v2 API) workerpool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_worker_pool_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/workerPools/{{worker_pool}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloud_run_v2_worker_pool_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/workerPools/{{worker_pool}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudrunv2/workerPoolIamPolicy:WorkerPoolIamPolicy editor projects/{{project}}/locations/{{location}}/workerPools/{{worker_pool}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def WorkerPoolIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudrunv2.WorkerPoolIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
