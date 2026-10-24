package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object containeranalysis:
  object ContaineranalysisFunctions:
    /** Retrieves the current IAM policy data for note */
    inline def getNoteIamPolicy(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.containeranalysis.outputs.GetNoteIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyArgs.builder
      com.pulumi.gcp.containeranalysis.ContaineranalysisFunctions.getNoteIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for note */
    inline def getNoteIamPolicyPlain(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.containeranalysis.outputs.GetNoteIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyPlainArgs.builder
      com.pulumi.gcp.containeranalysis.ContaineranalysisFunctions.getNoteIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * A Container Analysis note is a high-level piece of metadata that
   * describes a type of analysis that can be done for a resource.
   * 
   * To get more information about Note, see:
   * 
   * * [API documentation](https://cloud.google.com/container-analysis/api/reference/rest/)
   * * How-to Guides
   *     * [Creating Attestations (Occurrences)](https://cloud.google.com/binary-authorization/docs/making-attestations)
   *     * [Official Documentation](https://cloud.google.com/container-analysis/)
   */
  def Note(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.containeranalysis.NoteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.containeranalysis.NoteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.containeranalysis.Note(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Container Registry Note. Each of these resources serves a different use case:
   * 
   * * `gcp.containeranalysis.NoteIamPolicy`: Authoritative. Sets the IAM policy for the note and replaces any existing policy already attached.
   * * `gcp.containeranalysis.NoteIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the note are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.containeranalysis.NoteIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the note are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.containeranalysis.NoteIamPolicy`: Retrieves the IAM policy for the note
   * 
   * &gt; **Note:** `gcp.containeranalysis.NoteIamPolicy` **cannot** be used in conjunction with `gcp.containeranalysis.NoteIamBinding` and `gcp.containeranalysis.NoteIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.containeranalysis.NoteIamBinding` resources **can be** used in conjunction with `gcp.containeranalysis.NoteIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.containeranalysis.NoteIamPolicy
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
   * import com.pulumi.gcp.containeranalysis.NoteIamPolicy;
   * import com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs;
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
   *                 .role("roles/containeranalysis.notes.occurrences.viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new NoteIamPolicy("policy", NoteIamPolicyArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.containeranalysis.NoteIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.containeranalysis.NoteIamBinding;
   * import com.pulumi.gcp.containeranalysis.NoteIamBindingArgs;
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
   *         var binding = new NoteIamBinding("binding", NoteIamBindingArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .role("roles/containeranalysis.notes.occurrences.viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.containeranalysis.NoteIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.containeranalysis.NoteIamMember;
   * import com.pulumi.gcp.containeranalysis.NoteIamMemberArgs;
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
   *         var member = new NoteIamMember("member", NoteIamMemberArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .role("roles/containeranalysis.notes.occurrences.viewer")
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
   * # IAM policy for Container Registry Note
   * 
   * Three different resources help you manage your IAM policy for Container Registry Note. Each of these resources serves a different use case:
   * 
   * * `gcp.containeranalysis.NoteIamPolicy`: Authoritative. Sets the IAM policy for the note and replaces any existing policy already attached.
   * * `gcp.containeranalysis.NoteIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the note are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.containeranalysis.NoteIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the note are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.containeranalysis.NoteIamPolicy`: Retrieves the IAM policy for the note
   * 
   * &gt; **Note:** `gcp.containeranalysis.NoteIamPolicy` **cannot** be used in conjunction with `gcp.containeranalysis.NoteIamBinding` and `gcp.containeranalysis.NoteIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.containeranalysis.NoteIamBinding` resources **can be** used in conjunction with `gcp.containeranalysis.NoteIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.containeranalysis.NoteIamPolicy
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
   * import com.pulumi.gcp.containeranalysis.NoteIamPolicy;
   * import com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs;
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
   *                 .role("roles/containeranalysis.notes.occurrences.viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new NoteIamPolicy("policy", NoteIamPolicyArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.containeranalysis.NoteIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.containeranalysis.NoteIamBinding;
   * import com.pulumi.gcp.containeranalysis.NoteIamBindingArgs;
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
   *         var binding = new NoteIamBinding("binding", NoteIamBindingArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .role("roles/containeranalysis.notes.occurrences.viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.containeranalysis.NoteIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.containeranalysis.NoteIamMember;
   * import com.pulumi.gcp.containeranalysis.NoteIamMemberArgs;
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
   *         var member = new NoteIamMember("member", NoteIamMemberArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .role("roles/containeranalysis.notes.occurrences.viewer")
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
   * * projects/{{project}}/notes/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Container Registry note IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_container_analysis_note_iam_member.editor &#34;projects/{{project}}/notes/{{note}} roles/containeranalysis.notes.occurrences.viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_container_analysis_note_iam_binding.editor &#34;projects/{{project}}/notes/{{note}} roles/containeranalysis.notes.occurrences.viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:containeranalysis/noteIamBinding:NoteIamBinding editor projects/{{project}}/notes/{{note}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def NoteIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.containeranalysis.NoteIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.containeranalysis.NoteIamBindingArgs.builder
    com.pulumi.gcp.containeranalysis.NoteIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Container Registry Note. Each of these resources serves a different use case:
   * 
   * * `gcp.containeranalysis.NoteIamPolicy`: Authoritative. Sets the IAM policy for the note and replaces any existing policy already attached.
   * * `gcp.containeranalysis.NoteIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the note are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.containeranalysis.NoteIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the note are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.containeranalysis.NoteIamPolicy`: Retrieves the IAM policy for the note
   * 
   * &gt; **Note:** `gcp.containeranalysis.NoteIamPolicy` **cannot** be used in conjunction with `gcp.containeranalysis.NoteIamBinding` and `gcp.containeranalysis.NoteIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.containeranalysis.NoteIamBinding` resources **can be** used in conjunction with `gcp.containeranalysis.NoteIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.containeranalysis.NoteIamPolicy
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
   * import com.pulumi.gcp.containeranalysis.NoteIamPolicy;
   * import com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs;
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
   *                 .role("roles/containeranalysis.notes.occurrences.viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new NoteIamPolicy("policy", NoteIamPolicyArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.containeranalysis.NoteIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.containeranalysis.NoteIamBinding;
   * import com.pulumi.gcp.containeranalysis.NoteIamBindingArgs;
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
   *         var binding = new NoteIamBinding("binding", NoteIamBindingArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .role("roles/containeranalysis.notes.occurrences.viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.containeranalysis.NoteIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.containeranalysis.NoteIamMember;
   * import com.pulumi.gcp.containeranalysis.NoteIamMemberArgs;
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
   *         var member = new NoteIamMember("member", NoteIamMemberArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .role("roles/containeranalysis.notes.occurrences.viewer")
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
   * # IAM policy for Container Registry Note
   * 
   * Three different resources help you manage your IAM policy for Container Registry Note. Each of these resources serves a different use case:
   * 
   * * `gcp.containeranalysis.NoteIamPolicy`: Authoritative. Sets the IAM policy for the note and replaces any existing policy already attached.
   * * `gcp.containeranalysis.NoteIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the note are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.containeranalysis.NoteIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the note are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.containeranalysis.NoteIamPolicy`: Retrieves the IAM policy for the note
   * 
   * &gt; **Note:** `gcp.containeranalysis.NoteIamPolicy` **cannot** be used in conjunction with `gcp.containeranalysis.NoteIamBinding` and `gcp.containeranalysis.NoteIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.containeranalysis.NoteIamBinding` resources **can be** used in conjunction with `gcp.containeranalysis.NoteIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.containeranalysis.NoteIamPolicy
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
   * import com.pulumi.gcp.containeranalysis.NoteIamPolicy;
   * import com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs;
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
   *                 .role("roles/containeranalysis.notes.occurrences.viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new NoteIamPolicy("policy", NoteIamPolicyArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.containeranalysis.NoteIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.containeranalysis.NoteIamBinding;
   * import com.pulumi.gcp.containeranalysis.NoteIamBindingArgs;
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
   *         var binding = new NoteIamBinding("binding", NoteIamBindingArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .role("roles/containeranalysis.notes.occurrences.viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.containeranalysis.NoteIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.containeranalysis.NoteIamMember;
   * import com.pulumi.gcp.containeranalysis.NoteIamMemberArgs;
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
   *         var member = new NoteIamMember("member", NoteIamMemberArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .role("roles/containeranalysis.notes.occurrences.viewer")
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
   * * projects/{{project}}/notes/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Container Registry note IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_container_analysis_note_iam_member.editor &#34;projects/{{project}}/notes/{{note}} roles/containeranalysis.notes.occurrences.viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_container_analysis_note_iam_binding.editor &#34;projects/{{project}}/notes/{{note}} roles/containeranalysis.notes.occurrences.viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:containeranalysis/noteIamMember:NoteIamMember editor projects/{{project}}/notes/{{note}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def NoteIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.containeranalysis.NoteIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.containeranalysis.NoteIamMemberArgs.builder
    com.pulumi.gcp.containeranalysis.NoteIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Container Registry Note. Each of these resources serves a different use case:
   * 
   * * `gcp.containeranalysis.NoteIamPolicy`: Authoritative. Sets the IAM policy for the note and replaces any existing policy already attached.
   * * `gcp.containeranalysis.NoteIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the note are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.containeranalysis.NoteIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the note are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.containeranalysis.NoteIamPolicy`: Retrieves the IAM policy for the note
   * 
   * &gt; **Note:** `gcp.containeranalysis.NoteIamPolicy` **cannot** be used in conjunction with `gcp.containeranalysis.NoteIamBinding` and `gcp.containeranalysis.NoteIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.containeranalysis.NoteIamBinding` resources **can be** used in conjunction with `gcp.containeranalysis.NoteIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.containeranalysis.NoteIamPolicy
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
   * import com.pulumi.gcp.containeranalysis.NoteIamPolicy;
   * import com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs;
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
   *                 .role("roles/containeranalysis.notes.occurrences.viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new NoteIamPolicy("policy", NoteIamPolicyArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.containeranalysis.NoteIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.containeranalysis.NoteIamBinding;
   * import com.pulumi.gcp.containeranalysis.NoteIamBindingArgs;
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
   *         var binding = new NoteIamBinding("binding", NoteIamBindingArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .role("roles/containeranalysis.notes.occurrences.viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.containeranalysis.NoteIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.containeranalysis.NoteIamMember;
   * import com.pulumi.gcp.containeranalysis.NoteIamMemberArgs;
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
   *         var member = new NoteIamMember("member", NoteIamMemberArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .role("roles/containeranalysis.notes.occurrences.viewer")
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
   * # IAM policy for Container Registry Note
   * 
   * Three different resources help you manage your IAM policy for Container Registry Note. Each of these resources serves a different use case:
   * 
   * * `gcp.containeranalysis.NoteIamPolicy`: Authoritative. Sets the IAM policy for the note and replaces any existing policy already attached.
   * * `gcp.containeranalysis.NoteIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the note are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.containeranalysis.NoteIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the note are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.containeranalysis.NoteIamPolicy`: Retrieves the IAM policy for the note
   * 
   * &gt; **Note:** `gcp.containeranalysis.NoteIamPolicy` **cannot** be used in conjunction with `gcp.containeranalysis.NoteIamBinding` and `gcp.containeranalysis.NoteIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.containeranalysis.NoteIamBinding` resources **can be** used in conjunction with `gcp.containeranalysis.NoteIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.containeranalysis.NoteIamPolicy
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
   * import com.pulumi.gcp.containeranalysis.NoteIamPolicy;
   * import com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs;
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
   *                 .role("roles/containeranalysis.notes.occurrences.viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new NoteIamPolicy("policy", NoteIamPolicyArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.containeranalysis.NoteIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.containeranalysis.NoteIamBinding;
   * import com.pulumi.gcp.containeranalysis.NoteIamBindingArgs;
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
   *         var binding = new NoteIamBinding("binding", NoteIamBindingArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .role("roles/containeranalysis.notes.occurrences.viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.containeranalysis.NoteIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.containeranalysis.NoteIamMember;
   * import com.pulumi.gcp.containeranalysis.NoteIamMemberArgs;
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
   *         var member = new NoteIamMember("member", NoteIamMemberArgs.builder()
   *             .project(note.get("project"))
   *             .note(note.get("name"))
   *             .role("roles/containeranalysis.notes.occurrences.viewer")
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
   * * projects/{{project}}/notes/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Container Registry note IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_container_analysis_note_iam_member.editor &#34;projects/{{project}}/notes/{{note}} roles/containeranalysis.notes.occurrences.viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_container_analysis_note_iam_binding.editor &#34;projects/{{project}}/notes/{{note}} roles/containeranalysis.notes.occurrences.viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:containeranalysis/noteIamPolicy:NoteIamPolicy editor projects/{{project}}/notes/{{note}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def NoteIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs.builder
    com.pulumi.gcp.containeranalysis.NoteIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An occurrence is an instance of a Note, or type of analysis that
   * can be done for a resource.
   * 
   * To get more information about Occurrence, see:
   * 
   * * [API documentation](https://cloud.google.com/container-analysis/api/reference/rest/)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/container-analysis/)
   */
  def Occurence(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.containeranalysis.OccurenceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.containeranalysis.OccurenceArgs.builder
    com.pulumi.gcp.containeranalysis.Occurence(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
