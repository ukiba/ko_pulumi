package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object notebooks:
  extension (builder: com.pulumi.gcp.notebooks.RuntimeArgs.Builder)
    /**
     * @param accessConfig The config settings for accessing runtime.
     *  Structure is documented below.
     * @return builder
     */
    def accessConfig(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeAccessConfigArgs.Builder]):
        com.pulumi.gcp.notebooks.RuntimeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeAccessConfigArgs.builder
      builder.accessConfig(args(argsBuilder).build)

    /**
     * @param softwareConfig The config settings for software inside the runtime.
     *  Structure is documented below.
     * @return builder
     */
    def softwareConfig(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeSoftwareConfigArgs.Builder]):
        com.pulumi.gcp.notebooks.RuntimeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeSoftwareConfigArgs.builder
      builder.softwareConfig(args(argsBuilder).build)

    /**
     * @param virtualMachine Use a Compute Engine VM image to start the managed notebook instance.
     *  Structure is documented below.
     * @return builder
     */
    def virtualMachine(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineArgs.Builder]):
        com.pulumi.gcp.notebooks.RuntimeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineArgs.builder
      builder.virtualMachine(args(argsBuilder).build)

  /**
   * &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Runtime` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  Three different resources help you manage your IAM policy for Cloud AI Notebooks Runtime. Each of these resources serves a different use case:
   * 
   *  * `gcp.notebooks.RuntimeIamPolicy`: Authoritative. Sets the IAM policy for the runtime and replaces any existing policy already attached.
   *  * `gcp.notebooks.RuntimeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtime are preserved.
   *  * `gcp.notebooks.RuntimeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtime are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.notebooks.RuntimeIamPolicy`: Retrieves the IAM policy for the runtime
   * 
   *  &gt; **Note:** `gcp.notebooks.RuntimeIamPolicy` **cannot** be used in conjunction with `gcp.notebooks.RuntimeIamBinding` and `gcp.notebooks.RuntimeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.notebooks.RuntimeIamBinding` resources **can be** used in conjunction with `gcp.notebooks.RuntimeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.notebooks.RuntimeIamPolicy
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
   *  import com.pulumi.gcp.notebooks.RuntimeIamPolicy;
   *  import com.pulumi.gcp.notebooks.RuntimeIamPolicyArgs;
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
   *          var policy = new RuntimeIamPolicy("policy", RuntimeIamPolicyArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.RuntimeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.RuntimeIamBinding;
   *  import com.pulumi.gcp.notebooks.RuntimeIamBindingArgs;
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
   *          var binding = new RuntimeIamBinding("binding", RuntimeIamBindingArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.RuntimeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.RuntimeIamMember;
   *  import com.pulumi.gcp.notebooks.RuntimeIamMemberArgs;
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
   *          var member = new RuntimeIamMember("member", RuntimeIamMemberArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
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
   *  # IAM policy for Cloud AI Notebooks Runtime
   *  &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Runtime` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  Three different resources help you manage your IAM policy for Cloud AI Notebooks Runtime. Each of these resources serves a different use case:
   * 
   *  * `gcp.notebooks.RuntimeIamPolicy`: Authoritative. Sets the IAM policy for the runtime and replaces any existing policy already attached.
   *  * `gcp.notebooks.RuntimeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtime are preserved.
   *  * `gcp.notebooks.RuntimeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtime are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.notebooks.RuntimeIamPolicy`: Retrieves the IAM policy for the runtime
   * 
   *  &gt; **Note:** `gcp.notebooks.RuntimeIamPolicy` **cannot** be used in conjunction with `gcp.notebooks.RuntimeIamBinding` and `gcp.notebooks.RuntimeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.notebooks.RuntimeIamBinding` resources **can be** used in conjunction with `gcp.notebooks.RuntimeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.notebooks.RuntimeIamPolicy
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
   *  import com.pulumi.gcp.notebooks.RuntimeIamPolicy;
   *  import com.pulumi.gcp.notebooks.RuntimeIamPolicyArgs;
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
   *          var policy = new RuntimeIamPolicy("policy", RuntimeIamPolicyArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.RuntimeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.RuntimeIamBinding;
   *  import com.pulumi.gcp.notebooks.RuntimeIamBindingArgs;
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
   *          var binding = new RuntimeIamBinding("binding", RuntimeIamBindingArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.RuntimeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.RuntimeIamMember;
   *  import com.pulumi.gcp.notebooks.RuntimeIamMemberArgs;
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
   *          var member = new RuntimeIamMember("member", RuntimeIamMemberArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
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
   *  * projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}}
   *  * {{project}}/{{location}}/{{runtime_name}}
   *  * {{location}}/{{runtime_name}}
   *  * {{runtime_name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud AI Notebooks runtime IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_notebooks_runtime_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_notebooks_runtime_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:notebooks/runtimeIamMember:RuntimeIamMember editor projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RuntimeIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.notebooks.RuntimeIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.notebooks.RuntimeIamMemberArgs.builder
    com.pulumi.gcp.notebooks.RuntimeIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** `gcp.notebooks.Environment` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  A Cloud AI Platform Notebook environment.
   * 
   *  To get more information about Environment, see:
   * 
   *  * [API documentation](https://cloud.google.com/ai-platform/notebooks/docs/reference/rest)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/ai-platform-notebooks)
   */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.notebooks.EnvironmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.notebooks.EnvironmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.notebooks.Environment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.notebooks.InstanceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.notebooks.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.notebooks.InstanceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  type NotebooksFunctions = com.pulumi.gcp.notebooks.NotebooksFunctions
  object NotebooksFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.notebooks.NotebooksFunctions.*
  extension (self: NotebooksFunctions.type)
    /**
     * &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Instance` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
     * 
     *  Retrieves the current IAM policy data for instance
     */
    def getInstanceIamPolicy(args: Endofunction[com.pulumi.gcp.notebooks.inputs.GetInstanceIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.notebooks.outputs.GetInstanceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.GetInstanceIamPolicyArgs.builder
      com.pulumi.gcp.notebooks.NotebooksFunctions.getInstanceIamPolicy(args(argsBuilder).build)

    /**
     * &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Instance` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
     * 
     *  Retrieves the current IAM policy data for instance
     */
    def getInstanceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.notebooks.inputs.GetInstanceIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.notebooks.outputs.GetInstanceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.GetInstanceIamPolicyPlainArgs.builder
      com.pulumi.gcp.notebooks.NotebooksFunctions.getInstanceIamPolicyPlain(args(argsBuilder).build)

    /**
     * &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Runtime` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
     * 
     *  Retrieves the current IAM policy data for runtime
     */
    def getRuntimeIamPolicy(args: Endofunction[com.pulumi.gcp.notebooks.inputs.GetRuntimeIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.notebooks.outputs.GetRuntimeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.GetRuntimeIamPolicyArgs.builder
      com.pulumi.gcp.notebooks.NotebooksFunctions.getRuntimeIamPolicy(args(argsBuilder).build)

    /**
     * &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Runtime` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
     * 
     *  Retrieves the current IAM policy data for runtime
     */
    def getRuntimeIamPolicyPlain(args: Endofunction[com.pulumi.gcp.notebooks.inputs.GetRuntimeIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.notebooks.outputs.GetRuntimeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.GetRuntimeIamPolicyPlainArgs.builder
      com.pulumi.gcp.notebooks.NotebooksFunctions.getRuntimeIamPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.notebooks.InstanceArgs.Builder)
    /**
     * @param acceleratorConfig The hardware accelerator used on this instance. If you use accelerators,
     *  make sure that your configuration has enough vCPUs and memory to support the
     *  machineType you have selected.
     *  Structure is documented below.
     * @return builder
     */
    def acceleratorConfig(args: Endofunction[com.pulumi.gcp.notebooks.inputs.InstanceAcceleratorConfigArgs.Builder]):
        com.pulumi.gcp.notebooks.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.InstanceAcceleratorConfigArgs.builder
      builder.acceleratorConfig(args(argsBuilder).build)

    /**
     * @param containerImage Use a container image to start the notebook instance.
     *  Structure is documented below.
     * @return builder
     */
    def containerImage(args: Endofunction[com.pulumi.gcp.notebooks.inputs.InstanceContainerImageArgs.Builder]):
        com.pulumi.gcp.notebooks.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.InstanceContainerImageArgs.builder
      builder.containerImage(args(argsBuilder).build)

    /**
     * @param reservationAffinity Reservation Affinity for consuming Zonal reservation.
     *  Structure is documented below.
     * @return builder
     */
    def reservationAffinity(args: Endofunction[com.pulumi.gcp.notebooks.inputs.InstanceReservationAffinityArgs.Builder]):
        com.pulumi.gcp.notebooks.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.InstanceReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig A set of Shielded Instance options. Check [Images using supported Shielded VM features]
     *  Not all combinations are valid
     *  Structure is documented below.
     * @return builder
     */
    def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.notebooks.inputs.InstanceShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.notebooks.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.InstanceShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param vmImage Use a Compute Engine VM image to start the notebook instance.
     *  Structure is documented below.
     * @return builder
     */
    def vmImage(args: Endofunction[com.pulumi.gcp.notebooks.inputs.InstanceVmImageArgs.Builder]):
        com.pulumi.gcp.notebooks.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.InstanceVmImageArgs.builder
      builder.vmImage(args(argsBuilder).build)

  /**
   * &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Runtime` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  Three different resources help you manage your IAM policy for Cloud AI Notebooks Runtime. Each of these resources serves a different use case:
   * 
   *  * `gcp.notebooks.RuntimeIamPolicy`: Authoritative. Sets the IAM policy for the runtime and replaces any existing policy already attached.
   *  * `gcp.notebooks.RuntimeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtime are preserved.
   *  * `gcp.notebooks.RuntimeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtime are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.notebooks.RuntimeIamPolicy`: Retrieves the IAM policy for the runtime
   * 
   *  &gt; **Note:** `gcp.notebooks.RuntimeIamPolicy` **cannot** be used in conjunction with `gcp.notebooks.RuntimeIamBinding` and `gcp.notebooks.RuntimeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.notebooks.RuntimeIamBinding` resources **can be** used in conjunction with `gcp.notebooks.RuntimeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.notebooks.RuntimeIamPolicy
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
   *  import com.pulumi.gcp.notebooks.RuntimeIamPolicy;
   *  import com.pulumi.gcp.notebooks.RuntimeIamPolicyArgs;
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
   *          var policy = new RuntimeIamPolicy("policy", RuntimeIamPolicyArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.RuntimeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.RuntimeIamBinding;
   *  import com.pulumi.gcp.notebooks.RuntimeIamBindingArgs;
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
   *          var binding = new RuntimeIamBinding("binding", RuntimeIamBindingArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.RuntimeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.RuntimeIamMember;
   *  import com.pulumi.gcp.notebooks.RuntimeIamMemberArgs;
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
   *          var member = new RuntimeIamMember("member", RuntimeIamMemberArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
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
   *  # IAM policy for Cloud AI Notebooks Runtime
   *  &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Runtime` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  Three different resources help you manage your IAM policy for Cloud AI Notebooks Runtime. Each of these resources serves a different use case:
   * 
   *  * `gcp.notebooks.RuntimeIamPolicy`: Authoritative. Sets the IAM policy for the runtime and replaces any existing policy already attached.
   *  * `gcp.notebooks.RuntimeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtime are preserved.
   *  * `gcp.notebooks.RuntimeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtime are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.notebooks.RuntimeIamPolicy`: Retrieves the IAM policy for the runtime
   * 
   *  &gt; **Note:** `gcp.notebooks.RuntimeIamPolicy` **cannot** be used in conjunction with `gcp.notebooks.RuntimeIamBinding` and `gcp.notebooks.RuntimeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.notebooks.RuntimeIamBinding` resources **can be** used in conjunction with `gcp.notebooks.RuntimeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.notebooks.RuntimeIamPolicy
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
   *  import com.pulumi.gcp.notebooks.RuntimeIamPolicy;
   *  import com.pulumi.gcp.notebooks.RuntimeIamPolicyArgs;
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
   *          var policy = new RuntimeIamPolicy("policy", RuntimeIamPolicyArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.RuntimeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.RuntimeIamBinding;
   *  import com.pulumi.gcp.notebooks.RuntimeIamBindingArgs;
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
   *          var binding = new RuntimeIamBinding("binding", RuntimeIamBindingArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.RuntimeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.RuntimeIamMember;
   *  import com.pulumi.gcp.notebooks.RuntimeIamMemberArgs;
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
   *          var member = new RuntimeIamMember("member", RuntimeIamMemberArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
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
   *  * projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}}
   *  * {{project}}/{{location}}/{{runtime_name}}
   *  * {{location}}/{{runtime_name}}
   *  * {{runtime_name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud AI Notebooks runtime IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_notebooks_runtime_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_notebooks_runtime_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:notebooks/runtimeIamPolicy:RuntimeIamPolicy editor projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RuntimeIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.notebooks.RuntimeIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.notebooks.RuntimeIamPolicyArgs.builder
    com.pulumi.gcp.notebooks.RuntimeIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.notebooks.RuntimeIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.notebooks.RuntimeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Instance` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  Three different resources help you manage your IAM policy for Cloud AI Notebooks Instance. Each of these resources serves a different use case:
   * 
   *  * `gcp.notebooks.InstanceIamPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   *  * `gcp.notebooks.InstanceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.notebooks.InstanceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.notebooks.InstanceIamPolicy`: Retrieves the IAM policy for the instance
   * 
   *  &gt; **Note:** `gcp.notebooks.InstanceIamPolicy` **cannot** be used in conjunction with `gcp.notebooks.InstanceIamBinding` and `gcp.notebooks.InstanceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.notebooks.InstanceIamBinding` resources **can be** used in conjunction with `gcp.notebooks.InstanceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.notebooks.InstanceIamPolicy
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
   *  import com.pulumi.gcp.notebooks.InstanceIamPolicy;
   *  import com.pulumi.gcp.notebooks.InstanceIamPolicyArgs;
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
   *          var policy = new InstanceIamPolicy("policy", InstanceIamPolicyArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.InstanceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.InstanceIamBinding;
   *  import com.pulumi.gcp.notebooks.InstanceIamBindingArgs;
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
   *          var binding = new InstanceIamBinding("binding", InstanceIamBindingArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.InstanceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.InstanceIamMember;
   *  import com.pulumi.gcp.notebooks.InstanceIamMemberArgs;
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
   *          var member = new InstanceIamMember("member", InstanceIamMemberArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
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
   *  # IAM policy for Cloud AI Notebooks Instance
   *  &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Instance` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  Three different resources help you manage your IAM policy for Cloud AI Notebooks Instance. Each of these resources serves a different use case:
   * 
   *  * `gcp.notebooks.InstanceIamPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   *  * `gcp.notebooks.InstanceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.notebooks.InstanceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.notebooks.InstanceIamPolicy`: Retrieves the IAM policy for the instance
   * 
   *  &gt; **Note:** `gcp.notebooks.InstanceIamPolicy` **cannot** be used in conjunction with `gcp.notebooks.InstanceIamBinding` and `gcp.notebooks.InstanceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.notebooks.InstanceIamBinding` resources **can be** used in conjunction with `gcp.notebooks.InstanceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.notebooks.InstanceIamPolicy
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
   *  import com.pulumi.gcp.notebooks.InstanceIamPolicy;
   *  import com.pulumi.gcp.notebooks.InstanceIamPolicyArgs;
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
   *          var policy = new InstanceIamPolicy("policy", InstanceIamPolicyArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.InstanceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.InstanceIamBinding;
   *  import com.pulumi.gcp.notebooks.InstanceIamBindingArgs;
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
   *          var binding = new InstanceIamBinding("binding", InstanceIamBindingArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.InstanceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.InstanceIamMember;
   *  import com.pulumi.gcp.notebooks.InstanceIamMemberArgs;
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
   *          var member = new InstanceIamMember("member", InstanceIamMemberArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
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
   *  * projects/{{project}}/locations/{{location}}/instances/{{instance_name}}
   *  * {{project}}/{{location}}/{{instance_name}}
   *  * {{location}}/{{instance_name}}
   *  * {{instance_name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud AI Notebooks instance IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_notebooks_instance_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/instances/{{instance_name}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_notebooks_instance_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/instances/{{instance_name}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:notebooks/instanceIamPolicy:InstanceIamPolicy editor projects/{{project}}/locations/{{location}}/instances/{{instance_name}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def InstanceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.notebooks.InstanceIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.notebooks.InstanceIamPolicyArgs.builder
    com.pulumi.gcp.notebooks.InstanceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** `gcp.notebooks.Instance` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  A Cloud AI Platform Notebook instance.
   * 
   *  &gt; **Note:** Due to limitations of the Notebooks Instance API, many fields
   *  in this resource do not properly detect drift. These fields will also not
   *  appear in state once imported.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/ai-platform/notebooks/docs/reference/rest)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/ai-platform-notebooks)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.notebooks.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.notebooks.InstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.notebooks.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.notebooks.EnvironmentArgs.Builder)
    /**
     * @param containerImage Use a container image to start the notebook instance.
     *  Structure is documented below.
     * @return builder
     */
    def containerImage(args: Endofunction[com.pulumi.gcp.notebooks.inputs.EnvironmentContainerImageArgs.Builder]):
        com.pulumi.gcp.notebooks.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.EnvironmentContainerImageArgs.builder
      builder.containerImage(args(argsBuilder).build)

    /**
     * @param vmImage Use a Compute Engine VM image to start the notebook instance.
     *  Structure is documented below.
     * @return builder
     */
    def vmImage(args: Endofunction[com.pulumi.gcp.notebooks.inputs.EnvironmentVmImageArgs.Builder]):
        com.pulumi.gcp.notebooks.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.EnvironmentVmImageArgs.builder
      builder.vmImage(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.notebooks.InstanceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.notebooks.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.notebooks.InstanceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Instance` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  Three different resources help you manage your IAM policy for Cloud AI Notebooks Instance. Each of these resources serves a different use case:
   * 
   *  * `gcp.notebooks.InstanceIamPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   *  * `gcp.notebooks.InstanceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.notebooks.InstanceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.notebooks.InstanceIamPolicy`: Retrieves the IAM policy for the instance
   * 
   *  &gt; **Note:** `gcp.notebooks.InstanceIamPolicy` **cannot** be used in conjunction with `gcp.notebooks.InstanceIamBinding` and `gcp.notebooks.InstanceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.notebooks.InstanceIamBinding` resources **can be** used in conjunction with `gcp.notebooks.InstanceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.notebooks.InstanceIamPolicy
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
   *  import com.pulumi.gcp.notebooks.InstanceIamPolicy;
   *  import com.pulumi.gcp.notebooks.InstanceIamPolicyArgs;
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
   *          var policy = new InstanceIamPolicy("policy", InstanceIamPolicyArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.InstanceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.InstanceIamBinding;
   *  import com.pulumi.gcp.notebooks.InstanceIamBindingArgs;
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
   *          var binding = new InstanceIamBinding("binding", InstanceIamBindingArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.InstanceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.InstanceIamMember;
   *  import com.pulumi.gcp.notebooks.InstanceIamMemberArgs;
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
   *          var member = new InstanceIamMember("member", InstanceIamMemberArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
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
   *  # IAM policy for Cloud AI Notebooks Instance
   *  &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Instance` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  Three different resources help you manage your IAM policy for Cloud AI Notebooks Instance. Each of these resources serves a different use case:
   * 
   *  * `gcp.notebooks.InstanceIamPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   *  * `gcp.notebooks.InstanceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.notebooks.InstanceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.notebooks.InstanceIamPolicy`: Retrieves the IAM policy for the instance
   * 
   *  &gt; **Note:** `gcp.notebooks.InstanceIamPolicy` **cannot** be used in conjunction with `gcp.notebooks.InstanceIamBinding` and `gcp.notebooks.InstanceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.notebooks.InstanceIamBinding` resources **can be** used in conjunction with `gcp.notebooks.InstanceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.notebooks.InstanceIamPolicy
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
   *  import com.pulumi.gcp.notebooks.InstanceIamPolicy;
   *  import com.pulumi.gcp.notebooks.InstanceIamPolicyArgs;
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
   *          var policy = new InstanceIamPolicy("policy", InstanceIamPolicyArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.InstanceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.InstanceIamBinding;
   *  import com.pulumi.gcp.notebooks.InstanceIamBindingArgs;
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
   *          var binding = new InstanceIamBinding("binding", InstanceIamBindingArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.InstanceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.InstanceIamMember;
   *  import com.pulumi.gcp.notebooks.InstanceIamMemberArgs;
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
   *          var member = new InstanceIamMember("member", InstanceIamMemberArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
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
   *  * projects/{{project}}/locations/{{location}}/instances/{{instance_name}}
   *  * {{project}}/{{location}}/{{instance_name}}
   *  * {{location}}/{{instance_name}}
   *  * {{instance_name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud AI Notebooks instance IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_notebooks_instance_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/instances/{{instance_name}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_notebooks_instance_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/instances/{{instance_name}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:notebooks/instanceIamBinding:InstanceIamBinding editor projects/{{project}}/locations/{{location}}/instances/{{instance_name}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def InstanceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.notebooks.InstanceIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.notebooks.InstanceIamBindingArgs.builder
    com.pulumi.gcp.notebooks.InstanceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** `gcp.notebooks.Runtime` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  A Cloud AI Platform Notebook runtime.
   * 
   *  &gt; **Note:** Due to limitations of the Notebooks Runtime API, many fields
   *  in this resource do not properly detect drift. These fields will also not
   *  appear in state once imported.
   * 
   *  To get more information about Runtime, see:
   * 
   *  * [API documentation](https://cloud.google.com/ai-platform/notebooks/docs/reference/rest)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/ai-platform-notebooks)
   */
  def Runtime(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.notebooks.RuntimeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.notebooks.RuntimeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.notebooks.Runtime(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Runtime` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  Three different resources help you manage your IAM policy for Cloud AI Notebooks Runtime. Each of these resources serves a different use case:
   * 
   *  * `gcp.notebooks.RuntimeIamPolicy`: Authoritative. Sets the IAM policy for the runtime and replaces any existing policy already attached.
   *  * `gcp.notebooks.RuntimeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtime are preserved.
   *  * `gcp.notebooks.RuntimeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtime are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.notebooks.RuntimeIamPolicy`: Retrieves the IAM policy for the runtime
   * 
   *  &gt; **Note:** `gcp.notebooks.RuntimeIamPolicy` **cannot** be used in conjunction with `gcp.notebooks.RuntimeIamBinding` and `gcp.notebooks.RuntimeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.notebooks.RuntimeIamBinding` resources **can be** used in conjunction with `gcp.notebooks.RuntimeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.notebooks.RuntimeIamPolicy
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
   *  import com.pulumi.gcp.notebooks.RuntimeIamPolicy;
   *  import com.pulumi.gcp.notebooks.RuntimeIamPolicyArgs;
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
   *          var policy = new RuntimeIamPolicy("policy", RuntimeIamPolicyArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.RuntimeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.RuntimeIamBinding;
   *  import com.pulumi.gcp.notebooks.RuntimeIamBindingArgs;
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
   *          var binding = new RuntimeIamBinding("binding", RuntimeIamBindingArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.RuntimeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.RuntimeIamMember;
   *  import com.pulumi.gcp.notebooks.RuntimeIamMemberArgs;
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
   *          var member = new RuntimeIamMember("member", RuntimeIamMemberArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
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
   *  # IAM policy for Cloud AI Notebooks Runtime
   *  &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Runtime` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  Three different resources help you manage your IAM policy for Cloud AI Notebooks Runtime. Each of these resources serves a different use case:
   * 
   *  * `gcp.notebooks.RuntimeIamPolicy`: Authoritative. Sets the IAM policy for the runtime and replaces any existing policy already attached.
   *  * `gcp.notebooks.RuntimeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the runtime are preserved.
   *  * `gcp.notebooks.RuntimeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the runtime are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.notebooks.RuntimeIamPolicy`: Retrieves the IAM policy for the runtime
   * 
   *  &gt; **Note:** `gcp.notebooks.RuntimeIamPolicy` **cannot** be used in conjunction with `gcp.notebooks.RuntimeIamBinding` and `gcp.notebooks.RuntimeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.notebooks.RuntimeIamBinding` resources **can be** used in conjunction with `gcp.notebooks.RuntimeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.notebooks.RuntimeIamPolicy
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
   *  import com.pulumi.gcp.notebooks.RuntimeIamPolicy;
   *  import com.pulumi.gcp.notebooks.RuntimeIamPolicyArgs;
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
   *          var policy = new RuntimeIamPolicy("policy", RuntimeIamPolicyArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.RuntimeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.RuntimeIamBinding;
   *  import com.pulumi.gcp.notebooks.RuntimeIamBindingArgs;
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
   *          var binding = new RuntimeIamBinding("binding", RuntimeIamBindingArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.RuntimeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.RuntimeIamMember;
   *  import com.pulumi.gcp.notebooks.RuntimeIamMemberArgs;
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
   *          var member = new RuntimeIamMember("member", RuntimeIamMemberArgs.builder()
   *              .project(runtime.project())
   *              .location(runtime.location())
   *              .runtimeName(runtime.name())
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
   *  * projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}}
   *  * {{project}}/{{location}}/{{runtime_name}}
   *  * {{location}}/{{runtime_name}}
   *  * {{runtime_name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud AI Notebooks runtime IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_notebooks_runtime_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_notebooks_runtime_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:notebooks/runtimeIamBinding:RuntimeIamBinding editor projects/{{project}}/locations/{{location}}/runtimes/{{runtime_name}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RuntimeIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.notebooks.RuntimeIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.notebooks.RuntimeIamBindingArgs.builder
    com.pulumi.gcp.notebooks.RuntimeIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Instance` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  Three different resources help you manage your IAM policy for Cloud AI Notebooks Instance. Each of these resources serves a different use case:
   * 
   *  * `gcp.notebooks.InstanceIamPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   *  * `gcp.notebooks.InstanceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.notebooks.InstanceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.notebooks.InstanceIamPolicy`: Retrieves the IAM policy for the instance
   * 
   *  &gt; **Note:** `gcp.notebooks.InstanceIamPolicy` **cannot** be used in conjunction with `gcp.notebooks.InstanceIamBinding` and `gcp.notebooks.InstanceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.notebooks.InstanceIamBinding` resources **can be** used in conjunction with `gcp.notebooks.InstanceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.notebooks.InstanceIamPolicy
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
   *  import com.pulumi.gcp.notebooks.InstanceIamPolicy;
   *  import com.pulumi.gcp.notebooks.InstanceIamPolicyArgs;
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
   *          var policy = new InstanceIamPolicy("policy", InstanceIamPolicyArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.InstanceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.InstanceIamBinding;
   *  import com.pulumi.gcp.notebooks.InstanceIamBindingArgs;
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
   *          var binding = new InstanceIamBinding("binding", InstanceIamBindingArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.InstanceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.InstanceIamMember;
   *  import com.pulumi.gcp.notebooks.InstanceIamMemberArgs;
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
   *          var member = new InstanceIamMember("member", InstanceIamMemberArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
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
   *  # IAM policy for Cloud AI Notebooks Instance
   *  &gt; **Warning:** The parent resource has been deprecated: `gcp.notebooks.Instance` is deprecated and will be removed in a future major release. Use `gcp.workbench.Instance` instead.
   * 
   *  Three different resources help you manage your IAM policy for Cloud AI Notebooks Instance. Each of these resources serves a different use case:
   * 
   *  * `gcp.notebooks.InstanceIamPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   *  * `gcp.notebooks.InstanceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.notebooks.InstanceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.notebooks.InstanceIamPolicy`: Retrieves the IAM policy for the instance
   * 
   *  &gt; **Note:** `gcp.notebooks.InstanceIamPolicy` **cannot** be used in conjunction with `gcp.notebooks.InstanceIamBinding` and `gcp.notebooks.InstanceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.notebooks.InstanceIamBinding` resources **can be** used in conjunction with `gcp.notebooks.InstanceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.notebooks.InstanceIamPolicy
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
   *  import com.pulumi.gcp.notebooks.InstanceIamPolicy;
   *  import com.pulumi.gcp.notebooks.InstanceIamPolicyArgs;
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
   *          var policy = new InstanceIamPolicy("policy", InstanceIamPolicyArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.InstanceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.InstanceIamBinding;
   *  import com.pulumi.gcp.notebooks.InstanceIamBindingArgs;
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
   *          var binding = new InstanceIamBinding("binding", InstanceIamBindingArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.notebooks.InstanceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.notebooks.InstanceIamMember;
   *  import com.pulumi.gcp.notebooks.InstanceIamMemberArgs;
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
   *          var member = new InstanceIamMember("member", InstanceIamMemberArgs.builder()
   *              .project(instance.project())
   *              .location(instance.location())
   *              .instanceName(instance.name())
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
   *  * projects/{{project}}/locations/{{location}}/instances/{{instance_name}}
   *  * {{project}}/{{location}}/{{instance_name}}
   *  * {{location}}/{{instance_name}}
   *  * {{instance_name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud AI Notebooks instance IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_notebooks_instance_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/instances/{{instance_name}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_notebooks_instance_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/instances/{{instance_name}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:notebooks/instanceIamMember:InstanceIamMember editor projects/{{project}}/locations/{{location}}/instances/{{instance_name}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def InstanceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.notebooks.InstanceIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.notebooks.InstanceIamMemberArgs.builder
    com.pulumi.gcp.notebooks.InstanceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.notebooks.inputs.RuntimeIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.RuntimeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.notebooks.inputs.RuntimeState.Builder)
    /**
     * @param accessConfig The config settings for accessing runtime.
     *  Structure is documented below.
     * @return builder
     */
    def accessConfig(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeAccessConfigArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.RuntimeState.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeAccessConfigArgs.builder
      builder.accessConfig(args(argsBuilder).build)

    /**
     * @param metrics Contains Runtime daemon metrics such as Service status and JupyterLab
     *  status
     *  Structure is documented below.
     * @return builder
     */
    def metrics(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeMetricArgs.Builder]*):
        com.pulumi.gcp.notebooks.inputs.RuntimeState.Builder =
      def argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

    /**
     * @param softwareConfig The config settings for software inside the runtime.
     *  Structure is documented below.
     * @return builder
     */
    def softwareConfig(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeSoftwareConfigArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.RuntimeState.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeSoftwareConfigArgs.builder
      builder.softwareConfig(args(argsBuilder).build)

    /**
     * @param virtualMachine Use a Compute Engine VM image to start the managed notebook instance.
     *  Structure is documented below.
     * @return builder
     */
    def virtualMachine(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.RuntimeState.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineArgs.builder
      builder.virtualMachine(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.notebooks.inputs.RuntimeSoftwareConfigArgs.Builder)
    /**
     * @param kernels Use a list of container images to use as Kernels in the notebook instance.
     *  Structure is documented below.
     * @return builder
     */
    def kernels(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeSoftwareConfigKernelArgs.Builder]*):
        com.pulumi.gcp.notebooks.inputs.RuntimeSoftwareConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeSoftwareConfigKernelArgs.builder
      builder.kernels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.notebooks.inputs.RuntimeIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.RuntimeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.notebooks.inputs.EnvironmentState.Builder)
    /**
     * @param containerImage Use a container image to start the notebook instance.
     *  Structure is documented below.
     * @return builder
     */
    def containerImage(args: Endofunction[com.pulumi.gcp.notebooks.inputs.EnvironmentContainerImageArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.EnvironmentContainerImageArgs.builder
      builder.containerImage(args(argsBuilder).build)

    /**
     * @param vmImage Use a Compute Engine VM image to start the notebook instance.
     *  Structure is documented below.
     * @return builder
     */
    def vmImage(args: Endofunction[com.pulumi.gcp.notebooks.inputs.EnvironmentVmImageArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.EnvironmentVmImageArgs.builder
      builder.vmImage(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigArgs.Builder)
    /**
     * @param acceleratorConfig The Compute Engine accelerator configuration for this runtime.
     *  Structure is documented below.
     * @return builder
     */
    def acceleratorConfig(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs.builder
      builder.acceleratorConfig(args(argsBuilder).build)

    /**
     * @param containerImages Use a list of container images to start the notebook instance.
     *  Structure is documented below.
     * @return builder
     */
    def containerImages(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigContainerImageArgs.Builder]*):
        com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigContainerImageArgs.builder
      builder.containerImages(args.map(_(argsBuilder).build)*)

    /**
     * @param dataDisk Data disk option configuration settings.
     *  Structure is documented below.
     * @return builder
     */
    def dataDisk(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs.builder
      builder.dataDisk(args(argsBuilder).build)

    /**
     * @param encryptionConfig Encryption settings for virtual machine data disk.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig Shielded VM Instance configuration settings.
     *  Structure is documented below.
     * @return builder
     */
    def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineArgs.Builder)
    /**
     * @param virtualMachineConfig Virtual Machine configuration settings.
     *  Structure is documented below.
     * @return builder
     */
    def virtualMachineConfig(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigArgs.builder
      builder.virtualMachineConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.notebooks.inputs.InstanceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.notebooks.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.InstanceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs.Builder)
    /**
     * @param initializeParams Input only. Specifies the parameters for a new disk that will
     *  be created alongside the new instance. Use initialization
     *  parameters to create boot disks or local SSDs attached to the
     *  new instance. This property is mutually exclusive with the
     *  source property; you can only define one or the other, but not
     *  both.
     *  Structure is documented below.
     * @return builder
     */
    def initializeParams(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs.builder
      builder.initializeParams(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.notebooks.inputs.InstanceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.notebooks.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.InstanceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.notebooks.inputs.InstanceState.Builder)
    /**
     * @param acceleratorConfig The hardware accelerator used on this instance. If you use accelerators,
     *  make sure that your configuration has enough vCPUs and memory to support the
     *  machineType you have selected.
     *  Structure is documented below.
     * @return builder
     */
    def acceleratorConfig(args: Endofunction[com.pulumi.gcp.notebooks.inputs.InstanceAcceleratorConfigArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.InstanceAcceleratorConfigArgs.builder
      builder.acceleratorConfig(args(argsBuilder).build)

    /**
     * @param containerImage Use a container image to start the notebook instance.
     *  Structure is documented below.
     * @return builder
     */
    def containerImage(args: Endofunction[com.pulumi.gcp.notebooks.inputs.InstanceContainerImageArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.InstanceContainerImageArgs.builder
      builder.containerImage(args(argsBuilder).build)

    /**
     * @param reservationAffinity Reservation Affinity for consuming Zonal reservation.
     *  Structure is documented below.
     * @return builder
     */
    def reservationAffinity(args: Endofunction[com.pulumi.gcp.notebooks.inputs.InstanceReservationAffinityArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.InstanceReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig A set of Shielded Instance options. Check [Images using supported Shielded VM features]
     *  Not all combinations are valid
     *  Structure is documented below.
     * @return builder
     */
    def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.notebooks.inputs.InstanceShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.InstanceShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param vmImage Use a Compute Engine VM image to start the notebook instance.
     *  Structure is documented below.
     * @return builder
     */
    def vmImage(args: Endofunction[com.pulumi.gcp.notebooks.inputs.InstanceVmImageArgs.Builder]):
        com.pulumi.gcp.notebooks.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.InstanceVmImageArgs.builder
      builder.vmImage(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.notebooks.RuntimeIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.notebooks.inputs.RuntimeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.notebooks.RuntimeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.notebooks.inputs.RuntimeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)
