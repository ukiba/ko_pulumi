package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudbuildv2:
  object Cloudbuildv2Functions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for connection */
    inline def getConnectionIamPolicy(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.GetConnectionIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudbuildv2.outputs.GetConnectionIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.GetConnectionIamPolicyArgs.builder
      com.pulumi.gcp.cloudbuildv2.Cloudbuildv2Functions.getConnectionIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for connection */
    inline def getConnectionIamPolicyPlain(args: Endofunction[com.pulumi.gcp.cloudbuildv2.inputs.GetConnectionIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudbuildv2.outputs.GetConnectionIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudbuildv2.inputs.GetConnectionIamPolicyPlainArgs.builder
      com.pulumi.gcp.cloudbuildv2.Cloudbuildv2Functions.getConnectionIamPolicyPlain(args(argsBuilder).build)

  /**
   * A connection to a SCM like GitHub, GitHub Enterprise, Bitbucket Data Center/Cloud or GitLab.
   * 
   * To get more information about Connection, see:
   * 
   * * [API documentation](https://cloud.google.com/build/docs/api/reference/rest)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/build/docs)
   */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudbuildv2.ConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudbuildv2.ConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudbuildv2.Connection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Build v2 Connection. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudbuildv2.ConnectionIAMPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
   * * `gcp.cloudbuildv2.ConnectionIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudbuildv2.ConnectionIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudbuildv2.ConnectionIAMPolicy`: Retrieves the IAM policy for the connection
   * 
   * &gt; **Note:** `gcp.cloudbuildv2.ConnectionIAMPolicy` **cannot** be used in conjunction with `gcp.cloudbuildv2.ConnectionIAMBinding` and `gcp.cloudbuildv2.ConnectionIAMMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudbuildv2.ConnectionIAMBinding` resources **can be** used in conjunction with `gcp.cloudbuildv2.ConnectionIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMPolicy
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
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicy;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicyArgs;
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
   *                 .role("roles/cloudbuild.connectionViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ConnectionIAMPolicy("policy", ConnectionIAMPolicyArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMBinding;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMBindingArgs;
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
   *         var binding = new ConnectionIAMBinding("binding", ConnectionIAMBindingArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .role("roles/cloudbuild.connectionViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMMember;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMMemberArgs;
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
   *         var member = new ConnectionIAMMember("member", ConnectionIAMMemberArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .role("roles/cloudbuild.connectionViewer")
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
   * # IAM policy for Cloud Build v2 Connection
   * 
   * Three different resources help you manage your IAM policy for Cloud Build v2 Connection. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudbuildv2.ConnectionIAMPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
   * * `gcp.cloudbuildv2.ConnectionIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudbuildv2.ConnectionIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudbuildv2.ConnectionIAMPolicy`: Retrieves the IAM policy for the connection
   * 
   * &gt; **Note:** `gcp.cloudbuildv2.ConnectionIAMPolicy` **cannot** be used in conjunction with `gcp.cloudbuildv2.ConnectionIAMBinding` and `gcp.cloudbuildv2.ConnectionIAMMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudbuildv2.ConnectionIAMBinding` resources **can be** used in conjunction with `gcp.cloudbuildv2.ConnectionIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMPolicy
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
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicy;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicyArgs;
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
   *                 .role("roles/cloudbuild.connectionViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ConnectionIAMPolicy("policy", ConnectionIAMPolicyArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMBinding;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMBindingArgs;
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
   *         var binding = new ConnectionIAMBinding("binding", ConnectionIAMBindingArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .role("roles/cloudbuild.connectionViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMMember;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMMemberArgs;
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
   *         var member = new ConnectionIAMMember("member", ConnectionIAMMemberArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .role("roles/cloudbuild.connectionViewer")
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
   * * projects/{{project}}/locations/{{location}}/connections/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Build v2 connection IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloudbuildv2_connection_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/connections/{{connection}} roles/cloudbuild.connectionViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloudbuildv2_connection_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/connections/{{connection}} roles/cloudbuild.connectionViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudbuildv2/connectionIAMBinding:ConnectionIAMBinding editor projects/{{project}}/locations/{{location}}/connections/{{connection}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConnectionIAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudbuildv2.ConnectionIAMBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudbuildv2.ConnectionIAMBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudbuildv2.ConnectionIAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Build v2 Connection. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudbuildv2.ConnectionIAMPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
   * * `gcp.cloudbuildv2.ConnectionIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudbuildv2.ConnectionIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudbuildv2.ConnectionIAMPolicy`: Retrieves the IAM policy for the connection
   * 
   * &gt; **Note:** `gcp.cloudbuildv2.ConnectionIAMPolicy` **cannot** be used in conjunction with `gcp.cloudbuildv2.ConnectionIAMBinding` and `gcp.cloudbuildv2.ConnectionIAMMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudbuildv2.ConnectionIAMBinding` resources **can be** used in conjunction with `gcp.cloudbuildv2.ConnectionIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMPolicy
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
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicy;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicyArgs;
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
   *                 .role("roles/cloudbuild.connectionViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ConnectionIAMPolicy("policy", ConnectionIAMPolicyArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMBinding;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMBindingArgs;
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
   *         var binding = new ConnectionIAMBinding("binding", ConnectionIAMBindingArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .role("roles/cloudbuild.connectionViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMMember;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMMemberArgs;
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
   *         var member = new ConnectionIAMMember("member", ConnectionIAMMemberArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .role("roles/cloudbuild.connectionViewer")
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
   * # IAM policy for Cloud Build v2 Connection
   * 
   * Three different resources help you manage your IAM policy for Cloud Build v2 Connection. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudbuildv2.ConnectionIAMPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
   * * `gcp.cloudbuildv2.ConnectionIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudbuildv2.ConnectionIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudbuildv2.ConnectionIAMPolicy`: Retrieves the IAM policy for the connection
   * 
   * &gt; **Note:** `gcp.cloudbuildv2.ConnectionIAMPolicy` **cannot** be used in conjunction with `gcp.cloudbuildv2.ConnectionIAMBinding` and `gcp.cloudbuildv2.ConnectionIAMMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudbuildv2.ConnectionIAMBinding` resources **can be** used in conjunction with `gcp.cloudbuildv2.ConnectionIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMPolicy
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
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicy;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicyArgs;
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
   *                 .role("roles/cloudbuild.connectionViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ConnectionIAMPolicy("policy", ConnectionIAMPolicyArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMBinding;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMBindingArgs;
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
   *         var binding = new ConnectionIAMBinding("binding", ConnectionIAMBindingArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .role("roles/cloudbuild.connectionViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMMember;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMMemberArgs;
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
   *         var member = new ConnectionIAMMember("member", ConnectionIAMMemberArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .role("roles/cloudbuild.connectionViewer")
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
   * * projects/{{project}}/locations/{{location}}/connections/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Build v2 connection IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloudbuildv2_connection_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/connections/{{connection}} roles/cloudbuild.connectionViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloudbuildv2_connection_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/connections/{{connection}} roles/cloudbuild.connectionViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudbuildv2/connectionIAMMember:ConnectionIAMMember editor projects/{{project}}/locations/{{location}}/connections/{{connection}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConnectionIAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudbuildv2.ConnectionIAMMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudbuildv2.ConnectionIAMMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudbuildv2.ConnectionIAMMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Build v2 Connection. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudbuildv2.ConnectionIAMPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
   * * `gcp.cloudbuildv2.ConnectionIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudbuildv2.ConnectionIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudbuildv2.ConnectionIAMPolicy`: Retrieves the IAM policy for the connection
   * 
   * &gt; **Note:** `gcp.cloudbuildv2.ConnectionIAMPolicy` **cannot** be used in conjunction with `gcp.cloudbuildv2.ConnectionIAMBinding` and `gcp.cloudbuildv2.ConnectionIAMMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudbuildv2.ConnectionIAMBinding` resources **can be** used in conjunction with `gcp.cloudbuildv2.ConnectionIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMPolicy
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
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicy;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicyArgs;
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
   *                 .role("roles/cloudbuild.connectionViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ConnectionIAMPolicy("policy", ConnectionIAMPolicyArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMBinding;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMBindingArgs;
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
   *         var binding = new ConnectionIAMBinding("binding", ConnectionIAMBindingArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .role("roles/cloudbuild.connectionViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMMember;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMMemberArgs;
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
   *         var member = new ConnectionIAMMember("member", ConnectionIAMMemberArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .role("roles/cloudbuild.connectionViewer")
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
   * # IAM policy for Cloud Build v2 Connection
   * 
   * Three different resources help you manage your IAM policy for Cloud Build v2 Connection. Each of these resources serves a different use case:
   * 
   * * `gcp.cloudbuildv2.ConnectionIAMPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
   * * `gcp.cloudbuildv2.ConnectionIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.cloudbuildv2.ConnectionIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.cloudbuildv2.ConnectionIAMPolicy`: Retrieves the IAM policy for the connection
   * 
   * &gt; **Note:** `gcp.cloudbuildv2.ConnectionIAMPolicy` **cannot** be used in conjunction with `gcp.cloudbuildv2.ConnectionIAMBinding` and `gcp.cloudbuildv2.ConnectionIAMMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.cloudbuildv2.ConnectionIAMBinding` resources **can be** used in conjunction with `gcp.cloudbuildv2.ConnectionIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMPolicy
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
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicy;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicyArgs;
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
   *                 .role("roles/cloudbuild.connectionViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ConnectionIAMPolicy("policy", ConnectionIAMPolicyArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMBinding;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMBindingArgs;
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
   *         var binding = new ConnectionIAMBinding("binding", ConnectionIAMBindingArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .role("roles/cloudbuild.connectionViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.cloudbuildv2.ConnectionIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMMember;
   * import com.pulumi.gcp.cloudbuildv2.ConnectionIAMMemberArgs;
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
   *         var member = new ConnectionIAMMember("member", ConnectionIAMMemberArgs.builder()
   *             .project(my_connection.get("project"))
   *             .location(my_connection.get("location"))
   *             .name(my_connection.get("name"))
   *             .role("roles/cloudbuild.connectionViewer")
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
   * * projects/{{project}}/locations/{{location}}/connections/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Build v2 connection IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_cloudbuildv2_connection_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/connections/{{connection}} roles/cloudbuild.connectionViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_cloudbuildv2_connection_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/connections/{{connection}} roles/cloudbuild.connectionViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:cloudbuildv2/connectionIAMPolicy:ConnectionIAMPolicy editor projects/{{project}}/locations/{{location}}/connections/{{connection}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConnectionIAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudbuildv2.ConnectionIAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A repository associated to a parent connection.
   * 
   * To get more information about Repository, see:
   * 
   * * [API documentation](https://cloud.google.com/build/docs/api/reference/rest)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/build/docs)
   */
  def Repository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudbuildv2.RepositoryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudbuildv2.RepositoryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudbuildv2.Repository(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
