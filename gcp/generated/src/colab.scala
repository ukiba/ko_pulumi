package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object colab:
  object ColabFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for runtimetemplate */
    inline def getRuntimeTemplateIamPolicy(args: Endofunction[com.pulumi.gcp.colab.inputs.GetRuntimeTemplateIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.colab.outputs.GetRuntimeTemplateIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.colab.inputs.GetRuntimeTemplateIamPolicyArgs.builder
      com.pulumi.gcp.colab.ColabFunctions.getRuntimeTemplateIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for runtimetemplate */
    inline def getRuntimeTemplateIamPolicyPlain(args: Endofunction[com.pulumi.gcp.colab.inputs.GetRuntimeTemplateIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.colab.outputs.GetRuntimeTemplateIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.colab.inputs.GetRuntimeTemplateIamPolicyPlainArgs.builder
      com.pulumi.gcp.colab.ColabFunctions.getRuntimeTemplateIamPolicyPlain(args(argsBuilder).build)

  /**
   * &#39;An instance of a notebook Execution&#39;
   * 
   * To get more information about NotebookExecution, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.notebookExecutionJobs)
   * * How-to Guides
   *     * [Schedule a notebook run](https://cloud.google.com/colab/docs/schedule-notebook-run)
   */
  def NotebookExecution(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.colab.NotebookExecutionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.colab.NotebookExecutionArgs.builder
    com.pulumi.gcp.colab.NotebookExecution(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.colab.NotebookExecutionArgs.Builder)
    /**
     * @param customEnvironmentSpec Compute configuration to use for an execution job
     * Structure is documented below.
     * @return builder
     */
    def customEnvironmentSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecArgs.Builder]):
        com.pulumi.gcp.colab.NotebookExecutionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecArgs.builder
      builder.customEnvironmentSpec(args(argsBuilder).build)

    /**
     * @param dataformRepositorySource The Dataform Repository containing the input notebook.
     * Structure is documented below.
     * @return builder
     */
    def dataformRepositorySource(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionDataformRepositorySourceArgs.Builder]):
        com.pulumi.gcp.colab.NotebookExecutionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionDataformRepositorySourceArgs.builder
      builder.dataformRepositorySource(args(argsBuilder).build)

    /**
     * @param directNotebookSource The content of the input notebook in ipynb format.
     * Structure is documented below.
     * @return builder
     */
    def directNotebookSource(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionDirectNotebookSourceArgs.Builder]):
        com.pulumi.gcp.colab.NotebookExecutionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionDirectNotebookSourceArgs.builder
      builder.directNotebookSource(args(argsBuilder).build)

    /**
     * @param gcsNotebookSource The Cloud Storage uri for the input notebook.
     * Structure is documented below.
     * @return builder
     */
    def gcsNotebookSource(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionGcsNotebookSourceArgs.Builder]):
        com.pulumi.gcp.colab.NotebookExecutionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionGcsNotebookSourceArgs.builder
      builder.gcsNotebookSource(args(argsBuilder).build)

    /**
     * @param workbenchRuntime Configuration for a Workbench Instances-based environment.
     * Structure is documented below.
     * @return builder
     */
    def workbenchRuntime(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionWorkbenchRuntimeArgs.Builder]):
        com.pulumi.gcp.colab.NotebookExecutionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionWorkbenchRuntimeArgs.builder
      builder.workbenchRuntime(args(argsBuilder).build)

  /**
   * &#39;A runtime is a Google-provisioned virtual machine (VM) that can run the code in your notebook (IPYNB file).&#39;
   * 
   * To get more information about Runtime, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.notebookRuntimes)
   * * How-to Guides
   *     * [Create a runtime](https://cloud.google.com/colab/docs/create-runtime)
   */
  def Runtime(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.colab.RuntimeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.colab.RuntimeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.colab.Runtime(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.colab.RuntimeArgs.Builder)
    /**
     * @param notebookRuntimeTemplateRef &#39;Runtime specific information used for NotebookRuntime creation.&#39;
     * Structure is documented below.
     * @return builder
     */
    def notebookRuntimeTemplateRef(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeNotebookRuntimeTemplateRefArgs.Builder]):
        com.pulumi.gcp.colab.RuntimeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeNotebookRuntimeTemplateRefArgs.builder
      builder.notebookRuntimeTemplateRef(args(argsBuilder).build)

  /**
   * &#39;A runtime template is a VM configuration that specifies a machine type and other characteristics of the VM,
   *  as well as common settings such as the network and whether public internet access is enabled. When you create
   *  a runtime, its VM is created according to the specifications of a runtime template.&#39;
   * 
   * To get more information about RuntimeTemplate, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.notebookRuntimeTemplates)
   * * How-to Guides
   *     * [Create a runtime template](https://cloud.google.com/colab/docs/create-runtime-template)
   */
  def RuntimeTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.colab.RuntimeTemplateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.colab.RuntimeTemplateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.colab.RuntimeTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.colab.RuntimeTemplateArgs.Builder)
    /**
     * @param dataPersistentDiskSpec The configuration for the data disk of the runtime.
     * Structure is documented below.
     * @return builder
     */
    def dataPersistentDiskSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateDataPersistentDiskSpecArgs.Builder]):
        com.pulumi.gcp.colab.RuntimeTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateDataPersistentDiskSpecArgs.builder
      builder.dataPersistentDiskSpec(args(argsBuilder).build)

    /**
     * @param encryptionSpec Customer-managed encryption key spec for the notebook runtime.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.colab.RuntimeTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param eucConfig EUC configuration of the NotebookRuntimeTemplate.
     * Structure is documented below.
     * @return builder
     */
    def eucConfig(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateEucConfigArgs.Builder]):
        com.pulumi.gcp.colab.RuntimeTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateEucConfigArgs.builder
      builder.eucConfig(args(argsBuilder).build)

    /**
     * @param idleShutdownConfig Notebook Idle Shutdown configuration for the runtime.
     * Structure is documented below.
     * @return builder
     */
    def idleShutdownConfig(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateIdleShutdownConfigArgs.Builder]):
        com.pulumi.gcp.colab.RuntimeTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateIdleShutdownConfigArgs.builder
      builder.idleShutdownConfig(args(argsBuilder).build)

    /**
     * @param machineSpec &#39;The machine configuration of the runtime.&#39;
     * Structure is documented below.
     * @return builder
     */
    def machineSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateMachineSpecArgs.Builder]):
        com.pulumi.gcp.colab.RuntimeTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateMachineSpecArgs.builder
      builder.machineSpec(args(argsBuilder).build)

    /**
     * @param networkSpec The network configuration for the runtime.
     * Structure is documented below.
     * @return builder
     */
    def networkSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateNetworkSpecArgs.Builder]):
        com.pulumi.gcp.colab.RuntimeTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateNetworkSpecArgs.builder
      builder.networkSpec(args(argsBuilder).build)

    /**
     * @param shieldedVmConfig Runtime Shielded VM spec.
     * Structure is documented below.
     * @return builder
     */
    def shieldedVmConfig(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateShieldedVmConfigArgs.Builder]):
        com.pulumi.gcp.colab.RuntimeTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateShieldedVmConfigArgs.builder
      builder.shieldedVmConfig(args(argsBuilder).build)

    /**
     * @param softwareConfig The notebook software configuration of the notebook runtime.
     * Structure is documented below.
     * @return builder
     */
    def softwareConfig(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateSoftwareConfigArgs.Builder]):
        com.pulumi.gcp.colab.RuntimeTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateSoftwareConfigArgs.builder
      builder.softwareConfig(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Colab Enterprise RuntimeTemplate. Each of these resources serves a different use case:
   * 
   * * `gcp.colab.RuntimeTemplateIamPolicy`: Authoritative. Sets the IAM policy for the runtimetemplate and replaces any existing policy already attached.
   * * `gcp.colab.RuntimeTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtimetemplate are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.colab.RuntimeTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtimetemplate are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.colab.RuntimeTemplateIamPolicy`: Retrieves the IAM policy for the runtimetemplate
   * 
   * &gt; **Note:** `gcp.colab.RuntimeTemplateIamPolicy` **cannot** be used in conjunction with `gcp.colab.RuntimeTemplateIamBinding` and `gcp.colab.RuntimeTemplateIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.colab.RuntimeTemplateIamBinding` resources **can be** used in conjunction with `gcp.colab.RuntimeTemplateIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.colab.RuntimeTemplateIamPolicy
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
   * import com.pulumi.gcp.colab.RuntimeTemplateIamPolicy;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new RuntimeTemplateIamPolicy("policy", RuntimeTemplateIamPolicyArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.colab.RuntimeTemplateIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamBinding;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RuntimeTemplateIamBinding("binding", RuntimeTemplateIamBindingArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.colab.RuntimeTemplateIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamMember;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RuntimeTemplateIamMember("member", RuntimeTemplateIamMemberArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
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
   * # IAM policy for Colab Enterprise RuntimeTemplate
   * 
   * Three different resources help you manage your IAM policy for Colab Enterprise RuntimeTemplate. Each of these resources serves a different use case:
   * 
   * * `gcp.colab.RuntimeTemplateIamPolicy`: Authoritative. Sets the IAM policy for the runtimetemplate and replaces any existing policy already attached.
   * * `gcp.colab.RuntimeTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtimetemplate are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.colab.RuntimeTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtimetemplate are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.colab.RuntimeTemplateIamPolicy`: Retrieves the IAM policy for the runtimetemplate
   * 
   * &gt; **Note:** `gcp.colab.RuntimeTemplateIamPolicy` **cannot** be used in conjunction with `gcp.colab.RuntimeTemplateIamBinding` and `gcp.colab.RuntimeTemplateIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.colab.RuntimeTemplateIamBinding` resources **can be** used in conjunction with `gcp.colab.RuntimeTemplateIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.colab.RuntimeTemplateIamPolicy
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
   * import com.pulumi.gcp.colab.RuntimeTemplateIamPolicy;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new RuntimeTemplateIamPolicy("policy", RuntimeTemplateIamPolicyArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.colab.RuntimeTemplateIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamBinding;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RuntimeTemplateIamBinding("binding", RuntimeTemplateIamBindingArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.colab.RuntimeTemplateIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamMember;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RuntimeTemplateIamMember("member", RuntimeTemplateIamMemberArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
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
   * * projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}}
   * * {{project}}/{{location}}/{{runtime_template}}
   * * {{location}}/{{runtime_template}}
   * * {{runtime_template}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Colab Enterprise runtimetemplate IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * $ terraform import google_colab_runtime_template_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_colab_runtime_template_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:colab/runtimeTemplateIamBinding:RuntimeTemplateIamBinding editor projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RuntimeTemplateIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.colab.RuntimeTemplateIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.colab.RuntimeTemplateIamBindingArgs.builder
    com.pulumi.gcp.colab.RuntimeTemplateIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.colab.RuntimeTemplateIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.colab.RuntimeTemplateIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Colab Enterprise RuntimeTemplate. Each of these resources serves a different use case:
   * 
   * * `gcp.colab.RuntimeTemplateIamPolicy`: Authoritative. Sets the IAM policy for the runtimetemplate and replaces any existing policy already attached.
   * * `gcp.colab.RuntimeTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtimetemplate are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.colab.RuntimeTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtimetemplate are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.colab.RuntimeTemplateIamPolicy`: Retrieves the IAM policy for the runtimetemplate
   * 
   * &gt; **Note:** `gcp.colab.RuntimeTemplateIamPolicy` **cannot** be used in conjunction with `gcp.colab.RuntimeTemplateIamBinding` and `gcp.colab.RuntimeTemplateIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.colab.RuntimeTemplateIamBinding` resources **can be** used in conjunction with `gcp.colab.RuntimeTemplateIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.colab.RuntimeTemplateIamPolicy
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
   * import com.pulumi.gcp.colab.RuntimeTemplateIamPolicy;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new RuntimeTemplateIamPolicy("policy", RuntimeTemplateIamPolicyArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.colab.RuntimeTemplateIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamBinding;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RuntimeTemplateIamBinding("binding", RuntimeTemplateIamBindingArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.colab.RuntimeTemplateIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamMember;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RuntimeTemplateIamMember("member", RuntimeTemplateIamMemberArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
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
   * # IAM policy for Colab Enterprise RuntimeTemplate
   * 
   * Three different resources help you manage your IAM policy for Colab Enterprise RuntimeTemplate. Each of these resources serves a different use case:
   * 
   * * `gcp.colab.RuntimeTemplateIamPolicy`: Authoritative. Sets the IAM policy for the runtimetemplate and replaces any existing policy already attached.
   * * `gcp.colab.RuntimeTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtimetemplate are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.colab.RuntimeTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtimetemplate are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.colab.RuntimeTemplateIamPolicy`: Retrieves the IAM policy for the runtimetemplate
   * 
   * &gt; **Note:** `gcp.colab.RuntimeTemplateIamPolicy` **cannot** be used in conjunction with `gcp.colab.RuntimeTemplateIamBinding` and `gcp.colab.RuntimeTemplateIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.colab.RuntimeTemplateIamBinding` resources **can be** used in conjunction with `gcp.colab.RuntimeTemplateIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.colab.RuntimeTemplateIamPolicy
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
   * import com.pulumi.gcp.colab.RuntimeTemplateIamPolicy;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new RuntimeTemplateIamPolicy("policy", RuntimeTemplateIamPolicyArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.colab.RuntimeTemplateIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamBinding;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RuntimeTemplateIamBinding("binding", RuntimeTemplateIamBindingArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.colab.RuntimeTemplateIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamMember;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RuntimeTemplateIamMember("member", RuntimeTemplateIamMemberArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
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
   * * projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}}
   * * {{project}}/{{location}}/{{runtime_template}}
   * * {{location}}/{{runtime_template}}
   * * {{runtime_template}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Colab Enterprise runtimetemplate IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * $ terraform import google_colab_runtime_template_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_colab_runtime_template_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:colab/runtimeTemplateIamMember:RuntimeTemplateIamMember editor projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RuntimeTemplateIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.colab.RuntimeTemplateIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.colab.RuntimeTemplateIamMemberArgs.builder
    com.pulumi.gcp.colab.RuntimeTemplateIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.colab.RuntimeTemplateIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.colab.RuntimeTemplateIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Colab Enterprise RuntimeTemplate. Each of these resources serves a different use case:
   * 
   * * `gcp.colab.RuntimeTemplateIamPolicy`: Authoritative. Sets the IAM policy for the runtimetemplate and replaces any existing policy already attached.
   * * `gcp.colab.RuntimeTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtimetemplate are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.colab.RuntimeTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtimetemplate are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.colab.RuntimeTemplateIamPolicy`: Retrieves the IAM policy for the runtimetemplate
   * 
   * &gt; **Note:** `gcp.colab.RuntimeTemplateIamPolicy` **cannot** be used in conjunction with `gcp.colab.RuntimeTemplateIamBinding` and `gcp.colab.RuntimeTemplateIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.colab.RuntimeTemplateIamBinding` resources **can be** used in conjunction with `gcp.colab.RuntimeTemplateIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.colab.RuntimeTemplateIamPolicy
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
   * import com.pulumi.gcp.colab.RuntimeTemplateIamPolicy;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new RuntimeTemplateIamPolicy("policy", RuntimeTemplateIamPolicyArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.colab.RuntimeTemplateIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamBinding;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RuntimeTemplateIamBinding("binding", RuntimeTemplateIamBindingArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.colab.RuntimeTemplateIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamMember;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RuntimeTemplateIamMember("member", RuntimeTemplateIamMemberArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
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
   * # IAM policy for Colab Enterprise RuntimeTemplate
   * 
   * Three different resources help you manage your IAM policy for Colab Enterprise RuntimeTemplate. Each of these resources serves a different use case:
   * 
   * * `gcp.colab.RuntimeTemplateIamPolicy`: Authoritative. Sets the IAM policy for the runtimetemplate and replaces any existing policy already attached.
   * * `gcp.colab.RuntimeTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtimetemplate are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.colab.RuntimeTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtimetemplate are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.colab.RuntimeTemplateIamPolicy`: Retrieves the IAM policy for the runtimetemplate
   * 
   * &gt; **Note:** `gcp.colab.RuntimeTemplateIamPolicy` **cannot** be used in conjunction with `gcp.colab.RuntimeTemplateIamBinding` and `gcp.colab.RuntimeTemplateIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.colab.RuntimeTemplateIamBinding` resources **can be** used in conjunction with `gcp.colab.RuntimeTemplateIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.colab.RuntimeTemplateIamPolicy
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
   * import com.pulumi.gcp.colab.RuntimeTemplateIamPolicy;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new RuntimeTemplateIamPolicy("policy", RuntimeTemplateIamPolicyArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.colab.RuntimeTemplateIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamBinding;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RuntimeTemplateIamBinding("binding", RuntimeTemplateIamBindingArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.colab.RuntimeTemplateIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamMember;
   * import com.pulumi.gcp.colab.RuntimeTemplateIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RuntimeTemplateIamMember("member", RuntimeTemplateIamMemberArgs.builder()
   *             .project(runtime_template.get("project"))
   *             .location(runtime_template.get("location"))
   *             .runtimeTemplate(runtime_template.get("name"))
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
   * * projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}}
   * * {{project}}/{{location}}/{{runtime_template}}
   * * {{location}}/{{runtime_template}}
   * * {{runtime_template}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Colab Enterprise runtimetemplate IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * $ terraform import google_colab_runtime_template_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_colab_runtime_template_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:colab/runtimeTemplateIamPolicy:RuntimeTemplateIamPolicy editor projects/{{project}}/locations/{{location}}/notebookRuntimeTemplates/{{runtime_template}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RuntimeTemplateIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.colab.RuntimeTemplateIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.colab.RuntimeTemplateIamPolicyArgs.builder
    com.pulumi.gcp.colab.RuntimeTemplateIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * &#39;Colab Enterprise Notebook Execution Schedules.&#39;
   * 
   * To get more information about Schedule, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.schedules)
   * * How-to Guides
   *     * [Schedule a notebook run](https://cloud.google.com/colab/docs/schedule-notebook-run)
   */
  def Schedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.colab.ScheduleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.colab.ScheduleArgs.builder
    com.pulumi.gcp.colab.Schedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.colab.ScheduleArgs.Builder)
    /**
     * @param createNotebookExecutionJobRequest Request for google_colab_notebook_execution.
     * Structure is documented below.
     * @return builder
     */
    def createNotebookExecutionJobRequest(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestArgs.Builder]):
        com.pulumi.gcp.colab.ScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestArgs.builder
      builder.createNotebookExecutionJobRequest(args(argsBuilder).build)

    /**
     * @param createPipelineJobRequest Request message for PipelineService.CreatePipelineJob.
     * Structure is documented below.
     * @return builder
     */
    def createPipelineJobRequest(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestArgs.Builder]):
        com.pulumi.gcp.colab.ScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestArgs.builder
      builder.createPipelineJobRequest(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecArgs.Builder)
    /**
     * @param machineSpec &#39;The machine configuration of the runtime.&#39;
     * Structure is documented below.
     * @return builder
     */
    def machineSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecMachineSpecArgs.Builder]):
        com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecMachineSpecArgs.builder
      builder.machineSpec(args(argsBuilder).build)

    /**
     * @param networkSpec The network configuration for the runtime.
     * Structure is documented below.
     * @return builder
     */
    def networkSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecNetworkSpecArgs.Builder]):
        com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecNetworkSpecArgs.builder
      builder.networkSpec(args(argsBuilder).build)

    /**
     * @param persistentDiskSpec The configuration for the data disk of the runtime.
     * Structure is documented below.
     * @return builder
     */
    def persistentDiskSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecPersistentDiskSpecArgs.Builder]):
        com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecPersistentDiskSpecArgs.builder
      builder.persistentDiskSpec(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig Shielded VM configuration.
     * Structure is documented below.
     * @return builder
     */
    def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.colab.inputs.NotebookExecutionState.Builder)
    /**
     * @param customEnvironmentSpec Compute configuration to use for an execution job
     * Structure is documented below.
     * @return builder
     */
    def customEnvironmentSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecArgs.Builder]):
        com.pulumi.gcp.colab.inputs.NotebookExecutionState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionCustomEnvironmentSpecArgs.builder
      builder.customEnvironmentSpec(args(argsBuilder).build)

    /**
     * @param dataformRepositorySource The Dataform Repository containing the input notebook.
     * Structure is documented below.
     * @return builder
     */
    def dataformRepositorySource(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionDataformRepositorySourceArgs.Builder]):
        com.pulumi.gcp.colab.inputs.NotebookExecutionState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionDataformRepositorySourceArgs.builder
      builder.dataformRepositorySource(args(argsBuilder).build)

    /**
     * @param directNotebookSource The content of the input notebook in ipynb format.
     * Structure is documented below.
     * @return builder
     */
    def directNotebookSource(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionDirectNotebookSourceArgs.Builder]):
        com.pulumi.gcp.colab.inputs.NotebookExecutionState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionDirectNotebookSourceArgs.builder
      builder.directNotebookSource(args(argsBuilder).build)

    /**
     * @param gcsNotebookSource The Cloud Storage uri for the input notebook.
     * Structure is documented below.
     * @return builder
     */
    def gcsNotebookSource(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionGcsNotebookSourceArgs.Builder]):
        com.pulumi.gcp.colab.inputs.NotebookExecutionState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionGcsNotebookSourceArgs.builder
      builder.gcsNotebookSource(args(argsBuilder).build)

    /**
     * @param workbenchRuntime Configuration for a Workbench Instances-based environment.
     * Structure is documented below.
     * @return builder
     */
    def workbenchRuntime(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionWorkbenchRuntimeArgs.Builder]):
        com.pulumi.gcp.colab.inputs.NotebookExecutionState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionWorkbenchRuntimeArgs.builder
      builder.workbenchRuntime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.colab.inputs.NotebookExecutionWorkbenchRuntimeArgs.Builder)
    /**
     * @param vmImage Custom Compute Engine VM image for the Workbench instance.
     * Structure is documented below.
     * @return builder
     */
    def vmImage(args: Endofunction[com.pulumi.gcp.colab.inputs.NotebookExecutionWorkbenchRuntimeVmImageArgs.Builder]):
        com.pulumi.gcp.colab.inputs.NotebookExecutionWorkbenchRuntimeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.NotebookExecutionWorkbenchRuntimeVmImageArgs.builder
      builder.vmImage(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.colab.inputs.RuntimeState.Builder)
    /**
     * @param notebookRuntimeTemplateRef &#39;Runtime specific information used for NotebookRuntime creation.&#39;
     * Structure is documented below.
     * @return builder
     */
    def notebookRuntimeTemplateRef(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeNotebookRuntimeTemplateRefArgs.Builder]):
        com.pulumi.gcp.colab.inputs.RuntimeState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeNotebookRuntimeTemplateRefArgs.builder
      builder.notebookRuntimeTemplateRef(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.colab.inputs.RuntimeTemplateIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.colab.inputs.RuntimeTemplateIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.colab.inputs.RuntimeTemplateIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.colab.inputs.RuntimeTemplateIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.colab.inputs.RuntimeTemplateSoftwareConfigArgs.Builder)
    /**
     * @param colabImage Colab Image Configuration.
     * Structure is documented below.
     * @return builder
     */
    def colabImage(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateSoftwareConfigColabImageArgs.Builder]):
        com.pulumi.gcp.colab.inputs.RuntimeTemplateSoftwareConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateSoftwareConfigColabImageArgs.builder
      builder.colabImage(args(argsBuilder).build)

    /**
     * @param envs Environment variables to be passed to the container.
     * Structure is documented below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateSoftwareConfigEnvArgs.Builder]*):
        com.pulumi.gcp.colab.inputs.RuntimeTemplateSoftwareConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateSoftwareConfigEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param postStartupScriptConfig Post startup script config.
     * Structure is documented below.
     * @return builder
     */
    def postStartupScriptConfig(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateSoftwareConfigPostStartupScriptConfigArgs.Builder]):
        com.pulumi.gcp.colab.inputs.RuntimeTemplateSoftwareConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateSoftwareConfigPostStartupScriptConfigArgs.builder
      builder.postStartupScriptConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.colab.inputs.RuntimeTemplateState.Builder)
    /**
     * @param dataPersistentDiskSpec The configuration for the data disk of the runtime.
     * Structure is documented below.
     * @return builder
     */
    def dataPersistentDiskSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateDataPersistentDiskSpecArgs.Builder]):
        com.pulumi.gcp.colab.inputs.RuntimeTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateDataPersistentDiskSpecArgs.builder
      builder.dataPersistentDiskSpec(args(argsBuilder).build)

    /**
     * @param encryptionSpec Customer-managed encryption key spec for the notebook runtime.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.colab.inputs.RuntimeTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param eucConfig EUC configuration of the NotebookRuntimeTemplate.
     * Structure is documented below.
     * @return builder
     */
    def eucConfig(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateEucConfigArgs.Builder]):
        com.pulumi.gcp.colab.inputs.RuntimeTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateEucConfigArgs.builder
      builder.eucConfig(args(argsBuilder).build)

    /**
     * @param idleShutdownConfig Notebook Idle Shutdown configuration for the runtime.
     * Structure is documented below.
     * @return builder
     */
    def idleShutdownConfig(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateIdleShutdownConfigArgs.Builder]):
        com.pulumi.gcp.colab.inputs.RuntimeTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateIdleShutdownConfigArgs.builder
      builder.idleShutdownConfig(args(argsBuilder).build)

    /**
     * @param machineSpec &#39;The machine configuration of the runtime.&#39;
     * Structure is documented below.
     * @return builder
     */
    def machineSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateMachineSpecArgs.Builder]):
        com.pulumi.gcp.colab.inputs.RuntimeTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateMachineSpecArgs.builder
      builder.machineSpec(args(argsBuilder).build)

    /**
     * @param networkSpec The network configuration for the runtime.
     * Structure is documented below.
     * @return builder
     */
    def networkSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateNetworkSpecArgs.Builder]):
        com.pulumi.gcp.colab.inputs.RuntimeTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateNetworkSpecArgs.builder
      builder.networkSpec(args(argsBuilder).build)

    /**
     * @param shieldedVmConfig Runtime Shielded VM spec.
     * Structure is documented below.
     * @return builder
     */
    def shieldedVmConfig(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateShieldedVmConfigArgs.Builder]):
        com.pulumi.gcp.colab.inputs.RuntimeTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateShieldedVmConfigArgs.builder
      builder.shieldedVmConfig(args(argsBuilder).build)

    /**
     * @param softwareConfig The notebook software configuration of the notebook runtime.
     * Structure is documented below.
     * @return builder
     */
    def softwareConfig(args: Endofunction[com.pulumi.gcp.colab.inputs.RuntimeTemplateSoftwareConfigArgs.Builder]):
        com.pulumi.gcp.colab.inputs.RuntimeTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.RuntimeTemplateSoftwareConfigArgs.builder
      builder.softwareConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestArgs.Builder)
    /**
     * @param notebookExecutionJob The NotebookExecutionJob to create.
     * Structure is documented below.
     * @return builder
     */
    def notebookExecutionJob(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobArgs.builder
      builder.notebookExecutionJob(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobArgs.Builder)
    /**
     * @param customEnvironmentSpec Compute configuration to use for an execution job.
     * Structure is documented below.
     * @return builder
     */
    def customEnvironmentSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecArgs.builder
      builder.customEnvironmentSpec(args(argsBuilder).build)

    /**
     * @param dataformRepositorySource The Dataform Repository containing the input notebook.
     * Structure is documented below.
     * @return builder
     */
    def dataformRepositorySource(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobDataformRepositorySourceArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobDataformRepositorySourceArgs.builder
      builder.dataformRepositorySource(args(argsBuilder).build)

    /**
     * @param encryptionSpec Represents a customer-managed encryption key specification that can be applied to a Vertex AI resource.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param gcsNotebookSource The Cloud Storage uri for the input notebook.
     * Structure is documented below.
     * @return builder
     */
    def gcsNotebookSource(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobGcsNotebookSourceArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobGcsNotebookSourceArgs.builder
      builder.gcsNotebookSource(args(argsBuilder).build)

    /**
     * @param workbenchRuntime Configuration for a Workbench Instances-based environment.
     * @return builder
     */
    def workbenchRuntime(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobWorkbenchRuntimeArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobWorkbenchRuntimeArgs.builder
      builder.workbenchRuntime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecArgs.Builder)
    /**
     * @param machineSpec Specification of a single machine.
     * Structure is documented below.
     * @return builder
     */
    def machineSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecMachineSpecArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecMachineSpecArgs.builder
      builder.machineSpec(args(argsBuilder).build)

    /**
     * @param networkSpec Network spec.
     * Structure is documented below.
     * @return builder
     */
    def networkSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecNetworkSpecArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecNetworkSpecArgs.builder
      builder.networkSpec(args(argsBuilder).build)

    /**
     * @param persistentDiskSpec Represents the spec of persistent disk options.
     * Structure is documented below.
     * @return builder
     */
    def persistentDiskSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecPersistentDiskSpecArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecPersistentDiskSpecArgs.builder
      builder.persistentDiskSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecMachineSpecArgs.Builder)
    /**
     * @param reservationAffinity A ReservationAffinity can be used to configure a Vertex AI resource (e.g., a DeployedModel) to draw its Compute Engine resources from a Shared Reservation, or exclusively from on-demand capacity.
     * Structure is documented below.
     * @return builder
     */
    def reservationAffinity(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecMachineSpecReservationAffinityArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecMachineSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestNotebookExecutionJobCustomEnvironmentSpecMachineSpecReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestArgs.Builder)
    /**
     * @param pipelineJob An instance of a machine learning PipelineJob.
     * Structure is documented below.
     * @return builder
     */
    def pipelineJob(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobArgs.builder
      builder.pipelineJob(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobArgs.Builder)
    /**
     * @param encryptionSpec Represents a customer-managed encryption key specification that can be applied to a Vertex AI resource.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param pscInterfaceConfig Configuration for PSC-I.
     * Structure is documented below.
     * @return builder
     */
    def pscInterfaceConfig(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobPscInterfaceConfigArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobPscInterfaceConfigArgs.builder
      builder.pscInterfaceConfig(args(argsBuilder).build)

    /**
     * @param runtimeConfig The runtime config of a PipelineJob.
     * Structure is documented below.
     * @return builder
     */
    def runtimeConfig(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobRuntimeConfigArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobRuntimeConfigArgs.builder
      builder.runtimeConfig(args(argsBuilder).build)

    /**
     * @param templateMetadatas (Output)
     * Pipeline template metadata if PipelineJob.template_uri is from supported template registry. Currently, the only supported registry is Artifact Registry.
     * Structure is documented below.
     * @return builder
     */
    def templateMetadatas(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobTemplateMetadataArgs.Builder]*):
        com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobArgs.Builder =
      def argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobTemplateMetadataArgs.builder
      builder.templateMetadatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobPscInterfaceConfigArgs.Builder)
    /**
     * @param dnsPeeringConfigs DNS peering configurations. When specified, Vertex AI will attempt to configure DNS peering zones in the tenant project VPC to resolve the specified domains using the target network&#39;s Cloud DNS. The user must grant the dns.peer role to the Vertex AI Service Agent on the target project.
     * Structure is documented below.
     * @return builder
     */
    def dnsPeeringConfigs(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobPscInterfaceConfigDnsPeeringConfigArgs.Builder]*):
        com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobPscInterfaceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestPipelineJobPscInterfaceConfigDnsPeeringConfigArgs.builder
      builder.dnsPeeringConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.colab.inputs.ScheduleState.Builder)
    /**
     * @param createNotebookExecutionJobRequest Request for google_colab_notebook_execution.
     * Structure is documented below.
     * @return builder
     */
    def createNotebookExecutionJobRequest(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreateNotebookExecutionJobRequestArgs.builder
      builder.createNotebookExecutionJobRequest(args(argsBuilder).build)

    /**
     * @param createPipelineJobRequest Request message for PipelineService.CreatePipelineJob.
     * Structure is documented below.
     * @return builder
     */
    def createPipelineJobRequest(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestArgs.Builder]):
        com.pulumi.gcp.colab.inputs.ScheduleState.Builder =
      val argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleCreatePipelineJobRequestArgs.builder
      builder.createPipelineJobRequest(args(argsBuilder).build)

    /**
     * @param lastScheduledRunResponses Status of a scheduled run.
     * Structure is documented below.
     * @return builder
     */
    def lastScheduledRunResponses(args: Endofunction[com.pulumi.gcp.colab.inputs.ScheduleLastScheduledRunResponseArgs.Builder]*):
        com.pulumi.gcp.colab.inputs.ScheduleState.Builder =
      def argsBuilder = com.pulumi.gcp.colab.inputs.ScheduleLastScheduledRunResponseArgs.builder
      builder.lastScheduledRunResponses(args.map(_(argsBuilder).build)*)
