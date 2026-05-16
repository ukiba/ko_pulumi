package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object containeranalysis:
  extension (builder: com.pulumi.gcp.containeranalysis.OccurenceArgs.Builder)
    /**
     * @param attestation Occurrence that represents a single &#34;attestation&#34;. The authenticity
     *  of an attestation can be verified using the attached signature.
     *  If the verifier trusts the public key of the signer, then verifying
     *  the signature is sufficient to establish trust. In this circumstance,
     *  the authority to which this attestation is attached is primarily
     *  useful for lookup (how to find this attestation if you already
     *  know the authority and artifact to be verified) and intent (for
     *  which authority this attestation was intended to sign.
     *  Structure is documented below.
     * @return builder
     */
    def attestation(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs.Builder]):
        com.pulumi.gcp.containeranalysis.OccurenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs.builder
      builder.attestation(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Container Registry Note. Each of these resources serves a different use case:
   * 
   *  * `gcp.containeranalysis.NoteIamPolicy`: Authoritative. Sets the IAM policy for the note and replaces any existing policy already attached.
   *  * `gcp.containeranalysis.NoteIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the note are preserved.
   *  * `gcp.containeranalysis.NoteIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the note are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.containeranalysis.NoteIamPolicy`: Retrieves the IAM policy for the note
   * 
   *  &gt; **Note:** `gcp.containeranalysis.NoteIamPolicy` **cannot** be used in conjunction with `gcp.containeranalysis.NoteIamBinding` and `gcp.containeranalysis.NoteIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.containeranalysis.NoteIamBinding` resources **can be** used in conjunction with `gcp.containeranalysis.NoteIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.containeranalysis.NoteIamPolicy
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
   *  import com.pulumi.gcp.containeranalysis.NoteIamPolicy;
   *  import com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs;
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
   *                  .role("roles/containeranalysis.notes.occurrences.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new NoteIamPolicy("policy", NoteIamPolicyArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.containeranalysis.NoteIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.containeranalysis.NoteIamBinding;
   *  import com.pulumi.gcp.containeranalysis.NoteIamBindingArgs;
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
   *          var binding = new NoteIamBinding("binding", NoteIamBindingArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .role("roles/containeranalysis.notes.occurrences.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.containeranalysis.NoteIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.containeranalysis.NoteIamMember;
   *  import com.pulumi.gcp.containeranalysis.NoteIamMemberArgs;
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
   *          var member = new NoteIamMember("member", NoteIamMemberArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .role("roles/containeranalysis.notes.occurrences.viewer")
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
   *  # IAM policy for Container Registry Note
   * 
   *  Three different resources help you manage your IAM policy for Container Registry Note. Each of these resources serves a different use case:
   * 
   *  * `gcp.containeranalysis.NoteIamPolicy`: Authoritative. Sets the IAM policy for the note and replaces any existing policy already attached.
   *  * `gcp.containeranalysis.NoteIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the note are preserved.
   *  * `gcp.containeranalysis.NoteIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the note are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.containeranalysis.NoteIamPolicy`: Retrieves the IAM policy for the note
   * 
   *  &gt; **Note:** `gcp.containeranalysis.NoteIamPolicy` **cannot** be used in conjunction with `gcp.containeranalysis.NoteIamBinding` and `gcp.containeranalysis.NoteIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.containeranalysis.NoteIamBinding` resources **can be** used in conjunction with `gcp.containeranalysis.NoteIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.containeranalysis.NoteIamPolicy
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
   *  import com.pulumi.gcp.containeranalysis.NoteIamPolicy;
   *  import com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs;
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
   *                  .role("roles/containeranalysis.notes.occurrences.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new NoteIamPolicy("policy", NoteIamPolicyArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.containeranalysis.NoteIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.containeranalysis.NoteIamBinding;
   *  import com.pulumi.gcp.containeranalysis.NoteIamBindingArgs;
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
   *          var binding = new NoteIamBinding("binding", NoteIamBindingArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .role("roles/containeranalysis.notes.occurrences.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.containeranalysis.NoteIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.containeranalysis.NoteIamMember;
   *  import com.pulumi.gcp.containeranalysis.NoteIamMemberArgs;
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
   *          var member = new NoteIamMember("member", NoteIamMemberArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .role("roles/containeranalysis.notes.occurrences.viewer")
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
   *  * projects/{{project}}/notes/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Container Registry note IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_container_analysis_note_iam_member.editor &#34;projects/{{project}}/notes/{{note}} roles/containeranalysis.notes.occurrences.viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_container_analysis_note_iam_binding.editor &#34;projects/{{project}}/notes/{{note}} roles/containeranalysis.notes.occurrences.viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:containeranalysis/noteIamBinding:NoteIamBinding editor projects/{{project}}/notes/{{note}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def NoteIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.containeranalysis.NoteIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.containeranalysis.NoteIamBindingArgs.builder
    com.pulumi.gcp.containeranalysis.NoteIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An occurrence is an instance of a Note, or type of analysis that
   *  can be done for a resource.
   * 
   *  To get more information about Occurrence, see:
   * 
   *  * [API documentation](https://cloud.google.com/container-analysis/api/reference/rest/)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/container-analysis/)
   */
  def Occurence(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.containeranalysis.OccurenceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.containeranalysis.OccurenceArgs.builder
    com.pulumi.gcp.containeranalysis.Occurence(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Container Registry Note. Each of these resources serves a different use case:
   * 
   *  * `gcp.containeranalysis.NoteIamPolicy`: Authoritative. Sets the IAM policy for the note and replaces any existing policy already attached.
   *  * `gcp.containeranalysis.NoteIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the note are preserved.
   *  * `gcp.containeranalysis.NoteIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the note are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.containeranalysis.NoteIamPolicy`: Retrieves the IAM policy for the note
   * 
   *  &gt; **Note:** `gcp.containeranalysis.NoteIamPolicy` **cannot** be used in conjunction with `gcp.containeranalysis.NoteIamBinding` and `gcp.containeranalysis.NoteIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.containeranalysis.NoteIamBinding` resources **can be** used in conjunction with `gcp.containeranalysis.NoteIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.containeranalysis.NoteIamPolicy
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
   *  import com.pulumi.gcp.containeranalysis.NoteIamPolicy;
   *  import com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs;
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
   *                  .role("roles/containeranalysis.notes.occurrences.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new NoteIamPolicy("policy", NoteIamPolicyArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.containeranalysis.NoteIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.containeranalysis.NoteIamBinding;
   *  import com.pulumi.gcp.containeranalysis.NoteIamBindingArgs;
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
   *          var binding = new NoteIamBinding("binding", NoteIamBindingArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .role("roles/containeranalysis.notes.occurrences.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.containeranalysis.NoteIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.containeranalysis.NoteIamMember;
   *  import com.pulumi.gcp.containeranalysis.NoteIamMemberArgs;
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
   *          var member = new NoteIamMember("member", NoteIamMemberArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .role("roles/containeranalysis.notes.occurrences.viewer")
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
   *  # IAM policy for Container Registry Note
   * 
   *  Three different resources help you manage your IAM policy for Container Registry Note. Each of these resources serves a different use case:
   * 
   *  * `gcp.containeranalysis.NoteIamPolicy`: Authoritative. Sets the IAM policy for the note and replaces any existing policy already attached.
   *  * `gcp.containeranalysis.NoteIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the note are preserved.
   *  * `gcp.containeranalysis.NoteIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the note are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.containeranalysis.NoteIamPolicy`: Retrieves the IAM policy for the note
   * 
   *  &gt; **Note:** `gcp.containeranalysis.NoteIamPolicy` **cannot** be used in conjunction with `gcp.containeranalysis.NoteIamBinding` and `gcp.containeranalysis.NoteIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.containeranalysis.NoteIamBinding` resources **can be** used in conjunction with `gcp.containeranalysis.NoteIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.containeranalysis.NoteIamPolicy
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
   *  import com.pulumi.gcp.containeranalysis.NoteIamPolicy;
   *  import com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs;
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
   *                  .role("roles/containeranalysis.notes.occurrences.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new NoteIamPolicy("policy", NoteIamPolicyArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.containeranalysis.NoteIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.containeranalysis.NoteIamBinding;
   *  import com.pulumi.gcp.containeranalysis.NoteIamBindingArgs;
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
   *          var binding = new NoteIamBinding("binding", NoteIamBindingArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .role("roles/containeranalysis.notes.occurrences.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.containeranalysis.NoteIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.containeranalysis.NoteIamMember;
   *  import com.pulumi.gcp.containeranalysis.NoteIamMemberArgs;
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
   *          var member = new NoteIamMember("member", NoteIamMemberArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .role("roles/containeranalysis.notes.occurrences.viewer")
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
   *  * projects/{{project}}/notes/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Container Registry note IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_container_analysis_note_iam_member.editor &#34;projects/{{project}}/notes/{{note}} roles/containeranalysis.notes.occurrences.viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_container_analysis_note_iam_binding.editor &#34;projects/{{project}}/notes/{{note}} roles/containeranalysis.notes.occurrences.viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:containeranalysis/noteIamPolicy:NoteIamPolicy editor projects/{{project}}/notes/{{note}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def NoteIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs.builder
    com.pulumi.gcp.containeranalysis.NoteIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object ContaineranalysisFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for note */
    inline def getNoteIamPolicy(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.containeranalysis.outputs.GetNoteIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyArgs.builder
      com.pulumi.gcp.containeranalysis.ContaineranalysisFunctions.getNoteIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for note */
    inline def getNoteIamPolicyPlain(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.containeranalysis.outputs.GetNoteIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyPlainArgs.builder
      com.pulumi.gcp.containeranalysis.ContaineranalysisFunctions.getNoteIamPolicyPlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Container Registry Note. Each of these resources serves a different use case:
   * 
   *  * `gcp.containeranalysis.NoteIamPolicy`: Authoritative. Sets the IAM policy for the note and replaces any existing policy already attached.
   *  * `gcp.containeranalysis.NoteIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the note are preserved.
   *  * `gcp.containeranalysis.NoteIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the note are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.containeranalysis.NoteIamPolicy`: Retrieves the IAM policy for the note
   * 
   *  &gt; **Note:** `gcp.containeranalysis.NoteIamPolicy` **cannot** be used in conjunction with `gcp.containeranalysis.NoteIamBinding` and `gcp.containeranalysis.NoteIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.containeranalysis.NoteIamBinding` resources **can be** used in conjunction with `gcp.containeranalysis.NoteIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.containeranalysis.NoteIamPolicy
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
   *  import com.pulumi.gcp.containeranalysis.NoteIamPolicy;
   *  import com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs;
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
   *                  .role("roles/containeranalysis.notes.occurrences.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new NoteIamPolicy("policy", NoteIamPolicyArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.containeranalysis.NoteIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.containeranalysis.NoteIamBinding;
   *  import com.pulumi.gcp.containeranalysis.NoteIamBindingArgs;
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
   *          var binding = new NoteIamBinding("binding", NoteIamBindingArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .role("roles/containeranalysis.notes.occurrences.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.containeranalysis.NoteIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.containeranalysis.NoteIamMember;
   *  import com.pulumi.gcp.containeranalysis.NoteIamMemberArgs;
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
   *          var member = new NoteIamMember("member", NoteIamMemberArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .role("roles/containeranalysis.notes.occurrences.viewer")
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
   *  # IAM policy for Container Registry Note
   * 
   *  Three different resources help you manage your IAM policy for Container Registry Note. Each of these resources serves a different use case:
   * 
   *  * `gcp.containeranalysis.NoteIamPolicy`: Authoritative. Sets the IAM policy for the note and replaces any existing policy already attached.
   *  * `gcp.containeranalysis.NoteIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the note are preserved.
   *  * `gcp.containeranalysis.NoteIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the note are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.containeranalysis.NoteIamPolicy`: Retrieves the IAM policy for the note
   * 
   *  &gt; **Note:** `gcp.containeranalysis.NoteIamPolicy` **cannot** be used in conjunction with `gcp.containeranalysis.NoteIamBinding` and `gcp.containeranalysis.NoteIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.containeranalysis.NoteIamBinding` resources **can be** used in conjunction with `gcp.containeranalysis.NoteIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.containeranalysis.NoteIamPolicy
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
   *  import com.pulumi.gcp.containeranalysis.NoteIamPolicy;
   *  import com.pulumi.gcp.containeranalysis.NoteIamPolicyArgs;
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
   *                  .role("roles/containeranalysis.notes.occurrences.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new NoteIamPolicy("policy", NoteIamPolicyArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.containeranalysis.NoteIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.containeranalysis.NoteIamBinding;
   *  import com.pulumi.gcp.containeranalysis.NoteIamBindingArgs;
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
   *          var binding = new NoteIamBinding("binding", NoteIamBindingArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .role("roles/containeranalysis.notes.occurrences.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.containeranalysis.NoteIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.containeranalysis.NoteIamMember;
   *  import com.pulumi.gcp.containeranalysis.NoteIamMemberArgs;
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
   *          var member = new NoteIamMember("member", NoteIamMemberArgs.builder()
   *              .project(note.project())
   *              .note(note.name())
   *              .role("roles/containeranalysis.notes.occurrences.viewer")
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
   *  * projects/{{project}}/notes/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Container Registry note IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_container_analysis_note_iam_member.editor &#34;projects/{{project}}/notes/{{note}} roles/containeranalysis.notes.occurrences.viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_container_analysis_note_iam_binding.editor &#34;projects/{{project}}/notes/{{note}} roles/containeranalysis.notes.occurrences.viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:containeranalysis/noteIamMember:NoteIamMember editor projects/{{project}}/notes/{{note}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def NoteIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.containeranalysis.NoteIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.containeranalysis.NoteIamMemberArgs.builder
    com.pulumi.gcp.containeranalysis.NoteIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Container Analysis note is a high-level piece of metadata that
   *  describes a type of analysis that can be done for a resource.
   * 
   *  To get more information about Note, see:
   * 
   *  * [API documentation](https://cloud.google.com/container-analysis/api/reference/rest/)
   *  * How-to Guides
   *      * [Creating Attestations (Occurrences)](https://cloud.google.com/binary-authorization/docs/making-attestations)
   *      * [Official Documentation](https://cloud.google.com/container-analysis/)
   */
  def Note(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.containeranalysis.NoteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.containeranalysis.NoteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.containeranalysis.Note(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.containeranalysis.NoteIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.containeranalysis.NoteIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.containeranalysis.NoteArgs.Builder)
    /**
     * @param attestationAuthority Note kind that represents a logical attestation &#34;role&#34; or &#34;authority&#34;.
     *  For example, an organization might have one AttestationAuthority for
     *  &#34;QA&#34; and one for &#34;build&#34;. This Note is intended to act strictly as a
     *  grouping mechanism for the attached Occurrences (Attestations). This
     *  grouping mechanism also provides a security boundary, since IAM ACLs
     *  gate the ability for a principle to attach an Occurrence to a given
     *  Note. It also provides a single point of lookup to find all attached
     *  Attestation Occurrences, even if they don&#39;t all live in the same
     *  project.
     *  Structure is documented below.
     * @return builder
     */
    def attestationAuthority(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityArgs.Builder]):
        com.pulumi.gcp.containeranalysis.NoteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityArgs.builder
      builder.attestationAuthority(args(argsBuilder).build)

    /**
     * @param relatedUrls URLs associated with this note and related metadata.
     *  Structure is documented below.
     * @return builder
     */
    def relatedUrls(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteRelatedUrlArgs.Builder]*):
        com.pulumi.gcp.containeranalysis.NoteArgs.Builder =
      def argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteRelatedUrlArgs.builder
      builder.relatedUrls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.containeranalysis.NoteIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.containeranalysis.NoteIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.containeranalysis.inputs.OccurenceState.Builder)
    /**
     * @param attestation Occurrence that represents a single &#34;attestation&#34;. The authenticity
     *  of an attestation can be verified using the attached signature.
     *  If the verifier trusts the public key of the signer, then verifying
     *  the signature is sufficient to establish trust. In this circumstance,
     *  the authority to which this attestation is attached is primarily
     *  useful for lookup (how to find this attestation if you already
     *  know the authority and artifact to be verified) and intent (for
     *  which authority this attestation was intended to sign.
     *  Structure is documented below.
     * @return builder
     */
    def attestation(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs.Builder]):
        com.pulumi.gcp.containeranalysis.inputs.OccurenceState.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs.builder
      builder.attestation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityArgs.Builder)
    /**
     * @param hint This submessage provides human-readable hints about the purpose of
     *  the AttestationAuthority. Because the name of a Note acts as its
     *  resource reference, it is important to disambiguate the canonical
     *  name of the Note (which might be a UUID for security purposes)
     *  from &#34;readable&#34; names more suitable for debug output. Note that
     *  these hints should NOT be used to look up AttestationAuthorities
     *  in security sensitive contexts, such as when looking up
     *  Attestations to verify.
     *  Structure is documented below.
     * @return builder
     */
    def hint(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityHintArgs.Builder]):
        com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityHintArgs.builder
      builder.hint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.containeranalysis.inputs.NoteIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.containeranalysis.inputs.NoteIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs.Builder)
    /**
     * @param signatures One or more signatures over serializedPayload.
     *  Verifier implementations should consider this attestation
     *  message verified if at least one signature verifies
     *  serializedPayload. See Signature in common.proto for more
     *  details on signature structure and verification.
     *  Structure is documented below.
     * @return builder
     */
    def signatures(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationSignatureArgs.Builder]*):
        com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationSignatureArgs.builder
      builder.signatures(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.containeranalysis.inputs.NoteIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.containeranalysis.inputs.NoteIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.containeranalysis.inputs.NoteState.Builder)
    /**
     * @param attestationAuthority Note kind that represents a logical attestation &#34;role&#34; or &#34;authority&#34;.
     *  For example, an organization might have one AttestationAuthority for
     *  &#34;QA&#34; and one for &#34;build&#34;. This Note is intended to act strictly as a
     *  grouping mechanism for the attached Occurrences (Attestations). This
     *  grouping mechanism also provides a security boundary, since IAM ACLs
     *  gate the ability for a principle to attach an Occurrence to a given
     *  Note. It also provides a single point of lookup to find all attached
     *  Attestation Occurrences, even if they don&#39;t all live in the same
     *  project.
     *  Structure is documented below.
     * @return builder
     */
    def attestationAuthority(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityArgs.Builder]):
        com.pulumi.gcp.containeranalysis.inputs.NoteState.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityArgs.builder
      builder.attestationAuthority(args(argsBuilder).build)

    /**
     * @param relatedUrls URLs associated with this note and related metadata.
     *  Structure is documented below.
     * @return builder
     */
    def relatedUrls(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteRelatedUrlArgs.Builder]*):
        com.pulumi.gcp.containeranalysis.inputs.NoteState.Builder =
      def argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteRelatedUrlArgs.builder
      builder.relatedUrls(args.map(_(argsBuilder).build)*)
